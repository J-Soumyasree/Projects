package compack1;

import java.util.ArrayList;
import java.util.Scanner;

// Customer class
class Customer {
    String name;
    String phone;

    Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

// Room class
class Room {
    int roomNumber;
    String type;
    double pricePerDay;
    boolean isBooked;
    Customer customer;

    Room(int roomNumber, String type, double pricePerDay) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.pricePerDay = pricePerDay;
        this.isBooked = false;
        this.customer = null;
    }
}

// Main class
public class HotelManagementSystem {

    static ArrayList<Room> rooms = new ArrayList<>();
    static final double GST_RATE = 0.12;
    static final double DISCOUNT_RATE = 0.10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n🏨 HOTEL MANAGEMENT SYSTEM 🏨");
            System.out.println("1. Add Room");
            System.out.println("2. View Rooms");
            System.out.println("3. Book Room");
            System.out.println("4. Checkout Room");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addRoom(sc);
                    break;
                case 2:
                    viewRooms();
                    break;
                case 3:
                    bookRoom(sc);
                    break;
                case 4:
                    checkoutRoom(sc);
                    break;
                case 5:
                    System.out.println("Thank you for using Hotel Management System!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }

    // Add room
    static void addRoom(Scanner sc) {
        System.out.print("Room Number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Room Type (Single/Double/Deluxe): ");
        String type = sc.nextLine();

        System.out.print("Price per day: ");
        double price = sc.nextDouble();

        rooms.add(new Room(number, type, price));
        System.out.println("Room added successfully!");
    }

    // View rooms
    static void viewRooms() {
        System.out.println("\n--- Room Details ---");
        for (Room r : rooms) {
            System.out.println(
                "Room No: " + r.roomNumber +
                " | Type: " + r.type +
                " | Price/Day: ₹" + r.pricePerDay +
                " | Status: " + (r.isBooked ? "Booked" : "Available")
            );
            if (r.isBooked && r.customer != null) {
                System.out.println("   Customer: " + r.customer.name +
                                   " | Phone: " + r.customer.phone);
            }
        }
    }

    // Book room
    static void bookRoom(Scanner sc) {
        System.out.print("Enter Room Number to book: ");
        int number = sc.nextInt();
        sc.nextLine();

        for (Room r : rooms) {
            if (r.roomNumber == number) {
                if (!r.isBooked) {
                    System.out.print("Customer Name: ");
                    String name = sc.nextLine();

                    System.out.print("Customer Phone: ");
                    String phone = sc.nextLine();

                    r.customer = new Customer(name, phone);
                    r.isBooked = true;

                    System.out.println("Room booked successfully!");
                } else {
                    System.out.println("Room already booked!");
                }
                return;
            }
        }
        System.out.println("Room not found!");
    }

    // Checkout with GST & Discount
    static void checkoutRoom(Scanner sc) {
        System.out.print("Enter Room Number: ");
        int number = sc.nextInt();

        for (Room r : rooms) {
            if (r.roomNumber == number && r.isBooked) {
                System.out.print("Enter number of days stayed: ");
                int days = sc.nextInt();

                double baseAmount = days * r.pricePerDay;

                double discount = 0;
                if (days >= 5) {
                    discount = baseAmount * DISCOUNT_RATE;
                }

                double amountAfterDiscount = baseAmount - discount;
                double gst = amountAfterDiscount * GST_RATE;
                double finalBill = amountAfterDiscount + gst;

                System.out.println("\n🧾 FINAL BILL 🧾");
                System.out.println("Customer Name : " + r.customer.name);
                System.out.println("Phone Number  : " + r.customer.phone);
                System.out.println("Room Number   : " + r.roomNumber);
                System.out.println("Room Type     : " + r.type);
                System.out.println("Days Stayed   : " + days);
                System.out.println("--------------------------------");
                System.out.println("Base Amount   : ₹" + baseAmount);
                System.out.println("Discount      : ₹" + discount);
                System.out.println("GST (12%)     : ₹" + gst);
                System.out.println("Total Payable : ₹" + finalBill);
                System.out.println("--------------------------------");

                // reset room
                r.isBooked = false;
                r.customer = null;

                System.out.println("Checkout successful!");
                return;
            }
        }
        System.out.println("Invalid room number or room not booked!");
    }
}

