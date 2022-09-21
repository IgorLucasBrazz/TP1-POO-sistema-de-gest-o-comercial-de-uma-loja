package Interfaces;

import Metodos.MetodoUsuarios;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Construtivos.Usuario;

public class TeladoUsuario extends javax.swing.JInternalFrame {
    private MetodoUsuarios du;
    private int usuarioatual = 0;
    private boolean novocadastro = false;
    private DefaultTableModel Usertable;
    
    public void setDadosUsuarios(MetodoUsuarios du){
        this.du = du;
    }
    
    public TeladoUsuario() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        textocodigousuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbperfil = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        textonome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textosobrenome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botnovoUsuario = new javax.swing.JButton();
        botsalvar = new javax.swing.JButton();
        botalterar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        textocpf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textoemail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        textorua = new javax.swing.JTextField();
        textocompl = new javax.swing.JTextField();
        textobairro = new javax.swing.JTextField();
        textocep = new javax.swing.JTextField();
        textosenha = new javax.swing.JPasswordField();
        textoconfsenha = new javax.swing.JPasswordField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Mtable = new javax.swing.JTable();
        txtcidade = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

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

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Usuários");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
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
        jLabel1.setText("Código Usuário:");

        textocodigousuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textocodigousuario.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Perfil");

        cmbperfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione Perfil", "Administrador", "Funcionário" }));
        cmbperfil.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nome:");

        textonome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textonome.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Sobrenome:");

        textosobrenome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textosobrenome.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Conf. Senha:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Senha:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Faça seu Cadastro!!!");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botnovoUsuario.setText("Novo Cadastro");
        botnovoUsuario.setToolTipText("Novo Cadastro");
        botnovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botnovoUsuarioActionPerformed(evt);
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

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("CPF:");

        textocpf.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textocpf.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("E-mail:");

        textoemail.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textoemail.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Rua:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Complemento:");
        jLabel12.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Bairro:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("CEP:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Cidade:");

        textorua.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textorua.setEnabled(false);

        textocompl.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textocompl.setEnabled(false);

