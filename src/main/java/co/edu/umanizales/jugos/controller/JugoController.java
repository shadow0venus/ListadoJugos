package co.edu.umanizales.jugos.controller;

import co.edu.umanizales.jugos.model.Jugo;
import co.edu.umanizales.jugos.service.JugoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jugos")
public class JugoController {

    @Autowired
    private JugoService jugoService;

    @GetMapping
    public List<Jugo> getAllJugos() {
        return jugoService.getAllJugos();
    }

    @GetMapping("/fruta/{nombreFruta}")
    public List<Jugo> getJugosPorFruta(@PathVariable String nombreFruta) {
        return jugoService.getJugosPorFruta(nombreFruta);
    }
}

