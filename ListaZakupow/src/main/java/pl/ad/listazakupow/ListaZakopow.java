/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.ad.listazakupow;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author HP
 */
public class ListaZakopow extends javax.swing.JFrame {

    /**
     * Creates new form ListaZakopow
     */
    public ListaZakopow() {
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

        am_jPanell = new javax.swing.JPanel();
        am_jLabel1 = new javax.swing.JLabel();
        am_jTextField1 = new javax.swing.JTextField();
        am_jLabel2 = new javax.swing.JLabel();
        am_jTextField2 = new javax.swing.JTextField();
        am_jComboBox1 = new javax.swing.JComboBox<>();
        am_jLabel3 = new javax.swing.JLabel();
        am_jLabel4 = new javax.swing.JLabel();
        am_jButton1 = new javax.swing.JButton();
        am_jScrollPane1 = new javax.swing.JScrollPane();
        am_jTextArea1 = new javax.swing.JTextArea();
        am_jLabel5 = new javax.swing.JLabel();
        am_jLabel6 = new javax.swing.JLabel();
        am_jLabel7 = new javax.swing.JLabel();
        am_jTextField3 = new javax.swing.JTextField();
        am_jTextField4 = new javax.swing.JTextField();
        am_jMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        am_jLabel1.setText("Wpisz co kupiłeś");

        am_jLabel2.setText("Podaj wartość");

        am_jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        am_jLabel3.setText("Typ zakupionego towaru");

        am_jLabel4.setText("Data zakupu");

        am_jButton1.setText("Zapisz");

        am_jTextArea1.setColumns(20);
        am_jTextArea1.setRows(5);
        am_jScrollPane1.setViewportView(am_jTextArea1);

        am_jLabel5.setText("Dzisiejsze zakupy");

        am_jLabel6.setText("Wydatki z dzisiaj:");

        am_jLabel7.setText("Wydatki z tygodnia:");

        javax.swing.GroupLayout am_jPanellLayout = new javax.swing.GroupLayout(am_jPanell);
        am_jPanell.setLayout(am_jPanellLayout);
        am_jPanellLayout.setHorizontalGroup(
            am_jPanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(am_jPanellLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(am_jPanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(am_jPanellLayout.createSequentialGroup()
                        .addComponent(am_jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(am_jPanellLayout.createSequentialGroup()
                        .addGroup(am_jPanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, am_jPanellLayout.createSequentialGroup()
                                .addComponent(am_jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(am_jPanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(am_jLabel6)
                                    .addComponent(am_jLabel7))
                                .addGap(0, 1, Short.MAX_VALUE))
                            .addGroup(am_jPanellLayout.createSequentialGroup()
                                .addGroup(am_jPanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(am_jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(am_jPanellLayout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(am_jLabel1)))
                                .addGroup(am_jPanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(am_jPanellLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(am_jLabel2)
                                        .addGap(63, 63, 63))
                                    .addGroup(am_jPanellLayout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(am_jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGroup(am_jPanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, am_jPanellLayout.createSequentialGroup()
                                .addGroup(am_jPanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(am_jPanellLayout.createSequentialGroup()
                                        .addGap(0, 2, Short.MAX_VALUE)
                                        .addComponent(am_jLabel3))
                                    .addComponent(am_jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(am_jPanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(am_jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, am_jPanellLayout.createSequentialGroup()
                                        .addComponent(am_jLabel4)
                                        .addGap(13, 13, 13))))
                            .addComponent(am_jTextField3)
                            .addGroup(am_jPanellLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(am_jTextField4)))
                        .addGap(20, 20, 20))))
        );
        am_jPanellLayout.setVerticalGroup(
            am_jPanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(am_jPanellLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(am_jPanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(am_jLabel1)
                    .addComponent(am_jLabel2)
                    .addComponent(am_jLabel3)
                    .addComponent(am_jLabel4))
                .addGap(8, 8, 8)
                .addGroup(am_jPanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(am_jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(am_jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(am_jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(am_jButton1))
                .addGap(16, 16, 16)
                .addComponent(am_jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(am_jPanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(am_jPanellLayout.createSequentialGroup()
                        .addGroup(am_jPanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(am_jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(am_jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(am_jPanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(am_jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(am_jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(am_jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenu1.setText("File");
        am_jMenuBar.add(jMenu1);

        jMenu2.setText("Edit");
        am_jMenuBar.add(jMenu2);

        setJMenuBar(am_jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(am_jPanell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(am_jPanell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ListaZakopow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaZakopow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaZakopow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaZakopow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaZakopow().setVisible(true);
            }
        });
    }
    
    private void addKeyToam_jTextField1(){
        am_jTextField1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
                if(e.getKeyChar() == KeyEvent.VK_ENTER){
                System.out.println("Znak"+e.getKeyChar());
                am_jTextArea1.setText(am_jTextField1.getText());
            }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //System.out.println("2 keyPressed"+e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //System.out.println("3 keyReleased"+e.getKeyChar());
            }
        });
        
    }
    
    private void addKeyListenerToam_jTextField2(){
        am_jTextField2.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char ch =e.getKeyChar();
                if(ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9'){
                    System.out.println("NACIŚNIĘTO CYFRĘ: "+ch);
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
               
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton am_jButton1;
    private javax.swing.JComboBox<String> am_jComboBox1;
    private javax.swing.JLabel am_jLabel1;
    private javax.swing.JLabel am_jLabel2;
    private javax.swing.JLabel am_jLabel3;
    private javax.swing.JLabel am_jLabel4;
    private javax.swing.JLabel am_jLabel5;
    private javax.swing.JLabel am_jLabel6;
    private javax.swing.JLabel am_jLabel7;
    private javax.swing.JMenuBar am_jMenuBar;
    private javax.swing.JPanel am_jPanell;
    private javax.swing.JScrollPane am_jScrollPane1;
    private javax.swing.JTextArea am_jTextArea1;
    private javax.swing.JTextField am_jTextField1;
    private javax.swing.JTextField am_jTextField2;
    private javax.swing.JTextField am_jTextField3;
    private javax.swing.JTextField am_jTextField4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    // End of variables declaration//GEN-END:variables
}
