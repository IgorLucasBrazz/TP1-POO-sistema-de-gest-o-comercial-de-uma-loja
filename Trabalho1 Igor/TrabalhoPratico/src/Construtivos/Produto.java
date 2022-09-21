package Construtivos;
public class Produto {
    private String codproduto;
    private String nome;
    private String desc;
    private String preco;
    private String qtd;
    private String categoria;

    public Produto(String codproduto, String nome, String desc, String preco, 
            String qtd, String categoria) {
        this.codproduto = codproduto;
        this.nome = nome;
        this.desc = desc;
        this.preco = preco;
        this.qtd = qtd;
        this.categoria = categoria;
    }

    public String getCodproduto() {
        return codproduto;
    }

    public void setCodproduto(String codproduto) {
        this.codproduto = codproduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getQtd() {
        return qtd;
    }

    public void setQtd(String qtd) {
        this.qtd = qtd;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }  
}