//Desenvolvedor: Gabriel Pinheiro Ferrrari
//Modificação: 02/07/2025

package Formularios;

import Gerenciamento.GerProf;
import Objetos.Professor;
import javax.swing.JOptionPane;

public class FormCadastro extends javax.swing.JFrame {

    private static FormCadastro geraCadastro;
    
    //construtor
    private FormCadastro() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    //singleton
    public static FormCadastro geraFormCadastro(){
        if(geraCadastro == null){
            geraCadastro = new FormCadastro();
        }
        return geraCadastro;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtCadastro = new javax.swing.JLabel();
        rtNome = new javax.swing.JLabel();
        rtCpf = new javax.swing.JLabel();
        rtNascimento = new javax.swing.JLabel();
        rtCelular = new javax.swing.JLabel();
        rtFormacao = new javax.swing.JLabel();
        rtSenha = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        cxCpf = new javax.swing.JTextField();
        cxNascimento = new javax.swing.JTextField();
        cxCelular = new javax.swing.JTextField();
        cxFormacao = new javax.swing.JTextField();
        cxSenha = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        rtUser = new javax.swing.JLabel();
        cxUser = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        rtCadastro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtCadastro.setText("CADASTRO");

        rtNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtNome.setText("Nome:");

        rtCpf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtCpf.setText("CPF:");

        rtNascimento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtNascimento.setText("Nascimento:");

        rtCelular.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtCelular.setText("Celular:");

        rtFormacao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtFormacao.setText("Formação:");

        rtSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtSenha.setText("Senha:");

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        rtUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtUser.setText("Usuário:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btVoltar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(143, 143, 143)
                            .addComponent(rtCadastro))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rtNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rtNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rtCelular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rtFormacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(rtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cxNome)
                                .addComponent(cxCpf)
                                .addComponent(cxNascimento)
                                .addComponent(cxCelular)
                                .addComponent(cxFormacao)
                                .addComponent(cxSenha)
                                .addComponent(cxUser, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rtCadastro)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtNome)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtCpf)
                    .addComponent(cxCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtNascimento)
                    .addComponent(cxNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtCelular)
                    .addComponent(cxCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtFormacao)
                    .addComponent(cxFormacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btCadastrar))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        if(cadastrar()){
            mostraInfo("Cadastro realizado com sucesso!");
            limpar();
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        if(pergunta("Deseja realmente voltar?") == 0) voltar();
    }//GEN-LAST:event_btVoltarActionPerformed

    public boolean cadastrar(){
        GerProf bdProf = GerProf.geraGerProf();
        Professor prof = new Professor();
        
        try{
            prof.setNome(cxNome.getText());
            prof.setCpf(cxCpf.getText());
            prof.setIdade(Integer.parseInt(cxNascimento.getText()));
            prof.setCelular(cxCelular.getText());
            prof.setFormacao(cxFormacao.getText());
            prof.setSenha(cxSenha.getText());
            prof.setUser(cxUser.getText());
        
            bdProf.cadastrar(prof);
            return true;
        }
        catch(NumberFormatException nfe){
            mostraErro("Caixas com parâmetros incorretos!");
        }
        
        return false;
    }
    
    public void mostraErro(String msg){
        JOptionPane.showMessageDialog(
                null,
                msg,
                "ERRO",
                JOptionPane.ERROR_MESSAGE);
    }
    
    public void mostraInfo(String msg){
        JOptionPane.showMessageDialog(
                null,
                msg,
                "INFORMAÇÂO!",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    public int pergunta(String msg){
        return JOptionPane.showConfirmDialog(
                null,
                msg,
                "CONFIRMAÇÃO",
                JOptionPane.YES_NO_OPTION);
    }
    
    public void voltar(){
        limpar();
        FormInicial.geraInicial().setVisible(true);
        dispose();
    }
    
    public void limpar(){
        cxNome.setText("");
        cxCpf.setText("");
        cxCelular.setText("");
        cxNascimento.setText("");
        cxFormacao.setText("");
        cxSenha.setText("");
        cxUser.setText("");
        
        cxNome.requestFocus();
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
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxCelular;
    private javax.swing.JTextField cxCpf;
    private javax.swing.JTextField cxFormacao;
    private javax.swing.JTextField cxNascimento;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxSenha;
    private javax.swing.JTextField cxUser;
    private javax.swing.JLabel rtCadastro;
    private javax.swing.JLabel rtCelular;
    private javax.swing.JLabel rtCpf;
    private javax.swing.JLabel rtFormacao;
    private javax.swing.JLabel rtNascimento;
    private javax.swing.JLabel rtNome;
    private javax.swing.JLabel rtSenha;
    private javax.swing.JLabel rtUser;
    // End of variables declaration//GEN-END:variables
}
