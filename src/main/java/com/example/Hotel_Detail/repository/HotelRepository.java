package com.example.Hotel_Detail.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.Hotel_Detail.entity.Hotel;
import org.springframework.stereotype.Repository;

@Repository

public interface HotelRepository extends CrudRepository<Hotel, Long> {}
