package co.edu.umanizales.jugos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@AllArgsConstructor
public class Jugo {
    private String nombre;
    private List<Fruta> frutas;
    private boolean hechoEnLeche;
    private boolean conAzucar;
}
