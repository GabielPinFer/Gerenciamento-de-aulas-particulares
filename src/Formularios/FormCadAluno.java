//Desenvolvedor: Gabriel Pinheiro Ferrari
// Alteração: 02/07/2025

package Formularios;
import Objetos.Aluno;
import Gerenciamento.GerAluno;
import javax.swing.JOptionPane;

public class FormCadAluno extends javax.swing.JFrame {

    private static FormCadAluno cadAlunoUnic;
    
    private FormCadAluno() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public static FormCadAluno geraFormCadAluno(){
        if(cadAlunoUnic == null){
            cadAlunoUnic = new FormCadAluno();
        }
        return cadAlunoUnic;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtCadAluno = new javax.swing.JLabel();
        rtNome = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        rtResponsavel = new javax.swing.JLabel();
        cxResponsavel = new javax.swing.JTextField();
        rtNascimento = new javax.swing.JLabel();
        cxNascimento = new javax.swing.JTextField();
        rtCelular = new javax.swing.JLabel();
        cxCelular = new javax.swing.JTextField();
        rtEscola = new javax.swing.JLabel();
        cxEscola = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rtCadAluno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtCadAluno.setText("Cadastro de Aluno");

        rtNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtNome.setText("Nome do aluno:");

        rtResponsavel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtResponsavel.setText("Responsável pelo aluno:");

        rtNascimento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtNascimento.setText("Nascimento do aluno:");

        rtCelular.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtCelular.setText("Celular:");

        rtEscola.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rtEscola.setText("Escola:");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rtNome)
                            .addComponent(rtResponsavel)
                            .addComponent(rtNascimento)
                            .addComponent(rtCelular)
                            .addComponent(rtEscola)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cxNome, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                    .addComponent(cxResponsavel)
                                    .addComponent(cxNascimento)
                                    .addComponent(cxCelular)
                                    .addComponent(cxEscola)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btCadastrar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btVoltar))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(rtCadAluno)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rtCadAluno)
                .addGap(18, 18, 18)
                .addComponent(rtNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rtResponsavel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rtNascimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rtCelular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rtEscola)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cxEscola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btVoltar))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        if(pergunta("Quer realmente voltar?") == 0)voltar();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        if(pergunta("Deseja cadastrar o aluno especificado?") == 0){
            if(cadastrar()){
                mostraInfo("Cadastro realizado com Sucesso!");
                limpar();
                voltar();
            }
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    public boolean cadastrar(){
        Aluno al = new Aluno();
        GerAluno formaluno = GerAluno.geraGerAluno();
        
        try{
            al.setNome(cxNome.getText());
            al.setIdade(Integer.parseInt(cxNascimento.getText()));
            al.setResponsavel(cxResponsavel.getText());
            al.setCelular(cxCelular.getText());
            al.setEscola(cxEscola.getText());
        
            formaluno.cadastrar(al);
            return true;
        }
        catch(NumberFormatException nfe){
            mostraErro("Caixas com parâmetros incorretos.");
        }
        return false;
    }
    
    public void voltar(){
        FormTela1.geraFormTela1().setVisible(true);
        limpar();
        dispose();
    }
    
    public void limpar(){
        cxCelular.setText("");
        cxEscola.setText("");
        cxNascimento.setText("");
        cxNome.setText("");
        cxResponsavel.setText("");
    }
    
    public int pergunta(String msg){
        return JOptionPane.showConfirmDialog(
                null,
                msg, 
                "CONFIRMAÇÃO",
                JOptionPane.YES_NO_OPTION);
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
            java.util.logging.Logger.getLogger(FormCadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxCelular;
    private javax.swing.JTextField cxEscola;
    private javax.swing.JTextField cxNascimento;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxResponsavel;
    private javax.swing.JLabel rtCadAluno;
    private javax.swing.JLabel rtCelular;
    private javax.swing.JLabel rtEscola;
    private javax.swing.JLabel rtNascimento;
    private javax.swing.JLabel rtNome;
    private javax.swing.JLabel rtResponsavel;
    // End of variables declaration//GEN-END:variables
}
