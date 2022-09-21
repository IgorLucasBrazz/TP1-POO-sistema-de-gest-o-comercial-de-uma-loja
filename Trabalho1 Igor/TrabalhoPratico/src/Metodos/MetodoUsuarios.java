package Metodos;

import Construtivos.Usuario;

public class MetodoUsuarios {
    private int nummaxusuarios = 2000;
    private Usuario[] Vusuarios = new Usuario[nummaxusuarios];
    private int contadorUsuario = 0;
    
    public MetodoUsuarios(){
        Usuario Vusuario;
        Vusuario = new Usuario("1","Professor","UFV","1234","1234",
                                "Administrador","ilucas@mail.br",
                                "123456789","Centro","ap04","Santa Maria",
                                "6548123","Florestal");
        Vusuarios[contadorUsuario] = Vusuario;
        contadorUsuario++;
    }
    
    
        public boolean validarUsuario(String usuario, String senha){
        boolean x = false;
        for(int i = 0; i < contadorUsuario; i++){
            if(Vusuarios[i].getNome().equals(usuario) && 
               Vusuarios[i].getSenha().equals(senha)){
                return true;
            }
        }
        return false;
    }
        
    
    public int Numsuarios(){ 
        return contadorUsuario;
    }
    
    public Usuario[] getUsuarios(){ 
        return Vusuarios;
    }
    

    public String CadUsuario(Usuario VVusuario){ 
        if(contadorUsuario == nummaxusuarios){
            return "NÃO HÁ MAIS ESPAÇO PARA CADASTROS - LISTA CHEIA";
        }else{
            Vusuarios[contadorUsuario] = VVusuario;
            contadorUsuario++;
            return "USUÁRIO CADASTRADO!!!";
        }
    }
    
    public String EditarUsuario(Usuario VVusuario, int linha){ 
        Vusuarios[linha].setNome(VVusuario.getNome());
        Vusuarios[linha].setSobrenome(VVusuario.getSobrenome());
        Vusuarios[linha].setSenha(VVusuario.getSenha());
        Vusuarios[linha].setConfsenha(VVusuario.getConfsenha());
        Vusuarios[linha].setPerfil(VVusuario.getPerfil());
        Vusuarios[linha].setEmail(VVusuario.getEmail());
        Vusuarios[linha].setCpf(VVusuario.getCpf());
        Vusuarios[linha].setRua(VVusuario.getRua());
        Vusuarios[linha].setComplem(VVusuario.getComplem());
        Vusuarios[linha].setBairro(VVusuario.getBairro());
        Vusuarios[linha].setCep(VVusuario.getCep());
        Vusuarios[linha].setCidade(VVusuario.getCidade());
        return "USUÁRIO EDITADO!!!";
    }
    
    public int LinhaUsuario(String usuario){ 
        for(int i = 0; i < contadorUsuario; i++){
            if(Vusuarios[i].getIdusuario().equals(usuario)){
                return i;
            }
        }
        return -1;
    }
}
