/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Estudiantes
 */
public class Pantalla extends javax.swing.JFrame {

    
    Calculador miCalculador=new Calculador();
    Trigonometrica miCalculador2=new Trigonometrica();
    
           int operador;
        
           
    public Pantalla() 
    {
        initComponents();
    }

void obtenerdato1(){
float dato;    
dato=Float.parseFloat(Display.getText());
miCalculador.operador1=dato;
Display.setText("");

}
void obtenerdato(){
double dato;    
dato=Float.parseFloat(Display.getText());
miCalculador2.operador1=dato;
}


     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Display = new javax.swing.JTextField();
        BotonSumar = new javax.swing.JButton();
        BotonRestar = new javax.swing.JButton();
        BotonIgual = new javax.swing.JButton();
        BotonDividir = new javax.swing.JButton();
        BotonMultiplicar = new javax.swing.JButton();
        BotonCoseno = new javax.swing.JButton();
        BotonTangente = new javax.swing.JButton();
        BotonSeno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonSumar.setText("+");
        BotonSumar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonSumarMouseClicked(evt);
            }
        });

        BotonRestar.setText("-");
        BotonRestar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRestarMouseClicked(evt);
            }
        });

        BotonIgual.setText("=");
        BotonIgual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonIgualMouseClicked(evt);
            }
        });

        BotonDividir.setText("/");
        BotonDividir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonDividirMouseClicked(evt);
            }
        });

        BotonMultiplicar.setText("*");
        BotonMultiplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonMultiplicarMouseClicked(evt);
            }
        });

        BotonCoseno.setText("Cos");
        BotonCoseno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCosenoMouseClicked(evt);
            }
        });

        BotonTangente.setText("Tan");
        BotonTangente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonTangenteMouseClicked(evt);
            }
        });

        BotonSeno.setText("Sin");
        BotonSeno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonSenoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(26, Short.MAX_VALUE)
                        .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(BotonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotonRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BotonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotonSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotonSeno, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonCoseno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonTangente)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCoseno, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonTangente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonSeno, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSumarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSumarMouseClicked
obtenerdato1();
operador=0;

    }//GEN-LAST:event_BotonSumarMouseClicked

    private void BotonRestarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRestarMouseClicked
        obtenerdato1();
operador=1;
    }//GEN-LAST:event_BotonRestarMouseClicked

                           

    private void BotonIgualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonIgualMouseClicked

           float numero;
        
        numero=Float.valueOf(Display.getText());
        
        miCalculador.operador2=numero;
        
        switch (operador){ 
            case 0:
             miCalculador.sumar();
             break;
             
            case 1:
             miCalculador.restar(); 
             break;
            case 2:
             miCalculador.multiplicar();   
             break;
            case 3:
                
             miCalculador.dividir();
              break;
                
        }
                numero=miCalculador.resultado;
        Display.setText(String.valueOf(numero));
    }//GEN-LAST:event_BotonIgualMouseClicked

    private void BotonDividirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonDividirMouseClicked
        obtenerdato1();
operador=3;
    }//GEN-LAST:event_BotonDividirMouseClicked

    private void BotonMultiplicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMultiplicarMouseClicked
        obtenerdato1();
operador=2;
    }//GEN-LAST:event_BotonMultiplicarMouseClicked

    private void BotonCosenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCosenoMouseClicked
        double numero;
        obtenerdato();
        miCalculador2.Coseno();
        numero=miCalculador2.resultado;
        Display.setText(String.valueOf(numero));
    }//GEN-LAST:event_BotonCosenoMouseClicked

    private void BotonTangenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonTangenteMouseClicked
        double numero;
        obtenerdato();
        miCalculador2.Tangente();
        numero=miCalculador2.resultado;
        Display.setText(String.valueOf(numero));
    }//GEN-LAST:event_BotonTangenteMouseClicked

    private void BotonSenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSenoMouseClicked
        double numero;
        obtenerdato();
        miCalculador2.Seno();
        numero=miCalculador2.resultado;
        Display.setText(String.valueOf(numero));
    }//GEN-LAST:event_BotonSenoMouseClicked

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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCoseno;
    private javax.swing.JButton BotonDividir;
    private javax.swing.JButton BotonIgual;
    private javax.swing.JButton BotonMultiplicar;
    private javax.swing.JButton BotonRestar;
    private javax.swing.JButton BotonSeno;
    private javax.swing.JButton BotonSumar;
    private javax.swing.JButton BotonTangente;
    private javax.swing.JTextField Display;
    // End of variables declaration//GEN-END:variables
}
