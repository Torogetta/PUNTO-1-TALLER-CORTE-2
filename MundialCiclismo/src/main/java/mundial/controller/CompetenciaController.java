/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundial.controller;

/**
 *
 * @author tomi1
 */
import mundial.model.*;
import mundial.view.ConsolaView;

public class CompetenciaController {
    private final Competencia competencia;
    private final RankingService ranking;
    private final ConsolaView view;

    public CompetenciaController(Competencia competencia, RankingService ranking, ConsolaView view) {
        this.competencia = competencia;
        this.ranking = ranking;
        this.view = view;
    }

    /** Carga de muestra + resultados. */
    public void demoCargaInicial() {
        Equipo col = new Equipo("Colombia Pista", "COL");
        Equipo esp = new Equipo("España Velocidad", "ESP");

        col.agregarCompetidor(new Velocista("Kevin", "COL", 12, 1.78, 78));
        col.agregarCompetidor(new Fondista("Brandon", "COL", 30, 1.73, 65));
        esp.agregarCompetidor(new Velocista("Peio", "ESP", 18, 1.80, 80));

        competencia.agregarEquipo(col);
        competencia.agregarEquipo(esp);

        // Resultados: posición y si rompió récord
        ranking.registrarResultado(competencia, col.getCompetidores().get(0), 1, true);
        ranking.registrarResultado(competencia, col.getCompetidores().get(1), 4, false);
        ranking.registrarResultado(competencia, esp.getCompetidores().get(0), 2, false);

        view.imprimir(col.generarReporte());
        view.imprimir(esp.generarReporte());
        view.imprimir(ranking.tablaGeneral());
    }
}