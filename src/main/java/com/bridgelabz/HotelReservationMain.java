package com.bridgelabz;

public class HotelReservationMain {

    public static void main(String[] args) {
        System.out.println("Welcome to hotel reservation system");//display welcome message
        //create object of hotel reservation service class
        HotelReservationService hotelReservationService = new HotelReservationService();
        //using object reference calling add hotel method and pass parameters
        System.out.println(hotelReservationService.addHotel(new Hotel("Lakwood", 110)));
        System.out.println(hotelReservationService.addHotel(new Hotel("Bridgewood", 160)));
        System.out.println(hotelReservationService.addHotel(new Hotel("Ridgewood", 220)));
    }
}
