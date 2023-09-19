package br.senai.sp.jandira.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Venda {
    /** Cria lista de vendas */
    List<Object> listaVendas = new ArrayList<>();
    /** Instancia veiculo */
    Veiculo veiculo = new Veiculo();
    /** Instancia cliente */
    Cliente cliente = new Cliente();
    /** Instancia scanner */
    Scanner sc = new Scanner(System.in);

    public void realizaVenda() {
        System.out.println("-------- Venda ---------");
        System.out.print("Digite o código do veículo: ");
        int codVeiculo = sc.nextInt();
        System.out.print("Digite o código do cliente: ");
        int codCliente = sc.nextInt();

        /** Cria lista do metodo */
        List<Object> listaTemporaria = new ArrayList<>();
        listaTemporaria.add(veiculo.listaVeiculo.get(codVeiculo));
        listaTemporaria.add((cliente.listaCliente.get(codCliente)));
        listaVendas.add(listaTemporaria);
        System.out.println("---------------------------------");
        System.out.println(listaTemporaria);
        System.out.println("---------------------------------");
    }
}
