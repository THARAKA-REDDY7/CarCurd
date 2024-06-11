package com.car.service;


import com.car.dao.CarDetailsRepo;
import com.car.model.Car;
import com.car.model.CarDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarDetailsServiceImpl implements CarDetailsService{

    @Autowired
    private CarDetailsRepo carDetailsRepo;



    @Override
    public void saveCarDetails(CarDetails carDetails) {
        carDetailsRepo.save(carDetails);
    }

    @Override
    public CarDetails getCarDetails(int id) {
        return carDetailsRepo.findById(id).orElseThrow(()->new RecordNotExits("car details are not present in db",id));
    }

    @Override
    public List getAllCarDetails() {
        return carDetailsRepo.findAll();
    }

    @Override
    public void updateCarDetails(int c, int id) {
       CarDetails carDetails=carDetailsRepo.findById(id).orElseThrow(
                ()-> new RecordNotExits("car details are not present in db",id)
        );
        carDetails.setHp(c);
        carDetailsRepo.save(carDetails);
    }


}
