package com.pluralsight;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RoomTest {


    /**
     * Testing the room checkin method
     */
    @Test
    public void checkIn_shouldMakeRoomOccupiedAndDirty(){
        Room room = new Room(2, 150.00, false, false );
        room.checkIn();

        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
        assertTrue(room.isAvailable());
    }


    /**
     * Testing the room checkout method
     */
    @Test
    public void checkout_shouldMakeRoomNotOccupiedButStillDirty(){
        Room room = new Room(2, 150.00, false, false );

        room.checkIn();
        room.checkOut();

        assertFalse(room.isAvailable());
        assertTrue(room.isDirty());
        assertFalse(room.isAvailable());
    }


    









}