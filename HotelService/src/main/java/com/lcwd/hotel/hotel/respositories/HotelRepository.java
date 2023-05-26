package com.lcwd.hotel.hotel.respositories;

import com.lcwd.hotel.hotel.entites.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,String> {
}
