package com.certicom.carrito.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;


@Data
@Entity
@Table(name = "VENTA")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private Long idVenta;
    @Column(name = "id_cliente", nullable = false)
    private String idCliente;
    @Column(name = "fecha", nullable = false)
    private Date fecha;
}
