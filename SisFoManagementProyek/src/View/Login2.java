/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
//new
import java.awt.TextField;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author WAHYU LINTANG
 */
public class Login2 extends javax.swing.JFrame {

    /**
     * Creates new form Login2
     */
    public Login2() {
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

        jPanel1 = new javax.swing.JPanel();
        txtpass = new java.awt.TextField();
        txtuser = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(850, 510));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 347, 156, -1));

        txtuser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtuser.setName(""); // NOI18N
        jPanel1.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 317, 156, -1));
        txtuser.getAccessibleContext().setAccessibleName("");
        txtuser.getAccessibleContext().setAccessibleDescription("");

        jLabel3.setFont(new java.awt.Font("Vani", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MANAJEMEN PROYEK");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 93, 310, 50));

        jLabel1.setFont(new java.awt.Font("Vani", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SISTEM INFORMASI \n");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 53, 270, 40));

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Masuk");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 386, 90, 20));

        btnBack.setText("Kembali");
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 386, 100, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\Tubes PBO\\user_icon22.png")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, 150, 610, 420));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Tubes PBO\\low_poly_mountains_by_nheus-d8otn2f.png")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private java.awt.TextField txtpass;
    private java.awt.TextField txtuser;
    // End of variables declaration//GEN-END:variables

    public void addListener(ActionListener e) {
        btnLogin.addActionListener(e);
        btnBack.addActionListener(e);
    }

    public String getTxtpass() {
        return txtpass.getText();
    }

    public String getTxtuser() {
        return txtuser.getText();
    }

    public JButton getBtnLogin() {
        return btnLogin;
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    public void reset() {
        txtuser.setText("");
        txtpass.setText("");
    }

    public void viewErrorMsg(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }
    
}
