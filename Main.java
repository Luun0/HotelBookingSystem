import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(101, "Single", 50.0, true);
        Room room2 = new Room(102, "Double", 80.0, false);

        Guest guest1 = new Guest("Alice", "1234567890");
        Guest guest2 = new Guest("Bob", "0987654321");

        Booking booking1 = new Booking(room1, guest1, LocalDate.of(2024, 12, 27), LocalDate.of(2024, 12, 30));
        Booking booking2 = new Booking(room2, guest2, LocalDate.of(2025, 1, 1), LocalDate.of(2025, 1, 5));

        System.out.println("Booking Details:");
        System.out.println(booking1);
        System.out.println(booking2);

        System.out.println("\nRoom Availability:");
        System.out.println("Is room1 available? " + room1.isAvailable());
        room1.setAvailable(false);
        System.out.println("Is room1 available after booking? " + room1.isAvailable());

        System.out.println("\nComparison:");
        System.out.println("Are room1 and room2 the same? " + room1.equals(room2));
    }
}