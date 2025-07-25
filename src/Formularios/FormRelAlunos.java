//Desenvolvedor: Gabriel Pinheiro Ferrari
//Modificação: 02/07/2025

package Formularios;
import Objetos.Aluno;
import Gerenciamento.GerAluno;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.LinkedList;

public class FormRelAlunos extends javax.swing.JFrame {

    private static FormRelAlunos relAlunosUnic;
    
    private FormRelAlunos() {
        initComponents();
        setLocationRelativeTo(null);
    }

    //singleton
    public static FormRelAlunos geraFormRelAlunos(){
        if(relAlunosUnic == null){
            relAlunosUnic = new FormRelAlunos();
        }
        relAlunosUnic.popularTabela();
        return relAlunosUnic;
    }
    
    public void popularTabela(){
        DefaultTableModel tabmodelo = (DefaultTableModel) tabAlunos.getModel();
        List<Aluno> bdalunos = GerAluno.geraGerAluno().getBdAluno();
        int linha = 0;
        
        tabmodelo.setRowCount(linha);
        
        for(Aluno al : bdalunos){
            tabmodelo.insertRow(linha, new Object[]{al.getNome(), al.getIdade(), al.getDesenvolvimento(), al.getEscola()});
            linha++;
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtRelAlunos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabAlunos = new javax.swing.JTable();
        barMenus = new javax.swing.JMenuBar();
        mnOpcoes = new javax.swing.JMenu();
        mnItSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rtRelAlunos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtRelAlunos.setText("Relatório Geral de Alunos");

        tabAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Idade", "Desempenho", "Escola"
            }
        ));
        jScrollPane1.setViewportView(tabAlunos);

        mnOpcoes.setText("Opções");

        mnItSair.setText("Sair");
        mnItSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItSairActionPerformed(evt);
            }
        });
        mnOpcoes.add(mnItSair);

        barMenus.add(mnOpcoes);

        setJMenuBar(barMenus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(rtRelAlunos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rtRelAlunos)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnItSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItSairActionPerformed
        if(pergunta("Deseja realmente sair?") == 0) sair();
    }//GEN-LAST:event_mnItSairActionPerformed

    public void sair(){
        FormTela1.geraFormTela1().setVisible(true);
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
            java.util.logging.Logger.getLogger(FormRelAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRelAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRelAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRelAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRelAlunos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barMenus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mnItSair;
    private javax.swing.JMenu mnOpcoes;
    private javax.swing.JLabel rtRelAlunos;
    private javax.swing.JTable tabAlunos;
    // End of variables declaration//GEN-END:variables
}
