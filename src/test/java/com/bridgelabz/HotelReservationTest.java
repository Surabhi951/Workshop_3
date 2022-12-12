package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {

    //create object of hotel reservation service class
    HotelReservationService hotelReservationService = new HotelReservationService();

    //test return true
    @Test
    void givenHotel_ShouldBe_AddedToHotelList_ReturnTrue() {
        try {
            //verify the supplied condition are true
            Assertions.assertTrue(hotelReservationService.addHotel(new Hotel("Lakewood", 110)));
            Assertions.assertTrue(hotelReservationService.addHotel(new Hotel("Bridgewood", 160)));
            Assertions.assertTrue(hotelReservationService.addHotel(new Hotel("Ridgewood", 220)));
            System.out.println("Hotel details is valid");
        }catch (InvalidHotelDetailsException e){//handle exception
            System.out.println("Invalid hotel details" + e);
        }
    }

    //test return false
    @Test
    void givenHotel_ShouldNotBe_AddedToHotelList_ReturnFalse() {
        try {
            //verify supplied condition are false
            Assertions.assertFalse(hotelReservationService.addHotel(new Hotel("Greenwood", 120)));
            System.out.println("Hotel details is valid");
        }catch (InvalidHotelDetailsException e){
            System.out.println("Invalid hotel details" + e);
        }
    }
}
