package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Veiculo {
    /** Declara variaveis */
    String marca, modelo, cor, combustivel;
    int ano;
    double valor;

    /** Instancia scanner */
    Scanner scanner = new Scanner(System.in);

    public void cadastrarVeiculo() {
        System.out.println("------ Cadastro Veiculo ------");
        System.out.print("Informe a marca: ");
        marca = scanner.next();
        System.out.print("Modelo: ");
        modelo = scanner.next();
        System.out.print("Ano: ");
        ano = scanner.nextInt();
        System.out.print("Cor: ");
        cor = scanner.next();
        System.out.print("Combustível: ");
        combustivel = scanner.next();
        System.out.print("Valor: ");
        valor = scanner.nextDouble();
        System.out.println("--------------------------------");
        System.out.println("        Cadastro Finalizado!");
        System.out.println("--------------------------------");

    }

    public void listarVeiculo() {

    }
}
