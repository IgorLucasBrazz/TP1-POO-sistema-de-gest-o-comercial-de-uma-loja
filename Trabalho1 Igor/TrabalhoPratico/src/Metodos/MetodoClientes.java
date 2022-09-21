package Metodos;

import Construtivos.Cliente;

public class MetodoClientes {
    //Dados para os clientes
    private int nummaxclientes = 2000;
    private Cliente[] Vclientes = new Cliente[nummaxclientes];
    private int numClientes = 0;
    
    public MetodoClientes(){
        //CRIANDO O CADASTRO DE CLIENTES
        Cliente Vcliente;
        //criando o primeiro cliente
        Vcliente = new Cliente("10","02135421432","Igor","Igor@gmail.com",
                "1234", "Santa Maria, 74-ap04", "Perola, 222-casa3", 
                "BH", "2021/03/21");
        Vclientes[numClientes] = Vcliente;
        numClientes ++;
    }
    
    public int NumExistenteClientes(){
        return numClientes;
    }
    
    public Cliente[] getClientes(){
        return Vclientes;
    }
   
    public int LinhaCliente(String cliente){
        for(int i = 0; i < numClientes; i++){
            //agora será verificado se é possível fazer cadastro
            if(Vclientes[i].getCodigoCliente().equals(cliente)){
                return i;
            }
        }
        return -1;
    }
    
        //Método para editar
    public String EditarCliente(Cliente VVclientes, int linha){
        //código não precisa, pois é único
        Vclientes[linha].setCpfCliente(VVclientes.getCpfCliente());
        Vclientes[linha].setNameCliente(VVclientes.getNameCliente());
        Vclientes[linha].setEmailCliente(VVclientes.getEmailCliente());
        Vclientes[linha].setSenhaCliente(VVclientes.getSenhaCliente());
        Vclientes[linha].setEnderecoCliente(VVclientes.getEnderecoCliente());
        Vclientes[linha].setCidCliente(VVclientes.getCidCliente());
        Vclientes[linha].setDataVenda(VVclientes.getDataVenda());
        return "CLIENTE EDITADO!!!";
    }
    
    //Método para cadastrar clientes
    public String CadCliente(Cliente VVclientes){
        if(numClientes == nummaxclientes){
            return "NÃO HÁ MAIS ESPAÇO PARA CADASTROS - LISTA CHEIA";
        }else{
            Vclientes[numClientes] = VVclientes;
            numClientes++;
            return "CLIENTE CADASTRADO!!!";
        }
    }
    


}
