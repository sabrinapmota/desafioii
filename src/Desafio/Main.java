package Desafio;

import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       /* Vendedor v1 = new Vendedor("174", "jumento@jumento");
        v1.adiconaVendedor();
        v1.exibirVendedor();

        System.out.println("-------------------------------------------------------");

        RealizaVenda Rv1 = new RealizaVenda ("String", "String", "String", "double", "String");
        Rv1.cadastraVenda ();
        Rv1.getCpf ();
        Rv1.getEmail ();



        System.out.println("---------------------------------------------------------");

        Cliente cliente1 = new Cliente("String","String","String");
        cliente1.cadastraCliente();
        cliente1.exibeCliente();
        cliente1.continuarCadastrando();
        cliente1.excluirCliente();


        System.out.println ("----------------------------------------------------------");

        Registro R1 = new Registro("String","String");
        R1.getCpf ();
        R1.getEmail ();*/

        Cliente cliente = new Cliente("a", "a", "a");
        cliente.cadastraCliente();
        cliente.exibeCliente();
    }

}
