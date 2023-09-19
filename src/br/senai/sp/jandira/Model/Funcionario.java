package br.senai.sp.jandira.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionario {
    /** Declara variaveis */
    String nome, email, endereco, dataNascimento;
    long telefone, cpf, rg;
    double bonus;

    /** Instancia scanner */
    Scanner scanner = new Scanner(System.in);
    /** Cria lista de funcionarios */
    List<Funcionario> listaFuncionario = new ArrayList<>();

    public Funcionario cadastrarFuncionario(Funcionario funcionario) {
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

        return funcionario;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        listaFuncionario.add(funcionario);
    }

    public void consultaFuncionario() {
        int num = 0;
        System.out.println("Quantidade de funcionários cadastrados: "+listaFuncionario.size());
        for (Funcionario funcionario : listaFuncionario) {
            num++;
            System.out.println("---------- Funcionário COD:"+num+" ----------");
            System.out.println("Nome: "+funcionario.nome);
            System.out.println("CPF: "+funcionario.cpf);
            System.out.println("RG: "+funcionario.rg);
            System.out.println("Data de Nascimento: "+funcionario.dataNascimento);
            System.out.println("E-mail: "+funcionario.email);
            System.out.println("Endereço: "+funcionario.endereco);
            System.out.println("Telefone: "+funcionario.telefone);
        }
    }

    public Double bonusFuncionario(Veiculo objVeiculo){

        return bonus = objVeiculo.valor * 0.10;
    }
}
