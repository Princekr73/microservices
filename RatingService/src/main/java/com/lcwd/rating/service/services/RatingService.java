package com.lcwd.rating.service.services;


import com.lcwd.rating.service.entities.Rating;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RatingService {

    //create
    Rating create(Rating rating);


    //get all rating

    List<Rating>getRating();

    //get all by userID

    List<Rating>getRatingByUserId(String userId);
    //get all by user

    List<Rating>getRatingByHotelId(String hotelId);

}