        textobairro.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textobairro.setEnabled(false);
        textobairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textobairroActionPerformed(evt);
            }
        });

        textocep.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textocep.setEnabled(false);

        textosenha.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textosenha.setEnabled(false);

        textoconfsenha.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textoconfsenha.setEnabled(false);

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

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar-amigo 64.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel9)))
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textonome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(textocodigousuario, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(textocpf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textosobrenome))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(textocep, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                        .addComponent(textoemail)
                                        .addComponent(textoconfsenha, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textosenha, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botnovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botalterar)
                                        .addGap(18, 18, 18)
                                        .addComponent(botsalvar)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textorua))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textocompl, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 52, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtcidade))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textobairro)))
                                        .addGap(150, 150, 150))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)))
                                .addGap(16, 16, 16)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textocodigousuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8)
                            .addComponent(textocpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(cmbperfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(textonome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(textosobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(textorua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(textosenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(textoconfsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(textocompl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel9)
                    .addComponent(textoemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textobairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textocep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(txtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botnovoUsuario)
                            .addComponent(botalterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botsalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botnovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botnovoUsuarioActionPerformed
        botnovoUsuario.setEnabled(false);
        botalterar.setEnabled(false);
        botsalvar.setEnabled(true); 
        
        textocodigousuario.setEnabled(true);
        textonome.setEnabled(true);
        textosobrenome.setEnabled(true);
        textosenha.setEnabled(true);
        textoconfsenha.setEnabled(true);
        cmbperfil.setEnabled(true);
        textoemail.setEnabled(true);
        textocpf.setEnabled(true);
        textorua.setEnabled(true);
        textocompl.setEnabled(true);
        textobairro.setEnabled(true);
        textocep.setEnabled(true);
        txtcidade.setEnabled(true);
        
        textocodigousuario.setText("");
        textonome.setText("");
        textosobrenome.setText("");
        textosenha.setText("");
        textoconfsenha.setText("");
        cmbperfil.setSelectedIndex(0);
        textoemail.setText("");
        textocpf.setText("");
        textorua.setText("");
        textocompl.setText("");
        textobairro.setText("");
        textocep.setText("");
        txtcidade.setText("");
        
        novocadastro = true;
        textocodigousuario.requestFocusInWindow();
        CarregarTable();
        
    }//GEN-LAST:event_botnovoUsuarioActionPerformed

    private void botsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botsalvarActionPerformed
        if(textocodigousuario.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE O CÓDIGO");
            textocodigousuario.requestFocusInWindow();
            return;
        }
        
        if(cmbperfil.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rootPane, "FAVOR SELECIONAR UM PERFIL");
            cmbperfil.requestFocusInWindow();
            return;
        }
        
        if(textonome.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "INSIRA O NOME");
            textonome.requestFocusInWindow();
            return;
        }
        
        if(textosobrenome.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "INSIRA O SOBRENOME");
            textosobrenome.requestFocusInWindow();
            return;
        }
        
        String SSenha = new String(textosenha.getPassword());
        String ConfSenha = new String(textoconfsenha.getPassword());
        
        if(SSenha.equals("")){
            JOptionPane.showMessageDialog(rootPane, "FAVOR INSERIR A SENHA PARA REALIZAR SEU CADASTRO");
            textosenha.requestFocusInWindow();
            return;
        }
        
        if(ConfSenha.equals("")){
            JOptionPane.showMessageDialog(rootPane, "INSIRA A SENHA NOVAMENTE");
            textoconfsenha.requestFocusInWindow();
            return;
        }
        
        if(!SSenha.equals(ConfSenha)){
            JOptionPane.showMessageDialog(rootPane, "CONFIRME A SENHA");
            textosenha.requestFocusInWindow();
            return;
        }
        
        if(textoemail.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "INSIRA O E-MAIL");
            textoemail.requestFocusInWindow();
            return;
        }
        
        if(textocpf.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "INSIRA O CPF");
            textocpf.requestFocusInWindow();
            return;
        }
        
        if(textorua.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "INSIRA O NOME DA RUA");
            textorua.requestFocusInWindow();
            return;
        }
        
        if(textocompl.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "INSIRA COMPLEMENTO DE ENDEREÇO");
            textocompl.requestFocusInWindow();
            return;
        }
        
        if(textobairro.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "INSERA O BAIRRO");
            textobairro.requestFocusInWindow();
            return;
        }
        
        if(textocep.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "INSIRA O CEP");
            textocep.requestFocusInWindow();
            return;
        }
        
        if(txtcidade.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "INSIRA O NOME DA CIDADE");
            txtcidade.requestFocusInWindow();
            return;
        }
        
        int linha = du.LinhaUsuario(textocodigousuario.getText());
        if(novocadastro){
            if(linha != -1){ //exise
                textocodigousuario.requestFocusInWindow();
                return;
            }
        }else{
            if(linha == 1){ //n cadastrado
                textocodigousuario.requestFocusInWindow(); 
                return;
            }
        }
        
        Usuario MUsuario = new Usuario(textocodigousuario.getText(), 
                                         textonome.getText(), textosobrenome.getText(),
                                         SSenha, ConfSenha, (String)cmbperfil.getSelectedItem(), 
                                         textoemail.getText(),textocpf.getText(),textorua.getText(),textocompl.getText(),
                                        textobairro.getText(),textocep.getText(), txtcidade.getText());

        String msg;
        if(novocadastro){
            msg = du.CadUsuario(MUsuario);        
        }else{
            msg = du.EditarUsuario(MUsuario, linha);
        }
        JOptionPane.showMessageDialog(rootPane,msg);
        

        botnovoUsuario.setEnabled(true);
        botalterar.setEnabled(true);
        botsalvar.setEnabled(false); 
        
        textocodigousuario.setEnabled(false);
        textonome.setEnabled(false);
        textosobrenome.setEnabled(false);
        textosenha.setEnabled(false);
        textoconfsenha.setEnabled(false);
        cmbperfil.setEnabled(false);
        textoemail.setEnabled(false);
        textocpf.setEnabled(false);
        textorua.setEnabled(false);
        textocompl.setEnabled(false);
        textobairro.setEnabled(false);
        textocep.setEnabled(false);
        txtcidade.setEnabled(false);

        CarregarTable();
        return;    
    }//GEN-LAST:event_botsalvarActionPerformed

    private void botalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botalterarActionPerformed

        botnovoUsuario.setEnabled(false);
        botalterar.setEnabled(false);
        botsalvar.setEnabled(true);
        
        textonome.setEnabled(true);
        textosobrenome.setEnabled(true);
        textosenha.setEnabled(true);
        textoconfsenha.setEnabled(true);
        cmbperfil.setEnabled(true);
        textoemail.setEnabled(true);
        textocpf.setEnabled(true);
        textorua.setEnabled(true);
        textocompl.setEnabled(true);
        textobairro.setEnabled(true);
        textocep.setEnabled(true);
        txtcidade.setEnabled(true);
        
        novocadastro = false;
        textonome.requestFocusInWindow();
    }//GEN-LAST:event_botalterarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        visualizarCadastro();
        CarregarTable();
    }//GEN-LAST:event_formInternalFrameOpened

    private void textobairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textobairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textobairroActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameActivated
    
    private void visualizarCadastro(){
        textocodigousuario.setText(du.getUsuarios()[usuarioatual].getIdusuario());
        textonome.setText(du.getUsuarios()[usuarioatual].getNome());
        textosobrenome.setText(du.getUsuarios()[usuarioatual].getSobrenome());
        textosenha.setText(du.getUsuarios()[usuarioatual].getSenha());
        textoconfsenha.setText(du.getUsuarios()[usuarioatual].getConfsenha());
        cmbperfil.setSelectedItem(du.getUsuarios()[usuarioatual].getPerfil());
        textocpf.setText(du.getUsuarios()[usuarioatual].getCpf());
        textoemail.setText(du.getUsuarios()[usuarioatual].getEmail());
        textorua.setText(du.getUsuarios()[usuarioatual].getRua());
        textocompl.setText(du.getUsuarios()[usuarioatual].getComplem());
        textobairro.setText(du.getUsuarios()[usuarioatual].getBairro());
        textocep.setText(du.getUsuarios()[usuarioatual].getCep());
        txtcidade.setText(du.getUsuarios()[usuarioatual].getCidade());
    }

    private void CarregarTable(){
        String titulocabecalho[] = {"Cod Usuario", "Nome", "Sobrenome", "Perfil"}; //cabeçalho da tabela
        String RegCadastro[] = new String[4];
        Usertable = new DefaultTableModel(null, titulocabecalho);
        for(int i = 0; i < du.Numsuarios(); i++){
            RegCadastro[0] = du.getUsuarios()[i].getIdusuario();
            RegCadastro[1] = du.getUsuarios()[i].getNome();
            RegCadastro[2] = du.getUsuarios()[i].getSobrenome();
            RegCadastro[3] = "" + du.getUsuarios()[i].getPerfil();
            
            Usertable.addRow(RegCadastro);
        }
        Mtable.setModel(Usertable);
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Mtable;
    private javax.swing.JButton botalterar;
    private javax.swing.JButton botnovoUsuario;
    private javax.swing.JButton botsalvar;
    private javax.swing.JComboBox<String> cmbperfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JTextField textobairro;
    private javax.swing.JTextField textocep;
    private javax.swing.JTextField textocodigousuario;
    private javax.swing.JTextField textocompl;
    private javax.swing.JPasswordField textoconfsenha;
    private javax.swing.JTextField textocpf;
    private javax.swing.JTextField textoemail;
    private javax.swing.JTextField textonome;
    private javax.swing.JTextField textorua;
    private javax.swing.JPasswordField textosenha;
    private javax.swing.JTextField textosobrenome;
    private javax.swing.JTextField txtcidade;
    // End of variables declaration//GEN-END:variables
}
