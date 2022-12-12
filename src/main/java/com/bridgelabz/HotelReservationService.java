package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationService {

    // create list which is of hotel type
    List<Hotel> hotelList = new ArrayList<>();

    boolean addHotel(Hotel hotel) throws InvalidHotelDetailsException {// create method with parameter which is of boolean type and throws exception at method signature
        hotelList.add(hotel);//add hotels in list
        boolean result = true;//initialize result variable
        if (!result){
            throw new InvalidHotelDetailsException("Invalid hotel details");//throw invalid exception
        }
        else {
            return true;
        }
    }
}
