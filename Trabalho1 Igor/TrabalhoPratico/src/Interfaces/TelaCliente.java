package Interfaces;

import Metodos.MetodoClientes;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Construtivos.Cliente;

public class TelaCliente extends javax.swing.JInternalFrame {
    private MetodoClientes dc;
    private int clienteatual = 0;
    private boolean cadastroNovo = false;
    private DefaultTableModel Usertable;
    
    public void setDadosClientes(MetodoClientes dc){
        this.dc = dc;
    }
    
    public TelaCliente() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        textocodigocliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textonome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        botnovocadastro = new javax.swing.JButton();
        botsalvar = new javax.swing.JButton();
        botalterar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Mtable = new javax.swing.JTable();
        textocpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtendereco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtdatavenda = new javax.swing.JTextField();
        txtcdd = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtend2 = new javax.swing.JTextField();
        txtsenha = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();

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
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Clientes");
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
        jLabel1.setText("Código Cliente:");

        textocodigocliente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textocodigocliente.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("CPF:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nome Completo:");

        textonome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textonome.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cadastro do Cliente");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botnovocadastro.setText("Novo Cadastro");
        botnovocadastro.setToolTipText("Novo Cadastro");
        botnovocadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botnovocadastroActionPerformed(evt);
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

        Mtable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(Mtable);

        textocpf.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textocpf.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Cidade:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("E-mail:");

        txtemail.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtemail.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Senha:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Endereço 1:");

        txtendereco.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtendereco.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("DataVenda:");

        txtdatavenda.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtdatavenda.setEnabled(false);

        txtcdd.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtcdd.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Endereço 2:");

        txtend2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtend2.setEnabled(false);

