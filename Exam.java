
import javax.swing.*;

public class Exam extends javax.swing.JFrame {

    JFrame f;
    int noq = 1;
    int score = 0;
    
    
    private void check(){
        if((noq==1 && jRadioButton2.isSelected()) ||
                (noq==2 && jRadioButton2.isSelected()) ||
                (noq==3 && jRadioButton2.isSelected()) ||
                (noq==4 && jRadioButton3.isSelected()) ||
                (noq==5 && jRadioButton2.isSelected()) ||
                (noq==6 && jRadioButton2.isSelected()) ){
            score = score-1;
        }
        else if((noq==7 && jTextField1.getText().equals("print('Hello World')")) || (noq==8 && jTextField1.getText().equals("15"))){
            score = score - 2;
        }
                
    }
    private void RadioEnable0(){
        jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(false);
        jRadioButton3.setEnabled(false);
        jRadioButton4.setEnabled(false);
    }
    
        private void RadioReset(){
        jRadioButton1.setEnabled(true);
        jRadioButton2.setEnabled(true);
        jRadioButton3.setEnabled(true);
        jRadioButton4.setEnabled(true);
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
       
        
        check();
    }
            private void RadioEnable1(){
        jRadioButton1.setEnabled(true);
        jRadioButton2.setEnabled(true);
        jRadioButton3.setEnabled(true);
        jRadioButton4.setEnabled(true);
        
        
    }
    private void TEdit(){
        jTextField1.setEditable(true);
        jTextField1.setText(null);
        score = score-2;
    }
    private void Visib(){
        jTextField1.setVisible(false);
                jButton3.setVisible(false);
    }
    
    

    private void Question() {
        if (noq == 1) {
            Visib();
            RadioEnable1();
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
            jTextField1.setVisible(false);

            jLabel1.setText("1. Who is the prime minister of India?");
            jRadioButton1.setText("Salman Khan");
            jRadioButton2.setText("Narendra Modi");
            jRadioButton3.setText("Manmohan Singh");
            jRadioButton4.setText("Akshay Kumar");

        } else if (noq == 2) {
            Visib();
            RadioEnable1();
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
            jButton3.setVisible(true);
            jTextField1.setVisible(false);

            jLabel1.setText("2. What is our national animal?");
            jRadioButton1.setText("Cow");
            jRadioButton2.setText("Tiger");
            jRadioButton3.setText("Lion");
            jRadioButton4.setText("Neelgay");

        } else if (noq == 3) {
            Visib();
            RadioEnable1();
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
            jButton3.setVisible(true);
            jTextField1.setVisible(false);

            jLabel1.setText("3. What is 2+2?");
            jRadioButton1.setText("2");
            jRadioButton2.setText("4");
            jRadioButton3.setText("6");
            jRadioButton4.setText("8");
        } else if (noq == 4) {
            Visib();
            RadioEnable1();
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
            jButton3.setVisible(true);
            jTextField1.setVisible(false);

            jLabel1.setText("4. How many colours are there in Rainbow?");
            jRadioButton1.setText("2");
            jRadioButton2.setText("4");
            jRadioButton3.setText("7");
            jRadioButton4.setText("8");
        } else if (noq == 5) {
            Visib();
            RadioEnable1();
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
            jButton3.setVisible(true);
            jTextField1.setVisible(false);

            jLabel1.setText("5. The Square root of 100 is 5.");
            jRadioButton1.setText("True");
            jRadioButton2.setText("False");
            jRadioButton3.setVisible(false);
            jRadioButton4.setVisible(false);
        } else if (noq == 6) {
            Visib();
            RadioEnable1();
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
            jButton3.setVisible(true);
            jTextField1.setVisible(false);
            jLabel1.setText("6. Ice is made out of glass.");
            jRadioButton1.setText("True");
            jRadioButton2.setText("False");
            jRadioButton3.setVisible(false);
            jRadioButton4.setVisible(false);
        } else if (noq == 7) {
            RadioEnable1();
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
            jTextField1.setVisible(true);
            jButton3.setVisible(true);
            jTextField1.setEditable(true);

            jLabel1.setText("7. Write syntax of printing Hello World in python.");
            jRadioButton1.setVisible(false);
            jRadioButton2.setVisible(false);
            jRadioButton3.setVisible(false);
            jRadioButton4.setVisible(false);
        } else if (noq == 8) {
            RadioEnable1();
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
            jTextField1.setVisible(true);
            jButton3.setVisible(true);

            jLabel1.setText("8. The square root of 225 is ____.");
            jRadioButton1.setVisible(false);
            jRadioButton2.setVisible(false);
            jRadioButton3.setVisible(false);
            jRadioButton4.setVisible(false);
            jButton1.setText("Submit my responses");
            jTextField1.setEditable(true);
        } else if (noq == 9) {
            f = new JFrame();
            JOptionPane.showMessageDialog(f, "Your Score is:" + score);
            System.exit(0);
        }
    }

    public Exam() {
        initComponents();
        jTextField1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("1. Who is the prime minister of India?");

        jRadioButton1.setText("Salman Khan");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Narendra Modi");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("Manmohan Singh");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setText("Akshay Kumar");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jButton1.setText("Next");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton3.setText("Previous");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Reset Response");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton4)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jRadioButton1.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);

        if (noq == 1) {
            score = score + 1;
            RadioEnable0();
            System.out.println(score);
        } else if (noq == 2) {
            score = score + 1;
            RadioEnable0();
            System.out.println(score);
        } else if (noq == 3) {
            score = score + 1;
            RadioEnable0();
            System.out.println(score);
        } else if (noq == 5) {
            score = score + 1;
            RadioEnable0();
            System.out.println(score);
        } else if (noq == 6) {
            score = score + 1;
            RadioEnable0();
            System.out.println(score);
        }


    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        noq = noq + 1;
        System.out.println("noq:" + noq);
        Question();
        jTextField1.setText(null);

        


    }//GEN-LAST:event_jButton1MouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        RadioEnable0();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        RadioEnable0();
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton4.setSelected(false);
        if (noq == 4) {
            score = score + 1;
            RadioEnable0();
            System.out.println(score);
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        RadioEnable0();
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        if (noq == 7 && jTextField1.getText().equals("print('Hello World')")) {
            score = score + 2;
            jTextField1.setEditable(false);
            System.out.println(score);

        } else if (noq == 8 && jTextField1.getText().equals("15")) {
            score = score + 2;
            jTextField1.setEditable(false);
            System.out.println(score);
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        jTextField1.setText(null);
        noq = noq - 1;
        
        if(noq == 7){
            jButton1.setText("Next");
        }
        Question();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(noq==7 || noq==8){
            TEdit();
        }
        else{
            RadioReset();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exam().setVisible(true);
                
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private static javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private static javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
