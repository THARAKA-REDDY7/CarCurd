package com.car.service;

import com.car.model.ExceptionModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {
    public int id;
    String str;

    @org.springframework.web.bind.annotation.ExceptionHandler
    public ResponseEntity noRecordFound(RecordNotExits re){
        id=re.getId();
        str=re.getS();
        ExceptionModel response= buildResponse(id,str);

        return new ResponseEntity(response, HttpStatus.NOT_FOUND);
    }

    private ExceptionModel buildResponse(int id, String str) {
        return ExceptionModel.builder()
                .id(id)
                .s(str)
                .build();
    }
}
