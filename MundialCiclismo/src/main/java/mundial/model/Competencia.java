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

public class Competencia {
    private final String nombreEvento;
    private final List<Equipo> equipos = new ArrayList<>();

    public Competencia(String nombreEvento) { this.nombreEvento = nombreEvento; }

    public String getNombreEvento() { return nombreEvento; }
    public List<Equipo> getEquipos() { return equipos; }

    public void agregarEquipo(Equipo e) { if (e != null) equipos.add(e); }

    /** Sobrecarga #1: puntos por posición (polimorfismo por tipo de competidor). */
    public int calcularPuntos(Competidor competidor, int posicionLlegada) {
        return competidor.calcularPuntosPorPrueba(posicionLlegada);
    }

    /** Sobrecarga #2: misma lógica + bonificación por récord. */
    public int calcularPuntos(Competidor competidor, int posicionLlegada, boolean rompioRecord) {
        int base = calcularPuntos(competidor, posicionLlegada);
        return rompioRecord ? base + 10 : base;
    }
}
