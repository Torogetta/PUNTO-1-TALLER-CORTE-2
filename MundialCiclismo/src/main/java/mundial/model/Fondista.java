/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundial.model;

/**
 *
 * @author tomi1
 */
public class Fondista extends Competidor {
    public Fondista(String nombre, String pais, int rankingMundial, double estatura, double peso) {
        super(nombre, pais, rankingMundial, estatura, peso);
    }

    /** Fondistas: consistencia del 4° al 10°.
     * @param posicionLlegada
     * @return  */
    @Override
    public int calcularPuntosPorPrueba(int posicionLlegada) {
        return switch (posicionLlegada) {
            case 1 -> 95;
            case 2 -> 75;
            case 3 -> 60;
            case 4,5,6 -> 45;
            case 7,8,9,10 -> 35;
            default -> Math.max(0, 15 - posicionLlegada);
        };
    }

    @Override
    public String toString() {
        return "Fondista -> " + super.toString();
    }
}
