package jogodamemoria;

import java.util.ArrayList;
import java.util.Random;

public class Tabuleiro {
    //Atributos
    private int tamanho;
    private ArrayList<Carta> cartas = new ArrayList<>();
    
    //Construtor
    public Tabuleiro(int tamanho){
        this.tamanho = tamanho;
        for(int i = 0; i < tamanho; i++){
            //Criar o par de cartas
            this.cartas.add(CriarCartas(i));
            this.cartas.add(CriarCartas(i));
            
        }
        EmbaralharCartas();
    }
    
    public Carta CriarCartas(int id){
        String url = "";
        switch(id){
            case 1: 
                url = "file:/C:/Users/Pedro/OneDrive/Documentos/NetBeansProjects/JogoDaMemoria/src/Imagens/cd.png";
                break;
            case 2:
                url = "file:/C:/Users/Pedro/OneDrive/Documentos/NetBeansProjects/JogoDaMemoria/src/Imagens/dvd.png";
                break;
            case 3:
                url = "file:/C:/Users/Pedro/OneDrive/Documentos/NetBeansProjects/JogoDaMemoria/src/Imagens/livros.png";
                break;
            case 4:
                url = "file:/C:/Users/Pedro/OneDrive/Documentos/NetBeansProjects/JogoDaMemoria/src/Imagens/jogos.png";
                break;
            //default:
                //url = "C:/Users/Pedro/OneDrive/Documentos/Trabalho Prático 2/Imagens";
                //break;
        }
        Carta cartas = new Carta(id, url);
        return cartas;
    }
    
    public void EmbaralharCartas(){
        Random aleat = new Random();
        
        for(int i = 0; i < this.tamanho; i++){
            Carta aux = this.cartas.get(i);
            int num = aleat.nextInt(this.tamanho);
            this.cartas.set(i, this.cartas.get(num));
            this.cartas.set(num, aux);    
        }
    } 
    
    public int GetTamanho(){
        return this.tamanho;
    }
    
    public boolean VerificarPares(int id1, int id2){
        //Verificar se o id da carta que está no índice id1 do tabuleiro é igual ao id da carta que está no índice id2
        if(this.cartas.get(id1).GetId() == this.cartas.get(id2).GetId()){
            return true;    
        }else{
            this.cartas.get(id1).VirarCarta();
            this.cartas.get(id2).VirarCarta();
            return false;
        }  
    }
    
    public void VirarCarta(int id){
        this.cartas.get(id).VirarCarta();
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }
    
}