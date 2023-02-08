package com.ian.entregaSpring.controller;

import com.ian.entregaSpring.model.Juego;
import com.ian.entregaSpring.JuegosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WebController {
    @Autowired
    private JuegosServiceImpl ju;
    // CRUD: C
    @PostMapping("/alta")
    public void altaJuego(Juego juegos)
    {
        ju.saveJuego(juegos);
        System.out.println("Se ha agregado con éxito");
    }
    // R
    @GetMapping("/juegos")
    public List<Juego> listaJuego()
    {
        System.out.println("Los datos obtenidos son los siguientes:");
        return ju.findAll();
    }
    // U
    @PutMapping("/juegos/{id}")
    public Juego actualizaJuego(@PathVariable Long id, Juego juegos)
    {
        System.out.println("Se han actualizado los datos!!");
        return ju.updateJuego(id,juegos);
    }
    // D
    @DeleteMapping("/juegos/{id}")
    public void borraJuego(@PathVariable Long id)
    {
        System.out.println("Se estan eliminando los datos....");
        ju.deleteJuego(id);
    }
}
