package com.pluralsight;

public class Main {
    public static void main(String[] args) {



        Room room1 = new Room(2, 150.00, false, false);
        System.out.println("Room available: " + room1.isAvailable());

        Reservation reservation1 = new Reservation("king", 3, true);
        System.out.println("Reservation total: $" + reservation1.getReservationTotal());

        Employee employee1 = new Employee(101, "Mubarak", "IT", 20.0, 45);
        System.out.println("Regular hours: " + employee1.getRegularHours());
        System.out.println("Overtime hours: " + employee1.getOvertimeHours());
        System.out.println("Total pay: $" + employee1.getTotalPay());



    }






}
