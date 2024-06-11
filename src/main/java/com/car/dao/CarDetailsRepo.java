package com.car.dao;


import com.car.model.CarDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarDetailsRepo extends JpaRepository<CarDetails,Integer> {

}
