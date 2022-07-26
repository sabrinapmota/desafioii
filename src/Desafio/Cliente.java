package Desafio;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {

    Scanner cliente = new Scanner(System.in);

    //Set<String> Cliente = new HashSet<>();
    ArrayList<Cliente> nomeCli = new ArrayList<>();
    boolean continuaCadastroCliente = true;
    String nomeCliente;
    String cpfCliente;
    String emailCliente;

    public Cliente(String nomeCliente, String cpfCliente, String emailCliente) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.emailCliente = emailCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public void cadastraCliente() {

        System.out.println("Digite o nome do Cliente a ser cadastrado ");
        nomeCliente = cliente.nextLine();

        System.out.println("Digite o CPF do Cliente a ser cadastrado ");
        cpfCliente = cliente.nextLine();

        System.out.println("Digite o e-mail Cliente a ser cadastrado ");
        emailCliente = cliente.nextLine();

        Cliente cliente1 = new Cliente(nomeCliente, cpfCliente, emailCliente);

        nomeCli.add(cliente1);

        continuarCadastrando();
    }

    public void continuarCadastrando() {
        Scanner repete = new Scanner(System.in);

        while (continuaCadastroCliente) {
            System.out.println("Deseja cadastrar mais clientes ? S / N ");
            String cadastro = repete.next();

            if (cadastro.equalsIgnoreCase("S")) {
                cadastraCliente();
            } else {
                continuaCadastroCliente = false;
            }
        }
    }

    public void exibeCliente() {

        System.out.println("Lista de Clientes Cadastrados ");
        for (int i = 0; i < nomeCli.size(); i++) {
            System.out.println("NOME " + nomeCli.get(i).nomeCliente + " CPF " + nomeCli.get(i).cpfCliente + " E-MAIL " + nomeCli.get(i).emailCliente);
        }
    }

    public boolean validaCliente() {

        for (int i = 0; i < nomeCli.size(); i++) {
            if (nomeCli.get(i).nomeCliente == nomeCliente) {
                System.out.println("Nome duplicado");
            } else if (nomeCli.get(i).cpfCliente == cpfCliente) {
                System.out.println("CPF duplicado");
            } else if (nomeCli.get(i).emailCliente == emailCliente) {
                System.out.println("EMAIL duplicado");
            }
        }
        return true;
    }

    public void excluirCliente() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome a ser excluido: ");
        String excluir = input.nextLine();

        boolean excluirItem = false;

        for (int i = 0; i < this.nomeCli.size(); i++) {
            if (this.nomeCli.get(i).nomeCliente.equals(excluir)) {
                this.nomeCli.remove(i);
                System.out.println("Item excluido com Sucesso");
                excluirItem = true;
            }
        }
        if (!excluirItem) {
            System.out.println("Valor não encontrado,favor verificar !!! ");
        }

    }

}

