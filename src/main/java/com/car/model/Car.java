package com.car.model;

import jakarta.persistence.*;
import lombok.Data;

    @Entity
    @Data
    public class Car {
        @Id
        @GeneratedValue(strategy= GenerationType.SEQUENCE)
        private int id;
        @Column
        private String company;
        @Column
        private String name;
        @Column
        private String model;
        @Column
        private String price;
    }

