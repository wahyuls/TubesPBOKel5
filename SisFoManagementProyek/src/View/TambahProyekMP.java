/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.TextField;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author WAHYU LINTANG
 */
public class TambahProyekMP extends javax.swing.JFrame {

    /**
     * Creates new form MENU21
     */
    public TambahProyekMP() {
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
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnLogout = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        btnTambahProyek = new javax.swing.JButton();
        btnHapusProyek = new javax.swing.JButton();
        btnDetailProyek = new javax.swing.JButton();
        btnBeranda = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtNamaProyek = new java.awt.TextField();
        jLabel15 = new javax.swing.JLabel();
        cbTgl = new javax.swing.JComboBox<>();
        cbBulan = new javax.swing.JComboBox<>();
        cbTahun = new javax.swing.JComboBox<>();
        btnSimpan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(850, 510));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Vani", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tambah Proyek");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 32, 179, 72));

        jDesktopPane1.setBackground(new java.awt.Color(0, 153, 204));

        btnLogout.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        btnLogout.setText("LOGOUT ");

        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setText("USER :  MANAJER PROYEK");

        btnTambahProyek.setFont(new java.awt.Font("Vani", 0, 10)); // NOI18N
        btnTambahProyek.setText("TAMBAH PROYEK");

        btnHapusProyek.setFont(new java.awt.Font("Vani", 0, 10)); // NOI18N
        btnHapusProyek.setText("HAPUS PROYEK");

        btnDetailProyek.setFont(new java.awt.Font("Vani", 0, 10)); // NOI18N
        btnDetailProyek.setText("DETAIL PROYEK");

        btnBeranda.setFont(new java.awt.Font("Vani", 0, 10)); // NOI18N
        btnBeranda.setText("BERANDA");

        jDesktopPane1.setLayer(btnLogout, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblUser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnTambahProyek, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnHapusProyek, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnDetailProyek, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnBeranda, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
            .addComponent(btnBeranda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTambahProyek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHapusProyek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDetailProyek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnBeranda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnTambahProyek, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnHapusProyek, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnDetailProyek, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 0, -1, -1));

        jLabel14.setFont(new java.awt.Font("Vani", 0, 14)); // NOI18N
        jLabel14.setText("INPUT NAMA PROYEK  :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 114, -1, -1));
        jPanel1.add(txtNamaProyek, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 114, 229, -1));

        jLabel15.setFont(new java.awt.Font("Vani", 0, 14)); // NOI18N
        jLabel15.setText("INPUT  TANGGAL   :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 150, -1, -1));

        cbTgl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(cbTgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 150, -1, -1));

        cbBulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel1.add(cbBulan, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 150, -1, -1));

        cbTahun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016" }));
        jPanel1.add(cbTahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 150, -1, -1));

        btnSimpan.setText("SIMPAN");
        jPanel1.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 347, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Tubes PBO\\wallhaven-41419.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public JButton getBtnBeranda() {
        return btnBeranda;
    }

    public JButton getBtnDetailProyek() {
        return btnDetailProyek;
    }

    public JButton getBtnHapusProyek() {
        return btnHapusProyek;
    }

    public JButton getBtnLogout() {
        return btnLogout;
    }

    public JButton getBtnSimpan() {
        return btnSimpan;
    }

    public JButton getBtnTambahProyek() {
        return btnTambahProyek;
    }

    public int getCbBulan() {
        return Integer.parseInt((String) cbBulan.getSelectedItem());
    }

    public int getCbTahun() {
        return Integer.parseInt((String) cbTahun.getSelectedItem());
    }

    public int getCbTgl() {
        return Integer.parseInt((String) cbTgl.getSelectedItem());
    }

    public JLabel getLblUser() {
        return lblUser;
    }

    /**
     * @param args the command line arguments
     */
    public String getTxtNamaProyek() {
        return txtNamaProyek.getText();
    }

    public void addListener(ActionListener e) {
        btnBeranda.addActionListener(e);
        btnDetailProyek.addActionListener(e);
        btnLogout.addActionListener(e);
        btnSimpan.addActionListener(e);
        btnTambahProyek.addActionListener(e);
        cbTgl.setSelectedIndex(0);
        cbTahun.setSelectedIndex(0);
        cbBulan.setSelectedIndex(0);
        btnHapusProyek.addActionListener(e);
    }

    public void reset() {
        txtNamaProyek.setText("");
        cbBulan.setSelectedIndex(0);
        cbTahun.setSelectedIndex(0);
        cbTahun.setSelectedIndex(0);
    }
    
     public void viewErrorMsg(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBeranda;
    private javax.swing.JButton btnDetailProyek;
    private javax.swing.JButton btnHapusProyek;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambahProyek;
    private javax.swing.JComboBox<String> cbBulan;
    private javax.swing.JComboBox<String> cbTahun;
    private javax.swing.JComboBox<String> cbTgl;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUser;
    private java.awt.TextField txtNamaProyek;
    // End of variables declaration//GEN-END:variables
}
