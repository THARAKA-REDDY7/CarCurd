package com.car.controller;

import com.car.model.CarDetails;
import com.car.service.CarDetailsService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/car")
public class Controller {

    @Autowired
    private CarDetailsService carDetailsService;

    @PostMapping("/save")
    public ResponseEntity saveCar(@RequestBody CarDetails carDetails) {
        carDetailsService.saveCarDetails(carDetails);
        return new ResponseEntity<>(carDetails, HttpStatus.CREATED);
    }
    @GetMapping("/fetch/{id}")
    public ResponseEntity getCar(@PathVariable int id){
        CarDetails reponse =new CarDetails();
        reponse=carDetailsService.getCarDetails(id);
        return new ResponseEntity(reponse,HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity getAllCar(){
        List response= new ArrayList();
        response= carDetailsService.getAllCarDetails();

        return new ResponseEntity(response,HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateCarCompany(@RequestParam("hp") int c,@PathVariable int id){

        carDetailsService.updateCarDetails(c,id);

        return new ResponseEntity<>("updated ",HttpStatus.OK);


    }


}
