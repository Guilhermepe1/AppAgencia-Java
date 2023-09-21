package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Venda {

    /** Instancia Scanner */
    Scanner sc = new Scanner(System.in);

    /** Método de venda que pesquisa atraves de inteiros */
    public void efetuarVenda(Cliente objCliente, Veiculo objVeiculo, Funcionario objFuncionario){
        int codVeiculo, codCliente, codFuncionario;

        System.out.println("---------------------------------");
        objVeiculo.consultaVeiculo();
        System.out.print("Informe o código do veículo: ");
        codVeiculo = sc.nextInt();
        objCliente.consultaCliente();
        System.out.print("Informe o código do cliente: ");
        codCliente = sc.nextInt();
        objFuncionario.consultaFuncionario();
        System.out.print("Informe o código do funcionário: ");
        codFuncionario = sc.nextInt();
        sc.nextLine();

        Veiculo vendaVeiculo = objVeiculo.listaVeiculo.get(codVeiculo-1);
        Cliente vendaCliente = objCliente.listaCliente.get(codCliente-1);
        Funcionario vendaFuncionario = objFuncionario.listaFuncionario.get(codFuncionario-1);

        if (formaDePagamento(vendaCliente, vendaVeiculo)) {
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
            System.out.println("Saldo do cliente: R$"+(vendaCliente.dinheiroDisponivel));

        } else {
            System.out.println("Escolha um veículo mais acessível, dentro do seu orçamento!");
        }

    }

    /** Método de venda que pesquisa através de strings */
    public boolean realizarVenda(Cliente objCliente, Veiculo objVeiculo){

        System.out.println("------ Validando Venda -------");

        if (formaDePagamento(objCliente, objVeiculo)){

            System.out.println("------------------- Parabéns  --------------------");
            System.out.println("Olá " + objCliente.nome);
            System.out.println("Você acaba de adquirir um " + objVeiculo.modelo);
            System.out.println("No precinho de " + objVeiculo.valor);
            System.out.println("--------------------------------------------------");

            System.out.println("Seu saldo é: " + objCliente.dinheiroDisponivel);

            return true;

        } else {
            System.out.println("Escolha um carro mais acessivel");
            return false;
        }
    }

    public Boolean formaDePagamento(Cliente cliente, Veiculo veiculo) {

        System.out.println("------ Forma de pagamento -------");
        System.out.println("- 1- À vista                    -");
        System.out.println("- 2- Financiamento              -");
        System.out.println("---------------------------------");
        System.out.print("Digite sua opção: ");
        int opcaoPagamento = sc.nextInt();
        sc.nextLine();

        switch (opcaoPagamento) {
            case 1:
                System.out.println("Pagamento à vista selecionado!");
                if (cliente.dinheiroDisponivel >= veiculo.valor) {
                    cliente.dinheiroDisponivel -= veiculo.valor;
                    return true;
                }
                break;
            case 2:
                if (financiamento(cliente, veiculo)) {
                    return true;
                }
                break;
        }

        return false;
    }

    public Boolean financiamento(Cliente cliente, Veiculo veiculo) {

        System.out.println("Financiamento selecionado!");
        System.out.print("Qual o valor de entrada? ");
        Double entrada = sc.nextDouble();

        if (entrada<=cliente.dinheiroDisponivel&&entrada>0) {
            cliente.dinheiroDisponivel -= entrada;
            Double saldoFinanciamento = veiculo.valor-entrada;
            System.out.println("O valor à parcelar é de R$"+saldoFinanciamento);
            System.out.print("Em quantas parcelas você deseja pagar? ");
            int qtdParcelas = sc.nextInt();
            sc.nextLine();
            System.out.println("Serão "+qtdParcelas+" de R$"+saldoFinanciamento/qtdParcelas);
            return true;
        } else {
            System.out.println("O valor de entrada é menor do que o disponível!");
        }

        return false;
    }
}
