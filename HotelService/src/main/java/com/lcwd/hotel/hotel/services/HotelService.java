package com.lcwd.hotel.hotel.services;

import com.lcwd.hotel.hotel.entites.Hotel;

import java.util.List;

public interface HotelService {

    // create

    Hotel create(Hotel hotel);

    //get all

    List<Hotel>getAll();

    // get single

    Hotel get(String id);

}
