/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package suratmasuk;


//import koneksi.conn;
import adminkalender.admin;
import adminkalender.edit;
import adminkalender.kegiatan;
import adminkalender.profil;
import com.mysql.cj.protocol.Message;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import static javax.management.Query.value;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import koneksi.conek;

/**
 *
 * @author WIN 10
 */
public class masuk extends javax.swing.JFrame {
    conn conek = new conn();

    /**
     * Creates new form masuk
     */
    public masuk() {
        initComponents();
        datatable();
        reset();
        btnkalender.setBackground(new Color (0,0,0,0));
        btnadmin.setBackground(new Color (0,0,0,0));
        btnkeluar.setBackground(new Color (0,0,0,0));
        btnnotif.setBackground(new Color (0,0,0,0));
        txtcari.setBackground(new Color (0,0,0,0));
        btnhapus.setBackground(new Color (0,0,0,0));
        btnprint.setBackground(new Color (0,0,0,0));
        btnhapus.setBackground(new Color (0,0,0,0));
        btnedit.setBackground(new Color (0,0,0,0));
        btnadd.setBackground(new Color (0,0,0,0));
        btnupload.setBackground(new Color (0,0,0,0));
        btnprofil.setBackground(new Color (0,0,0,0));
        btnkalender.setBorder(null);
        btnadmin.setBorder(null);
        btnkeluar.setBorder(null);
        btnnotif.setBorder(null);
        txtcari.setBorder(null);
        btnhapus.setBorder(null);
        btnedit.setBorder(null);
        btnadd.setBorder(null);
        btnupload.setBorder(null);
        btnprofil.setBorder(null);
        dctanggal.setBounds(70, 440, 150, 30);
        
        tblmasuk.setBackground(new Color (0,0,0,0));
        ((DefaultTableCellRenderer)tblmasuk.getDefaultRenderer(Object.class)).setBackground(new Color (0,0,0,0));
        tblmasuk.setGridColor(Color.black);
        tblmasuk.setForeground(Color.BLACK);
        JScrollPane1.setBackground(new Color(0,0,0,0));
        JScrollPane1.setOpaque(false);
            tblmasuk.setOpaque(false);
                ((DefaultTableCellRenderer)tblmasuk.getDefaultRenderer(Object.class)).setOpaque(false);
        JScrollPane1.getViewport().setOpaque(false);
        tblmasuk.setShowGrid(true);

}
    
    void datatable() {
        try {
            Statement statement=(Statement)conek.GetConnection().createStatement();
            ResultSet res=statement.executeQuery("select * from masuk");
            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("Nomor Surat");
            tbl.addColumn("Pengirim");
            tbl.addColumn("Kepada");
            tbl.addColumn("Perihal");
            tbl.addColumn("Hari/Tanggal");
            tbl.addColumn("Jenis Surat");
            tbl.addColumn("Direktori Surat");
            tblmasuk.setModel(tbl);
            while (res.next()) {
                tbl.addRow(new Object[]{
                        res.getString("nomor"),
                        res.getString("pengirim"),
                        res.getString("kepada"),
                        res.getString("perihal"),
                        res.getString("hari_tanggal"),
                        res.getString("jenis"),
                        res.getString("surat")
                    });
                tblmasuk.setModel(tbl);
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "salah "+e);
        }
    }
    
