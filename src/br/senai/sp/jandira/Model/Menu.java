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
        int escolha = 0;
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
            System.out.println("- 5- Consultar                  -");
            System.out.println("- 6- Sair                       -");
            System.out.println("---------------------------------");
            System.out.print("Digite sua opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine();
            System.out.println("---------------------------------");

            /** Seleciona metodo de acordo com a escolha */
            switch (escolha) {
                case 1:
                    veiculo.cadastrarVeiculo();
                    veiculo.listaVeiculo.add(veiculo);
                    break;
                case 2:
                    cliente.cadastrarCliente();
                    cliente.listaCliente.add(cliente);
                    break;
                case 3:
                    funcionario.cadastrarFuncionario();
                    funcionario.listaFuncionario.add(funcionario);
                    break;
                case 4:
                    venda.realizaVenda();
                    break;
                case 5:
                    Boolean escolhaConsulta = true;
                    while (escolhaConsulta) {
                        System.out.println("---------------------------------");
                        System.out.println("-           Consultar           -");
                        System.out.println("---------------------------------");
                        System.out.println("- 1- Consultar veículo          -");
                        System.out.println("- 2- Consultar cliente          -");
                        System.out.println("- 3- Consultar funcionário      -");
                        System.out.println("- 4- Voltar                     -");
                        System.out.println("---------------------------------");
                        System.out.print("Digite sua opção: ");
                        escolha = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("---------------------------------");
                        switch (escolha) {
                            case 1:
                                veiculo.consultaVeiculo();
                                break;
                            case 2:
                                cliente.consultaCliente();
                                break;
                            case 3:
                                funcionario.consultaFuncionario();
                                break;
                            default:
                                escolhaConsulta = false;
                                break;
                        }
                    }
                    break;
                default:
                    continua = false;
                    break;
            }
        }
    }
}
