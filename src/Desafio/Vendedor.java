package Desafio;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Vendedor {

    private String cpf;
    private String  email;
    Scanner input = new Scanner(System.in);
    ArrayList<Vendedor>ListaVendedor = new ArrayList<>();
    private boolean continuarCadastrandoVendedo =true;

    public Vendedor(String cpf, String email) {
        this.cpf = cpf;
        this.email = email;


    }/// adicionar

    public void adiconaVendedor(){

        System.out.println("Qual é seu CPF ?  ");
        String  cpf = input.next();

        System.out.println("Qual é seu EMAIL ?  ");
        String email = input.next();

        System.out.println("Foi adicionado um vendedor");

        Vendedor novoVendedor = new Vendedor(cpf, email);
        ListaVendedor.add(novoVendedor);
        continuarCadastrandoVendedor();

    }
    public void continuarCadastrandoVendedor(){
        Scanner loop = new Scanner(System.in);
        while (continuarCadastrandoVendedo){
            System.out.println("Deseja cadastrar mais vendedor ? S / N ");
            String cadastro = loop.next();
            if (cadastro.equalsIgnoreCase("S")){
                adiconaVendedor();
            }else {
                continuarCadastrandoVendedo = false;
            }
        }

    }


    /// Exibir
    public void exibirVendedor(){

        for (int i =0; i < ListaVendedor.size(); i++)
            System.out.println("Número do CPF  "   +  ListaVendedor.get(i).getCpf()+ "Email" + ListaVendedor.get(i).getEmail());

    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


