package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Menu {

    /** Instancia Cliente */
    Cliente cliente = new Cliente();
    /** Instancia Veiculo */
    Veiculo veiculo = new Veiculo();
    /** Instancia Funcionario */
    Funcionario funcionario = new Funcionario();
    /** Instancia Venda */
    Venda venda = new Venda();
    /** Instancia Scanner */
    Scanner scanner = new Scanner(System.in);

    public void chamaMenu() {
        /** Declara variaveis */
        int escolha;
        Boolean continua = true;

        /** Inicia laco de repeticao do menu */
        while (continua) {
            System.out.println("---------------------------------");
            System.out.println("-       Escolha uma opção       -");
            System.out.println("---------------------------------");
            System.out.println("- 1- Cadastrar veículo          -");
            System.out.println("- 2- Cadastrar cliente          -");
            System.out.println("- 3- Cadastrar funcionário      -");
            System.out.println("- 4- Realizar venda             -");
            System.out.println("- 5- Sair                       -");
            System.out.println("---------------------------------");
            System.out.print("Digite sua opção: ");
            escolha = scanner.nextInt();
            System.out.println("---------------------------------");

            /** Seleciona metodo de acordo com a escolha */
            switch (escolha) {
                case 1:
                    veiculo.cadastrarVeiculo();
                    break;
                case 2:
                    cliente.cadastrarCliente();
                    break;
                case 3:
                    funcionario.cadastrarFuncionario();
                    break;
                case 4:
                    break;
                case 5:
                    continua = false;
                    break;
            }
        }
    }
}
