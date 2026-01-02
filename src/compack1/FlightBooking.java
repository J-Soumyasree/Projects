package compack1;
import java.util.Scanner;

public class FlightBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int baseFare = 5000;
        int windowCharge = 300;
        int totalAmount = 0;

        System.out.println("✈️ Welcome to Flight Booking System ✈️");

        // City selection
        System.out.println("\nSelect Source City:");
        System.out.println("1. Hyderabad");
        System.out.println("2. Bangalore");
        System.out.println("3. Chennai");
        int source = sc.nextInt();

        System.out.println("\nSelect Destination City:");
        System.out.println("1. Delhi");
        System.out.println("2. Mumbai");
        System.out.println("3. Kolkata");
        int destination = sc.nextInt();

        String fromCity = "";
        String toCity = "";

        switch (source) {
            case 1 -> fromCity = "Hyderabad";
            case 2 -> fromCity = "Bangalore";
            case 3 -> fromCity = "Chennai";
            default -> System.out.println("Invalid source city");
        }

        switch (destination) {
            case 1 -> toCity = "Delhi";
            case 2 -> toCity = "Mumbai";
            case 3 -> toCity = "Kolkata";
            default -> System.out.println("Invalid destination city");
        }

        // Number of passengers
        System.out.print("\nEnter number of passengers: ");
        int persons = sc.nextInt();

        // Display seat arrangement
        System.out.println("\nAvailable Seats:");
        int seat = 1;
        while (seat <= 50) {
            System.out.printf("[%d] [%d] [%d]     [%d] [%d]\n",
                    seat, seat + 1, seat + 2, seat + 3, seat + 4);
            seat += 5;
        }

        // Booking each passenger
        for (int i = 1; i <= persons; i++) {

            System.out.println("\nPassenger " + i + " Details");

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Aadhaar Number: ");
            String aadhaar = sc.nextLine();

            System.out.print("Phone Number: ");
            String phone = sc.nextLine();

            System.out.print("Select Seat Number: ");
            int seatNo = sc.nextInt();

            int fare = baseFare;

            // Window seat check
            if (seatNo % 5 == 1 || seatNo % 5 == 0) {
                System.out.println("Window seat selected (+₹300)");
                fare += windowCharge;
            }

            totalAmount += fare;

            System.out.println("Fare for " + name + ": ₹" + fare);
        }

        // Booking summary
        System.out.println("\n🧾 Booking Summary");
        System.out.println("------------------------");
        System.out.println("From: " + fromCity);
        System.out.println("To: " + toCity);
        System.out.println("Passengers: " + persons);
        System.out.println("Total Amount to Pay: ₹" + totalAmount);

        System.out.println("\n✅ Booking Confirmed! Happy Journey ✈️");

        sc.close();
    }
}