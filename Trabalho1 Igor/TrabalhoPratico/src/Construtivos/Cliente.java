package Construtivos;
public class Cliente {
    private String codigoCliente;
    private String cpfCliente;
    private String enderecoCliente;
    private String endereco2Cliente;
    private String cidCliente;
    private String nameCliente;
    private String emailCliente;
    private String senhaCliente;
    private String dataVenda;
    

    public Cliente(String codigoCliente, String cpfCliente, String nomeCliente, 
                    String emailCliente, String senhaCliente, 
                    String enderecoCliente, String endereco2Cliente, 
                    String cidadeCliente,String dataVenda) {
        this.codigoCliente = codigoCliente;
        this.cpfCliente = cpfCliente;
        this.nameCliente = nomeCliente;
        this.emailCliente = emailCliente;
        this.senhaCliente = senhaCliente;
        this.enderecoCliente = enderecoCliente;
        this.endereco2Cliente = endereco2Cliente;
        this.cidCliente = cidadeCliente;
        this.dataVenda = dataVenda;
    }
    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getNameCliente() {
        return nameCliente;
    }

    public void setNameCliente(String nameCliente) {
        this.nameCliente = nameCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getSenhaCliente() {
        return senhaCliente;
    }

    public void setSenhaCliente(String senhaCliente) {
        this.senhaCliente = senhaCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getEndereco2Cliente() {
        return endereco2Cliente;
    }

    public void setEndereco2Cliente(String endereco2Cliente) {
        this.endereco2Cliente = endereco2Cliente;
    }

    public String getCidCliente() {
        return cidCliente;
    }

    public void setCidCliente(String cidCliente) {
        this.cidCliente = cidCliente;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }    
}