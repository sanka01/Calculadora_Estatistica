/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author PYU
 */
public class JFCalculoMedidasSeparatrizes extends javax.swing.JFrame {

    /**
     * Creates new form JFCalculoMedia
     */
    Integer[] values = new Integer[1000];
    int i = 0;

    public JFCalculoMedidasSeparatrizes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPCalculoMedidasSeparatrizes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaNumerosDigitados = new javax.swing.JTextArea();
        jButtonAddNumero = new javax.swing.JButton();
        jTextFieldgetNumero = new javax.swing.JTextField();
        jTextFieldgetPercentil = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPosicao = new javax.swing.JTextField();
        jTextFieldvalor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonCalcularPercentil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calcular Média");

        jTextAreaNumerosDigitados.setEditable(false);
        jTextAreaNumerosDigitados.setColumns(20);
        jTextAreaNumerosDigitados.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextAreaNumerosDigitados.setRows(5);
        jScrollPane1.setViewportView(jTextAreaNumerosDigitados);

        jButtonAddNumero.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        jButtonAddNumero.setText("Adicionar");
        jButtonAddNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddNumeroActionPerformed(evt);
            }
        });

        jTextFieldgetNumero.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        jTextFieldgetNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldgetNumeroActionPerformed(evt);
            }
        });

        jTextFieldgetPercentil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldgetPercentilActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Digite o percentil a buscar :");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("%");

        jTextFieldPosicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPosicaoActionPerformed(evt);
            }
        });

        jTextFieldvalor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldvalorActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Posição :");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Valor :");

        jButtonCalcularPercentil.setText("Calcular");
        jButtonCalcularPercentil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularPercentilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPCalculoMedidasSeparatrizesLayout = new javax.swing.GroupLayout(JPCalculoMedidasSeparatrizes);
        JPCalculoMedidasSeparatrizes.setLayout(JPCalculoMedidasSeparatrizesLayout);
        JPCalculoMedidasSeparatrizesLayout.setHorizontalGroup(
            JPCalculoMedidasSeparatrizesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPCalculoMedidasSeparatrizesLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(JPCalculoMedidasSeparatrizesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPCalculoMedidasSeparatrizesLayout.createSequentialGroup()
                        .addGroup(JPCalculoMedidasSeparatrizesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JPCalculoMedidasSeparatrizesLayout.createSequentialGroup()
                                .addComponent(jTextFieldgetNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButtonAddNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(59, Short.MAX_VALUE))
                    .addGroup(JPCalculoMedidasSeparatrizesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(JPCalculoMedidasSeparatrizesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JPCalculoMedidasSeparatrizesLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldgetPercentil, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPCalculoMedidasSeparatrizesLayout.createSequentialGroup()
                                .addGroup(JPCalculoMedidasSeparatrizesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(58, 58, 58)
                                .addGroup(JPCalculoMedidasSeparatrizesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPosicao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldvalor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButtonCalcularPercentil, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(64, 64, 64))))
        );
        JPCalculoMedidasSeparatrizesLayout.setVerticalGroup(
            JPCalculoMedidasSeparatrizesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPCalculoMedidasSeparatrizesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPCalculoMedidasSeparatrizesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldgetNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(JPCalculoMedidasSeparatrizesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldgetPercentil, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(42, 42, 42)
                .addGroup(JPCalculoMedidasSeparatrizesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(JPCalculoMedidasSeparatrizesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(43, 43, 43)
                .addComponent(jButtonCalcularPercentil, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPCalculoMedidasSeparatrizes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPCalculoMedidasSeparatrizes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddNumeroActionPerformed
        values[i] = Integer.parseInt(jTextFieldgetNumero.getText());
        jTextFieldgetNumero.setText(null);
        Integer c=0, aux, aux2;
        if (i > 0 ) {
            for (c = i; c > 0; c--) {
                aux = values[c - 1];
                if (aux > values[c]) {
                    aux2 = values[c];
                    values[c] = aux;
                    values[c - 1] = aux2;
                }
             }
            
        }
        jTextAreaNumerosDigitados.setText(null);
        for (c = 0; c <= i; c++) {
            if (c == i) {
                jTextAreaNumerosDigitados.append(values[c].toString());
            } else {
                jTextAreaNumerosDigitados.append(values[c].toString() + ",");
            }
        }
        i++;
    }//GEN-LAST:event_jButtonAddNumeroActionPerformed

    private void jTextFieldgetNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldgetNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldgetNumeroActionPerformed

    private void jTextFieldgetPercentilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldgetPercentilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldgetPercentilActionPerformed

    private void jButtonCalcularPercentilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularPercentilActionPerformed
        Integer aux, aux2;
        Double aux3, aux4;
        aux4 = Double.parseDouble(jTextFieldgetPercentil.getText());
        aux3 = (i * aux4) / 100;
      
        if (aux3 % 1 == 0) {
            jTextFieldPosicao.setText(aux3.toString());
            jTextFieldvalor.setText(values[Integer.parseInt(aux3.toString())].toString());
            //se a intenção da linha acima é pegar o elemento na posição do resultado - aux3 - não está funcionando
        } else {
            jTextFieldPosicao.setText(aux3.toString());

            aux = values[Integer.parseInt(aux3.toString())];
            aux2 = values[Integer.parseInt(aux3.toString()) + 1];
            aux = (aux + aux2) / 2;
            

            jTextFieldvalor.setText(aux.toString());

        }
    }//GEN-LAST:event_jButtonCalcularPercentilActionPerformed

    private void jTextFieldvalorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldvalorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldvalorActionPerformed

    private void jTextFieldPosicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPosicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPosicaoActionPerformed

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
            java.util.logging.Logger.getLogger(JFCalculoMedidasSeparatrizes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCalculoMedidasSeparatrizes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCalculoMedidasSeparatrizes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCalculoMedidasSeparatrizes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCalculoMedidasSeparatrizes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPCalculoMedidasSeparatrizes;
    private javax.swing.JButton jButtonAddNumero;
    private javax.swing.JButton jButtonCalcularPercentil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaNumerosDigitados;
    private javax.swing.JTextField jTextFieldPosicao;
    private javax.swing.JTextField jTextFieldgetNumero;
    private javax.swing.JTextField jTextFieldgetPercentil;
    private javax.swing.JTextField jTextFieldvalor;
    // End of variables declaration//GEN-END:variables
}