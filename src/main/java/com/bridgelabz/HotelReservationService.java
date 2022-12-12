package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationService {

    // create list which is of hotel type
    List<Hotel> hotelList = new ArrayList<>();

    boolean addHotel(Hotel hotel){// create method with parameter which is of boolean type
        hotelList.add(hotel);//add hotels in list
        return true;
    }
}