        txtsenha.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtsenha.setEnabled(false);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user (1).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addGap(0, 0, 0)
                        .addComponent(textocodigocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(textocpf, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(0, 0, 0)
                        .addComponent(textonome, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel5)
                        .addGap(0, 0, 0)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel6)
                        .addGap(0, 0, 0)
                        .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(txtcdd, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel9)
                        .addGap(0, 0, 0)
                        .addComponent(txtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(botnovocadastro)
                .addGap(10, 10, 10)
                .addComponent(botalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(botsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel10)
                        .addGap(0, 0, 0)
                        .addComponent(txtdatavenda, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel11)
                        .addGap(0, 0, 0)
                        .addComponent(txtend2, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel7)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textocodigocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textocpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3))
                    .addComponent(textonome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel9))
                    .addComponent(txtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel11))
                    .addComponent(txtend2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel10))
                    .addComponent(txtdatavenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botnovocadastro)
                            .addComponent(botalterar)
                            .addComponent(botsalvar))
                        .addGap(80, 80, 80)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botnovocadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botnovocadastroActionPerformed
        botnovocadastro.setEnabled(false);
        botalterar.setEnabled(false); 
        botsalvar.setEnabled(true); 
        
        textocodigocliente.setEnabled(true);
        textocpf.setEnabled(true);
        textonome.setEnabled(true);
        txtemail.setEnabled(true);
        txtsenha.setEnabled(true);
        txtendereco.setEnabled(true);
        txtend2.setEnabled(true);
        txtcdd.setEnabled(true);
        txtdatavenda.setEnabled(true);
        
        textocodigocliente.setText("");
        textocpf.setText("");
        textonome.setText("");
        txtemail.setText("");
        txtsenha.setText("");
        txtendereco.setText("");
        txtend2.setText("");
        txtcdd.setText("");
        txtdatavenda.setText("");
        
        cadastroNovo = true;        
        textocodigocliente.requestFocusInWindow();
        CarregarTable();       
    }//GEN-LAST:event_botnovocadastroActionPerformed

    private void botsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botsalvarActionPerformed
        if(textocodigocliente.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE O CÓDIGO");
            textocodigocliente.requestFocusInWindow();
            return;
        }
        if(textocpf.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "INSIRA O CPF DO CLIENTE");
            textocpf.requestFocusInWindow();
            return;
        }
        if(textonome.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "INSIRA O NOME DO CLIENTE");
            textonome.requestFocusInWindow();
            return;
        }
        if(txtemail.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "INSERA O E-MAIL DO CLIENTE");
            txtemail.requestFocusInWindow();
            return;
        }
        if(txtsenha.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "INSERA A SENHA");
            txtsenha.requestFocusInWindow();
            return;
        }
        if(txtendereco.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "INSIRA O PRIMEIRO ENDEREÇO");
            txtendereco.requestFocusInWindow();
            return;
        }
        if(txtend2.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "INSIRA O SEGUNDO ENDEREÇO");
            txtend2.requestFocusInWindow();
            return;
        }
        if(txtcdd.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "INSIRA O NOME DA CIDADE");
            txtcdd.requestFocusInWindow();
            return;
        }
        if(txtdatavenda.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "INSIRA A DATA DA VENDA");
            txtdatavenda.requestFocusInWindow();
            return;
        }

        int linha = dc.LinhaCliente(textocodigocliente.getText());
        if(cadastroNovo){
            if(linha != -1){ //produto já existe
                //JOptionPane.showMessageDialog(rootPane, "ESTE CADASTRO JÁ EXISTE");
                textocodigocliente.requestFocusInWindow();
                return;
            }
        }else{
            if(linha == 1){
                textocodigocliente.requestFocusInWindow(); 
                return;
            }
        }
        
        Cliente MClientes = new Cliente(textocodigocliente.getText(), textocpf.getText(), 
                                          textonome.getText(), txtemail.getText(), txtsenha.getText(),
                                          txtendereco.getText(),txtend2.getText(),
                                          txtcdd.getText(),txtdatavenda.getText());
       
        String msg;
        if(cadastroNovo){
            msg = dc.CadCliente(MClientes);
            
        }else{
            msg = dc.EditarCliente(MClientes, linha);
        }
        JOptionPane.showMessageDialog(rootPane,msg);
        CarregarTable();

        botnovocadastro.setEnabled(true);
        botalterar.setEnabled(true);
        botsalvar.setEnabled(false); 
        
        textocodigocliente.setEnabled(false);
        textocpf.setEnabled(false);
        textonome.setEnabled(false);
        txtemail.setEnabled(false);
        txtsenha.setEnabled(false);
        txtendereco.setEnabled(false);
        txtend2.setEnabled(false);
        txtcdd.setEnabled(false);
        txtdatavenda.setEnabled(false);

        CarregarTable();
        return;    
    }//GEN-LAST:event_botsalvarActionPerformed

    private void botalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botalterarActionPerformed
        botnovocadastro.setEnabled(false);
        botalterar.setEnabled(false);
        botsalvar.setEnabled(true);
        
        textocodigocliente.setEnabled(false);
        textocpf.setEnabled(true);
        textonome.setEnabled(true);
        txtemail.setEnabled(true);
        txtsenha.setEnabled(true);
        txtendereco.setEnabled(true);
        txtend2.setEnabled(true);
        txtcdd.setEnabled(true);
        txtdatavenda.setEnabled(true);
 
        cadastroNovo = false;
        textonome.requestFocusInWindow();
    }//GEN-LAST:event_botalterarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        visualizarCadastro();
        CarregarTable();
    }//GEN-LAST:event_formInternalFrameOpened
    
    private void visualizarCadastro(){
        textocodigocliente.setText(dc.getClientes()[clienteatual].getCodigoCliente());
        textocpf.setText(dc.getClientes()[clienteatual].getCpfCliente());
        textonome.setText(dc.getClientes()[clienteatual].getNameCliente());
        txtsenha.setText(dc.getClientes()[clienteatual].getSenhaCliente());
        txtendereco.setText(dc.getClientes()[clienteatual].getEnderecoCliente());
        txtend2.setText(dc.getClientes()[clienteatual].getEndereco2Cliente());
        txtemail.setText(dc.getClientes()[clienteatual].getEmailCliente());
        txtcdd.setText(dc.getClientes()[clienteatual].getCidCliente());
        txtdatavenda.setText(dc.getClientes()[clienteatual].getDataVenda());
    }

    private void CarregarTable(){
        String titulocabecalho[] = {"Cod Cliente", "CPF", "Nome", "Endereço", "Id", "Data da Venda"}; //cabeçalho da tabela
        String RegCadastro[] = new String[5];
        Usertable = new DefaultTableModel(null, titulocabecalho);
        for(int i = 0; i < dc.NumExistenteClientes(); i++){
            RegCadastro[0] = dc.getClientes()[i].getCodigoCliente();
            RegCadastro[1] = dc.getClientes()[i].getCpfCliente();
            RegCadastro[2] = dc.getClientes()[i].getNameCliente();
            RegCadastro[3] = dc.getClientes()[i].getEnderecoCliente();
            RegCadastro[4] = dc.getClientes()[i].getDataVenda();
            
            Usertable.addRow(RegCadastro);
        }
        Mtable.setModel(Usertable);
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Mtable;
    private javax.swing.JButton botalterar;
    private javax.swing.JButton botnovocadastro;
    private javax.swing.JButton botsalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textocodigocliente;
    private javax.swing.JTextField textocpf;
    private javax.swing.JTextField textonome;
    private javax.swing.JTextField txtcdd;
    private javax.swing.JTextField txtdatavenda;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtend2;
    private javax.swing.JTextField txtendereco;
    private javax.swing.JPasswordField txtsenha;
    // End of variables declaration//GEN-END:variables
}
