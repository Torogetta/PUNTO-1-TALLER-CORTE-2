/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundial.model;

/**
 *
 * @author tomi1
 */

import java.util.Objects;

public abstract class Competidor {
    private String nombre;
    private String pais;
    private int rankingMundial;  // posición en ranking UCI
    private double estatura;     // m
    private double peso;         // kg

    public Competidor(String nombre, String pais, int rankingMundial, double estatura, double peso) {
        this.nombre = nombre;
        this.pais = pais;
        this.rankingMundial = rankingMundial;
        this.estatura = estatura;
        this.peso = peso;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }

    public int getRankingMundial() { return rankingMundial; }
    public void setRankingMundial(int rankingMundial) { this.rankingMundial = rankingMundial; }

    public double getEstatura() { return estatura; }
    public void setEstatura(double estatura) { this.estatura = estatura; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

// Cada subclase calcula puntos con su propia lógica (polimorfismo)
    public abstract int calcularPuntosPorPrueba(int posicionLlegada);

    @Override
    public String toString() {
        return "Competidor{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", rankingMundial=" + rankingMundial +
                ", estatura=" + estatura +
                ", peso=" + peso +
                '}';
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Competidor)) return false;
        Competidor that = (Competidor) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(pais, that.pais);
    }

    @Override public int hashCode() { return Objects.hash(nombre, pais); }
}
