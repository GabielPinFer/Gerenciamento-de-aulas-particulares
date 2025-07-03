// Desenvolvedor: Gabriel Pinheiro Ferrari
// Alteração: 02/07/2025
package Formularios;
import Gerenciamento.GerProf;
import Objetos.Professor;
import javax.swing.JOptionPane;

public class FormInicial extends javax.swing.JFrame {

    private static FormInicial iniUnic;
    private Professor userAtual;
    
    private FormInicial() {
        initComponents();
        setLocationRelativeTo(null);
        rtDados.setAlignmentX(TOP_ALIGNMENT);
        rtDados.setAlignmentY(TOP_ALIGNMENT);
    }
    
    public static FormInicial geraInicial(){
        if(iniUnic == null){
            iniUnic = new FormInicial();
        }
        return iniUnic;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cxUsuario = new javax.swing.JTextField();
        cxSenha = new javax.swing.JTextField();
        rtUsuario = new javax.swing.JLabel();
        rtSenha = new javax.swing.JLabel();
        btEntrar = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        rtDados = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cxUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxUsuarioActionPerformed(evt);
            }
        });

        rtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtUsuario.setText("Usuário:");

        rtSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtSenha.setText("Senha:");

        btEntrar.setText("Entrar");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        rtDados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtDados.setText("Aulas Particulares");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEntrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rtSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cxUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(cxSenha))))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addComponent(rtDados)
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(rtDados)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEntrar)
                    .addComponent(btCadastrar))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadastrar();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        entrar(cxSenha.getText(), cxUsuario.getText());
    }//GEN-LAST:event_btEntrarActionPerformed

    private void cxUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxUsuarioActionPerformed

    public void cadastrar(){
        FormCadastro.geraFormCadastro().setVisible(true);
        dispose();
    }
    
    public void entrar(String senha, String user){
        GerProf bdprof = GerProf.geraGerProf();
        Professor prof = bdprof.buscar(senha, user);
        
        if(prof != null){
            FormTela1.geraFormTela1().setVisible(true);
            userAtual = prof;
            limpar();
            dispose();
        }else{
            mostraErro("Usuario ou senha incorretos !");
        }
    }
    
    public void mostraErro(String msg){
        JOptionPane.showMessageDialog(
                null,
                msg,
                "ERRO",
                JOptionPane.ERROR_MESSAGE);
    }
    
    public void setUserAtual(Professor userAtual){
        this.userAtual = userAtual;
    }
    
    public Professor getUserAtual(){
        return userAtual;
    }
    
    public void limpar(){
        cxUsuario.setText("");
        cxSenha.setText("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btEntrar;
    private javax.swing.JTextField cxSenha;
    private javax.swing.JTextField cxUsuario;
    private javax.swing.JLabel rtDados;
    private javax.swing.JLabel rtSenha;
    private javax.swing.JLabel rtUsuario;
    // End of variables declaration//GEN-END:variables
}
