package com.car.service;


import com.car.model.CarDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarDetailsService {

    void saveCarDetails(CarDetails carDetails);

    CarDetails getCarDetails(int id);

    List getAllCarDetails();

    void updateCarDetails(int c, int id);
}


