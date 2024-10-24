package co.edu.umanizales.jugos.service;

import co.edu.umanizales.jugos.model.Fruta;
import co.edu.umanizales.jugos.model.Jugo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class JugoService {
    private List<Jugo> jugos = new ArrayList<>();

    public JugoService() {
        // Inicializa algunos jugos con frutas de ejemplo
        List<Fruta> frutas1 = List.of(new Fruta("Banana", "Amarillo"), new Fruta("Fresa", "Rojo"));
        List<Fruta> frutas2 = List.of(new Fruta("Manzana", "Rojo"), new Fruta("Kiwi", "Verde"));

        jugos.add(new Jugo("Jugo de Fresa y Banana", frutas1, true, true));
        jugos.add(new Jugo("Jugo de Manzana y Kiwi", frutas2, false, false));
    }

    public List<Jugo> getAllJugos() {
        return jugos;
    }

    public List<Jugo> getJugosPorFruta(String nombreFruta) {
        return jugos.stream()
                .filter(jugo -> jugo.getFrutas().stream()
                        .anyMatch(fruta -> fruta.getNombre().equalsIgnoreCase(nombreFruta)))
                .collect(Collectors.toList());
    }
}

