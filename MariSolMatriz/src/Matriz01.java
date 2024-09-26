

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author vitor
 */
public class Matriz01 extends javax.swing.JFrame {

    String[][] tabela = new String[10][4];
    int i = 0, j = 0;

    public Matriz01() {
        initComponents();
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        setLocationRelativeTo(null);
        setResizable(false); 

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        panCadastro = new javax.swing.JPanel();
        lblnome = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        btnCadastro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panCadastro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblnome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblnome.setText("Nome:");
        panCadastro.add(lblnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 68, -1));

        lblCidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCidade.setText("Cidade:");
        panCadastro.add(lblCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 48, -1));

        lblEstado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEstado.setText("Estado:");
        panCadastro.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 48, -1));

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });
        panCadastro.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 487, -1));

        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });
        txtCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCidadeKeyPressed(evt);
            }
        });
        panCadastro.add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 184, -1));
        panCadastro.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 184, -1));

        btnCadastro.setText("Cadastar");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        panCadastro.add(btnCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 120, 30));

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("*campo obrigatório*");
        panCadastro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 115, -1));

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("*campo obrigatório*");
        panCadastro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        panCadastro.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 130, 30));

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("*campo obrigatório*");
        panCadastro.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(panCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(panCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
             // Testa se todos os campos estão preechidos, exibe uma mensagem caso eles estejam vazios 
        if ((txtEstado.getText().trim().isEmpty()) || (txtNome.getText().trim().isEmpty()) || (txtCidade.getText().trim().isEmpty())) {
            JOptionPane.showMessageDialog(this, "CAMPOS VAZIOS!!!!! Preencha todos os campos para cadastrar.");
            if (txtNome.getText().trim().isEmpty()) {
                jLabel1.setVisible(true);   
            }else{jLabel1.setVisible(false);}
            if (txtCidade.getText().trim().isEmpty()) {
                jLabel2.setVisible(true);
            }else{jLabel2.setVisible(false);}
            if (txtEstado.getText().trim().isEmpty()) {
                jLabel3.setVisible(true);
            }else{jLabel3.setVisible(false);}
            
        } else {
            tabela[i][j] = txtNome.getText();
            j++;
            tabela[i][j] = txtCidade.getText();
            j++;
            tabela[i][j] = txtEstado.getText();
            j = 0;
            i++;
            
            // AO CLICAR NO BOTÃO DE CADASTRO:
            JOptionPane.showMessageDialog(this, "DADOS CADASTRADOS COM SUCESSO!!!");
            // LIMPAR O PAINEL DE CADASTRO
            txtNome.setText(" ");
            txtEstado.setText(" ");
            txtCidade.setText(" ");
            // APAGAR AS MENSAGENS DE CAMPO OBRIGATÓRIO
            jLabel1.setVisible(false);
            jLabel2.setVisible(false);
            jLabel3.setVisible(false);

        }

    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
       //MÉTODO QUE TRANSFORMA A MATRIZ EM UMA STRING   
       /* String result = Arrays.deepToString(tabela);
         JOptionPane.showMessageDialog(this, result);*/
       String planilha = " ";
         for(i=0 ; i < tabela.length; i++){
             for(j=0 ; j < 3; j++){
                 planilha += tabela[i][j];
                 planilha += "  ";
             }
             planilha += "\n";
         }
        JOptionPane.showMessageDialog(this,planilha);
        System.out.println(planilha);
        

    }//GEN-LAST:event_btnImprimirActionPerformed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCidade.requestFocus();
            
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtCidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCidadeKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtEstado.requestFocus();
        }
    }//GEN-LAST:event_txtCidadeKeyPressed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matriz01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblnome;
    private javax.swing.JPanel panCadastro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
