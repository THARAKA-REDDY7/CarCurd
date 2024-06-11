package com.car.service;

import lombok.Data;

@Data
public class RecordNotExits extends RuntimeException{
    private final String s;
    private final int id;
    public RecordNotExits(String s, int id) {
        super();
        this.s=s;
        this.id=id;
    }
}
