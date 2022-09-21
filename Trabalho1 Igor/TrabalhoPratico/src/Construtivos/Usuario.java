package Construtivos;

public class Usuario {
    private String idusuario;
    private String nome;
    private String sobrenome;
    private String senha;
    private String confsenha;
    private String rua;
    private String complem;
    private String bairro;
    private String cep;
    private String cidade;
    private String perfil;
    private String email;
    private String cpf;
  


    public Usuario(String idusuario, String nome, String sobrenome, 
                    String senha, String confsenha, String perfil, 
                    String email, String cpf, String rua, String complem, 
                    String bairro, String cep, String cidade) {
        this.idusuario = idusuario;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.senha = senha;
        this.confsenha = confsenha;
        this.perfil = perfil;
        this.email = email;
        this.cpf = cpf;
        this.rua = rua;
        this.complem = complem;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfsenha() {
        return confsenha;
    }

    public void setConfsenha(String confsenha) {
        this.confsenha = confsenha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplem() {
        return complem;
    }

    public void setComplem(String complem) {
        this.complem = complem;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}