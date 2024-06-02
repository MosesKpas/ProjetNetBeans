package ma_caisse_final_version;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.Timer;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import com.mysql.jdbc.PreparedStatement;

/*
 * @author Moses
 */
public class ajout_client extends javax.swing.JInternalFrame {
    private final String url = "jdbc:mysql://127.0.0.1:3306/caisse", user = "root", pass = "";
    private Connection con;
    private Statement st;
    private String insert;
    private String delete;
    private PreparedStatement pst;
    public static final String[] colonne={
        "NOM","POSTNOM","PRENOM","TEL","COMMUNE","QUARTIER","NUMERO"
    };
    private DefaultTableModel model= new DefaultTableModel(colonne,0);

    void ouverture() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = (Connection) DriverManager.getConnection(url, user, pass);
            System.out.println("ouvert");
        } catch (Exception e) {
            System.out.println("pas ouvert" + e);
        }
    }
    void fermeture() {
        try {
            this.con.close();
            this.st.close();
            System.out.println("fermer");
        } catch (Exception e) {
            System.out.println("pas fermer");
        }
    }
    public ajout_client() {
        initComponents();
        tab.setModel(model);
         data();
         commune();
        Timer updateTimer;
        int play = 100;
        updateTimer = new Timer(play, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Date cur = new Date();
                String FormatTimer = "hh:mm:ss";
                String FormatTimer2 = "dd/MM/yyyy";
                DateFormat as = new SimpleDateFormat(FormatTimer);
                DateFormat ase = new SimpleDateFormat(FormatTimer2);
                String a = as.format(cur);
                String b = ase.format(cur);
                heure.setText(a);
                date.setText(b);
            }
        });
        updateTimer.start();
        this.setBorder(null);
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pan = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        cherche = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        post = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        num = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        quat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        bis = new javax.swing.JRadioButton();
        com = new javax.swing.JTextField();
        av = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        nump = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        heure = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        update = new javax.swing.JButton();
        bsave = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        comm = new javax.swing.JLabel();

        pan.setBackground(new java.awt.Color(204, 204, 255));
        pan.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panMouseMoved(evt);
            }
        });

        tab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        tab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOM", "POSTNOM", "PRENOM", "TEL", "COMMUNE", "QUARTIER", "AVENUE", "NUMERO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tab);
        if (tab.getColumnModel().getColumnCount() > 0) {
            tab.getColumnModel().getColumn(0).setResizable(false);
            tab.getColumnModel().getColumn(1).setResizable(false);
            tab.getColumnModel().getColumn(2).setResizable(false);
            tab.getColumnModel().getColumn(3).setResizable(false);
            tab.getColumnModel().getColumn(4).setResizable(false);
            tab.getColumnModel().getColumn(4).setHeaderValue("COMMUNE");
            tab.getColumnModel().getColumn(5).setResizable(false);
            tab.getColumnModel().getColumn(5).setHeaderValue("QUARTIER");
            tab.getColumnModel().getColumn(6).setResizable(false);
            tab.getColumnModel().getColumn(6).setHeaderValue("AVENUE");
            tab.getColumnModel().getColumn(7).setResizable(false);
            tab.getColumnModel().getColumn(7).setHeaderValue("NUMERO");
        }

        cherche.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        cherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chercheActionPerformed(evt);
            }
        });
        cherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                chercheKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RECHERCHE:");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        post.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        post.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postActionPerformed(evt);
            }
        });

        nom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setText("PRENOM    :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("POSTNOM :");

        pre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setText("NUMERO   :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("NOM            :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setText("+243");

        try {
            num.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("### ### ###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        num.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adresse", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        quat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Q  /");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("N°");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("C  /");

        bis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bis.setText("BIS");

        com.setEditable(false);
        com.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        com.setText("LIMETE");

        av.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Av/");

        nump.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(com, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(quat, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(nump, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bis))
                            .addComponent(av, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(com, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(quat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(av, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(bis)
                    .addComponent(nump, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel8.setBackground(new java.awt.Color(102, 153, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setText("CODE          :");

        code.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(post, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(post, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Roblox Font", 1, 36)); // NOI18N
        jLabel2.setText("AJOUT CLIENT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        date.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));

        heure.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        heure.setForeground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Option", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jButton4.setBackground(new java.awt.Color(0, 153, 153));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_print_24px.png"))); // NOI18N
        jButton4.setText("PRINT");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(204, 204, 255));
        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_data_backup_24px.png"))); // NOI18N
        update.setText("Update");
        update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        bsave.setBackground(new java.awt.Color(0, 255, 102));
        bsave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_add_user_male_24px_1.png"))); // NOI18N
        bsave.setText("+USER");
        bsave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        bsave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsaveActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_delete_user_male_24px.png"))); // NOI18N
        jButton2.setText("DELETE");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bsave, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bsave, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        comm.setForeground(new java.awt.Color(204, 204, 255));
        comm.setText("l");

        javax.swing.GroupLayout panLayout = new javax.swing.GroupLayout(pan);
        pan.setLayout(panLayout);
        panLayout.setHorizontalGroup(
            panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLayout.createSequentialGroup()
                .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215)
                        .addComponent(comm)
                        .addGap(249, 249, 249)
                        .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(heure, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(cherche, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        panLayout.setVerticalGroup(
            panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panLayout.createSequentialGroup()
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(heure, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comm))))
                .addGap(6, 6, 6)
                .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cherche, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chercheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chercheKeyReleased
        String ch = cherche.getText();
        search(ch);
    }//GEN-LAST:event_chercheKeyReleased

    private void postActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postActionPerformed

    }//GEN-LAST:event_postActionPerformed

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed

    }//GEN-LAST:event_nomActionPerformed

    private void preActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preActionPerformed

    }//GEN-LAST:event_preActionPerformed

    private void bsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsaveActionPerformed
        //Pour enregistrer
        String NOM = nom.getText();
        String PRENOM = pre.getText();
        String POST = post.getText();
        String NUM = num.getText();
        String CODE = code.getText();
        String COM = com.getText();
        String QUAT = quat.getText();
        String NUMP = ""+nump.getComponentCount();
        String motif = "Enregistrer";
        String BIS = "";
        if (bis.isSelected()) {
            BIS = bis.getText();
        } else if (!bis.isSelected()) {
            BIS = "";
        }
        if (NOM.isEmpty() || PRENOM.isEmpty() || POST.isEmpty() || NUM.isEmpty() || CODE.isEmpty() || QUAT.isEmpty() || NUMP.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Remplir les champs vide");
        } else {
            save(NOM, POST, PRENOM, NUM, CODE, COM, QUAT, NUMP, BIS);
            ouverture_compte_dollar(NOM, PRENOM, CODE, motif, 0, 0, date.getText(),heure.getText());
            ouverture_compte_franc(NOM, PRENOM, CODE, motif, 0, 0, date.getText(),heure.getText());
            String sv[] = {NOM, POST, PRENOM, NUM, COM, QUAT, NUMP + BIS};
            DefaultTableModel model = (DefaultTableModel) tab.getModel();
            model.addRow(sv);
        }
    }//GEN-LAST:event_bsaveActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
    int i =tab.getSelectedRow();
    model.setValueAt(nom.getText(), i, 0);
    model.setValueAt(post.getText(), i, 1);
    model.setValueAt(pre.getText(), i, 2);
    model.setValueAt(num.getText(), i, 3);
    model.setValueAt(quat.getText(), i, 6);
    model.setValueAt(""+nump.getComponentCount(), i, 8);
    mise(nom.getText(),post.getText(),pre.getText(),num.getText(),quat.getText(),""+nump.getComponentCount());
    
    }//GEN-LAST:event_updateActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //pour l'impression
        MessageFormat header = new MessageFormat("Liste des clients");
        MessageFormat footer = new MessageFormat("Ma caisse Remix");
        try {
            tab.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("erreur d'impression", e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Pour effecer
        effacer(nom.getText(), post.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void panMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panMouseMoved
        // TODO add your handling code here:    
    }//GEN-LAST:event_panMouseMoved

    private void tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseClicked
        //Pour update les informations a partir du tableau
        tab.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int i =tab.getSelectedRow();
                nom.setText((String) model.getValueAt(i, 0));
                post.setText((String) model.getValueAt(i, 1));
                pre.setText((String) model.getValueAt(i, 2));
                num.setText((String) model.getValueAt(i, 3));
                code.setText((String) model.getValueAt(i, 4));
                com.setText((String) model.getValueAt(i, 5));
                quat.setText((String) model.getValueAt(i, 6));
                nump.setToolTipText((String) model.getValueAt(i, 8));
            }
        });
        
    }//GEN-LAST:event_tabMouseClicked

    private void chercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chercheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chercheActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField av;
    private javax.swing.JRadioButton bis;
    private javax.swing.JButton bsave;
    private javax.swing.JTextField cherche;
    private javax.swing.JTextField code;
    private javax.swing.JTextField com;
    private javax.swing.JLabel comm;
    private javax.swing.JLabel date;
    private javax.swing.JLabel heure;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nom;
    private javax.swing.JFormattedTextField num;
    private javax.swing.JSpinner nump;
    private javax.swing.JPanel pan;
    private javax.swing.JTextField post;
    private javax.swing.JTextField pre;
    private javax.swing.JTextField quat;
    private javax.swing.JTable tab;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

    //Methode pour enregistrer!
    public void save(String Nom, String Post, String Pre, String NUm, String Code, String Com, String Quat, String Num, String Bis) {
        try {
            ouverture();
            this.st = (Statement) this.con.createStatement();
            this.insert = "insert into ajoutclient value('" + Nom + "','" + Post + "','" + Pre + "','" + NUm + "','" + Code + "','" + Com + "','" + Quat + "','" + Num + Bis + "')";
            this.st.executeUpdate(insert);
            JOptionPane.showMessageDialog(null, "client Ajouter");
            nom.setText("");
            post.setText("");
            pre.setText("");
            num.setText("");
            nump.setToolTipText("");
            code.setText(""); 
            quat.setText("");
            fermeture();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Pas d'enregistrement");
        }
    }

    //pour enregistrer le client du cote franc et dollar
    public void ouverture_compte_dollar(String nom, String post, String code, String motif, int solde, int total, String date,String Heure) {
        try {
            ouverture();
            this.st = (Statement) this.con.createStatement();
            this.insert = "insert into dollar value('" + nom + "','" + post + "','" + code + "','" + motif + "','" + solde + "','" + total + "','" + date+"  "+Heure + "')";
            this.st.executeUpdate(insert);
            JOptionPane.showMessageDialog(null, "Ouverture du compte en dollar");
            fermeture();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "compte non ouvert " + e);
        }
    }

    public void ouverture_compte_franc(String nom, String post, String code, String motif, int solde, int total, String date,String Heure) {
        try {
            ouverture();
            this.st = (Statement) this.con.createStatement();
            this.insert = "insert into franc value('" + nom + "','" + post + "','" + code + "','" + motif + "','" + solde + "','" + total + "','" + date+"  "+Heure + "')";
            this.st.executeUpdate(insert);
            JOptionPane.showMessageDialog(null, "Ouverture du compte en franc");
            fermeture();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "compte non ouvert " + e);
        }
    }

    //Methode pour voir les enregistrements!
    public void data() {
        try {
            ouverture();
            Statement st = (Statement) con.createStatement();
            String sql = "select * from ajoutclient";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String NOM = rs.getString("nom");
                String POSTNOM = rs.getString("postnom");
                String PRENOM = rs.getString("prenom");
                String NUMERO = rs.getString("numero");
                String COMMUNE = rs.getString("commune");
                String QUART = rs.getString("quartier");
                String NUM_PARCELLE = rs.getString("Num_parcelle");
                String tdData[] = {NOM, POSTNOM, PRENOM, NUMERO, COMMUNE, QUART, NUM_PARCELLE};
                DefaultTableModel tbModel = (DefaultTableModel) tab.getModel();
                tbModel.addRow(tdData);
            }
            fermeture();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    //Methode pour effacer un clientm a partir du nom et du postnom
    public void effacer(String NOM, String Post) {
        try {
            ouverture();
            this.st = (Statement) this.con.createStatement();
            this.delete = "delete from ajoutclient where NOM='" + NOM + "' and Postnom='" + Post + "'";
            this.st.executeUpdate(this.delete);
            nom.setText("");
            post.setText("");
            fermeture();
            JOptionPane.showMessageDialog(null, "Supprimer avec succes");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    //Pour effectuer des recherches au niveau du tableau
    public void search(String str) {
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) tab.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tab.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));

    }
    public void mise(String Nom,String Post, String Pre,String Num,String Quat,String Nump){
        try {
            ouverture();
            this.pst=(PreparedStatement)this.con.prepareStatement("");
            String sq="update ajouclient set nom='"+Nom+"' ";
            pst.executeUpdate(sq);
            fermeture();
            System.out.println("mise a jour");
        } catch (Exception e) {
            System.out.println("pas de mise a jour "+e);
        }
    }
    //pour prendre la commune
    public void commune(){
        try {
            ouverture();
            this.st=(Statement)this.con.createStatement();
            String sql =" select commune from user where 1";
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                String comm = rs.getString("commune");
                com.setText(comm);
            }
            fermeture();
        } catch (Exception e) {
            System.out.println("non "+e);
        }
    }

}
