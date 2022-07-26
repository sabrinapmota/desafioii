package Desafio;


import java.util.ArrayList;
import java.util.Scanner;

public class RealizaVenda implements Venda {



    private double valorVenda;
    private String dataVenda;


    ArrayList<RealizaVenda> realizaVenda = new ArrayList<>();

    Scanner carrinho = new Scanner(System.in);

    public RealizaVenda(double valorVenda, String dataVenda) {
        this.valorVenda = valorVenda;
        this.dataVenda = dataVenda;
    }

    public void cadastraVenda(){
        System.out.println("Informe data da venda: ");
        System.out.println("Nome do Vendedor: ");
        System.out.println("Nome do Cliente");


    }

    public void calculaVenda (){
        System.out.println("O valor da venda foi:Informe o nome do produto: ");

        System.out.println("Informe a quantidade: ");

        System.out.println("Informe o valor");


    }


}
