package com.pluralsight;

public class Reservation {

    private String roomType;
    private int numberOfNights;
    private boolean weekend;
//    private int reservationTotal;


    public Reservation(String roomType, int numberOfNights, boolean weekend ) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;

    }


    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;

    }



    // Derived Method: Price per night
    public double getPrice() {

        double basePrice;

        if (roomType.equalsIgnoreCase("king")) {
            basePrice = 139.00;
        } else {
            basePrice = 124.00;
        }

        if (weekend) {
            basePrice = basePrice * 1.10;
        }

        return basePrice;
    }

    // Derived Method: Total reservation cost
    public double getReservationTotal() {
        return getPrice() * numberOfNights;
    }


}
