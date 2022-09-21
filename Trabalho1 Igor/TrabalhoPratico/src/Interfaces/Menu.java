package Interfaces;
import Metodos.MetodoClientes;
import Metodos.MetodoProdutos;
import Metodos.MetodoUsuarios;
import Metodos.MetodoVendas;
import Facilitadores.Fundo;
public class Menu extends javax.swing.JFrame {

    private MetodoUsuarios du;
    public void setDadosUsuarios(MetodoUsuarios du){
        this.du = du;
    }
    
    private MetodoProdutos dp;
    public void setDadosProdutos(MetodoProdutos dp){
        this.dp = dp;
    }
    
    private MetodoClientes dc;
    public void setDadosClientes(MetodoClientes dc){
        this.dc = dc;
    }
    
    private MetodoVendas dv;
    public void setDadosVendas(MetodoVendas dv){
        this.dv = dv;
    }
    
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        Deskpainel = new Fundo();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnarquivos = new javax.swing.JMenu();
        cmbclientes = new javax.swing.JMenuItem();
        cmbprodutos = new javax.swing.JMenuItem();
        cmbusuarios = new javax.swing.JMenuItem();
        mnmovimentos = new javax.swing.JMenu();
        mnvendas = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem6.setText("jMenuItem6");

        jMenuItem7.setText("jMenuItem7");

        jMenuItem8.setText("jMenuItem8");

        jMenuItem9.setText("jMenuItem9");

        jMenuItem10.setText("jMenuItem10");

        jMenuItem11.setText("jMenuItem11");

        jMenuItem12.setText("jMenuItem12");

        jMenuItem16.setText("jMenuItem16");

        jMenuItem17.setText("jMenuItem17");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem18.setText("jMenuItem18");

        jMenuItem19.setText("jMenuItem19");

        jMenuItem13.setText("jMenuItem13");

        jMenuItem14.setText("jMenuItem14");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA JAVA");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Deskpainel.setBackground(new java.awt.Color(255, 255, 255));
        Deskpainel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout DeskpainelLayout = new javax.swing.GroupLayout(Deskpainel);
        Deskpainel.setLayout(DeskpainelLayout);
        DeskpainelLayout.setHorizontalGroup(
            DeskpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );
        DeskpainelLayout.setVerticalGroup(
            DeskpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );

        mnarquivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/documento.png"))); // NOI18N
        mnarquivos.setText("Arquivos");

        cmbclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/avaliacao.png"))); // NOI18N
        cmbclientes.setText("Clientes");
        cmbclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbclientesActionPerformed(evt);
            }
        });
        mnarquivos.add(cmbclientes);

        cmbprodutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novo-produto (1).png"))); // NOI18N
        cmbprodutos.setText("Produtos");
        cmbprodutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbprodutosActionPerformed(evt);
            }
        });
        mnarquivos.add(cmbprodutos);

        cmbusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/homem-usuario.png"))); // NOI18N
        cmbusuarios.setText("Usuários");
        cmbusuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbusuariosActionPerformed(evt);
            }
        });
        mnarquivos.add(cmbusuarios);

        jMenuBar1.add(mnarquivos);

        mnmovimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/venda.png"))); // NOI18N
        mnmovimentos.setText("Vendas");

        mnvendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas.png"))); // NOI18N
        mnvendas.setText("Vendas");
        mnvendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnvendasActionPerformed(evt);
            }
        });
        mnmovimentos.add(mnvendas);

        jMenuBar1.add(mnmovimentos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Deskpainel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Deskpainel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Tentando colocar plano de fundo
        ((Fundo)Deskpainel).setImagem("/imagens/11224.jpg");
        
    }//GEN-LAST:event_formWindowOpened

    private void mnvendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnvendasActionPerformed
        //Código do botão de vendas no menu
        TelaVendas vendas = new TelaVendas();
        vendas.setDadosVendas(dv);
        Deskpainel.add(vendas);
        vendas.show();
    }//GEN-LAST:event_mnvendasActionPerformed

    private void cmbclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbclientesActionPerformed
        TelaCliente clientes = new TelaCliente();
        clientes.setDadosClientes(dc);
        Deskpainel.add(clientes);
        clientes.show();
    }//GEN-LAST:event_cmbclientesActionPerformed

    private void cmbusuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbusuariosActionPerformed
        TeladoUsuario usuarios = new TeladoUsuario();
        usuarios.setDadosUsuarios(du);
        Deskpainel.add(usuarios);
        usuarios.show();
    }//GEN-LAST:event_cmbusuariosActionPerformed

    private void cmbprodutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbprodutosActionPerformed
        TelaProduto produtos = new TelaProduto();
        produtos.setDadosProdutos(dp);
        Deskpainel.add(produtos);
        produtos.show();
    }//GEN-LAST:event_cmbprodutosActionPerformed

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Deskpainel;
    private javax.swing.JMenuItem cmbclientes;
    private javax.swing.JMenuItem cmbprodutos;
    private javax.swing.JMenuItem cmbusuarios;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu mnarquivos;
    private javax.swing.JMenu mnmovimentos;
    private javax.swing.JMenuItem mnvendas;
    // End of variables declaration//GEN-END:variables
}
