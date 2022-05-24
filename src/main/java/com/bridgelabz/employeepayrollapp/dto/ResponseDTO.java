package com.bridgelabz.employeepayrollapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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