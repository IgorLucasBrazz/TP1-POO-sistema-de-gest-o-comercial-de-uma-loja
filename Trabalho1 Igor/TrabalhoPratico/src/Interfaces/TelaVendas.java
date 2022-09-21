package Interfaces;

import Metodos.MetodoVendas;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Construtivos.Venda;
import Facilitadores.Utilidades;

public class TelaVendas extends javax.swing.JInternalFrame {
    private MetodoVendas dv;
    private int vendaAtual = 0;
    private boolean cmdNovo = false;
    private DefaultTableModel Usertable;
    
    public void setDadosVendas(MetodoVendas dv){
        this.dv = dv;
    }
    
    public TelaVendas() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        textoprodutocomprado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textonomecliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        botnovaVenda = new javax.swing.JButton();
        botsalvar = new javax.swing.JButton();
        botalterar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        textoendereco = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        textopreco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textostatus = new javax.swing.JTextField();
        textoquantidade = new javax.swing.JTextField();
        textodatainicial = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textodatafinal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textototalpagar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textocodigovenda = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Venda de Produtos");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Produto Comprado:");

        textoprodutocomprado.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textoprodutocomprado.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Preço:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nome do Cliente:");

        textonomecliente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textonomecliente.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Faça sua compra aqui");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botnovaVenda.setText("Novo Cadastro");
        botnovaVenda.setToolTipText("Novo Produto");
        botnovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botnovaVendaActionPerformed(evt);
            }
        });

        botsalvar.setText("Salvar");
        botsalvar.setToolTipText("Salvar Venda");
        botsalvar.setEnabled(false);
        botsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botsalvarActionPerformed(evt);
            }
        });

        botalterar.setText("Editar");
        botalterar.setToolTipText("Editar Venda");
        botalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botalterarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Data Inicial:");

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(Tabela);

        textoendereco.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textoendereco.setEnabled(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Endereço para entrega:");

        textopreco.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textopreco.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Quantidade:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Status:");

        textostatus.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textostatus.setEnabled(false);

        textoquantidade.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textoquantidade.setEnabled(false);

        textodatainicial.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textodatainicial.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Data Final:");

        textodatafinal.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textodatafinal.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Total a pagar:");

        textototalpagar.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textototalpagar.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("CodigoVenda:");

        textocodigovenda.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textocodigovenda.setEnabled(false);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novo-produto.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2))
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textoprodutocomprado, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7)
                        .addComponent(textopreco, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textoendereco, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                        .addComponent(textonomecliente, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textostatus, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(textocodigovenda))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textototalpagar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textodatafinal, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textoquantidade))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textodatainicial, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(botnovaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botsalvar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textoprodutocomprado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(textopreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textocodigovenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textonomecliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textostatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textodatafinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(textodatainicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textototalpagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(textoquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botnovaVenda)
                            .addComponent(botalterar)
                            .addComponent(botsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botnovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botnovaVendaActionPerformed
        botnovaVenda.setEnabled(false);
        botalterar.setEnabled(false);
        botsalvar.setEnabled(true);    
        

        textoprodutocomprado.setEnabled(true);
        textonomecliente.setEnabled(true);
        textoendereco.setEnabled(true);
        textocodigovenda.setEnabled(true);
        textopreco.setEnabled(true);
        textodatainicial.setEnabled(true);
        textodatafinal.setEnabled(true);
        textoquantidade.setEnabled(true);
        textostatus.setEnabled(true);
        textototalpagar.setEnabled(true);
        
        textocodigovenda.setText("");
        textoprodutocomprado.setText("");
        textonomecliente.setText("");
        textoendereco.setText("");
        textopreco.setText("");
        textodatainicial.setText("");
        textodatafinal.setText("");
        textoquantidade.setText("");
        textostatus.setText("");
        textototalpagar.setText("");
        
        cmdNovo = true;        
        textoprodutocomprado.requestFocusInWindow();
        CarregarTable();       
    }//GEN-LAST:event_botnovaVendaActionPerformed

    private void botsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botsalvarActionPerformed
        if(textoprodutocomprado.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE NOME DO PRODUTO COMPRADO PARA REALIZAR O CADASTRO");
            textoprodutocomprado.requestFocusInWindow();
            return;
        }
        
        if(textocodigovenda.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE O CODIGO DA COMPRA");
            textocodigovenda.requestFocus();
            return;
        }
        
        if(textonomecliente.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "FAVOR INSERIR O NOME DO CLIENTE QUE ESTÁ REALIZANDO A COMPRA");
            textonomecliente.requestFocusInWindow();
            return;
        }
        
        if(textoendereco.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "FAVOR INSERIR O ENDEREÇO DE ENTREGA");
            textoendereco.requestFocusInWindow();
            return;
        }

        if(textopreco.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "FAVOR INSERIR O PREÇO DO PRODUTO");
            textopreco.requestFocusInWindow();
            return;
        }
        
        
        if(textoquantidade.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE A QUANTIDADE DE PRODUTOS COMPRADOS");
            textoquantidade.requestFocusInWindow();
            return;
        }
        
        if(textostatus.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "INSIRA O STATUS DA VENDA");
            textostatus.requestFocusInWindow();
            return;
        }
        
        if(textototalpagar.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE O VALOR TOTAL DA COMPRA DO CLIENTE");
            textototalpagar.requestFocusInWindow();
            return;
        }
        
        if(!Utilidades.isNumeric(textopreco.getText())){ 
            JOptionPane.showMessageDialog(rootPane, "PREÇO SÓ ACEITA NÚMEROS");
            textopreco.requestFocusInWindow();
            return;
        }
        
        int preco = Integer.parseInt(textopreco.getText());
        if(preco <= 0){
            JOptionPane.showMessageDialog(rootPane, "ESTE CAMPO TEM QUE SER UM NUMERO MAIOR QUE 0");
            textopreco.requestFocusInWindow();
            return;
        }
        
        if(textodatainicial.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE A DATA INICIAL DA VENDA");
            textodatainicial.requestFocusInWindow();
            return;
        }
        
        if(textodatafinal.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE DATA FINAL DA VENDA");
            textodatafinal.requestFocusInWindow();
            return;
        }
        
        

        int poslinha = dv.LinhaVenda(textocodigovenda.getText());
        if(cmdNovo){
            if(poslinha != -1){ 
                textocodigovenda.requestFocusInWindow();
                return;
            }
        }else{
            if(poslinha == 1){ 
                textoprodutocomprado.requestFocusInWindow(); 
                return;
            }
        }
        
        Venda Mvendas = new Venda(textocodigovenda.getText(), textoprodutocomprado.getText(), 
                                    textonomecliente.getText(), textoendereco.getText(),
                                    textopreco.getText(), textodatainicial.getText(), textodatafinal.getText(), 
                                    textoquantidade.getText(), textostatus.getText(), textototalpagar.getText());
       
        String msg;
        if(cmdNovo){
            msg = dv.CadVendas(Mvendas);   
        }else{
            msg = dv.EditarVenda(Mvendas, poslinha);
        }
        JOptionPane.showMessageDialog(rootPane,msg);
        CarregarTable();
        
        botnovaVenda.setEnabled(true);
        botalterar.setEnabled(true);
        botsalvar.setEnabled(false); 
        
        textoprodutocomprado.setEnabled(false);
        textonomecliente.setEnabled(false);
        textoendereco.setEnabled(false);
        textocodigovenda.setEnabled(false);
        textopreco.setEnabled(false);
        textodatainicial.setEnabled(false);
        textodatafinal.setEnabled(false);
        textoquantidade.setEnabled(false);
        textostatus.setEnabled(false);
        textototalpagar.setEnabled(false);


        CarregarTable();
        return;    
    }//GEN-LAST:event_botsalvarActionPerformed

    private void botalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botalterarActionPerformed
        botnovaVenda.setEnabled(false);
        botalterar.setEnabled(false);
        botsalvar.setEnabled(true);   
        
        textocodigovenda.setEnabled(true);
        textoprodutocomprado.setEnabled(true);
        textonomecliente.setEnabled(true);
        textoendereco.setEnabled(true);
        textopreco.setEnabled(true);
        textodatainicial.setEnabled(true);
        textocodigovenda.setEnabled(true);
        textodatafinal.setEnabled(true);
        textoquantidade.setEnabled(true);
        textostatus.setEnabled(true);
        textototalpagar.setEnabled(true);
 
        cmdNovo = false;
        textonomecliente.requestFocusInWindow();
    }//GEN-LAST:event_botalterarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        visualizarCadastro();
        CarregarTable();
    }//GEN-LAST:event_formInternalFrameOpened
    
    private void visualizarCadastro(){
        textocodigovenda.setText(dv.getVendas()[vendaAtual].getCodigovenda());
        textoprodutocomprado.setText(dv.getVendas()[vendaAtual].getProdutoComprado());
        textonomecliente.setText(dv.getVendas()[vendaAtual].getNomeCliente());
        textoendereco.setText(dv.getVendas()[vendaAtual].getEnderecoEntrega());
        textopreco.setText(dv.getVendas()[vendaAtual].getPreco());
        textodatainicial.setText(dv.getVendas()[vendaAtual].getDataInicial());
        textodatafinal.setText(dv.getVendas()[vendaAtual].getDataFinal());
        textoquantidade.setText(dv.getVendas()[vendaAtual].getQtd());
        textostatus.setText(dv.getVendas()[vendaAtual].getStatus());
        textototalpagar.setText(dv.getVendas()[vendaAtual].getTotalPagar());
    }

    private void CarregarTable(){
        String titulocabecalho[] = {"Codigo", "Nome do Cliente", "Produto", "Preço", "Quantidade", "Data Inicial", "Data Final", "Total a Pagar"}; //cabeçalho da tabela
        String RegCadastro[] = new String[8];
        Usertable = new DefaultTableModel(null, titulocabecalho);
        for(int i = 0; i < dv.NumVendas(); i++){
            RegCadastro[0] = dv.getVendas()[i].getCodigovenda();
            RegCadastro[1] = dv.getVendas()[i].getNomeCliente();
            RegCadastro[2] = dv.getVendas()[i].getProdutoComprado();
            RegCadastro[3] = dv.getVendas()[i].getPreco();
            RegCadastro[4] = dv.getVendas()[i].getQtd();
            RegCadastro[5] = dv.getVendas()[i].getDataInicial();
            RegCadastro[6] = dv.getVendas()[i].getDataFinal();
            RegCadastro[7] = dv.getVendas()[i].getTotalPagar();
            
            Usertable.addRow(RegCadastro);
        }
        Tabela.setModel(Usertable);
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton botalterar;
    private javax.swing.JButton botnovaVenda;
    private javax.swing.JButton botsalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textocodigovenda;
    private javax.swing.JTextField textodatafinal;
    private javax.swing.JTextField textodatainicial;
    private javax.swing.JTextField textoendereco;
    private javax.swing.JTextField textonomecliente;
    private javax.swing.JTextField textopreco;
    private javax.swing.JTextField textoprodutocomprado;
    private javax.swing.JTextField textoquantidade;
    private javax.swing.JTextField textostatus;
    private javax.swing.JTextField textototalpagar;
    // End of variables declaration//GEN-END:variables
}
