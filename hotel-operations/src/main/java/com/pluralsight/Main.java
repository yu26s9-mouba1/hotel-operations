package com.pluralsight;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        System.out.println("======== Reservations ============");


        /*Testing the rooms
         */
        Room room1 = new Room(2, 150.00, false, false);
        System.out.println("Room available before check-in: " + room1.isAvailable());

        room1.checkIn();
        System.out.println("Room available after check-in: " + room1.isAvailable());

        room1.checkOut();
        System.out.println("Room available after check-out: " + room1.isAvailable());

        room1.cleanRoom();
        System.out.println("Room available after cleaning: " + room1.isAvailable());


        // Testing the reservation
        Reservation reservation1 = new Reservation("king", 3, true);
        System.out.println("Reservation total: $" + reservation1.getReservationTotal());


        // Testing the employee object
        Employee employee1 = new Employee(101, "Mubarak", "IT", 20.0, 0);

        employee1.punchIn(9);
        employee1.punchOut(17);


        System.out.println("Employee: " + employee1.getName());
        System.out.println("Regular hours: " + employee1.getRegularHours());
        System.out.println("Overtime hours: " + employee1.getOvertimeHours());
        System.out.println("Hours worked: " + employee1.getHoursWorked());
        System.out.println("Total pay: $" + employee1.getTotalPay());
        System.out.println();


        System.out.println("======== Hotel ==========");

        Hotel hotel = new Hotel("Mubarak Hotel", 5, 10);

        System.out.println("Available suites: " + hotel.getAvailableSuites());
        System.out.println("Available basic rooms: " + hotel.getAvailableRooms());

        boolean bookedSuite = hotel.bookRoom(2, true);
        System.out.println("Suite booking successful: " + bookedSuite);
        System.out.println("Available suites after booking: " + hotel.getAvailableSuites());

        boolean bookedRoom = hotel.bookRoom(3, false);
        System.out.println("Basic room booking successful: " + bookedRoom);
        System.out.println("Available basic rooms after booking: " + hotel.getAvailableRooms());





    }






}
