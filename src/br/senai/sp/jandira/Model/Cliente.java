package br.senai.sp.jandira.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Cliente {
    /** Declara variaveis */
    String nome, email, endereco, dataNascimento;
    Long telefone, cpf, rg;

    /** Instancia scanner */
    Scanner scanner = new Scanner(System.in);
    /** Cria lista de clientes */
    public List<Cliente> listaCliente = new ArrayList<>();

    public void cadastrarCliente() {
        System.out.println("------ Cadastro Cliente ------");
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

    public void consultaCliente() {
        int num = 0;
        System.out.println("Quantidade de clientes cadastrados: "+listaCliente.size());
        for (Cliente cliente : listaCliente) {
            num++;
            System.out.println("---------- Cliente COD:"+num+" ----------");
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
