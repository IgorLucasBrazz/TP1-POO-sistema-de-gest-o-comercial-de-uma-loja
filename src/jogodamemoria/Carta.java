package jogodamemoria;
public class Carta {
    //Atributos
    private int id;
    private String url;
    private boolean isVirada;
    
    //Construtor
    public Carta(int id, String url){
        this.isVirada = false;
        this.id = id;
        this.url = url;
    }
    
    //Métodos
    public void VirarCarta(){
        this.isVirada = !this.isVirada;
    }   
    
    public int GetId(){
        return id;
    }

    public String getUrl() {
        return url;
    }
    
    
}