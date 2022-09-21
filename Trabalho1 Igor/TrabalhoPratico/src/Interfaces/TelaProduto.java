package Interfaces;

import Metodos.MetodoProdutos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Construtivos.Produto;

public class TelaProduto extends javax.swing.JInternalFrame {
    private MetodoProdutos dp;
    private int produtoatual = 0;
    private boolean cmdNovo = false;
    private DefaultTableModel Usertable;
    
    public void setDadosProdutos(MetodoProdutos dp){
        this.dp = dp;
    }
    
    public TelaProduto() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        textocodigoproduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textonome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        botnovoProduto = new javax.swing.JButton();
        botsalvar = new javax.swing.JButton();
        botalterar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        textopreco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textocat = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        textodesc = new javax.swing.JTextArea();
        textoqtd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

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
        setTitle("Cadastro de Produtos");
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
        jLabel1.setText("Código Produto:");

        textocodigoproduto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textocodigoproduto.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Preço:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nome:");

        textonome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textonome.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cadastro do Produto");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botnovoProduto.setText("Novo Cadastro");
        botnovoProduto.setToolTipText("Novo Cadastro");
        botnovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botnovoProdutoActionPerformed(evt);
            }
        });

        botsalvar.setText("Salvar");
        botsalvar.setToolTipText("Salvar Cadastro");
        botsalvar.setEnabled(false);
        botsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botsalvarActionPerformed(evt);
            }
        });

        botalterar.setText("Editar");
        botalterar.setToolTipText("Editar Cadastro");
        botalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botalterarActionPerformed(evt);
            }
        });

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

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Descrição:");

        textopreco.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textopreco.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Estoque Quantidade:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Categoria:");

        textocat.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textocat.setEnabled(false);

        textodesc.setColumns(20);
        textodesc.setRows(5);
        textodesc.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textodesc.setEnabled(false);
        jScrollPane3.setViewportView(textodesc);

        textoqtd.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textoqtd.setEnabled(false);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sacola-de-compras.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoqtd, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textocat, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 102, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(textocodigoproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textopreco, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5))
                            .addComponent(textonome)
                            .addComponent(jScrollPane3)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botnovoProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(textocodigoproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(textopreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textonome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel16))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textoqtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(textocat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botnovoProduto)
                    .addComponent(botalterar)
                    .addComponent(botsalvar))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botnovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botnovoProdutoActionPerformed
        botnovoProduto.setEnabled(false);
        botalterar.setEnabled(false);
        botsalvar.setEnabled(true);   
        

        textocodigoproduto.setEnabled(true);
        textonome.setEnabled(true);
        textodesc.setEnabled(true);
        textopreco.setEnabled(true);
        textoqtd.setEnabled(true);
        textocat.setEnabled(true);
           
        //Permitir a escrita após habilitados os campos
        textocodigoproduto.setText("");
        textonome.setText("");
        textodesc.setText("");
        textopreco.setText("");
        textoqtd.setText("");
        textocat.setText("");
        
        cmdNovo = true;        
        textocodigoproduto.requestFocusInWindow();
        CarregarTable();       
    }//GEN-LAST:event_botnovoProdutoActionPerformed

    private void botsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botsalvarActionPerformed
        //Validando Campos no formulário de cadastro
        if(textocodigoproduto.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE O CÓDIGO");
            textocodigoproduto.requestFocusInWindow();
            return;
        }
        if(textonome.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "INSIRA O NOME DO PRODUTO");
            textonome.requestFocusInWindow();
            return;
        }
        
        if(textodesc.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "INSERA A DESCRIÇÃO DO PRODUTO");
            textodesc.requestFocusInWindow();
            return;
        }

        if(textopreco.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "INSERA O PREÇO DO PRODUTO");
            textopreco.requestFocusInWindow();
            return;
        }

        if(textoqtd.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "INSERA A QUANTIDADE EM ESTOQUE");
            textoqtd.requestFocusInWindow();
            return;
        }
        
        if(textocat.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "INSERA A CATEGORIA");
            textocat.requestFocusInWindow();
            return;
        }

        int poslinha = dp.LinhaProduto(textocodigoproduto.getText());
        if(cmdNovo){
            if(poslinha != -1){ 
                textocodigoproduto.requestFocusInWindow();
                return;
            }
        }else{
            if(poslinha == 1){ 
                textocodigoproduto.requestFocusInWindow(); 
                return;
            }
        }
        
        Produto MProdutos = new Produto(textocodigoproduto.getText(), 
                                         textonome.getText(), textodesc.getText(),
                                         textopreco.getText(), textoqtd.getText(),
                                         textocat.getText());
       
        String msg;
        if(cmdNovo){
            msg = dp.CadProduto(MProdutos);    
        }else{
            msg = dp.EditarProduto(MProdutos, poslinha);
        }
        JOptionPane.showMessageDialog(rootPane,msg);
        CarregarTable();
        
        botnovoProduto.setEnabled(true);
        botalterar.setEnabled(true);
        botsalvar.setEnabled(false); 
        
        textocodigoproduto.setEnabled(false);
        textonome.setEnabled(false);
        textodesc.setEnabled(false);
        textopreco.setEnabled(false);
        textoqtd.setEnabled(false);
        textocat.setEnabled(false);

        CarregarTable();
        return;    
    }//GEN-LAST:event_botsalvarActionPerformed

    private void botalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botalterarActionPerformed
        botnovoProduto.setEnabled(false);
        botalterar.setEnabled(false);
        botsalvar.setEnabled(true);  
        
        textocodigoproduto.setEnabled(false);
        textonome.setEnabled(true);
        textodesc.setEnabled(true);
        textopreco.setEnabled(true);
        textoqtd.setEnabled(true);
        textocat.setEnabled(true);
 
        cmdNovo = false;
        textonome.requestFocusInWindow();
    }//GEN-LAST:event_botalterarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        visualizarCadastro();
        CarregarTable();
    }//GEN-LAST:event_formInternalFrameOpened
    
    private void visualizarCadastro(){
        textocodigoproduto.setText(dp.getProdutos()[produtoatual].getCodproduto());
        textonome.setText(dp.getProdutos()[produtoatual].getNome());
        textodesc.setText(dp.getProdutos()[produtoatual].getDesc());
        textopreco.setText("" + dp.getProdutos()[produtoatual].getPreco());
        textoqtd.setText(dp.getProdutos()[produtoatual].getQtd());
        textocat.setText(dp.getProdutos()[produtoatual].getCategoria());
    }

    private void CarregarTable(){
        String titulocabecalho[] = {"Cod Produto", "Nome", "Descrição", "Preço", "Quantidade", "Categoria"}; //cabeçalho da tabela
        String RegCadastro[] = new String[6];
        Usertable = new DefaultTableModel(null, titulocabecalho);
        for(int i = 0; i < dp.NumProduto(); i++){
            RegCadastro[0] = dp.getProdutos()[i].getCodproduto();
            RegCadastro[1] = dp.getProdutos()[i].getNome();
            RegCadastro[2] = dp.getProdutos()[i].getDesc();
            RegCadastro[3] = "" + dp.getProdutos()[i].getPreco();
            RegCadastro[4] = "" + dp.getProdutos()[i].getQtd();
            RegCadastro[5] = dp.getProdutos()[i].getCategoria();
            
            Usertable.addRow(RegCadastro);
        }
        Tabela.setModel(Usertable);
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton botalterar;
    private javax.swing.JButton botnovoProduto;
    private javax.swing.JButton botsalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textocat;
    private javax.swing.JTextField textocodigoproduto;
    private javax.swing.JTextArea textodesc;
    private javax.swing.JTextField textonome;
    private javax.swing.JTextField textopreco;
    private javax.swing.JTextField textoqtd;
    // End of variables declaration//GEN-END:variables
}
