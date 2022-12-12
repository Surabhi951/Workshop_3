package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {

    //create object of hotel reservation service class
    HotelReservationService hotelReservationService = new HotelReservationService();

    //test return true
    @Test
    void givenHotel_ShouldBe_AddedToHotelList_ReturnTrue(){
        boolean result = hotelReservationService.addHotel(new Hotel("Lakewood",110));// data store in result
        Assertions.assertTrue(result);
    }

    @Test
    void givenHotel_ShouldBe_AddedToHotelList_ReturnFlase(){
        boolean result = hotelReservationService.addHotel(new Hotel("Greenwood",120));
        Assertions.assertFalse(result);
    }
}
