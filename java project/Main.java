import java.io.*;
import java.util.*;
// here a class is made named movie
class Movie {
    int id;
    String title;
    String[] showTimes;   // Array of Strings

    Movie(int id, String title, String[] showTimes) {
        this.id = id;
        this.title = title;
        this.showTimes = showTimes;
    }

    void display() {
        System.out.print(id + ". " + title + " | Shows: ");
        for (String s : showTimes) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
// here a class named booking is made
class Booking {
    String customerName;
    Movie movie;          
    String showTime;
    String seat;

    Booking(String customerName, Movie movie, String showTime, String seat) {
        this.customerName = customerName;
        this.movie = movie;
        this.showTime = showTime;
        this.seat = seat;
    }

    public String toString() {
        return customerName + "," + movie.title + "," + showTime + "," + seat;
    }
}
// this is the main class from where we enter the code
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // ------- ARRAY OF OBJECTS -------
        Movie[] movies = {
                new Movie(1, "3 idiots", new String[]{"12:00", "18:00"}),
                new Movie(2, "Airlift", new String[]{"11:00", "20:00"})
        };

        while (true) {
            System.out.println("\n=== MOVIE TICKET BOOKING SYSTEM ===");
            System.out.println("1) Show Movies");
            System.out.println("2) Book Ticket");
            System.out.println("3) View All Bookings");
            System.out.println("0) Exit");
            System.out.print("Enter choice: ");

            int choice;
// here is exception handling used
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input! Enter a number.");
                continue;
            }

            if (choice == 1) {
                showMovies(movies);

            } else if (choice == 2) {
                bookTicket(movies);

            } else if (choice == 3) {
                viewBookings();

            } else if (choice == 0) {
                System.out.println("Thank you! Goodbye!");
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
// here is show movie method
    static void showMovies(Movie[] movies) {
        System.out.println("\nAvailable Movies:");
        for (Movie m : movies) {
            m.display();
        }
    }
    // here is book ticket method

    static void bookTicket(Movie[] movies) {

        System.out.print("\nEnter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter Movie ID: ");
        int id;

        try {
            id = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Invalid movie ID!");
            return;
        }

        Movie selected = null;

        for (Movie m : movies) {
            if (m.id == id) {
                selected = m;
                break;
            }
        }

        if (selected == null) {
            System.out.println("Movie not found!");
            return;
        }

        System.out.print("Enter Show Time: ");
        String show = sc.nextLine();

        System.out.print("Enter Seat (e.g., A1): ");
        String seat = sc.nextLine();

     
        Booking b = new Booking(name, selected, show, seat);

        //file input output
        try (FileWriter fw = new FileWriter("bookings.txt", true)) {
            fw.write(b.toString() + "\n");
            System.out.println("Booking saved successfully!");
        } catch (Exception e) {
            System.out.println("Error writing to file!");
        }
    }

    static void viewBookings() {
        System.out.println("\n=== All Bookings ===");

        File f = new File("bookings.txt");

        if (!f.exists()) {
            System.out.println("No bookings found!");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            System.out.println("Error reading file!");
        }
    }
}
