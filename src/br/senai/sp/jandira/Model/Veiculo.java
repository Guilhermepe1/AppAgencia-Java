package br.senai.sp.jandira.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Veiculo {
    /** Declara variaveis */
    String marca, modelo, cor, combustivel;
    int ano;
    double valor;

    /** Instancia scanner */
    Scanner scanner = new Scanner(System.in);
    /** Cria lista de veiculos */
    public List<Veiculo> listaVeiculo = new ArrayList<>();

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

    public void consultaVeiculo() {
        int num = 0;
        System.out.println("Quantidade de veículos cadastrados: "+listaVeiculo.size());
        for (Veiculo veiculo : listaVeiculo) {
            num++;
            System.out.println("---------- Veículo COD:"+num+" ----------");
            System.out.println("Marca: "+marca);
            System.out.println("Modelo: "+modelo);
            System.out.println("Ano: "+ano);
            System.out.println("Cor: "+cor);
            System.out.println("Combustível: "+combustivel);
            System.out.println("Valor: R$"+valor);
        }
    }

}
