package com.ian.entregaSpring;

import com.ian.entregaSpring.model.Juego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JuegosServiceImpl implements JuegoService {

    @Autowired
    private JuegosRepository ju;

    public List<Juego> findAll() {
        return (List<Juego>) ju.findAll();
    }

    public Optional<Juego> findById(Long id) {
        return ju.findById(id);
    }

    public void saveJuego(Juego juegos) {
        ju.save(juegos);
    }

    public Juego updateJuego(Long id, Juego juego) {
        if (ju.findById(id).isPresent())
            ju.save(juego);
        return juego;
    }

    public void deleteJuego(Long id) {
        ju.deleteById(id);
    }
}
