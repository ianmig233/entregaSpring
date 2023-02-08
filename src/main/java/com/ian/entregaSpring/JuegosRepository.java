package com.ian.entregaSpring;

import com.ian.entregaSpring.model.Juego;
import org.springframework.data.repository.CrudRepository;

public interface JuegosRepository extends CrudRepository<Juego,Long> {
}