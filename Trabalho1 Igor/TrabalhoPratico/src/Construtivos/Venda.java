package Construtivos;
public class Venda {
    //Atributos
    private String codigovenda;
    private String produtoComprado;
    private String nomeCliente;
    private String enderecoEntrega;
    private String preco;
    private String dataInicial;
    private String dataFinal;
    private String qtd;
    private String status;
    private String totalPagar;

    //Construtor
    public Venda(String codigovenda, String produtoComprado, 
                  String nomeCliente, String enderecoEntrega, String preco, 
                  String dataInicial, String dataFinal, String qtd, 
                  String status, String totalPagar) {
        this.codigovenda = codigovenda;
        this.produtoComprado = produtoComprado;
        this.nomeCliente = nomeCliente;
        this.enderecoEntrega = enderecoEntrega;
        this.preco = preco;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.qtd = qtd;
        this.status = status;
        this.totalPagar = totalPagar;
    }

    //Getters e Setters
    public String getCodigovenda() {
        return codigovenda;
    }

    public void setCodigovenda(String codigovenda) {
        this.codigovenda = codigovenda;
    }

    public String getProdutoComprado() {
        return produtoComprado;
    }

    public void setProdutoComprado(String produtoComprado) {
        this.produtoComprado = produtoComprado;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(String dataInicial) {
        this.dataInicial = dataInicial;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getQtd() {
        return qtd;
    }

    public void setQtd(String qtd) {
        this.qtd = qtd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(String totalPagar) {
        this.totalPagar = totalPagar;
    }
}
