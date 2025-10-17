/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundial.model;

/**
 *
 * @author tomi1
 */

import java.util.HashMap;
import java.util.Map;

public class RankingService {

    /** Acumula puntos a lo largo del evento. */
    private final Map<Competidor, Integer> tabla = new HashMap<>();

    public void registrarResultado(Competencia cmp, Competidor c, int posicionLlegada, boolean record) {
        int puntos = cmp.calcularPuntos(c, posicionLlegada, record);
        tabla.merge(c, puntos, Integer::sum);
    }

    public int getPuntos(Competidor c) { return tabla.getOrDefault(c, 0); }

    /** Ranking de mayor a menor. */
    public String tablaGeneral() {
        StringBuilder sb = new StringBuilder("RANKING GENERAL\n");
        tabla.entrySet().stream()
             .sorted((a,b) -> Integer.compare(b.getValue(), a.getValue()))
             .forEach(e -> sb.append(e.getKey().getNombre())
                             .append(" (").append(e.getKey().getPais()).append(") : ")
                             .append(e.getValue()).append("\n"));
        return sb.toString();
    }
}
