package br.senai.sp.jandira.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
    /** Declara variaveis */
    String nome, email, endereco, dataNascimento;
    Long telefone, cpf, rg;
    Double dinheiroDisponivel;

    /** Instancia scanner */
    Scanner scanner = new Scanner(System.in);

    /** Cria lista de clientes */
    List<Cliente> listaCliente = new ArrayList<>();

    public Cliente cadastrarCliente(Cliente cliente) {
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
        scanner.nextLine();
        System.out.print("Qual valor deseja gastar: ");
        dinheiroDisponivel = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("--------------------------------");
        System.out.println("        Cadastro Finalizado!");
        System.out.println("--------------------------------");

        return cliente;
    }

    public void adicionarCliente(Cliente cliente) {
        listaCliente.add(cliente);
    }

    public void consultaCliente() {

        int num = 0;
        System.out.println("Quantidade de clientes cadastrados: "+listaCliente.size());
        for (Cliente cliente : listaCliente) {
            num++;
            System.out.println("---------- Cliente COD:"+num+" ----------");
            System.out.println("Nome: "+cliente.nome);
            System.out.println("CPF: "+cliente.cpf);
            System.out.println("RG: "+cliente.rg);
            System.out.println("Data de Nascimento: "+cliente.dataNascimento);
            System.out.println("E-mail: "+cliente.email);
            System.out.println("Endereço: "+cliente.endereco);
            System.out.println("Telefone: "+cliente.telefone);
            System.out.println("Saldo: R$"+cliente.dinheiroDisponivel);
        }
    }

    public Cliente pesquisarComprador(String comprador) {
        for (Cliente cliente : listaCliente) {
            if (cliente.nome.equalsIgnoreCase(comprador)) {
                return cliente;
            }
        }
        return null;
    }
}
