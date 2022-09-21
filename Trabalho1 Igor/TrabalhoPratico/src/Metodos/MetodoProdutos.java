package Metodos;

import Construtivos.Produto;

public class MetodoProdutos {
    private int nummaxprodutos = 1000;
    private Produto[] Vprodutos = new Produto[nummaxprodutos];
    private int contadorProduto = 0;
    
    public MetodoProdutos(){

        Produto Mproduto;
        Mproduto = new Produto("1", "Jogo", "The last of us",
                                "R$140,00", "15", "Suspense");
        Vprodutos[contadorProduto] = Mproduto;
        contadorProduto ++;
    }
    
    public int NumProduto(){
        return contadorProduto;
    }
    
    public Produto[] getProdutos(){
        return Vprodutos;
    }
    

    public int LinhaProduto(String produto){
        for(int i = 0; i < contadorProduto; i++){
            if(Vprodutos[i].getCodproduto().equals(produto)){
                return i;
            }
        }
        return -1;
    }
    
    public String EditarProduto(Produto VVprodutos, int linha){
        Vprodutos[linha].setNome(VVprodutos.getNome());
        Vprodutos[linha].setDesc(VVprodutos.getDesc());
        Vprodutos[linha].setPreco(VVprodutos.getPreco());
        Vprodutos[linha].setQtd(VVprodutos.getQtd());
        Vprodutos[linha].setCategoria(VVprodutos.getCategoria());
        return "PRODUTO EDITADO!!!";
    }
    
    public String CadProduto(Produto VVprodutos){
        if(contadorProduto == nummaxprodutos){
            return "NÃO HÁ MAIS ESPAÇO PARA CADASTROS - LISTA CHEIA";
        }else{
            Vprodutos[contadorProduto] = VVprodutos;
            contadorProduto++;
            return "PRODUTO CADASTRADO!!!";
        }
    }
}
