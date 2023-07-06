package com.certicom.carrito.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CLIENTE")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombres", nullable = false)
    private String nombres;
    @Column(name = "apellidos", nullable = false)
    private String apellidos;
    @Column(name = "dni", unique = true, nullable = false)
    private String dni;
    @Column(name = "telefono", unique = true)
    private String telefono;
    @Column(name = "email", unique = true)
    private String email;
}
