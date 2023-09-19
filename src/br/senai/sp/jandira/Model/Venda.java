package br.senai.sp.jandira.Model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Venda {

    /** Instancia Scanner */
    Scanner sc = new Scanner(System.in);



    public void realizarVenda(Cliente objCliente, Veiculo objVeiculo, Funcionario objFuncionario){
        int codVeiculo, codCliente, codFuncionario;


        System.out.println("---------------------------------");
        System.out.print("Informe o código do veículo: ");
        codVeiculo = sc.nextInt();
        System.out.print("Informe o código do cliente: ");
        codCliente = sc.nextInt();
        System.out.print("Informe o código do funcionário: ");
        codFuncionario = sc.nextInt();
        sc.nextLine();

        Veiculo vendaVeiculo = objVeiculo.listaVeiculo.get(codVeiculo-1);
        Cliente vendaCliente = objCliente.listaCliente.get(codCliente-1);
        Funcionario vendaFuncionario = objFuncionario.listaFuncionario.get(codFuncionario-1);

        if (vendaCliente.dinheiroDisponivel>=vendaVeiculo.valor) {
            System.out.println("------ Validando Venda -------");
            System.out.println("------------> Veiculo Vendido");
            System.out.println("Marca: " + vendaVeiculo.marca);
            System.out.println("Modelo: " + vendaVeiculo.modelo);
            System.out.println("Ano: " + vendaVeiculo.ano);
            System.out.println("Cor: " + vendaVeiculo.cor);
            System.out.println("Combustível: " + vendaVeiculo.combustivel);
            System.out.println("Valor: R$" + vendaVeiculo.valor);
            System.out.println("------------> Comprador");
            System.out.println("Nome: "+vendaCliente.nome);
            System.out.println("CPF: "+vendaCliente.cpf);
            System.out.println("------------> Funcionário");
            System.out.println("Nome: "+vendaFuncionario.nome);
            System.out.println("CPF: "+vendaFuncionario.cpf);
            System.out.println("Bonûs do funcionário: R$"+vendaFuncionario.bonusFuncionario(vendaVeiculo));
            System.out.println("---------------------------------");

            JOptionPane.showMessageDialog(null, "Valeu Pelo Dinheiro!", "Finalização Venda", JOptionPane.WARNING_MESSAGE);


        } else {
            System.out.println("Escolha um veículo mais acessível, dentro do seu orçamento!");
        }



//        System.out.println("------ Validando Venda -------");
//
//        if (objCliente.dinheiroDisponivel >= objVeiculo.valor){
//
//            System.out.println("------------------- Parabéns  --------------------");
//            System.out.println("Olá " + objCliente.nome);
//            System.out.println("Você acaba de adquirir um " + objVeiculo.modelo);
//            System.out.println("No precinho de " + objVeiculo.valor);
//            System.out.println("--------------------------------------------------");
//
//
//
//        } else {
//            System.out.println("Escolha um carro mais acessivel");
//
//        }

    }
}