    void reset () {
        txtnomor.setText("");
        txtdari.setText("");
        txtkepada.setText("");
        txtperihal.setText("");
        dctanggal.setText("");
        cmbjenis.setSelectedIndex(0);
        txtsurat.setText("");
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDatePickerUtil1 = new net.sourceforge.jdatepicker.util.JDatePickerUtil();
        dateChooser1 = new com.raven.datechooser.DateChooser();
        cmbjenis = new javax.swing.JComboBox<>();
        profil = new javax.swing.JLabel();
        JScrollPane1 = new javax.swing.JScrollPane();
        tblmasuk = new javax.swing.JTable();
        txtcari = new javax.swing.JTextField();
        txtperihal = new javax.swing.JTextField();
        txtkepada = new javax.swing.JTextField();
        txtdari = new javax.swing.JTextField();
        txtnomor = new javax.swing.JTextField();
        txtsurat = new javax.swing.JTextField();
        btnshare = new javax.swing.JButton();
        btnprofil = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnprint = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnnotif = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btnupload = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        btnadmin = new javax.swing.JButton();
        btnkalender = new javax.swing.JButton();
        btnmove = new javax.swing.JButton();
        dctanggal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        dateChooser1.setTextRefernce(dctanggal);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "umum", "telegram", "notadinas" }));
        cmbjenis.setSelectedIndex(-1);
        getContentPane().add(cmbjenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 170, -1));

        profil.setForeground(new java.awt.Color(255, 255, 255));
        profil.setText("Nama Pegawai");
        profil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profilMouseClicked(evt);
            }
        });
        getContentPane().add(profil, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 86, 190, 30));

        tblmasuk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nomor Surat", "Pengirim", "Kepada", "Perihal", "Hari/Tanggal", "Jenis Surat", "Direktori Surat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblmasuk.setGridColor(new java.awt.Color(0, 0, 51));
        tblmasuk.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tblmasuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblmasukMouseReleased(evt);
            }
        });
        JScrollPane1.setViewportView(tblmasuk);

        getContentPane().add(JScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 220, 860, 420));

        txtcari.setBorder(null);
        txtcari.setForeground(new java.awt.Color(0, 0, 102));
        txtcari.setSelectedTextColor(new java.awt.Color(0, 0, 51));
        txtcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcariActionPerformed(evt);
            }
        });
        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcariKeyTyped(evt);
            }
        });
        getContentPane().add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 170, 280, 30));

        txtperihal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtperihalActionPerformed(evt);
            }
        });
        getContentPane().add(txtperihal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 170, -1));

        txtkepada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkepadaActionPerformed(evt);
            }
        });
        getContentPane().add(txtkepada, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 170, -1));

        txtdari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdariActionPerformed(evt);
            }
        });
        getContentPane().add(txtdari, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 170, -1));
        getContentPane().add(txtnomor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 170, -1));
        getContentPane().add(txtsurat, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 160, -1));

        btnshare.setText("Share");
        btnshare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshareActionPerformed(evt);
            }
        });
        getContentPane().add(btnshare, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 380, -1, -1));

        btnprofil.setForeground(new java.awt.Color(255, 255, 255));
        btnprofil.setBorder(null);
        btnprofil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnprofil, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 80, 60, 40));

        btnedit.setForeground(new java.awt.Color(255, 255, 255));
        btnedit.setBorder(null);
        btnedit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        getContentPane().add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 310, 40, 30));

        btnprint.setForeground(new java.awt.Color(255, 255, 255));
        btnprint.setBorder(null);
        btnprint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });
        getContentPane().add(btnprint, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 260, 40, 30));

        btnhapus.setForeground(new java.awt.Color(255, 255, 255));
        btnhapus.setBorder(null);
        btnhapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 210, 40, 40));

        btnnotif.setForeground(new java.awt.Color(255, 255, 255));
        btnnotif.setBorder(null);
        btnnotif.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnnotif, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 90, 30, 30));

        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setBorder(null);
        btnadd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        getContentPane().add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 600, 60, 30));

        btnupload.setForeground(new java.awt.Color(255, 255, 255));
        btnupload.setBorder(null);
        btnupload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnupload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuploadActionPerformed(evt);
            }
        });
        getContentPane().add(btnupload, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 160, 20));

        btnkeluar.setForeground(new java.awt.Color(255, 255, 255));
        btnkeluar.setBorder(null);
        btnkeluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 80, 20));

        btnadmin.setForeground(new java.awt.Color(255, 255, 255));
        btnadmin.setBorder(null);
        btnadmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnadmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnadminMouseClicked(evt);
            }
        });
        getContentPane().add(btnadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 50, 20));

        btnkalender.setForeground(new java.awt.Color(255, 255, 255));
        btnkalender.setBorder(null);
        btnkalender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnkalender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnkalenderMouseClicked(evt);
            }
        });
        getContentPane().add(btnkalender, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 70, 20));

        btnmove.setText("Move to Act");
        btnmove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnmove, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 350, 70, -1));
        getContentPane().add(dctanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 170, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/suratmasuk/MASUK(1).png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtdariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdariActionPerformed

    private void txtkepadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkepadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkepadaActionPerformed

    private void txtperihalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtperihalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtperihalActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
    String nomor = txtnomor.getText();
    String dari = txtdari.getText();
    String kepada = txtkepada.getText();
    String perihal = txtperihal.getText();
    String jenis = cmbjenis.getSelectedItem().toString().split(". ")[0];
    String surat = txtsurat.getText().replace("\\", "\\\\");;
    String tanggal = dctanggal.getText();
    try{
        Statement statement = (Statement) conek.GetConnection().createStatement();
        statement.executeUpdate("INSERT INTO masuk (nomor, pengirim, kepada, perihal, hari_tanggal, jenis, surat) VALUES ('"+nomor+"','"+dari+"','"+kepada+"','"+perihal+"','"+tanggal+"','"+jenis+"','"+surat+"')");
        datatable();
        reset();
    } catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_btnaddActionPerformed

    private void txtcariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyTyped
try {
    Statement statement = (Statement) conek.GetConnection().createStatement();
    ResultSet res = statement.executeQuery("SELECT * FROM masuk WHERE nomor LIKE '%" + txtcari.getText() + "%' "
        + "OR pengirim LIKE '%" + txtcari.getText() + "%' "
        + "OR kepada LIKE '%" + txtcari.getText() + "%' "
        + "OR perihal LIKE '%" + txtcari.getText() + "%' "
        + "OR hari_tanggal LIKE '%" + txtcari.getText() + "%' "
        + "OR jenis LIKE '%" + txtcari.getText() + "%' "
        + "OR surat LIKE '%" + txtcari.getText()+ "%'");

    DefaultTableModel tbl = new DefaultTableModel();
    tbl.addColumn("Nomor Surat");
    tbl.addColumn("Pengirim");
    tbl.addColumn("Kepada");
    tbl.addColumn("Perihal");
    tbl.addColumn("Hari/Tanggal");
    tbl.addColumn("Jenis Surat");
    tbl.addColumn("Direktori Surat");

    boolean found = false; // Menandai apakah hasil pencarian ditemukan atau tidak
    while (res.next()) {
        tbl.addRow(new Object[]{
                res.getString("nomor"),
                res.getString("pengirim"),
                res.getString("kepada"),
                res.getString("perihal"),
                res.getString("hari_tanggal"),
                res.getString("jenis"),
                res.getString("surat")
        });
        found = true; // Setel ke true jika setidaknya satu hasil pencarian ditemukan
    }
    
    tblmasuk.setModel(tbl);
    
        // Jika hasil pencarian tidak ditemukan, kosongkan tabel
        if (!found) {
            tbl.setRowCount(0); // Menghapus semua baris dari tabel
        }

    }catch (SQLException e) {
            
    }
    }//GEN-LAST:event_txtcariKeyTyped

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed

    }//GEN-LAST:event_txtcariActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
    int option = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
    if (option == JOptionPane.YES_OPTION) {
        String idadmin = txtnomor.getText();
        try {
            Statement statement=conek.GetConnection().createStatement();
            statement.executeUpdate("DELETE from masuk where nomor=('" + txtnomor.getText() + "');" );          
            //JOptionPane.showMessageDialog(null, "data berhasil di HAPUS");
            datatable();
            reset();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data gagal di HAPUS" + e);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Penghapusan data dibatalkan.");
    }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
                                    
    try {
        Statement statement = conek.GetConnection().createStatement();
        String query = "UPDATE masuk SET "
            + "nomor = '" + txtnomor.getText()+ "', "
            + "pengirim = '" + txtdari.getText() + "', "
            + "kepada = '" + txtkepada.getText() + "', "
            + "perihal = '" + txtperihal.getText() + "', "
            + "hari_tanggal = '" + dctanggal.getText() + "', "
            + "jenis = '" + cmbjenis.getSelectedItem() + "', "
            + "surat = '" + txtsurat.getText() + "' "
            + "WHERE nomor = '"+ txtnomor.getText() +"'";

        statement.executeUpdate(query);
        datatable();
        reset();

    } catch (Exception e){
        JOptionPane.showMessageDialog(null,e);
    }

    }//GEN-LAST:event_btneditActionPerformed

    private void tblmasukMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblmasukMouseReleased
        int row = tblmasuk.getSelectedRow();
        DefaultTableModel tableModel = (DefaultTableModel) tblmasuk.getModel();
        txtnomor.setText(tableModel.getValueAt(row, 0).toString());
        txtdari.setText(tableModel.getValueAt(row, 1).toString());
        txtkepada.setText(tableModel.getValueAt(row, 2).toString());
        txtperihal.setText(tableModel.getValueAt(row, 3).toString());
        dctanggal.setText(tableModel.getValueAt(row, 4).toString());
        cmbjenis.setSelectedItem(tableModel.getValueAt(row,5).toString());
        txtsurat.setText(tableModel.getValueAt(row, 6).toString());
        
    }//GEN-LAST:event_tblmasukMouseReleased

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
    int selectedRow = tblmasuk.getSelectedRow();
    if (selectedRow != -1) { // Pastikan baris dipilih sebelum membuka file
        String filePath = tblmasuk.getValueAt(selectedRow, 6).toString(); // Ambil path file dari kolom ke-6 (kolom "Surat")
        try {
            File file = new File(filePath);
            Desktop.getDesktop().open(file); // Buka file dengan program bawaan sistem operasi
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Gagal membuka file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Pilih baris dalam tabel terlebih dahulu.", "Peringatan", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnprintActionPerformed

    private void btnuploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuploadActionPerformed
    
    JFileChooser fileChooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Surat files", "txt", "doc", "docx", "pdf");
    fileChooser.setFileFilter(filter);

    int returnValue = fileChooser.showOpenDialog(null);
    if (returnValue == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        String filePath = selectedFile.getAbsolutePath(); // Dapatkan path file yang dipilih
        
        // Setel path file pada txtsurat
        txtsurat.setText(filePath);
        
        System.out.println("File yang dipilih: " + filePath);
    } else {
        System.out.println("Pengunggahan surat dibatalkan.");
    }

    }//GEN-LAST:event_btnuploadActionPerformed

    private void btnshareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshareActionPerformed
        int selectedRow = tblmasuk.getSelectedRow();
        if(selectedRow >= 0) {
            
            // Mengambil data direktori surat dari baris yang dipilih
            Object direktoriSurat = tblmasuk.getModel().getValueAt(selectedRow, 6);

            // Membuat instance dari form `masuk_share`
            masuk_share a = new masuk_share();

            // Memanggil metode untuk menetapkan direktori surat pada form `masuk_share`
            a.setDirektori(direktoriSurat.toString());

            // Menampilkan form `masuk_share`
            a.setVisible(true);
            a.pack();
            a.setDefaultCloseOperation(masuk_share.DISPOSE_ON_CLOSE);
            
        } else {
            // Tampilkan pesan error jika tidak ada baris yang dipilih
            JOptionPane.showMessageDialog(this, "Silahkan pilih baris pada tabel terlebih dahulu", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnshareActionPerformed

    private void btnmoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoveActionPerformed
        int selectedRow = tblmasuk.getSelectedRow();
        if(selectedRow >= 0) {
            
            // Mengambil data direktori surat dari baris yang dipilih
            Object direktoriSurat = tblmasuk.getModel().getValueAt(selectedRow, 6);

            // Membuat instance dari form `masuk_share`
            masuk_move a = new masuk_move();

            // Memanggil metode untuk menetapkan direktori surat pada form `masuk_share`
            a.setDirektori(direktoriSurat.toString());

            // Menampilkan form `masuk_share`
            a.setVisible(true);
            a.pack();
            a.setDefaultCloseOperation(masuk_move.DISPOSE_ON_CLOSE);
            
        } else {
            // Tampilkan pesan error jika tidak ada baris yang dipilih
            JOptionPane.showMessageDialog(this, "Silahkan pilih baris pada tabel terlebih dahulu", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnmoveActionPerformed

    private void btnadminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnadminMouseClicked
        // TODO add your handling code here:
        this.dispose();
                admin a = new admin();
                a.setVisible(true);
            
    }//GEN-LAST:event_btnadminMouseClicked

    private void btnkalenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkalenderMouseClicked
        // TODO add your handling code here:
        this.dispose();
                kegiatan a = new kegiatan();
                a.setVisible(true);
            
    }//GEN-LAST:event_btnkalenderMouseClicked

    private void profilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilMouseClicked
        // TODO add your handling code here:
        this.dispose();
                profil a = new profil();
                a.setVisible(true);
            
    }//GEN-LAST:event_profilMouseClicked

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
            java.util.logging.Logger.getLogger(masuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(masuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(masuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(masuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new masuk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPane1;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnadmin;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkalender;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnmove;
    private javax.swing.JButton btnnotif;
    private javax.swing.JButton btnprint;
    private javax.swing.JButton btnprofil;
    private javax.swing.JButton btnshare;
    private javax.swing.JButton btnupload;
    private javax.swing.JComboBox<String> cmbjenis;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JTextField dctanggal;
    private net.sourceforge.jdatepicker.util.JDatePickerUtil jDatePickerUtil1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel profil;
    private javax.swing.JTable tblmasuk;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtdari;
    private javax.swing.JTextField txtkepada;
    private javax.swing.JTextField txtnomor;
    private javax.swing.JTextField txtperihal;
    private javax.swing.JTextField txtsurat;
    // End of variables declaration//GEN-END:variables
}
