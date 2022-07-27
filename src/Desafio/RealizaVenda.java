package Desafio;

import java.util.ArrayList;
import java.util.Scanner;

public class RealizaVenda extends Registro {


    private String nomeCliente;
    private double valorVenda;
    private String dataVenda;


    public RealizaVenda(String cpf, String email, String nomeCliente, double valorVenda, String dataVenda) {
        super(cpf, email);
        this.nomeCliente = nomeCliente;
        this.valorVenda = valorVenda;
        this.dataVenda = dataVenda;
    }

    ArrayList<RealizaVenda> realizaVenda = new ArrayList<>();

    Scanner input = new Scanner(System.in);


    public void cadastraVenda() {

        System.out.println("Informe o nome do cliente: " + nomeCliente + input.nextLine());

        System.out.println("Informe data da venda: " + dataVenda + input.nextLine());


        System.out.println("Informe o valor da venda:" + valorVenda + input.nextLine());


    }

    boolean executar = true;
    int opcao = input.nextInt();

    {
        while (executar) {
            System.out.println("deseja cadastrar essa venda? Digite 1 para sim e 2 para não: ");
            if (opcao == 1) {
                System.out.println("Sua venda foi cadastrada com sucesso! ");

            } else if (opcao == 2) {
                System.out.println("Venda não cadastrada");

            } else {
                System.out.println("Digite uma opção válida!");
            }
            executar = false;
        }

    }

}