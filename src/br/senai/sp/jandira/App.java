package br.senai.sp.jandira;

import br.senai.sp.jandira.Model.Menu;

/**
 * Sistema para agência de veículos
 * @author Guilherme Pereira
 * Data: 05/09/2023
 * */
public class App {
    public static void main(String[] args) {
        /** Instancia Menu */
        Menu menu = new Menu();

        System.out.println("------------> Bem vindo! <------------");
        System.out.println("-       Concessionária Multimarcas   -");
        System.out.println("--------------------------------------");

        /** Inicia menu */
        menu.chamaMenu();
    }
}
