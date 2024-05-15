package com.example.Hotel_Detail.controller;

import com.example.Hotel_Detail.entity.Hotel;
import com.example.Hotel_Detail.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @PostMapping("/Hotels")
    public Hotel addHotel(@RequestBody Hotel hotel){
        return hotelService.addHotel(hotel);
    }

    @PutMapping("/Hotels/{id}")
    public Hotel modifyHotel(@RequestBody Hotel hotel, @PathVariable("id") Long id){
        return hotelService.modifyHotel(hotel, id);
    }

    @DeleteMapping("/Hotels/{id}")
    public String deleteHotel(Hotel hotel, @PathVariable("id") Long id){
        hotelService.deleteHotel(hotel, id);
        return "Hotel deleted Successfully";
    }

    @GetMapping("/Hotels/{id}")
    public Hotel getHotel(Hotel hotel, @PathVariable("id") Long id){
        return hotelService.getHotel(hotel, id);
    }
}
