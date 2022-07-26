package Desafio;

public class Venda {
    private String cliente;
    private String Vendeddor;
    private Double valorProduto;
    private int dataRegistro;


    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVendeddor() {
        return Vendeddor;
    }

    public void setVendeddor(String vendeddor) {
        Vendeddor = vendeddor;
    }

    public Double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public int getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(int dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public Venda(String cliente, String vendeddor, Double valorProduto, int dataRegistro) {
        this.cliente = cliente;
        Vendeddor = vendeddor;
        this.valorProduto = valorProduto;
        this.dataRegistro = dataRegistro;


    }
}