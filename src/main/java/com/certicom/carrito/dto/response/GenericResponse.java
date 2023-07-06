package com.certicom.carrito.dto.response;

import lombok.Data;

@Data
public class GenericResponse<T> {
    private String status;  //1:ok 0:error
    private String code;    //codigo de respuesta en caso de error
    private String message; //mensaje
    private T data;

    public GenericResponse() {
    }
    public GenericResponse(T data) {
        this.data = data;
    }
}
