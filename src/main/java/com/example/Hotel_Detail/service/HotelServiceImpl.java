package com.example.Hotel_Detail.service;
import com.example.Hotel_Detail.entity.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Hotel_Detail.repository.HotelRepository;

import java.util.Objects;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelRepository hotelRepository;

    @Override
    //Add new hotel -> Post OPERATION
    public Hotel addHotel(Hotel hotel){
        return hotelRepository.save(hotel);

    }

    @Override
    //Modify hotel data -> Put Operation
    public Hotel modifyHotel(Hotel hotel, Long Id){
        Hotel modifiedHotel = hotelRepository.findById(Id).get();

        if(Objects.nonNull(hotel.getHotelName())){
            modifiedHotel.setHotelName(hotel.getHotelName());
        }

        if(Objects.nonNull(hotel.getHotelAddress())){
            modifiedHotel.setHotelAddress(hotel.getHotelAddress());
        }

        if(Objects.nonNull(hotel.getRating())){
            modifiedHotel.setRating(hotel.getRating());
        }

        return hotelRepository.save(modifiedHotel);
    }

    @Override
    //Delete Hotel
    public void deleteHotel(Hotel hotel, Long id){
        hotelRepository.deleteById(id);
    }

    @Override
    //Get Hotel Data
    public Hotel getHotel(Hotel hotel, Long id){
        return hotelRepository.findById(id).get();
    }

}
