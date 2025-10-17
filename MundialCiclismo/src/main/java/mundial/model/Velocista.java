/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundial.model;

/**
 *
 * @author tomi1
 */
public class Velocista extends Competidor {
    public Velocista(String nombre, String pais, int rankingMundial, double estatura, double peso) {
        super(nombre, pais, rankingMundial, estatura, peso);
    }

    /** Velocistas: bonus alto en podio. */
    @Override
    public int calcularPuntosPorPrueba(int posicionLlegada) {
        int base = switch (posicionLlegada) {
            case 1 -> 100;
            case 2 -> 70;
            case 3 -> 50;
            case 4 -> 40;
            case 5 -> 30;
            default -> Math.max(0, 20 - posicionLlegada); // simbólico
        };
        return base + 5; // bonus por sprint
    }

    @Override
    public String toString() {
        return "Velocista -> " + super.toString();
    }
}
