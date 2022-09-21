package jogodamemoria;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Placar { //controlador
    private int jogadorVez;
    private int qtdJogadores;
    private boolean vencedor = false;
    private ArrayList<Jogador> jogadores = new ArrayList<>();
    private Tabuleiro tabuleiro;
    
    //Métodos
    public void DefinirJogadorInicial(){
        Random aleat = new Random();
        this.jogadorVez = aleat.nextInt(this.qtdJogadores);
    }
    
    public void CriarJogador(String nome){
        this.jogadores.add(new Jogador(nome));
        this.qtdJogadores ++;
    }
    
    public void CriarTabuleiro(int tamanho){
        this.tabuleiro = new Tabuleiro(tamanho);
    }
    
    public boolean Acertou(int carta1, int carta2){
        //Perguntar para o jogador da vez se a carta 1 é igual à carta 2
        //Perguntar para o tabuleiro do jogador da vez se a carta de id 1 é igual à carta de id 2
        return this.tabuleiro.VerificarPares(carta1, carta2);
    }
    
    public void EscolherJogador(){
        this.jogadorVez = (this.jogadorVez + 1 ) % qtdJogadores;
    }
    
    public boolean HasVencedor(){ //3 2 1 == qtd pares. O jogo acaba se a soma dos pontos for igual a qtd pares
        //VERIFICAR SE O NÚMERO DE PONTOS DO JOGADOR ATUAL É IGUAL AO MÁXIMO DE PARES DE CARTAS DO TABULEIRO DO JOGADOR ATUAL
        int soma = 0;
        for(int i = 0; i < this.qtdJogadores; i++){
            soma = soma + this.jogadores.get(i).GetQuantidadePontos();
        }
        return (soma == this.tabuleiro.GetTamanho());   
    }
    
    public void SetWinner(){
        Collections.sort(jogadores);   
    }
    
    public void ValidarJogada(int carta1, int carta2){
        if(Acertou(carta1, carta2)){
            this.jogadores.get(this.jogadorVez).AumentarPonto();
            //Se ele acertou, verificar se é o vencedor
            if(HasVencedor()){
                this.vencedor = true;
                SetWinner();
            }   
        }else{
            this.jogadores.get(this.jogadorVez).AumentarErro();
            EscolherJogador();    
        }
    }  
    
    public void VirarCarta(int cartaId){
        this.tabuleiro.VirarCarta(cartaId);
    }
    
    public boolean GetVencedor(){
        return this.vencedor;
    }
    
    public boolean GetBot(){
        return (this.jogadores.get(this.jogadorVez).GetNome() == "Bot");
    }
}