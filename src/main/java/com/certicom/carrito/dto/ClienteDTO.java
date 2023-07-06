package com.certicom.carrito.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;

@Data
@AllArgsConstructor
public class ClienteDTO {
    private String nombres;
    private String apellidos;
    private String dni;
    private String telefono;
    private String email;
    private Date fecha;
}
