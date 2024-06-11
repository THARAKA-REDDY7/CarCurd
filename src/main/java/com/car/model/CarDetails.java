package com.car.model;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Transactional
@Data
@Getter
@Setter
public class CarDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int carId;
    @Column
    private int hp;
    @Column
    private int year;
    @Column
    private String color;
    @OneToOne(cascade = CascadeType.ALL)
    /*@JoinColumn(name = "CarTable_id", referencedColumnName = "id")*/
    private Car car;
}
