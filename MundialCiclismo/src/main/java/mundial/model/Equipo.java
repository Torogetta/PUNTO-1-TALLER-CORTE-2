/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundial.model;
/**
 *
 * @author tomi1
 */
import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private String pais;
    private final List<Competidor> competidores = new ArrayList<>();

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }

    public List<Competidor> getCompetidores() { return competidores; }

    public void agregarCompetidor(Competidor c) { if (c != null) competidores.add(c); }

    /** Estructura anidada: equipo y sus ciclistas. */
    public String generarReporte() {
        StringBuilder sb = new StringBuilder("Equipo ")
                .append(nombre).append(" (").append(pais).append(")\n");
        for (Competidor c : competidores) {
            sb.append(" - ").append(c.toString()).append("\n");
        }
        return sb.toString();
    }
}
