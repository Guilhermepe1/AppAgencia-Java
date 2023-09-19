package br.senai.sp.jandira.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionario {
    /** Declara variaveis */
    String nome, email, endereco, dataNascimento;
    long telefone, cpf, rg;

    /** Instancia scanner */
    Scanner scanner = new Scanner(System.in);
    /** Cria lista de funcionarios */
    List<Funcionario> listaFuncionario = new ArrayList<>();

    public void cadastrarFuncionario() {
        System.out.println("------ Cadastro Funcionário ------");
        System.out.print("Informe o nome: ");
        nome = scanner.nextLine();
        System.out.print("CPF: ");
        cpf = scanner.nextLong();
        System.out.print("RG: ");
        rg = scanner.nextLong();
        System.out.print("Data de nascimento: ");
        dataNascimento = scanner.next();
        System.out.print("E-mail: ");
        email = scanner.next();
        scanner.nextLine();
        System.out.print("Endereço: ");
        endereco = scanner.nextLine();
        System.out.print("Telefone: ");
        telefone = scanner.nextLong();
        System.out.println("--------------------------------");
        System.out.println("        Cadastro Finalizado!");
        System.out.println("--------------------------------");
    }

    public void consultaFuncionario() {
        int num = 0;
        System.out.println("Quantidade de funcionários cadastrados: "+listaFuncionario.size());
        for (Funcionario funcionario : listaFuncionario) {
            num++;
            System.out.println("---------- Funcionário COD:"+num+" ----------");
            System.out.println("Nome: "+nome);
            System.out.println("CPF: "+cpf);
            System.out.println("RG: "+rg);
            System.out.println("Data de Nascimento: "+dataNascimento);
            System.out.println("E-mail: "+email);
            System.out.println("Endereço: "+endereco);
            System.out.println("Telefone: "+telefone);
        }
    }
}
