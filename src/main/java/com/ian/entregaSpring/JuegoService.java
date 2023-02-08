package com.ian.entregaSpring;

import com.ian.entregaSpring.model.Juego;

import java.util.List;
import java.util.Optional;
public interface JuegoService {
    List<Juego> findAll();

    Optional<Juego> findById(Long id);

    void saveJuego(Juego juegos);

    Juego updateJuego(Long id,Juego juegos);

    void deleteJuego(Long id);
}
