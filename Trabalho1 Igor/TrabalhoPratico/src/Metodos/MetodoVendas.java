package Metodos;

import Construtivos.Venda;

public class MetodoVendas {
    private int maxvendas = 20;
    private Venda[] Vvendas = new Venda[maxvendas];
    private int contvendas = 0;
    
    public MetodoVendas(){
        Venda Vvenda;
        Vvenda = new Venda("1","Jogos","Pedro","Primeiro","200","25/04/2021",
                            "28/04/2021","2","Entregue","R$400");
        Vvendas[contvendas] = Vvenda;
        contvendas++;
    }
    
    public int NumVendas(){
        return contvendas;
    }
    
    public Venda[] getVendas(){
        return Vvendas;
    }
    
    public int LinhaVenda(String venda){
        for(int i = 0; i < contvendas; i++){
            if(Vvendas[i].getCodigovenda().equals(venda)){
                return i;
            }
        }
        return -1;
    }
    
    public String EditarVenda(Venda VVvendas, int linha){
        Vvendas[linha].setProdutoComprado(VVvendas.getProdutoComprado());
        Vvendas[linha].setNomeCliente(VVvendas.getNomeCliente());
        Vvendas[linha].setEnderecoEntrega(VVvendas.getEnderecoEntrega());
        Vvendas[linha].setPreco(VVvendas.getPreco());
        Vvendas[linha].setDataInicial(VVvendas.getDataInicial());
        Vvendas[linha].setDataFinal(VVvendas.getDataFinal());
        Vvendas[linha].setQtd(VVvendas.getQtd());
        Vvendas[linha].setStatus(VVvendas.getStatus());
        Vvendas[linha].setTotalPagar(VVvendas.getTotalPagar());
        return "VENDA EDITADA!!!";
    }
    
    public String CadVendas(Venda VVvendas){
        if(contvendas == maxvendas){
            return "NÃO HÁ MAIS ESPAÇO PARA CADASTROS - LISTA CHEIA";
        }else{
            Vvendas[contvendas] = VVvendas;
            contvendas++;
            return "VENDA CADASTRADA!!!";
        }
    }
}
