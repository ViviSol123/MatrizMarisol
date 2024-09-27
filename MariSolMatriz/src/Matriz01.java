
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
        //CENTRALIZA O PAINEL
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
        btnCadastro = new javax.swing.JButton();
        txtEstado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        imagem = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panCadastro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblnome.setFont(new java.awt.Font("French Script MT", 1, 48)); // NOI18N
        lblnome.setForeground(new java.awt.Color(255, 204, 51));
        lblnome.setText("Nome:");
        panCadastro.add(lblnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 180, -1));

        lblCidade.setFont(new java.awt.Font("French Script MT", 1, 48)); // NOI18N
        lblCidade.setForeground(new java.awt.Color(255, 204, 51));
        lblCidade.setText("Cidade:");
        panCadastro.add(lblCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 120, -1));

        lblEstado.setFont(new java.awt.Font("French Script MT", 1, 48)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 204, 51));
        lblEstado.setText("Estado:");
        panCadastro.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 130, -1));

        txtNome.setBackground(new java.awt.Color(255, 204, 204));
        txtNome.setFont(new java.awt.Font("French Script MT", 0, 24)); // NOI18N
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
        panCadastro.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 487, -1));

        txtCidade.setBackground(new java.awt.Color(255, 204, 204));
        txtCidade.setFont(new java.awt.Font("French Script MT", 0, 24)); // NOI18N
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
        panCadastro.add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 300, -1));

        btnCadastro.setBackground(new java.awt.Color(255, 102, 255));
        btnCadastro.setFont(new java.awt.Font("French Script MT", 1, 48)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(255, 204, 102));
        btnCadastro.setText("Cadastar");
        btnCadastro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        panCadastro.add(btnCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 400, 230, 60));

        txtEstado.setBackground(new java.awt.Color(255, 204, 204));
        txtEstado.setFont(new java.awt.Font("French Script MT", 0, 24)); // NOI18N
        panCadastro.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 280, -1));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("*campo obrigatório*");
        panCadastro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 390, -1));

        btnImprimir.setBackground(new java.awt.Color(204, 102, 255));
        btnImprimir.setFont(new java.awt.Font("French Script MT", 1, 48)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(255, 204, 102));
        btnImprimir.setText("Imprimir");
        btnImprimir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        panCadastro.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 210, 60));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("*campo obrigatório*");
        panCadastro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("*campo obrigatório*");
        panCadastro.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 310, 30));

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/coroa .jpg"))); // NOI18N
        imagem.setText("jLabel6");
        panCadastro.add(imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        // Testa se todos os campos estão preechidos, exibe uma mensagem caso eles estejam vazios 

        if ((txtEstado.getText().trim().isEmpty()) || (txtNome.getText().trim().isEmpty()) || (txtCidade.getText().trim().isEmpty())) {
            //JOptionPane.showMessageDialog(this, "CAMPOS VAZIOS!!!!! Preencha todos os campos para cadastrar.");
            if (txtNome.getText().trim().isEmpty()) {
                jLabel1.setVisible(true);
            } else {
                jLabel1.setVisible(false);
            }
            if (txtCidade.getText().trim().isEmpty()) {
                jLabel2.setVisible(true);
            } else {
                jLabel2.setVisible(false);
            }
            if (txtEstado.getText().trim().isEmpty()) {
                jLabel3.setVisible(true);
            } else {
                jLabel3.setVisible(false);
            }

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
        //FUNÇÃO QUE IMPORTA A MATRIZ DE DADOS CADASTRADOS PARA O JPAINEL DA TELA FINAL
        new TelaFinal(tabela).setVisible(true);
        new Matriz01().setVisible(false);
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCidade.requestFocus();

        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtCidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCidadeKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
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
    private javax.swing.JLabel imagem;
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
