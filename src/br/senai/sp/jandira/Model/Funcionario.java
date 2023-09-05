package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Funcionario {
    /** Declara variaveis */
    String nome, email, endereco, dataNascimento;
    long telefone, cpf, rg;

    /** Instancia scanner */
    Scanner scanner = new Scanner(System.in);

    public void cadastrarFuncionario() {
        System.out.println("------ Cadastro Funcionário ------");
        System.out.print("Informe o nome: ");
        nome = scanner.next();
        System.out.print("CPF: ");
        cpf = scanner.nextLong();
        System.out.print("RG: ");
        rg = scanner.nextLong();
        System.out.print("Data de nascimento: ");
        dataNascimento = scanner.next();
        System.out.print("E-mail: ");
        email = scanner.next();
        System.out.print("Endereço: ");
        endereco = scanner.next();
        System.out.print("Telefone: ");
        telefone = scanner.nextLong();
        System.out.println("--------------------------------");
        System.out.println("        Cadastro Finalizado!");
        System.out.println("--------------------------------");

    }
}
