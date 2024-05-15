package com.example.Hotel_Detail.service;
import com.example.Hotel_Detail.entity.Hotel;


public interface HotelService {
    Hotel addHotel(Hotel hotel);
    Hotel modifyHotel(Hotel hotel, Long id);
    void deleteHotel(Hotel hotel, Long id);
    Hotel getHotel(Hotel hotel, Long id);

}
