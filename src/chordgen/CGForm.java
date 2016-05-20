/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chordgen;

import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import jm.music.data.*;
import jm.util.Play;


/**
 *
 * @author Алекс
 */
public class CGForm extends javax.swing.JFrame {

    
    Random ran = new Random();
    MelodyArray melody = new MelodyArray();
    MelodyArray memelody = new MelodyArray();
    GenerateMelody gm1 = new GenerateMelody();
    CGSingleton factory;
    Caretaker caretaker = new Caretaker();
    Boolean b;
    NoteWrapper nw = new NoteWrapper();
    
        ConsoleWriter conWrit = new ConsoleWriter();
        
        RFileWriter filWrit = null;
    /**
     * Creates new form CGForm
     */
    public CGForm() {
        factory = CGSingleton.getFactory();
        
        initComponents();
        b=false;
        jCancel.setEnabled(b);
        jTextField1.setText("60");
        jButton1.setEnabled(b);
        
        try {
            filWrit = new RFileWriter();
        } catch (IOException ex) {
            Logger.getLogger(CGForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMelody = new javax.swing.JLabel();
        jCancel = new javax.swing.JButton();
        genButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        JExit = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Темп");

        jLabel1.setText("Мелодия");

        jMelody.setText("- - - - - - - - - - - - - - - - ");

        jCancel.setText("Вернуть предыдущую");
        jCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelActionPerformed(evt);
            }
        });

        genButton.setText("Генерировать");
        genButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genButtonActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Играть");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        JExit.setText("Выход");
        JExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JExitActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Am - Dm - G - C", "C - G - Am - F", "Am - Em - F - G", "Am - Dm - E - Am" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Прогрессия");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(genButton)
                        .addGap(30, 30, 30)
                        .addComponent(jButton1))
                    .addComponent(JExit)
                    .addComponent(jLabel1)
                    .addComponent(jMelody))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel2))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(58, 58, 58))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genButton)
                    .addComponent(jCancel)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(19, 19, 19)
                        .addComponent(jMelody))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JExit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelActionPerformed
        // TODO add your handling code here:
        if (caretaker.savedStates.size()>=2){
            gm1.restoreFromMemento( caretaker.getMemento() );

            memelody = caretaker.getMemento().state;
            String melodyString = "";
            for (int i=0;i<memelody.noteList.size();i++)
            {
                Note nw = new NoteWrapper(memelody.noteList.get(i));
                melodyString += nw.getNote();
            }
            jMelody.setText(melodyString);
        }
        else
        {jMelody.setText("- - - - - - - - - - - - - - - - ");

            Boolean b = false;
            jButton1.setEnabled(b);}
        b=false;
        jCancel.setEnabled(b);
        //gm1.setMelody(melody);
        //caretaker.addMemento( gm1.saveToMemento() );
    }//GEN-LAST:event_jCancelActionPerformed

    private void genButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genButtonActionPerformed
        // TODO add your handling code here:

        GenerateMelody gm = new GenerateMelody();
        MelodyArray melody1 = new MelodyArray();
        gm.getMelody(melody1);
        String melodyString = "";
        for (int i=0;i<melody1.noteList.size();i++)
        {
            Note nw = new NoteWrapper(melody1.noteList.get(i));
            melodyString += nw.getNote();
        }
        jMelody.setText(melodyString);
        gm1.setMelody(melody1);
        // gm1.state1 = melody;
        melody = melody1;
        caretaker.addMemento( gm1.saveToMemento() );

        b=true;
        jCancel.setEnabled(b);
        jButton1.setEnabled(b);

        conWrit.write(melodyString);

        try {
            filWrit.write(melodyString);
        } catch (IOException ex) {
            Logger.getLogger(CGForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_genButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        if (jTextField1.getText() == "")
        {
            jButton1.setEnabled(false);
        }
        else {
            jButton1.setEnabled(true);
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double Tempo =  Double.parseDouble(jTextField1.getText());
        Phrase phr = factory.getPhrase();
        for (int i=0;i<melody.noteList.size();i++)
        {
            phr.add(melody.noteList.get(i));
        }
        Score sc = new Score(new Part(phr));
        sc.setTempo(Tempo);
        Play.midi(sc,false,false,1,1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JExitActionPerformed
        // TODO add your handling code here:
        filWrit.bufWriter.close();
        System.exit(0);
    }//GEN-LAST:event_JExitActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(CGForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CGForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CGForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CGForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CGForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JExit;
    private javax.swing.JButton genButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jCancel;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jMelody;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
