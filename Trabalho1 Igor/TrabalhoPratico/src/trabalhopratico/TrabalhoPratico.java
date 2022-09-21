//foi desmarcado a opção resizable para o tamanho do formulário permanecer fixo.
package trabalhopratico;
import Metodos.MetodoClientes;
import Metodos.MetodoProdutos;
import Metodos.MetodoUsuarios;
import Metodos.MetodoVendas;
import Interfaces.TelaLogin;

public class TrabalhoPratico {
    public static void main(String[] args) {
        MetodoUsuarios du = new MetodoUsuarios();
        MetodoProdutos dp = new MetodoProdutos();
        MetodoClientes dc = new MetodoClientes();
        MetodoVendas dv = new MetodoVendas();
        
        TelaLogin Login = new TelaLogin();
        Login.setDadosUsuarios(du);
        Login.setDadosProdutos(dp);
        Login.setDadosClientes(dc);
        Login.setDadosVendas(dv);
        Login.setLocationRelativeTo(null); //abre o formulário no centro da tela
        Login.setVisible(true); //queremos o formulário visível.
    }  
}