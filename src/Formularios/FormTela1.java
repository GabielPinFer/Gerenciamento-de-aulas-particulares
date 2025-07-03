//Desenvolvedor: Gabriel Pinheiro Ferrari
//Modificação: 01/07/2025

package Formularios;
import Formularios.FormCadAluno;
import javax.swing.JOptionPane;

public class FormTela1 extends javax.swing.JFrame {

    private static FormTela1 tela1Unic;

    private FormTela1() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public static FormTela1 geraFormTela1(){
        if(tela1Unic == null){
            tela1Unic = new FormTela1();
        }
        return tela1Unic;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtBemVindo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnOpcoes = new javax.swing.JMenu();
        mnItRelAlunos = new javax.swing.JMenuItem();
        mnItCadAluno = new javax.swing.JMenuItem();
        mnItSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rtBemVindo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtBemVindo.setText("Bem - Vindo");

        mnOpcoes.setText("Opções");

        mnItRelAlunos.setText("Relatório de alunos");
        mnItRelAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItRelAlunosActionPerformed(evt);
            }
        });
        mnOpcoes.add(mnItRelAlunos);

        mnItCadAluno.setText("Cadastrar Aluno");
        mnItCadAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItCadAlunoActionPerformed(evt);
            }
        });
        mnOpcoes.add(mnItCadAluno);

        mnItSair.setText("Sair");
        mnItSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItSairActionPerformed(evt);
            }
        });
        mnOpcoes.add(mnItSair);

        jMenuBar1.add(mnOpcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(rtBemVindo)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rtBemVindo)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnItSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItSairActionPerformed
        if(pergunta("Deseja realmente sair?") == 0) sair();
    }//GEN-LAST:event_mnItSairActionPerformed

    private void mnItCadAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItCadAlunoActionPerformed
        cadastroAluno();
    }//GEN-LAST:event_mnItCadAlunoActionPerformed

    private void mnItRelAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItRelAlunosActionPerformed
        abrirRelAlunos();
    }//GEN-LAST:event_mnItRelAlunosActionPerformed
       
    public void abrirRelAlunos(){
        FormRelAlunos.geraFormRelAlunos().setVisible(true);
        dispose();
    }
    
    public void cadastroAluno(){
        FormCadAluno.geraFormCadAluno().setVisible(true);
        dispose();
    }
    
    public void sair(){
        FormInicial.geraInicial().setVisible(true);
        dispose();
    }
    
    public int pergunta(String msg){
        return JOptionPane.showConfirmDialog(
                null,
                msg,
                "CONFIRMAÇÃO",
                JOptionPane.YES_NO_OPTION);
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
            java.util.logging.Logger.getLogger(FormTela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTela1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnItCadAluno;
    private javax.swing.JMenuItem mnItRelAlunos;
    private javax.swing.JMenuItem mnItSair;
    private javax.swing.JMenu mnOpcoes;
    private javax.swing.JLabel rtBemVindo;
    // End of variables declaration//GEN-END:variables
}
