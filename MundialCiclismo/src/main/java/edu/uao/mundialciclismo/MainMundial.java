/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.uao.mundialciclismo;


/**
 *
 * @author tomi1
 */

import mundial.controller.CompetenciaController;
import mundial.model.Competencia;
import mundial.model.RankingService;
import mundial.view.ConsolaView;

public class MainMundial {
    public static void main(String[] args) {
        Competencia cmp = new Competencia("Mundial de Ciclismo de Pista - Cali");
        RankingService rk = new RankingService();
        ConsolaView view = new ConsolaView();
        new CompetenciaController(cmp, rk, view).demoCargaInicial();
    }
}
