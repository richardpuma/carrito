package com.certicom.carrito.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "PRODUCTO")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "precio", precision = 10, scale = 2, nullable = false)
    private BigDecimal precio;
}
