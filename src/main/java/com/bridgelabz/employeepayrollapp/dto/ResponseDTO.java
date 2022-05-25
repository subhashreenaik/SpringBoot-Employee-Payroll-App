package com.bridgelabz.employeepayrollapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class ResponseDTO {
	String message;
    Object data;

//    public ResponseDTO(String message, Object data) {
//        this.message = message;
//        this.data = data;
//    }
}