package com.certicom.carrito.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.management.ConstructorParameters;
import java.sql.Date;

@Data
@AllArgsConstructor
public class VentasDTO {
    private String nombres;
    private String apellidos;
    private Date fecha;
    private Long idVenta;
}
