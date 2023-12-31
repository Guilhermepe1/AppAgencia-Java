package br.senai.sp.jandira.Model;


import javax.swing.*;
import java.util.Scanner;

public class Menu {

    /** Instancia Cliente para referencia da lista */
    Cliente cliente = new Cliente();
    /** Instancia Veiculo para referencia da lista */
    Veiculo veiculo = new Veiculo();
    /** Instancia Funcionario para referencia da lista */
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
            System.out.println("- 6- Pesquisar                  -");
            System.out.println("- 7- Sair                       -");
            System.out.println("---------------------------------");
            System.out.print("Digite sua opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine();
            System.out.println("---------------------------------");

            /** Seleciona metodo de acordo com a escolha */
            switch (escolha) {
                case 1:
                    Veiculo criaVeiculo = new Veiculo();
                    criaVeiculo.cadastrarVeiculo(criaVeiculo);
                    veiculo.adicionarVeiculo(criaVeiculo);
                    break;
                case 2:
                    Cliente criaCliente = new Cliente();
                    criaCliente.cadastrarCliente(criaCliente);
                    cliente.adicionarCliente(criaCliente);
                    break;
                case 3:
                    Funcionario criaFuncionario = new Funcionario();
                    criaFuncionario.cadastrarFuncionario(criaFuncionario);
                    funcionario.adicionarFuncionario(criaFuncionario);
                    break;
                case 4:
//                    venda.efetuarVenda(cliente, veiculo, funcionario);

                    cliente.consultaCliente();
                    System.out.println("Informe qual cliente deseja comprar um veiculo: ");
                    String comprador = scanner.nextLine();
                    Cliente objComprador = cliente.pesquisarComprador(comprador);

                    veiculo.consultaVeiculo();
                    System.out.println("Informe qual veículo: ");
                    String veiculoSelecionado = scanner.nextLine();
                    Veiculo objVeiculoVendido = veiculo.pesquisarVeiculoCompra(veiculoSelecionado);

                    funcionario.consultaFuncionario();
                    System.out.println("Informe quem é o vendedor: ");
                    String vendedor = scanner.nextLine();
                    Funcionario objVendedor = funcionario.pesquisarVendedor(vendedor);

                    boolean vender = venda.realizarVenda(objComprador, objVeiculoVendido);

                    if (vender){

                        objVendedor.bonusFuncionario(objVeiculoVendido);

                        System.out.println("O Funcionario recebeu: " + objVendedor.bonus);

                        JOptionPane.showMessageDialog(null, "Valeu Pelo Dinheiro!", "Finalização Venda", JOptionPane.WARNING_MESSAGE);
                    }

                    break;
                case 5:
                    /** Inicia laco de repeticao do menu de consultas */
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
                case 6:
                    System.out.print("Informe qual o modelo do veículo: ");
                    String veiculoPesquisado = scanner.nextLine();
                    Boolean validaVeiculo = false;

                    if (veiculoPesquisado != null) {
                        validaVeiculo = veiculo.pesquisarVeiculo(veiculoPesquisado);
                    } else {
                        System.out.println("Impossível realizar pesquisa!");
                    }

                    if (validaVeiculo) {
                        System.out.println("Veículo disponível para compra!");
                    } else {
                        System.out.println("Veículo indisponível.");
                    }

                    break;
                case 7:
                    continua = false;
                    break;
            }

            if (escolha < 0 || escolha > 7 ){
                System.out.println("Digite uma opção válida!");
            }
        }
    }
}
