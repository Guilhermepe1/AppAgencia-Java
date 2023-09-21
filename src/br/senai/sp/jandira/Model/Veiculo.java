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

    public Veiculo cadastrarVeiculo(Veiculo veiculo) {
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
        return veiculo;

    }

    public void adicionarVeiculo(Veiculo veiculo) {
        listaVeiculo.add(veiculo);
    }

    public void consultaVeiculo() {
        int num = 0;
        System.out.println("Quantidade de veículos cadastrados: "+listaVeiculo.size());
        for (Veiculo veiculo : listaVeiculo) {
            num++;
            System.out.println("---------- Veículo COD:"+num+" ----------");
            System.out.println("Marca: "+veiculo.marca);
            System.out.println("Modelo: "+veiculo.modelo);
            System.out.println("Ano: "+veiculo.ano);
            System.out.println("Cor: "+veiculo.cor);
            System.out.println("Combustível: "+veiculo.combustivel);
            System.out.println("Valor: R$"+veiculo.valor);
        }
    }

    public Boolean pesquisarVeiculo(String modeloVeiculo) {
        for (Veiculo veiculo : listaVeiculo) {
            if (veiculo.modelo.equalsIgnoreCase(modeloVeiculo)) {
                return true;
            }
        }
        return false;
    }

    public Veiculo pesquisarVeiculoCompra(String modeloVeiculo) {
        for (Veiculo veiculo : listaVeiculo) {
            if (veiculo.modelo.equalsIgnoreCase(modeloVeiculo)) {
                return veiculo;
            }
        }
        return null;
    }

}
