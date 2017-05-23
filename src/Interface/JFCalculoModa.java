/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;
import Calculos.Lista;
/**
 *
 * @author PYU
 */
public class JFCalculoModa extends javax.swing.JFrame {

    /**
     * Creates new form JFCalculoMedia
     */
    
     
    public JFCalculoModa() {
        initComponents();
    }
    
    Lista l = new Lista();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPCalculoModa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaNumerosDigitados = new javax.swing.JTextArea();
        jTextFieldModa = new javax.swing.JTextField();
        jButtonAddNumero = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldgetNumero = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calcular Moda");

        jTextAreaNumerosDigitados.setEditable(false);
        jTextAreaNumerosDigitados.setColumns(20);
        jTextAreaNumerosDigitados.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextAreaNumerosDigitados.setRows(5);
        jScrollPane1.setViewportView(jTextAreaNumerosDigitados);

        jTextFieldModa.setEditable(false);
        jTextFieldModa.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N

        jButtonAddNumero.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        jButtonAddNumero.setText("Adicionar");
        jButtonAddNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddNumeroActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        jLabel1.setText("A moda dessa sequencia é :");

        jTextFieldgetNumero.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        jTextFieldgetNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldgetNumeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPCalculoModaLayout = new javax.swing.GroupLayout(JPCalculoModa);
        JPCalculoModa.setLayout(JPCalculoModaLayout);
        JPCalculoModaLayout.setHorizontalGroup(
            JPCalculoModaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPCalculoModaLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(JPCalculoModaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldModa, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPCalculoModaLayout.createSequentialGroup()
                        .addComponent(jTextFieldgetNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jButtonAddNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        JPCalculoModaLayout.setVerticalGroup(
            JPCalculoModaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPCalculoModaLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(JPCalculoModaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldgetNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jTextFieldModa, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPCalculoModa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPCalculoModa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddNumeroActionPerformed
       l.inserir(Integer.parseInt(jTextFieldgetNumero.getText()));
       
       if(l.getContagemElementos()>1) {
           jTextAreaNumerosDigitados.append(","+jTextFieldgetNumero.getText());
           jTextFieldModa.setText(null);
        } else {
           jTextAreaNumerosDigitados.append(jTextFieldgetNumero.getText());
        }
       jTextFieldModa.setText(l.calcularModa());
       jTextFieldgetNumero.setText(null);
    }//GEN-LAST:event_jButtonAddNumeroActionPerformed

    private void jTextFieldgetNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldgetNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldgetNumeroActionPerformed

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
            java.util.logging.Logger.getLogger(JFCalculoModa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCalculoModa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCalculoModa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCalculoModa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCalculoModa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPCalculoModa;
    private javax.swing.JButton jButtonAddNumero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaNumerosDigitados;
    private javax.swing.JTextField jTextFieldModa;
    private javax.swing.JTextField jTextFieldgetNumero;
    // End of variables declaration//GEN-END:variables
}