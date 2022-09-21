package jogodamemoria;
import java.util.Random;
public class JogoDaMemoria {
    public static void main(String[] args) {
        Interface i = new Interface();
        Random aleat = new Random();
        int tamanho = 4;
        
        
        Placar p = new Placar();
        p.CriarJogador("Pedro");
        p.CriarJogador("Bot");
        p.CriarTabuleiro(tamanho);
        p.DefinirJogadorInicial();
        while(!p.GetVencedor()){
            int carta1;
            int carta2;
            
            if(p.GetBot()){ //esses valores não devem ser iguais
                carta1 = aleat.nextInt(2 * tamanho);
                p.VirarCarta(carta1);
                //colocar um time
                carta2 = aleat.nextInt(2 * tamanho);
                p.VirarCarta(carta2);
                //colocar time  
            }else{
                carta1 = 1; //vem da interface
                p.VirarCarta(carta1);
                
                carta2 = 6;//vem da interface
                p.VirarCarta(carta2);
                
            }
            p.ValidarJogada(carta1, carta2); 
            
            
        }
        
    }   
}