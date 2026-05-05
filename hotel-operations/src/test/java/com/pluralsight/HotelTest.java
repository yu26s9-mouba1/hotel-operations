package com.pluralsight;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class HotelTest {

    Hotel hotel = new Hotel("Mubarak Hotel", 5, 10);

    @Test
    public void hotel_shouldStartWithAllRoomsAvailable() {

        Hotel hotel = new Hotel("Mubarak Hotel", 5, 10);

        assertEquals(5, hotel.getAvailableSuites());
        assertEquals(10, hotel.getAvailableRooms());
    }


    @Test
    public void bookRoom_shouldBookSuitesWhenAvailable() {

        Hotel hotel = new Hotel("Mubarak Hotel", 5, 10);

        boolean wasBooked = hotel.bookRoom(2, true);

        assertTrue(wasBooked);
        assertEquals(3, hotel.getAvailableSuites());
    }


    @Test
    public void bookRoom_shouldNotBookSuitesWhenNotEnoughAvailable() {

        Hotel hotel = new Hotel("Mubarak Hotel", 5, 10);

        boolean wasBooked = hotel.bookRoom(6, true);

        assertFalse(wasBooked);
        assertEquals(5, hotel.getAvailableSuites());
    }


    @Test
    public void bookRoom_shouldNotBookBasicRoomsWhenNotEnoughAvailable() {

        Hotel hotel = new Hotel("Mubarak Hotel", 5, 10);

        boolean wasBooked = hotel.bookRoom(11, false);

        assertFalse(wasBooked);
        assertEquals(10, hotel.getAvailableRooms());
    }


    @Test
    public void bookRoom_shouldBookBasicRoomsWhenAvailable() {

        Hotel hotel = new Hotel("Mubarak Hotel", 5, 10);

        boolean wasBooked = hotel.bookRoom(3, false);

        assertTrue(wasBooked);
        assertEquals(7, hotel.getAvailableRooms());
    }















}
