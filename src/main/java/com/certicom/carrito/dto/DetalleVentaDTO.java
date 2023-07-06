package com.certicom.carrito.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class DetalleVentaDTO {
    private String nombre;
    private BigDecimal precio;
    private Integer cantidad;
}
