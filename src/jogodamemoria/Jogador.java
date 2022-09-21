package jogodamemoria;

public class Jogador implements Comparable<Jogador> {
    //Atributos
    private String nome;
    private int acertos;
    private int erros;
    //private Tabuleiro tabuleiro;
    
    //Construtor
    public Jogador(String nome){
        this.nome = nome;
        this.acertos = 0;
        this.erros = 0;
        //this.tabuleiro = new Tabuleiro(tamTabuleiro);
    }
    
    //Métodos
    public void ReiniciarJogo(){
        this.acertos = 0;
        this.erros = 0;
    }
    
    public void AumentarPonto(){
        this.acertos ++;
    }
    
    public void AumentarErro(){
        this.erros ++;
    }
    
    public int GetQuantidadePontos(){
        return this.acertos;
    }
    
    /*public Tabuleiro GetTabuleiro(){
        return this.tabuleiro;
    }*/
    
    @Override public int compareTo(Jogador jogador2){
        //reetornar de forma descrescente
        if(this.acertos > jogador2.GetQuantidadePontos()){
            return 1; //desloque a direita
        }else if(this.acertos < jogador2.GetQuantidadePontos()){
            return -1; //desloque à esquerda
        }else{
            return 0;
        }
    }
    
    public String GetNome(){
        return this.nome;
    }
}