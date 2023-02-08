package com.ian.entregaSpring.model;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="juego")
public class Juego implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="Titulo")
    private String titulo;
    @Column(name="Categoria")
    private String categoria;
    @Column(name="Precio")
    private double precio;
}
