package Ma_caisse_Remix_20;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import javax.swing.JOptionPane;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author moses
 */
public class MENU_EXCEL extends javax.swing.JFrame {

    boolean move = true;
    Double bHeight = 0.0;
    String motif = "";
    //excel
    XSSFWorkbook workbook = new XSSFWorkbook();
    XSSFSheet sheet = workbook.createSheet("alls");
    XSSFRow row;

    //
    public void exelll() {
        //excel

        row = sheet.createRow(0);
        Cell cell0 = row.createCell(0);
        Cell cell1 = row.createCell(1);
        Cell cell2 = row.createCell(2);
        Cell cell3 = row.createCell(3);
        Cell cell4 = row.createCell(4);
        Cell cell5 = row.createCell(5);
        Cell cell6 = row.createCell(6);
        Cell cell7 = row.createCell(7);
        Cell cell8 = row.createCell(8);
        Cell cell9 = row.createCell(9);
        cell0.setCellValue("NOM");
        cell1.setCellValue("POSTNOM");
        cell2.setCellValue("PRENOM");
        cell3.setCellValue("SEXE");
        cell4.setCellValue("TELEPHONE");
        cell5.setCellValue("CODE");
        cell6.setCellValue("COMMUNE");
        cell7.setCellValue("QUARTIER");
        cell8.setCellValue("AVENUE");
        cell9.setCellValue("NUMERO");
        for (int i = 0; i < 1; i++) {
            row = sheet.createRow(i + 1);
        }
    }

    public MENU_EXCEL() {
        initComponents();
        setIcone();
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (move == true) {
                    titlemove.setLocation(titlemove.getLocation().x - 5, titlemove.getLocation().y);
                    dz.setForeground(Color.red);
                    dz1.setForeground(Color.blue);
                }
                if (titlemove.getLocation().x < 0) {
                    move = false;
                }
                if (move == false) {
                    titlemove.setLocation(titlemove.getLocation().x + 5, titlemove.getLocation().y);
                    if (titlemove.getLocation().x > 450) {
                        move = true;
                    }
                    dz.setForeground(Color.blue);
                    dz1.setForeground(Color.red);
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 35);

        conf.setVisible(false);
        //pour les boutons
        boutonclient.setEnabled(false);
        boutonoperation.setEnabled(false);
        boutonbilan.setEnabled(false);
        boutonautre.setEnabled(false);
        //differentes methodes de data

        //fin
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        placeholder pl = new placeholder("Votre Nom", nomuser);
        pl = new placeholder("Mot de passe", mdpuser);

    }

    //
    public void setIcone() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("img0.jpg")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Couleur = new javax.swing.ButtonGroup();
        couleurSuite = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        barrlat = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        dz = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        dz1 = new javax.swing.JLabel();
        dz2 = new javax.swing.JLabel();
        ichelp1 = new javax.swing.JLabel();
        PANEAUDECONTROL = new javax.swing.JPanel();
        boutonclient = new javax.swing.JButton();
        boutonoperation = new javax.swing.JButton();
        boutonbilan = new javax.swing.JButton();
        boutonautre = new javax.swing.JButton();
        lcl = new javax.swing.JPanel();
        lop = new javax.swing.JPanel();
        lbi = new javax.swing.JPanel();
        lau = new javax.swing.JPanel();
        titlemove = new javax.swing.JLabel();
        principal = new javax.swing.JTabbedPane();
        user = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        nomuser = new javax.swing.JTextField();
        mdpuser = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        val = new javax.swing.JPanel();
        valt = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        c = new javax.swing.JCheckBox();
        jPanel62 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        conf = new javax.swing.JPanel();
        jPanel101 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        nomroot = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        mdproot = new javax.swing.JPasswordField();
        jLabel132 = new javax.swing.JLabel();
        jSeparator27 = new javax.swing.JSeparator();
        fraisroot = new javax.swing.JTextField();
        jLabel133 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        AjoutClient = new javax.swing.JTabbedPane();
        fondaj = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel64 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        boutoninfos = new javax.swing.JButton();
        boutonajout = new javax.swing.JButton();
        boutonmodifier = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        jPanel65 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        prec = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        nomc = new javax.swing.JTextField();
        postc = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        comc = new javax.swing.JComboBox<>();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        mdpc = new javax.swing.JPasswordField();
        jLabel96 = new javax.swing.JLabel();
        telc = new javax.swing.JFormattedTextField();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        quatc = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        numc = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        avc = new javax.swing.JTextField();
        bisc = new javax.swing.JRadioButton();
        sexec = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        operation = new javax.swing.JTabbedPane();
        fondop = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        postop = new javax.swing.JTextField();
        preop = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        nomop = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        codeop = new javax.swing.JPasswordField();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jPanel17 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        franc = new javax.swing.JTextField();
        dollar = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel107 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RETRAIT = new javax.swing.JRadioButton();
        DEPOT = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        FC = new javax.swing.JRadioButton();
        DL = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        inserer = new javax.swing.JTextField();
        jPanel94 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        pourc = new javax.swing.JLabel();
        entrefranc = new javax.swing.JLabel();
        entredollar = new javax.swing.JLabel();
        fraisd = new javax.swing.JLabel();
        fraisf = new javax.swing.JLabel();
        bilan = new javax.swing.JTabbedPane();
        fondbl = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        dlbl = new javax.swing.JTextField();
        francbl = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        postbl = new javax.swing.JTextField();
        prebl = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        nombl = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        codebl = new javax.swing.JPasswordField();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabbl = new javax.swing.JTable();
        autre = new javax.swing.JTabbedPane();
        moi = new javax.swing.JTabbedPane();
        jPanel47 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel54 = new javax.swing.JPanel();
        nomusercon = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel53 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jPanel57 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        fraisdispodl = new javax.swing.JTextField();
        fraisdispofc = new javax.swing.JTextField();
        caissefc = new javax.swing.JTextField();
        caissedl = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        frdl = new javax.swing.JRadioButton();
        frfc = new javax.swing.JRadioButton();
        jLabel61 = new javax.swing.JLabel();
        modiff = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jPanel89 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        rfrais = new javax.swing.JTextField();
        pourcactuel = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jPanel58 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jPanel59 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        parametre = new javax.swing.JTabbedPane();
        fondau = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        blks = new javax.swing.JRadioButton();
        whts = new javax.swing.JRadioButton();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        bles = new javax.swing.JRadioButton();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        orgs = new javax.swing.JRadioButton();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        vrts = new javax.swing.JRadioButton();
        jPanel49 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jPanel67 = new javax.swing.JPanel();
        jPanel68 = new javax.swing.JPanel();
        jPanel69 = new javax.swing.JPanel();
        jPanel70 = new javax.swing.JPanel();
        jPanel71 = new javax.swing.JPanel();
        jPanel72 = new javax.swing.JPanel();
        jPanel73 = new javax.swing.JPanel();
        jPanel74 = new javax.swing.JPanel();
        jPanel75 = new javax.swing.JPanel();
        blk = new javax.swing.JRadioButton();
        wht = new javax.swing.JRadioButton();
        jPanel76 = new javax.swing.JPanel();
        jPanel77 = new javax.swing.JPanel();
        jPanel78 = new javax.swing.JPanel();
        jPanel79 = new javax.swing.JPanel();
        ble = new javax.swing.JRadioButton();
        jPanel80 = new javax.swing.JPanel();
        jPanel81 = new javax.swing.JPanel();
        jPanel82 = new javax.swing.JPanel();
        jPanel83 = new javax.swing.JPanel();
        org = new javax.swing.JRadioButton();
        jPanel84 = new javax.swing.JPanel();
        jPanel85 = new javax.swing.JPanel();
        jPanel86 = new javax.swing.JPanel();
        jPanel87 = new javax.swing.JPanel();
        vrt = new javax.swing.JRadioButton();
        updateClient = new javax.swing.JTabbedPane();
        jPanel60 = new javax.swing.JPanel();
        jPanel61 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jPanel63 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jPanel66 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        sexemd = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        nommd = new javax.swing.JTextField();
        postmd = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        mdpmd = new javax.swing.JPasswordField();
        jLabel114 = new javax.swing.JLabel();
        telmd = new javax.swing.JFormattedTextField();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        commd = new javax.swing.JTextField();
        jLabel117 = new javax.swing.JLabel();
        quatmd = new javax.swing.JTextField();
        jLabel118 = new javax.swing.JLabel();
        nummd = new javax.swing.JTextField();
        jLabel119 = new javax.swing.JLabel();
        avmd = new javax.swing.JTextField();
        BIS = new javax.swing.JRadioButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        premd = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabmodif = new javax.swing.JTable();
        nommemoir = new javax.swing.JLabel();
        fakecode = new javax.swing.JLabel();
        infos = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jPanel88 = new javax.swing.JPanel();
        jPanel90 = new javax.swing.JPanel();
        jPanel91 = new javax.swing.JPanel();
        infoTl = new javax.swing.JComboBox<>();
        infocom = new javax.swing.JComboBox<>();
        infoSx = new javax.swing.JComboBox<>();
        jLabel79 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        jPanel92 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jPanel93 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        ndhomme = new javax.swing.JTextField();
        nbclients = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        ndfemme = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabinfo = new javax.swing.JTable();
        supplement = new javax.swing.JTabbedPane();
        apropos = new javax.swing.JTabbedPane();
        jPanel95 = new javax.swing.JPanel();
        jPanel97 = new javax.swing.JPanel();
        jPanel96 = new javax.swing.JPanel();
        jLabel120 = new javax.swing.JLabel();
        jSeparator23 = new javax.swing.JSeparator();
        jPanel100 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jSeparator25 = new javax.swing.JSeparator();
        jLabel125 = new javax.swing.JLabel();
        jPanel99 = new javax.swing.JPanel();
        jLabel123 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jSeparator26 = new javax.swing.JSeparator();
        jLabel127 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jSeparator24 = new javax.swing.JSeparator();
        jLabel126 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        mdpClient = new javax.swing.JTabbedPane();
        jPanel98 = new javax.swing.JPanel();
        jPanel102 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jPanel103 = new javax.swing.JPanel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jPanel104 = new javax.swing.JPanel();
        jPanel105 = new javax.swing.JPanel();
        jLabel146 = new javax.swing.JLabel();
        jPanel106 = new javax.swing.JPanel();
        postau = new javax.swing.JTextField();
        preau = new javax.swing.JTextField();
        jLabel141 = new javax.swing.JLabel();
        jSeparator28 = new javax.swing.JSeparator();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        nomau = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jSeparator29 = new javax.swing.JSeparator();
        jSeparator30 = new javax.swing.JSeparator();
        telau = new javax.swing.JFormattedTextField();
        jPanel107 = new javax.swing.JPanel();
        jLabel140 = new javax.swing.JLabel();
        jPanel108 = new javax.swing.JPanel();
        jLabel147 = new javax.swing.JLabel();
        jPanel109 = new javax.swing.JPanel();
        jPanel112 = new javax.swing.JPanel();
        jLabel148 = new javax.swing.JLabel();
        code1 = new javax.swing.JTextField();
        jLabel149 = new javax.swing.JLabel();
        jPanel110 = new javax.swing.JPanel();
        codeconf = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jLabel163 = new javax.swing.JLabel();
        jPanel111 = new javax.swing.JPanel();
        jLabel151 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1000, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barrlat.setBackground(new java.awt.Color(255, 255, 255));
        barrlat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_power_off_button_48px.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        barrlat.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 20, 50, 50));

        dz.setFont(new java.awt.Font("Roblox Font", 1, 48)); // NOI18N
        dz.setText("0");
        barrlat.add(dz, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 30, 60));

        title.setFont(new java.awt.Font("Roblox Font", 1, 48)); // NOI18N
        title.setText("MA CAISSE REMIX");
        barrlat.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, 60));

        dz1.setFont(new java.awt.Font("Roblox Font", 1, 48)); // NOI18N
        dz1.setText("2");
        barrlat.add(dz1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 30, 60));

        dz2.setFont(new java.awt.Font("Roblox Font", 1, 48)); // NOI18N
        dz2.setText(".");
        barrlat.add(dz2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, -1, 60));

        ichelp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_logout_rounded_left_50px.png"))); // NOI18N
        ichelp1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ichelp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ichelp1MouseClicked(evt);
            }
        });
        barrlat.add(ichelp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 60));

        jPanel2.add(barrlat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -7, 1320, 80));

        PANEAUDECONTROL.setBackground(new java.awt.Color(255, 255, 255));
        PANEAUDECONTROL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boutonclient.setBackground(new java.awt.Color(255, 255, 255));
        boutonclient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        boutonclient.setText("+CLIENTS");
        boutonclient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boutonclient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boutonclientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boutonclientMouseExited(evt);
            }
        });
        boutonclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonclientActionPerformed(evt);
            }
        });
        PANEAUDECONTROL.add(boutonclient, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 26, 134, 52));

        boutonoperation.setBackground(new java.awt.Color(255, 255, 255));
        boutonoperation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        boutonoperation.setText("OPERATIONS");
        boutonoperation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boutonoperation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boutonoperationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boutonoperationMouseExited(evt);
            }
        });
        boutonoperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonoperationActionPerformed(evt);
            }
        });
        PANEAUDECONTROL.add(boutonoperation, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 26, 140, 52));

        boutonbilan.setBackground(new java.awt.Color(255, 255, 255));
        boutonbilan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        boutonbilan.setText("BILAN");
        boutonbilan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boutonbilan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boutonbilanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boutonbilanMouseExited(evt);
            }
        });
        boutonbilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonbilanActionPerformed(evt);
            }
        });
        PANEAUDECONTROL.add(boutonbilan, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 26, 140, 52));

        boutonautre.setBackground(new java.awt.Color(255, 255, 255));
        boutonautre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        boutonautre.setText("AUTRE");
        boutonautre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boutonautre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boutonautreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boutonautreMouseExited(evt);
            }
        });
        boutonautre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonautreActionPerformed(evt);
            }
        });
        PANEAUDECONTROL.add(boutonautre, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 26, 134, 52));

        lcl.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout lclLayout = new javax.swing.GroupLayout(lcl);
        lcl.setLayout(lclLayout);
        lclLayout.setHorizontalGroup(
            lclLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        lclLayout.setVerticalGroup(
            lclLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        PANEAUDECONTROL.add(lcl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 17, -1, 4));

        lop.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout lopLayout = new javax.swing.GroupLayout(lop);
        lop.setLayout(lopLayout);
        lopLayout.setHorizontalGroup(
            lopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        lopLayout.setVerticalGroup(
            lopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        PANEAUDECONTROL.add(lop, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 17, -1, 4));

        lbi.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout lbiLayout = new javax.swing.GroupLayout(lbi);
        lbi.setLayout(lbiLayout);
        lbiLayout.setHorizontalGroup(
            lbiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        lbiLayout.setVerticalGroup(
            lbiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        PANEAUDECONTROL.add(lbi, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 17, -1, 4));

        lau.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout lauLayout = new javax.swing.GroupLayout(lau);
        lau.setLayout(lauLayout);
        lauLayout.setHorizontalGroup(
            lauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        lauLayout.setVerticalGroup(
            lauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        PANEAUDECONTROL.add(lau, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 17, -1, 4));

        titlemove.setText("MA CAISSE REMIX 2.0 Copyright@ G5 PRGOS");
        titlemove.setEnabled(false);
        PANEAUDECONTROL.add(titlemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        jPanel2.add(PANEAUDECONTROL, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, 720, 100));

        jPanel11.setBackground(new java.awt.Color(153, 153, 153));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));
        jPanel13.setForeground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("AUTHENTIFICATION");
        jPanel13.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 270, 30));

        jPanel12.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 420, 70));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_lock_48px.png"))); // NOI18N
        jPanel12.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 50, 50));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_user_48px.png"))); // NOI18N
        jPanel12.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 50, 50));

        nomuser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nomuser.setBorder(null);
        jPanel12.add(nomuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 230, 40));

        mdpuser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mdpuser.setBorder(null);
        mdpuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdpuserActionPerformed(evt);
            }
        });
        jPanel12.add(mdpuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 210, 40));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel12.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 280, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel12.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 280, 10));

        val.setBackground(new java.awt.Color(0, 0, 255));
        val.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        val.setFocusable(false);
        val.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                valMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                valMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                valMouseExited(evt);
            }
        });
        val.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        valt.setBackground(new java.awt.Color(255, 255, 255));
        valt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valt.setForeground(new java.awt.Color(255, 255, 255));
        valt.setText("VALIDER");
        valt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        valt.setFocusable(false);
        val.add(valt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 70, 40));

        jPanel12.add(val, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 120, 40));

        jPanel14.setBackground(new java.awt.Color(178, 178, 178));
        jPanel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel14MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("A Propos de Ma caisse_remix 2.0");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel12.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 260, -1));

        c.setBackground(new java.awt.Color(255, 255, 255));
        c.setText("jCheckBox1");
        c.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_eye_24px_1.png"))); // NOI18N
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        jPanel12.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 30, -1));

        jPanel62.setBackground(new java.awt.Color(178, 178, 178));
        jPanel62.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel62MouseClicked(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel65.setText("A PROPOS DE G5 Progs");
        jLabel65.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel65MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel12.add(jPanel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 260, -1));

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 440, 460));

        conf.setBackground(new java.awt.Color(255, 255, 255));
        conf.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel101.setBackground(new java.awt.Color(0, 0, 0));

        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setText("CONFIG");

        javax.swing.GroupLayout jPanel101Layout = new javax.swing.GroupLayout(jPanel101);
        jPanel101.setLayout(jPanel101Layout);
        jPanel101Layout.setHorizontalGroup(
            jPanel101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel101Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(jLabel86)
                .addGap(85, 85, 85))
        );
        jPanel101Layout.setVerticalGroup(
            jPanel101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel101Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        conf.add(jPanel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 260, -1));

        jLabel130.setFont(new java.awt.Font("Future Light", 1, 24)); // NOI18N
        jLabel130.setText("Frais/retrait");
        conf.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        nomroot.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        conf.add(nomroot, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 170, 30));

        jLabel131.setFont(new java.awt.Font("Future Light", 1, 24)); // NOI18N
        jLabel131.setText("NOM");
        conf.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));
        conf.add(mdproot, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 170, 30));

        jLabel132.setFont(new java.awt.Font("Future Light", 1, 24)); // NOI18N
        jLabel132.setText("/100");
        conf.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        jSeparator27.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator27.setForeground(new java.awt.Color(0, 0, 0));
        conf.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 272, 150, 10));
        conf.add(fraisroot, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 100, 30));

        jLabel133.setFont(new java.awt.Font("Future Light", 1, 24)); // NOI18N
        jLabel133.setText("Code");
        conf.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton12.setText("AJOUT");
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        conf.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 120, 40));

        jButton16.setBackground(new java.awt.Color(255, 255, 255));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton16.setText("ANNULER");
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        conf.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 110, 40));

        jPanel11.add(conf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 280, 400));

        user.addTab("tab1", jPanel11);

        principal.addTab("tab3", user);

        fondaj.setBackground(new java.awt.Color(204, 204, 204));
        fondaj.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 204, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Glitch Inside", 1, 36)); // NOI18N
        jLabel8.setText("CLIENTS");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel10.setFont(new java.awt.Font("Glitch Inside", 1, 24)); // NOI18N
        jLabel10.setText("AJOUT ");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        fondaj.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 539, 250, 90));

        jPanel7.setBackground(new java.awt.Color(0, 204, 204));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Glitch Inside", 1, 36)); // NOI18N
        jLabel12.setText("CLIENTS");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel14.setFont(new java.awt.Font("Glitch Inside", 1, 24)); // NOI18N
        jLabel14.setText("AJOUT ");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        fondaj.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 539, 260, 90));

        jPanel64.setBackground(new java.awt.Color(255, 255, 255));
        jPanel64.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel87.setBackground(new java.awt.Color(0, 204, 204));
        jLabel87.setFont(new java.awt.Font("Segoe UI Variable", 3, 18)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(0, 204, 204));
        jLabel87.setText("OPTIONS");
        jPanel64.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 90, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel64.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 42, 150, 12));

        boutoninfos.setBackground(new java.awt.Color(0, 204, 204));
        boutoninfos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        boutoninfos.setText("INFOS");
        boutoninfos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boutoninfos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boutoninfosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boutoninfosMouseExited(evt);
            }
        });
        boutoninfos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutoninfosActionPerformed(evt);
            }
        });
        jPanel64.add(boutoninfos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 119, 40));

        boutonajout.setBackground(new java.awt.Color(0, 204, 204));
        boutonajout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        boutonajout.setText("AJOUTER");
        boutonajout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boutonajout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boutonajoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boutonajoutMouseExited(evt);
            }
        });
        boutonajout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonajoutActionPerformed(evt);
            }
        });
        jPanel64.add(boutonajout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 119, 40));

        boutonmodifier.setBackground(new java.awt.Color(0, 204, 204));
        boutonmodifier.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        boutonmodifier.setText("MODIFIER");
        boutonmodifier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boutonmodifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boutonmodifierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boutonmodifierMouseExited(evt);
            }
        });
        boutonmodifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonmodifierActionPerformed(evt);
            }
        });
        jPanel64.add(boutonmodifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 119, 40));

        jButton19.setBackground(new java.awt.Color(0, 204, 204));
        jButton19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton19.setText("IMPRIMER");
        jButton19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel64.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 119, 40));

        fondaj.add(jPanel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 170, 460));

        tab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDENTITE", "ADRESSE", "TELEPHONE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane14.setViewportView(tab);
        if (tab.getColumnModel().getColumnCount() > 0) {
            tab.getColumnModel().getColumn(0).setResizable(false);
            tab.getColumnModel().getColumn(1).setResizable(false);
            tab.getColumnModel().getColumn(2).setResizable(false);
        }

        fondaj.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 87, 590, 420));

        jPanel65.setBackground(new java.awt.Color(255, 255, 255));
        jPanel65.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel88.setBackground(new java.awt.Color(0, 204, 204));
        jLabel88.setFont(new java.awt.Font("Segoe UI Variable", 3, 18)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(0, 204, 204));
        jLabel88.setText("Confidentialite");
        jPanel65.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 140, 50));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel65.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 440, 10));

        prec.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel65.add(prec, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 140, 30));

        jLabel89.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel89.setText("Sexe");
        jPanel65.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 70, 30));

        jLabel90.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel90.setText("Nom");
        jPanel65.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 50, 30));

        jLabel91.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel91.setText("+243");
        jPanel65.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 50, 30));

        nomc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel65.add(nomc, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 150, 30));

        postc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel65.add(postc, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 150, 30));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel65.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 42, 440, 12));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel65.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 440, 10));

        jLabel92.setBackground(new java.awt.Color(0, 204, 204));
        jLabel92.setFont(new java.awt.Font("Segoe UI Variable", 3, 18)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(0, 204, 204));
        jLabel92.setText("Infos-sur-Clients");
        jPanel65.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 170, 40));

        jLabel93.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel93.setText("Mot de Passe");
        jPanel65.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 120, 40));

        comc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----CHOISIR---", "Ndjili", "Kasa-Vubu", "Lingwala", "Maluku", "Kinkole", "Gombe", "Ngaba", "Ngiri-Ngiri", "Limete", "Masina", "Kimbanseke", "Nsele", "Matete", "Lemba", "Kinshasa", "Barumbu", "Kintambo", "Bandal", "Bumbu", "Selembao", "Makala", "Mont Ngafula", "Ngaliema", "Kalamu" }));
        comc.setAutoscrolls(true);
        jPanel65.add(comc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 150, 30));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel65.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 440, 10));

        jLabel94.setBackground(new java.awt.Color(0, 204, 204));
        jLabel94.setFont(new java.awt.Font("Segoe UI Variable", 3, 18)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(0, 204, 204));
        jLabel94.setText("Adresse");
        jPanel65.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 80, 40));

        jLabel95.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel95.setText("Prenom");
        jPanel65.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 70, 30));

        mdpc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel65.add(mdpc, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 160, 30));

        jLabel96.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel96.setText("Postnom");
        jPanel65.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 80, 30));

        try {
            telc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("### ### ###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel65.add(telc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 110, 30));

        jLabel97.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel97.setText("Tel.");
        jPanel65.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 30, 30));

        jLabel98.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel98.setText("Commune");
        jPanel65.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 100, 30));

        jLabel99.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel99.setText("Quartier");
        jPanel65.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 80, 30));

        quatc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel65.add(quatc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 150, 30));

        jLabel100.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel100.setText("Num");
        jPanel65.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 50, 30));

        numc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel65.add(numc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 90, 30));

        jLabel101.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel101.setText("Avenue");
        jPanel65.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 80, 30));

        avc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel65.add(avc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 150, 30));

        bisc.setBackground(new java.awt.Color(255, 255, 255));
        bisc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bisc.setText("BIS");
        bisc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel65.add(bisc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, -1, 30));

        sexec.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sexec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----CHOISIR---", "Homme", "Femme" }));
        sexec.setAutoscrolls(true);
        sexec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexecActionPerformed(evt);
            }
        });
        jPanel65.add(sexec, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 102, 140, 30));

        fondaj.add(jPanel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 470, 460));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fondaj.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 40, 190, 40));

        jLabel106.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel106.setText("RECHERCHE");
        fondaj.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 50, -1, -1));

        AjoutClient.addTab("tab1", fondaj);

        principal.addTab("tab5", AjoutClient);

        fondop.setBackground(new java.awt.Color(204, 204, 204));
        fondop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(0, 255, 102));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Glitch Inside", 1, 36)); // NOI18N
        jLabel13.setText("operation");
        jPanel10.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 230, -1));

        jLabel18.setFont(new java.awt.Font("Glitch Inside", 1, 24)); // NOI18N
        jLabel18.setText("Ici");
        jPanel10.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        fondop.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 539, 250, 90));

        jPanel15.setBackground(new java.awt.Color(0, 255, 102));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Glitch Inside", 1, 36)); // NOI18N
        jLabel19.setText("operation");
        jPanel15.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 40, 240, -1));

        jLabel20.setFont(new java.awt.Font("Glitch Inside", 1, 24)); // NOI18N
        jLabel20.setText("ici");
        jPanel15.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        fondop.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 539, 260, 90));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setBackground(new java.awt.Color(0, 255, 102));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel1.setText("VERIFICATION");
        jPanel19.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 40));

        jPanel16.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 340, 50));

        jPanel20.setBackground(new java.awt.Color(204, 255, 204));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        postop.setEditable(false);
        postop.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel20.add(postop, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 46, 170, 36));

        preop.setEditable(false);
        preop.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel20.add(preop, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 93, 170, 38));

        jLabel33.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel33.setText("Prenom");
        jPanel20.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 90, -1));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel20.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 240, 10));

        jLabel34.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel34.setText("Complement");
        jPanel20.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 100, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel35.setText("Postnom");
        jPanel20.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, -1));

        jPanel16.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 340, 140));

        nomop.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nomop.setBorder(null);
        jPanel16.add(nomop, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 190, 40));

        jButton2.setBackground(new java.awt.Color(51, 255, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Verifier");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 90, 30));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_lock_48px.png"))); // NOI18N
        jPanel16.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, 80));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_user_48px.png"))); // NOI18N
        jPanel16.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, 40));

        codeop.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        codeop.setBorder(null);
        jPanel16.add(codeop, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 170, 40));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel16.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 122, 240, 10));

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        jPanel16.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 240, 10));

        fondop.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 360, 420));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 255, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("VALIDER");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 100, 40));

        jPanel18.setBackground(new java.awt.Color(204, 255, 204));

        franc.setEditable(false);
        franc.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        franc.setText("0");

        dollar.setEditable(false);
        dollar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dollar.setText("0");

        jLabel105.setFont(new java.awt.Font("Segoe UI Variable", 3, 18)); // NOI18N
        jLabel105.setText("FC");

        jLabel108.setFont(new java.awt.Font("Segoe UI Variable", 3, 18)); // NOI18N
        jLabel108.setText("$");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(franc, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(dollar, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(franc, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dollar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 590, 90));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel17.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 400, 12));

        jLabel107.setFont(new java.awt.Font("Segoe UI Variable", 3, 18)); // NOI18N
        jLabel107.setText("Mon-Compte");
        jPanel17.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 120, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("TOTAL");
        jPanel17.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 60, -1));

        RETRAIT.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(RETRAIT);
        RETRAIT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RETRAIT.setText("RETRAIT");
        RETRAIT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RETRAIT.setOpaque(false);
        jPanel17.add(RETRAIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 220, 120, 40));

        DEPOT.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(DEPOT);
        DEPOT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DEPOT.setText("DEPOT");
        DEPOT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DEPOT.setOpaque(false);
        jPanel17.add(DEPOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 90, 40));

        jLabel3.setFont(new java.awt.Font("Future Light", 1, 24)); // NOI18N
        jLabel3.setText("FAIRE UN :-:->");
        jPanel17.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 150, -1));

        FC.setBackground(new java.awt.Color(255, 255, 255));
        couleurSuite.add(FC);
        FC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FC.setText("FRANC");
        FC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FC.setOpaque(false);
        jPanel17.add(FC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 90, 40));

        DL.setBackground(new java.awt.Color(255, 255, 255));
        couleurSuite.add(DL);
        DL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DL.setText("DOLLAR");
        DL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DL.setOpaque(false);
        jPanel17.add(DL, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 100, 40));

        jLabel4.setFont(new java.awt.Font("Future Light", 1, 24)); // NOI18N
        jLabel4.setText("DEVISE   :-:->");
        jPanel17.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 150, -1));

        total.setEditable(false);
        total.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        total.setForeground(new java.awt.Color(51, 255, 51));
        jPanel17.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 160, 40));

        jLabel5.setFont(new java.awt.Font("Future Light", 1, 24)); // NOI18N
        jLabel5.setText("MONTANT--:-:->");
        jPanel17.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 170, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("|");
        jPanel17.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 20, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("|");
        jPanel17.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 20, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("|");
        jPanel17.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 20, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("|");
        jPanel17.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 20, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("|");
        jPanel17.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 20, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("|");
        jPanel17.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 20, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("|");
        jPanel17.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 20, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel26.setText("OPERATION");
        jPanel17.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 120, -1));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel17.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 192, 190, 10));

        inserer.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        inserer.setForeground(new java.awt.Color(51, 255, 51));
        jPanel17.add(inserer, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 160, 40));

        jPanel94.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel94Layout = new javax.swing.GroupLayout(jPanel94);
        jPanel94.setLayout(jPanel94Layout);
        jPanel94Layout.setHorizontalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel94Layout.setVerticalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel17.add(jPanel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 240, 120));

        jButton14.setBackground(new java.awt.Color(41, 182, 97));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton14.setText("FIN");
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 343, 90, 40));

        fondop.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 630, 420));

        pourc.setForeground(new java.awt.Color(204, 204, 204));
        pourc.setText("jLabel50");
        fondop.add(pourc, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 340, -1, -1));

        entrefranc.setForeground(new java.awt.Color(204, 204, 204));
        fondop.add(entrefranc, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 290, 60, 30));

        entredollar.setForeground(new java.awt.Color(204, 204, 204));
        fondop.add(entredollar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 240, 50, 40));

        fraisd.setForeground(new java.awt.Color(204, 204, 204));
        fondop.add(fraisd, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 60, 30));

        fraisf.setForeground(new java.awt.Color(204, 204, 204));
        fondop.add(fraisf, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 60, 30));

        operation.addTab("tab1", fondop);

        principal.addTab("tab3", operation);

        fondbl.setBackground(new java.awt.Color(204, 204, 204));
        fondbl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBackground(new java.awt.Color(204, 0, 255));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Glitch Inside", 1, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("Bilan");
        jPanel21.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 40, 190, -1));

        jLabel28.setFont(new java.awt.Font("Glitch Inside", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("Le");
        jPanel21.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        fondbl.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 539, 260, 90));

        jPanel22.setBackground(new java.awt.Color(204, 0, 255));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Glitch Inside", 1, 36)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setText("Bilan");
        jPanel22.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 180, -1));

        jLabel30.setFont(new java.awt.Font("Glitch Inside", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setText("Le");
        jPanel22.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        fondbl.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 539, 250, 90));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(204, 0, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("IMPRIMER");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, -1, 40));

        jPanel3.setBackground(new java.awt.Color(211, 168, 211));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dlbl.setEditable(false);
        dlbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dlbl.setText("0");
        jPanel3.add(dlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 190, 40));

        francbl.setEditable(false);
        francbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        francbl.setText("0");
        jPanel3.add(francbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 18, 190, 40));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setText("$");
        jPanel3.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 30, 40));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setText("FC");
        jPanel3.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 30, 40));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 11, 510, 80));

        jButton15.setBackground(new java.awt.Color(134, 26, 161));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton15.setText("FIN");
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 13, 110, 30));

        fondbl.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 720, 100));

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel24.setBackground(new java.awt.Color(204, 0, 255));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel36.setText("VERIFICATION");
        jPanel24.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 40));

        jPanel23.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 340, 50));

        jPanel25.setBackground(new java.awt.Color(211, 168, 211));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        postbl.setEditable(false);
        postbl.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel25.add(postbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 46, 170, 36));

        prebl.setEditable(false);
        prebl.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel25.add(prebl, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 93, 170, 38));

        jLabel37.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel37.setText("Prenom");
        jPanel25.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 90, -1));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        jPanel25.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 240, 10));

        jLabel38.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel38.setText("Complement");
        jPanel25.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 100, -1));

        jLabel40.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel40.setText("Postnom");
        jPanel25.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, -1));

        jPanel23.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 340, 140));

        nombl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nombl.setBorder(null);
        jPanel23.add(nombl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 190, 40));

        jButton3.setBackground(new java.awt.Color(204, 0, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Verifier");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel23.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 90, 30));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_lock_48px.png"))); // NOI18N
        jPanel23.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, 80));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_user_48px.png"))); // NOI18N
        jPanel23.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, 40));

        codebl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        codebl.setBorder(null);
        jPanel23.add(codebl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 170, 40));

        jSeparator14.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        jPanel23.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 122, 240, 10));

        jSeparator15.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));
        jPanel23.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 240, 10));

        fondbl.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 360, 420));

        tabbl.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        tabbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDENTITE", "MOTIF", "FAIT", "TOTAL", "DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabbl);
        if (tabbl.getColumnModel().getColumnCount() > 0) {
            tabbl.getColumnModel().getColumn(0).setResizable(false);
            tabbl.getColumnModel().getColumn(1).setResizable(false);
            tabbl.getColumnModel().getColumn(2).setResizable(false);
            tabbl.getColumnModel().getColumn(3).setResizable(false);
            tabbl.getColumnModel().getColumn(4).setResizable(false);
        }

        fondbl.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 70, 720, 310));

        bilan.addTab("tab1", fondbl);

        principal.addTab("tab4", bilan);

        jPanel47.setBackground(new java.awt.Color(204, 204, 204));
        jPanel47.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel48.setBackground(new java.awt.Color(255, 255, 255));
        jPanel48.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(0, 51, 51));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("STYLE");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel48.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 140, 41));

        jPanel54.setBackground(new java.awt.Color(130, 170, 170));
        jPanel54.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nomusercon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nomusercon.setText("NOM ICI");
        jPanel54.add(nomusercon, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 60, 190, -1));

        jLabel51.setFont(new java.awt.Font("Future Light", 1, 26)); // NOI18N
        jLabel51.setText("GESTIONNAIRE");
        jPanel54.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jSeparator16.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator16.setForeground(new java.awt.Color(0, 0, 0));
        jPanel54.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 200, -1));

        jPanel48.add(jPanel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 90));

        jButton6.setBackground(new java.awt.Color(0, 51, 51));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("A PROPOS");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel48.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 140, 41));

        jButton7.setBackground(new java.awt.Color(0, 51, 51));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("CONTACTER");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel48.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 140, 41));

        jButton8.setBackground(new java.awt.Color(0, 51, 51));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Mot de passe");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel48.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 140, 41));

        jPanel47.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 240, 420));

        jPanel53.setBackground(new java.awt.Color(255, 255, 255));
        jPanel53.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel55.setBackground(new java.awt.Color(130, 170, 170));

        jLabel58.setFont(new java.awt.Font("Future Light", 1, 26)); // NOI18N
        jLabel58.setText("- - MODIFIER-FRAIS - -");

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel55Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addComponent(jLabel58)
                .addGap(98, 98, 98))
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel53.add(jPanel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 450, 40));

        jPanel57.setBackground(new java.awt.Color(130, 170, 170));

        jLabel53.setFont(new java.awt.Font("Future Light", 1, 26)); // NOI18N
        jLabel53.setText("- - DISPO_EN_CAISSE - -");

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
            .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel57Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel53)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel57Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel53)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel53.add(jPanel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 340, 40));

        fraisdispodl.setEditable(false);
        fraisdispodl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fraisdispodl.setForeground(new java.awt.Color(0, 204, 51));
        fraisdispodl.setText("0");
        jPanel53.add(fraisdispodl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 190, 40));

        fraisdispofc.setEditable(false);
        fraisdispofc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fraisdispofc.setForeground(new java.awt.Color(0, 204, 51));
        fraisdispofc.setText("0");
        jPanel53.add(fraisdispofc, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 190, 40));

        caissefc.setEditable(false);
        caissefc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        caissefc.setForeground(new java.awt.Color(0, 204, 51));
        caissefc.setText("0");
        jPanel53.add(caissefc, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 190, 40));

        caissedl.setEditable(false);
        caissedl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        caissedl.setForeground(new java.awt.Color(0, 204, 51));
        caissedl.setText("0");
        jPanel53.add(caissedl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 190, 40));

        jLabel54.setFont(new java.awt.Font("Future Light", 1, 26)); // NOI18N
        jLabel54.setText("$");
        jPanel53.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, 40));

        jLabel55.setFont(new java.awt.Font("Future Light", 1, 26)); // NOI18N
        jLabel55.setText("FC");
        jPanel53.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, 40));

        jLabel56.setFont(new java.awt.Font("Future Light", 1, 26)); // NOI18N
        jLabel56.setText("$");
        jPanel53.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, 40));

        jLabel57.setFont(new java.awt.Font("Future Light", 1, 26)); // NOI18N
        jLabel57.setText("FC");
        jPanel53.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, 40));

        jPanel56.setBackground(new java.awt.Color(130, 170, 170));

        jLabel59.setFont(new java.awt.Font("Future Light", 1, 26)); // NOI18N
        jLabel59.setText("- - FRAIS - -");

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
            .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel56Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel59)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel56Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel59)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel53.add(jPanel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 340, 40));

        jLabel60.setFont(new java.awt.Font("Future Light", 1, 26)); // NOI18N
        jLabel60.setText("MONTANT :-->");
        jPanel53.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));

        buttonGroup2.add(frdl);
        frdl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        frdl.setText("DOLLAR");
        frdl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel53.add(frdl, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, -1, 30));

        buttonGroup2.add(frfc);
        frfc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        frfc.setText("FRANC");
        frfc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel53.add(frfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, -1, 30));

        jLabel61.setFont(new java.awt.Font("Future Light", 1, 26)); // NOI18N
        jLabel61.setText("Devise     :-->");
        jPanel53.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        modiff.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel53.add(modiff, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, 140, 40));

        jButton9.setBackground(new java.awt.Color(0, 51, 51));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("MODIFIER");
        jButton9.setToolTipText("");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel53.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 130, 30));

        jPanel89.setBackground(new java.awt.Color(130, 170, 170));

        jLabel77.setFont(new java.awt.Font("Future Light", 1, 26)); // NOI18N
        jLabel77.setText("- - RETIRER_DU_FRAIS - -");

        javax.swing.GroupLayout jPanel89Layout = new javax.swing.GroupLayout(jPanel89);
        jPanel89.setLayout(jPanel89Layout);
        jPanel89Layout.setHorizontalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel89Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel77)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel89Layout.setVerticalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel77, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel53.add(jPanel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 450, 40));

        rfrais.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel53.add(rfrais, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 190, 50));

        pourcactuel.setEditable(false);
        pourcactuel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel53.add(pourcactuel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 140, 40));

        jButton13.setBackground(new java.awt.Color(0, 51, 51));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("RETIRER");
        jButton13.setToolTipText("");
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel53.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 110, 40));

        jLabel134.setFont(new java.awt.Font("Future Light", 1, 18)); // NOI18N
        jLabel134.setText("MODIFIER");
        jPanel53.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, -1, -1));

        jLabel135.setFont(new java.awt.Font("Future Light", 1, 18)); // NOI18N
        jLabel135.setText("----->");
        jPanel53.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 50, -1));

        jLabel136.setFont(new java.awt.Font("Future Light", 1, 18)); // NOI18N
        jLabel136.setText("ACTUEL");
        jPanel53.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, -1, -1));

        jPanel47.add(jPanel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 870, 420));

        jPanel58.setBackground(new java.awt.Color(0, 51, 51));
        jPanel58.setToolTipText("");
        jPanel58.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel52.setFont(new java.awt.Font("Glitch Inside", 1, 36)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("ESPACE");
        jPanel58.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 210, -1));

        jLabel62.setFont(new java.awt.Font("Glitch Inside", 1, 24)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Mon");
        jPanel58.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 10, 80, -1));

        jPanel47.add(jPanel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 510, 250, 90));

        jPanel59.setBackground(new java.awt.Color(0, 51, 51));
        jPanel59.setToolTipText("");
        jPanel59.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel63.setFont(new java.awt.Font("Glitch Inside", 1, 36)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("ESPACE");
        jPanel59.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 40, 210, -1));

        jLabel64.setFont(new java.awt.Font("Glitch Inside", 1, 24)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Mon");
        jPanel59.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jPanel47.add(jPanel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 260, 90));

        moi.addTab("tab1", jPanel47);

        autre.addTab("tab1", moi);

        fondau.setBackground(new java.awt.Color(207, 207, 207));
        fondau.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel26.setBackground(new java.awt.Color(218, 218, 249));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel27.setBackground(new java.awt.Color(204, 204, 204));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));

        jPanel30.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
            .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel28Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
            .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel28Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel27.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, -1));

        jPanel29.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jPanel27.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, -1));

        jPanel26.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 170, 120));

        jPanel31.setBackground(new java.awt.Color(204, 204, 204));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));

        jPanel33.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
            .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel32Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
            .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel32Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel31.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, -1));

        jPanel34.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jPanel31.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, -1));

        jPanel26.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 170, 120));

        Couleur.add(blks);
        blks.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        blks.setText("H-Noire B-Noire (NOIRE)");
        blks.setOpaque(false);
        blks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blksActionPerformed(evt);
            }
        });
        jPanel26.add(blks, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        Couleur.add(whts);
        whts.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        whts.setText("Defaut (Blanc)");
        whts.setOpaque(false);
        whts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whtsActionPerformed(evt);
            }
        });
        jPanel26.add(whts, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 120, -1));

        jPanel35.setBackground(new java.awt.Color(204, 204, 204));
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel36.setBackground(new java.awt.Color(51, 51, 255));

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
            .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel36Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
            .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel36Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel35.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, -1));

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jPanel35.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, -1));

        jPanel26.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 170, 120));

        Couleur.add(bles);
        bles.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bles.setText("H-Bleue B-Bleu (BLEU)");
        bles.setOpaque(false);
        bles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blesActionPerformed(evt);
            }
        });
        jPanel26.add(bles, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, -1));

        jPanel39.setBackground(new java.awt.Color(204, 204, 204));
        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel40.setBackground(new java.awt.Color(0, 0, 0));

        jPanel41.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
            .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel40Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
            .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel40Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel39.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, -1));

        jPanel42.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jPanel39.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, -1));

        jPanel26.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 170, 120));

        Couleur.add(orgs);
        orgs.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        orgs.setText("H-Or. B-Or. (Orange)");
        orgs.setOpaque(false);
        orgs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgsActionPerformed(evt);
            }
        });
        jPanel26.add(orgs, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, -1, -1));

        jPanel43.setBackground(new java.awt.Color(204, 204, 204));
        jPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel44.setBackground(new java.awt.Color(0, 204, 0));

        jPanel45.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
            .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel44Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
            .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel44Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel43.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, -1));

        jPanel46.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jPanel43.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, -1));

        jPanel26.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 170, 120));

        Couleur.add(vrts);
        vrts.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vrts.setText("H-Vert B-Vert (VERT)");
        vrts.setOpaque(false);
        vrts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vrtsActionPerformed(evt);
            }
        });
        jPanel26.add(vrts, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 140, -1, -1));

        fondau.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 1160, 180));

        jPanel49.setBackground(new java.awt.Color(255, 51, 51));
        jPanel49.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("Glitch Inside", 1, 36)); // NOI18N
        jLabel39.setText("STYLE");
        jPanel49.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 40, 190, -1));

        jLabel45.setFont(new java.awt.Font("Glitch Inside", 1, 24)); // NOI18N
        jLabel45.setText("Le");
        jPanel49.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        fondau.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 260, 90));

        jPanel50.setBackground(new java.awt.Color(0, 255, 0));
        jPanel50.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setFont(new java.awt.Font("Glitch Inside", 1, 36)); // NOI18N
        jLabel46.setText("STYLE");
        jPanel50.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 180, -1));

        jLabel47.setFont(new java.awt.Font("Glitch Inside", 1, 24)); // NOI18N
        jLabel47.setText("Le");
        jPanel50.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        fondau.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 510, 250, 90));

        jPanel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel51MouseClicked(evt);
            }
        });
        jPanel51.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel48.setText("A VOTRE CHOIX");
        jPanel51.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 3, 160, 30));

        fondau.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 460, 230, 40));

        jPanel52.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel49.setText("CHANGER LA COULEUR");
        jPanel52.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 11, 270, -1));

        fondau.add(jPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 20, 320, 40));

        jPanel67.setBackground(new java.awt.Color(218, 218, 249));
        jPanel67.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel68.setBackground(new java.awt.Color(204, 204, 204));
        jPanel68.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel69.setBackground(new java.awt.Color(0, 0, 0));

        jPanel70.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
            .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel69Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
            .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel69Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel68.add(jPanel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, -1));

        jPanel71.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel71Layout = new javax.swing.GroupLayout(jPanel71);
        jPanel71.setLayout(jPanel71Layout);
        jPanel71Layout.setHorizontalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel71Layout.setVerticalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jPanel68.add(jPanel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, -1));

        jPanel67.add(jPanel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 170, 120));

        jPanel72.setBackground(new java.awt.Color(204, 204, 204));
        jPanel72.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel73.setBackground(new java.awt.Color(255, 255, 255));

        jPanel74.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel73Layout = new javax.swing.GroupLayout(jPanel73);
        jPanel73.setLayout(jPanel73Layout);
        jPanel73Layout.setHorizontalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
            .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel73Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel73Layout.setVerticalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
            .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel73Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel72.add(jPanel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, -1));

        jPanel75.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jPanel72.add(jPanel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, -1));

        jPanel67.add(jPanel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 170, 120));

        Couleur.add(blk);
        blk.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        blk.setText("H-Noire B-Noire (NOIRE)");
        blk.setOpaque(false);
        blk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blkActionPerformed(evt);
            }
        });
        jPanel67.add(blk, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        Couleur.add(wht);
        wht.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        wht.setSelected(true);
        wht.setText("Defaut (Blanc)");
        wht.setOpaque(false);
        wht.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whtActionPerformed(evt);
            }
        });
        jPanel67.add(wht, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 120, -1));

        jPanel76.setBackground(new java.awt.Color(204, 204, 204));
        jPanel76.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel77.setBackground(new java.awt.Color(51, 51, 255));

        jPanel78.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel78Layout = new javax.swing.GroupLayout(jPanel78);
        jPanel78.setLayout(jPanel78Layout);
        jPanel78Layout.setHorizontalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel78Layout.setVerticalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel77Layout = new javax.swing.GroupLayout(jPanel77);
        jPanel77.setLayout(jPanel77Layout);
        jPanel77Layout.setHorizontalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
            .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel77Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel77Layout.setVerticalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
            .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel77Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel76.add(jPanel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, -1));

        jPanel79.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel79Layout = new javax.swing.GroupLayout(jPanel79);
        jPanel79.setLayout(jPanel79Layout);
        jPanel79Layout.setHorizontalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel79Layout.setVerticalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jPanel76.add(jPanel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, -1));

        jPanel67.add(jPanel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 170, 120));

        Couleur.add(ble);
        ble.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ble.setText("H-Bleue B-Bleu (BLEU)");
        ble.setOpaque(false);
        ble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bleActionPerformed(evt);
            }
        });
        jPanel67.add(ble, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, -1));

        jPanel80.setBackground(new java.awt.Color(204, 204, 204));
        jPanel80.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel81.setBackground(new java.awt.Color(255, 204, 0));

        jPanel82.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel82Layout = new javax.swing.GroupLayout(jPanel82);
        jPanel82.setLayout(jPanel82Layout);
        jPanel82Layout.setHorizontalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel82Layout.setVerticalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel81Layout = new javax.swing.GroupLayout(jPanel81);
        jPanel81.setLayout(jPanel81Layout);
        jPanel81Layout.setHorizontalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
            .addGroup(jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel81Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel81Layout.setVerticalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
            .addGroup(jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel81Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel80.add(jPanel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, -1));

        jPanel83.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout jPanel83Layout = new javax.swing.GroupLayout(jPanel83);
        jPanel83.setLayout(jPanel83Layout);
        jPanel83Layout.setHorizontalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel83Layout.setVerticalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jPanel80.add(jPanel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, -1));

        jPanel67.add(jPanel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 170, 120));

        Couleur.add(org);
        org.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        org.setText("H-Or. B-Or. (Orange)");
        org.setOpaque(false);
        org.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgActionPerformed(evt);
            }
        });
        jPanel67.add(org, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, -1, -1));

        jPanel84.setBackground(new java.awt.Color(204, 204, 204));
        jPanel84.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel85.setBackground(new java.awt.Color(0, 204, 0));

        jPanel86.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel86Layout = new javax.swing.GroupLayout(jPanel86);
        jPanel86.setLayout(jPanel86Layout);
        jPanel86Layout.setHorizontalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel86Layout.setVerticalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel85Layout = new javax.swing.GroupLayout(jPanel85);
        jPanel85.setLayout(jPanel85Layout);
        jPanel85Layout.setHorizontalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
            .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel85Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel85Layout.setVerticalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
            .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel85Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel84.add(jPanel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, -1));

        jPanel87.setBackground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout jPanel87Layout = new javax.swing.GroupLayout(jPanel87);
        jPanel87.setLayout(jPanel87Layout);
        jPanel87Layout.setHorizontalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel87Layout.setVerticalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jPanel84.add(jPanel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, -1));

        jPanel67.add(jPanel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 170, 120));

        Couleur.add(vrt);
        vrt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vrt.setText("H-Vert B-Vert (VERT)");
        vrt.setOpaque(false);
        vrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vrtActionPerformed(evt);
            }
        });
        jPanel67.add(vrt, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 140, -1, -1));

        fondau.add(jPanel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 1160, 170));

        parametre.addTab("tab1", fondau);

        autre.addTab("tab1", parametre);

        jPanel60.setBackground(new java.awt.Color(204, 204, 204));
        jPanel60.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel61.setBackground(new java.awt.Color(255, 255, 0));
        jPanel61.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel66.setFont(new java.awt.Font("Glitch Inside", 1, 36)); // NOI18N
        jLabel66.setText("Modifier");
        jPanel61.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 210, -1));

        jLabel67.setFont(new java.awt.Font("Glitch Inside", 1, 24)); // NOI18N
        jLabel67.setText("Ici");
        jPanel61.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jPanel60.add(jPanel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 510, 250, 90));

        jPanel63.setBackground(new java.awt.Color(255, 255, 0));
        jPanel63.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel68.setFont(new java.awt.Font("Glitch Inside", 1, 36)); // NOI18N
        jLabel68.setText("Modifier");
        jPanel63.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 40, 210, -1));

        jLabel69.setFont(new java.awt.Font("Glitch Inside", 1, 24)); // NOI18N
        jLabel69.setText("Ici");
        jPanel63.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jPanel60.add(jPanel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 260, 90));

        jPanel66.setBackground(new java.awt.Color(255, 255, 255));
        jPanel66.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel102.setFont(new java.awt.Font("Segoe UI Variable", 3, 18)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(204, 204, 0));
        jLabel102.setText("Confidentialite");
        jPanel66.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 140, 50));

        jSeparator17.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator17.setForeground(new java.awt.Color(0, 0, 0));
        jPanel66.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 440, 10));

        sexemd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel66.add(sexemd, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 140, 30));

        jLabel103.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel103.setText("Sexe");
        jPanel66.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 70, 30));

        jLabel104.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel104.setText("Nom");
        jPanel66.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 50, 30));

        jLabel109.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel109.setText("+243");
        jPanel66.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 50, 30));

        nommd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel66.add(nommd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 150, 30));

        postmd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel66.add(postmd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 150, 30));

        jSeparator18.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator18.setForeground(new java.awt.Color(0, 0, 0));
        jPanel66.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 42, 440, 12));

        jSeparator19.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator19.setForeground(new java.awt.Color(0, 0, 0));
        jPanel66.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 440, 10));

        jLabel110.setFont(new java.awt.Font("Segoe UI Variable", 3, 18)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(204, 204, 0));
        jLabel110.setText("Infos-sur-Clients");
        jPanel66.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 170, 40));

        jLabel111.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel111.setText("Mot de Passe");
        jPanel66.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 120, 40));

        jSeparator20.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator20.setForeground(new java.awt.Color(0, 0, 0));
        jPanel66.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 440, 10));

        jLabel112.setFont(new java.awt.Font("Segoe UI Variable", 3, 18)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(204, 204, 0));
        jLabel112.setText("Adresse");
        jPanel66.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 80, 40));

        jLabel113.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel113.setText("Prenom");
        jPanel66.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 70, 30));

        mdpmd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel66.add(mdpmd, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 160, 30));

        jLabel114.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel114.setText("Postnom");
        jPanel66.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 80, 30));

        try {
            telmd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("### ### ###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telmd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel66.add(telmd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 110, 30));

        jLabel115.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel115.setText("Tel.");
        jPanel66.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 30, 30));

        jLabel116.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel116.setText("Commune");
        jPanel66.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 100, 30));

        commd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel66.add(commd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 150, 30));

        jLabel117.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel117.setText("Quartier");
        jPanel66.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 80, 30));

        quatmd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel66.add(quatmd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 150, 30));

        jLabel118.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel118.setText("Num");
        jPanel66.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 50, 30));

        nummd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel66.add(nummd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 90, 30));

        jLabel119.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel119.setText("Avenue");
        jPanel66.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 80, 30));

        avmd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel66.add(avmd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 150, 30));

        BIS.setBackground(new java.awt.Color(255, 255, 255));
        BIS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BIS.setText("BIS");
        jPanel66.add(BIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, -1, 30));

        jButton10.setBackground(new java.awt.Color(255, 255, 0));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setText("SUPPRIMER");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel66.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 140, 40));

        jButton11.setBackground(new java.awt.Color(255, 255, 0));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setText("MODIFIER");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel66.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 140, 40));

        premd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel66.add(premd, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 140, 30));

        jPanel60.add(jPanel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 470, 460));

        tabmodif.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tabmodif.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOM", "POSTNOM", "PRENOM", "SEXE", "TEL", "CODE", "COMMUNE", "QUARTIER", "AVENUE", "NUMERO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabmodif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabmodifMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabmodif);
        if (tabmodif.getColumnModel().getColumnCount() > 0) {
            tabmodif.getColumnModel().getColumn(0).setResizable(false);
            tabmodif.getColumnModel().getColumn(1).setResizable(false);
            tabmodif.getColumnModel().getColumn(2).setResizable(false);
            tabmodif.getColumnModel().getColumn(3).setResizable(false);
            tabmodif.getColumnModel().getColumn(4).setResizable(false);
            tabmodif.getColumnModel().getColumn(5).setResizable(false);
            tabmodif.getColumnModel().getColumn(6).setResizable(false);
            tabmodif.getColumnModel().getColumn(7).setResizable(false);
            tabmodif.getColumnModel().getColumn(8).setResizable(false);
            tabmodif.getColumnModel().getColumn(9).setResizable(false);
        }

        jPanel60.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 17, 760, 460));

        nommemoir.setForeground(new java.awt.Color(204, 204, 204));
        nommemoir.setText("jLabel50");
        jPanel60.add(nommemoir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, -1, -1));

        fakecode.setForeground(new java.awt.Color(204, 204, 204));
        fakecode.setText("jLabel50");
        jPanel60.add(fakecode, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, -1, -1));

        updateClient.addTab("tab1", jPanel60);

        autre.addTab("tab1", updateClient);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(153, 51, 0));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel70.setFont(new java.awt.Font("Glitch Inside", 1, 36)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(204, 204, 204));
        jLabel70.setText("NOMBRES");
        jPanel8.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 40, 250, -1));

        jLabel71.setFont(new java.awt.Font("Glitch Inside", 1, 24)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(204, 204, 204));
        jLabel71.setText("INFOS");
        jPanel8.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 510, 250, 90));

        jPanel9.setBackground(new java.awt.Color(153, 51, 0));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel72.setFont(new java.awt.Font("Glitch Inside", 1, 36)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(204, 204, 204));
        jLabel72.setText("NOMBRES");
        jPanel9.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 40, 250, -1));

        jLabel73.setFont(new java.awt.Font("Glitch Inside", 1, 24)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(204, 204, 204));
        jLabel73.setText("INFOS");
        jPanel9.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 260, 90));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel74.setFont(new java.awt.Font("Future Light", 1, 24)); // NOI18N
        jLabel74.setText("PAR NUMEROS_TEL");
        jPanel5.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 220, 40));

        jSeparator21.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator21.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 210, 10));

        jLabel75.setFont(new java.awt.Font("Future Light", 1, 24)); // NOI18N
        jLabel75.setText("FAIRE UNE SELECTION");
        jPanel5.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 230, -1));

        jLabel76.setFont(new java.awt.Font("Future Light", 1, 24)); // NOI18N
        jLabel76.setText("PAR COMMUNE");
        jPanel5.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 220, 40));

        jLabel78.setFont(new java.awt.Font("Future Light", 1, 24)); // NOI18N
        jLabel78.setText("PAR SEXE");
        jPanel5.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 220, 20));

        jPanel88.setBackground(new java.awt.Color(239, 186, 160));

        javax.swing.GroupLayout jPanel88Layout = new javax.swing.GroupLayout(jPanel88);
        jPanel88.setLayout(jPanel88Layout);
        jPanel88Layout.setHorizontalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanel88Layout.setVerticalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 290, 40));

        jPanel90.setBackground(new java.awt.Color(239, 186, 160));

        javax.swing.GroupLayout jPanel90Layout = new javax.swing.GroupLayout(jPanel90);
        jPanel90.setLayout(jPanel90Layout);
        jPanel90Layout.setHorizontalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanel90Layout.setVerticalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 290, -1));

        jPanel91.setBackground(new java.awt.Color(239, 186, 160));

        javax.swing.GroupLayout jPanel91Layout = new javax.swing.GroupLayout(jPanel91);
        jPanel91.setLayout(jPanel91Layout);
        jPanel91Layout.setHorizontalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanel91Layout.setVerticalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 290, -1));

        infoTl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        infoTl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----CHOISIR---", "81", "82", "99", "90", "85", "84" }));
        infoTl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoTlActionPerformed(evt);
            }
        });
        jPanel5.add(infoTl, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 180, 40));

        infocom.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        infocom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----CHOISIR---", "Ndjili", "Kasa-Vubu", "Lingwala", "Maluku", "Kinkole", "Gombe", "Ngaba", "Ngiri-Ngiri", "Limete", "Masina", "Kimbanseke", "Nsele", "Matete", "Lemba", "Kinshasa", "Barumbu", "Kintambo", "Bandal", "Bumbu", "Selembao", "Makala", "Mont Ngafula", "Ngaliema", "Kalamu" }));
        infocom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infocomActionPerformed(evt);
            }
        });
        jPanel5.add(infocom, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 180, 40));

        infoSx.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        infoSx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----CHOISIR---", "Homme", "Femme" }));
        infoSx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoSxActionPerformed(evt);
            }
        });
        jPanel5.add(infoSx, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 180, 40));

        jLabel79.setFont(new java.awt.Font("Future Light", 1, 24)); // NOI18N
        jLabel79.setText("INFOS-NOMBRES");
        jPanel5.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 220, -1));

        jSeparator22.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator22.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 210, 10));

        jPanel92.setBackground(new java.awt.Color(239, 186, 160));

        jLabel80.setFont(new java.awt.Font("Future Light", 1, 24)); // NOI18N
        jLabel80.setText("TOTAL-Dans-ma-caisse");

        javax.swing.GroupLayout jPanel92Layout = new javax.swing.GroupLayout(jPanel92);
        jPanel92.setLayout(jPanel92Layout);
        jPanel92Layout.setHorizontalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel92Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel80)
                .addContainerGap())
        );
        jPanel92Layout.setVerticalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel92Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.add(jPanel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 290, 40));

        jPanel93.setBackground(new java.awt.Color(239, 186, 160));

        jLabel81.setFont(new java.awt.Font("Future Light", 1, 24)); // NOI18N
        jLabel81.setText("TOTAL-homme-femme");

        javax.swing.GroupLayout jPanel93Layout = new javax.swing.GroupLayout(jPanel93);
        jPanel93.setLayout(jPanel93Layout);
        jPanel93Layout.setHorizontalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel93Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel93Layout.setVerticalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel93Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.add(jPanel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 290, -1));

        ndhomme.setEditable(false);
        ndhomme.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ndhomme.setText("0");
        jPanel5.add(ndhomme, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 110, 40));

        nbclients.setEditable(false);
        nbclients.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nbclients.setText("0");
        jPanel5.add(nbclients, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 160, 40));

        jLabel82.setFont(new java.awt.Font("Future Light", 1, 24)); // NOI18N
        jLabel82.setText("H");
        jPanel5.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 30, 40));

        ndfemme.setEditable(false);
        ndfemme.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ndfemme.setText("0");
        jPanel5.add(ndfemme, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 110, 40));

        jLabel83.setFont(new java.awt.Font("Future Light", 1, 24)); // NOI18N
        jLabel83.setText("F");
        jPanel5.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 30, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 680, 440));

        tabinfo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tabinfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOM", "POSTNOM", "SEXE", "TEL", "COMMUNE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabinfo);
        if (tabinfo.getColumnModel().getColumnCount() > 0) {
            tabinfo.getColumnModel().getColumn(0).setResizable(false);
            tabinfo.getColumnModel().getColumn(1).setResizable(false);
            tabinfo.getColumnModel().getColumn(2).setResizable(false);
            tabinfo.getColumnModel().getColumn(3).setResizable(false);
            tabinfo.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 30, 550, 440));

        infos.addTab("tab1", jPanel1);

        autre.addTab("tab5", infos);

        principal.addTab("tab1", autre);

        jPanel95.setBackground(new java.awt.Color(204, 204, 204));
        jPanel95.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel97.setBackground(new java.awt.Color(255, 255, 255));
        jPanel97.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel96.setBackground(new java.awt.Color(0, 0, 0));

        jLabel120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/g22252.png"))); // NOI18N

        javax.swing.GroupLayout jPanel96Layout = new javax.swing.GroupLayout(jPanel96);
        jPanel96.setLayout(jPanel96Layout);
        jPanel96Layout.setHorizontalGroup(
            jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel96Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel120)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel96Layout.setVerticalGroup(
            jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel96Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel97.add(jPanel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 210));

        jSeparator23.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator23.setForeground(new java.awt.Color(0, 0, 0));
        jPanel97.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 240, -1));

        jPanel100.setBackground(new java.awt.Color(255, 255, 255));
        jPanel100.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel100.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel85.setFont(new java.awt.Font("Future Light", 1, 24)); // NOI18N
        jLabel85.setText("MA CAISSE REMIX v2.0");
        jPanel100.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel121.setFont(new java.awt.Font("Future Light", 1, 24)); // NOI18N
        jLabel121.setText("(Version BETA)");
        jPanel100.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabel122.setFont(new java.awt.Font("Future Light", 1, 24)); // NOI18N
        jLabel122.setText("12.90.1.23.45");
        jPanel100.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, -1, -1));

        jSeparator25.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator25.setForeground(new java.awt.Color(0, 0, 0));
        jPanel100.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 240, 10));

        jLabel125.setFont(new java.awt.Font("Future Light", 1, 24)); // NOI18N
        jLabel125.setText("Produit sous license de g5 progs");
        jPanel100.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jPanel97.add(jPanel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 910, 100));

        jPanel99.setBackground(new java.awt.Color(255, 255, 255));
        jPanel99.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel99.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel123.setFont(new java.awt.Font("Future Light", 1, 24)); // NOI18N
        jLabel123.setText("12.90.1.23.45");
        jPanel99.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, -1, -1));

        jLabel84.setFont(new java.awt.Font("Future Light", 1, 24)); // NOI18N
        jLabel84.setText("G5 progs");
        jPanel99.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jSeparator26.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator26.setForeground(new java.awt.Color(0, 0, 0));
        jPanel99.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 130, 10));

        jLabel127.setFont(new java.awt.Font("Future Light", 1, 24)); // NOI18N
        jLabel127.setText("developpeurs libre des applications");
        jPanel99.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        jPanel97.add(jPanel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 910, 100));

        jLabel124.setFont(new java.awt.Font("Future Light", 1, 24)); // NOI18N
        jLabel124.setText("gestion de la caisse en toute securite");
        jPanel97.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jSeparator24.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator24.setForeground(new java.awt.Color(0, 0, 0));
        jPanel97.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 440, 10));

        jLabel126.setFont(new java.awt.Font("Future Light", 1, 24)); // NOI18N
        jLabel126.setText("version 2.0, l'amelioration est au rendez-vous. merci de nous faire confiance......................");
        jPanel97.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        jLabel128.setFont(new java.awt.Font("Future Light", 1, 24)); // NOI18N
        jLabel128.setText("Application (ma caisse remix v2.o) mis en place pour garentir la securite et la");
        jPanel97.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        jLabel129.setFont(new java.awt.Font("Future Light", 1, 24)); // NOI18N
        jLabel129.setText("rapidite dans la gestion de la caisse. cette derniere met l'accent sur la securite, en sa");
        jPanel97.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        jPanel95.add(jPanel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 1180, 450));

        apropos.addTab("tab1", jPanel95);

        supplement.addTab("tab1", apropos);

        jPanel98.setBackground(new java.awt.Color(204, 204, 204));
        jPanel98.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel102.setBackground(new java.awt.Color(0, 0, 51));
        jPanel102.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setFont(new java.awt.Font("Glitch Inside", 1, 36)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("PASSE");
        jPanel102.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel137.setFont(new java.awt.Font("Glitch Inside", 1, 24)); // NOI18N
        jLabel137.setForeground(new java.awt.Color(255, 255, 255));
        jLabel137.setText("MOT DE ");
        jPanel102.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jPanel98.add(jPanel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 519, 260, 90));

        jPanel103.setBackground(new java.awt.Color(0, 0, 51));
        jPanel103.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel138.setFont(new java.awt.Font("Glitch Inside", 1, 36)); // NOI18N
        jLabel138.setForeground(new java.awt.Color(255, 255, 255));
        jLabel138.setText("PASSE");
        jPanel103.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel139.setFont(new java.awt.Font("Glitch Inside", 1, 24)); // NOI18N
        jLabel139.setForeground(new java.awt.Color(255, 255, 255));
        jLabel139.setText("MOT DE");
        jPanel103.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jPanel98.add(jPanel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 519, 250, 90));

        jPanel104.setBackground(new java.awt.Color(255, 255, 255));
        jPanel104.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel105.setBackground(new java.awt.Color(0, 0, 51));
        jPanel105.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel146.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel146.setForeground(new java.awt.Color(255, 255, 255));
        jLabel146.setText("VERIFICATION");
        jPanel105.add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 40));

        jPanel104.add(jPanel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 340, 50));

        jPanel106.setBackground(new java.awt.Color(106, 106, 163));
        jPanel106.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        postau.setEditable(false);
        postau.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel106.add(postau, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 46, 170, 36));

        preau.setEditable(false);
        preau.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel106.add(preau, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 93, 170, 38));

        jLabel141.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel141.setText("Prenom");
        jPanel106.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 90, -1));

        jSeparator28.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator28.setForeground(new java.awt.Color(0, 0, 0));
        jPanel106.add(jSeparator28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 240, 10));

        jLabel142.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel142.setText("Complement");
        jPanel106.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 100, -1));

        jLabel143.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel143.setText("Postnom");
        jPanel106.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, -1));

        jPanel104.add(jPanel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 340, 140));

        nomau.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nomau.setBorder(null);
        jPanel104.add(nomau, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 190, 40));

        jButton17.setBackground(new java.awt.Color(0, 0, 51));
        jButton17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Verifier");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel104.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 90, 30));

        jLabel144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_phone_48px.png"))); // NOI18N
        jPanel104.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, 80));

        jLabel145.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_user_48px.png"))); // NOI18N
        jPanel104.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, 40));

        jSeparator29.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator29.setForeground(new java.awt.Color(0, 0, 0));
        jPanel104.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 122, 240, 10));

        jSeparator30.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator30.setForeground(new java.awt.Color(0, 0, 0));
        jPanel104.add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 240, 10));

        telau.setBorder(null);
        try {
            telau.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("### ### ###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telau.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel104.add(telau, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 180, 40));

        jPanel98.add(jPanel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 360, 420));

        jPanel107.setBackground(new java.awt.Color(255, 255, 255));

        jLabel140.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel140.setText("2eme Etape");

        javax.swing.GroupLayout jPanel107Layout = new javax.swing.GroupLayout(jPanel107);
        jPanel107.setLayout(jPanel107Layout);
        jPanel107Layout.setHorizontalGroup(
            jPanel107Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel107Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(429, Short.MAX_VALUE))
        );
        jPanel107Layout.setVerticalGroup(
            jPanel107Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel140, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel98.add(jPanel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 660, 40));

        jPanel108.setBackground(new java.awt.Color(255, 255, 255));

        jLabel147.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel147.setText("1ere Etape");

        javax.swing.GroupLayout jPanel108Layout = new javax.swing.GroupLayout(jPanel108);
        jPanel108.setLayout(jPanel108Layout);
        jPanel108Layout.setHorizontalGroup(
            jPanel108Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel108Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel147)
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel108Layout.setVerticalGroup(
            jPanel108Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel108Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel147, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel98.add(jPanel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 40));

        jPanel109.setBackground(new java.awt.Color(255, 255, 255));
        jPanel109.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel112.setBackground(new java.awt.Color(0, 0, 51));
        jPanel112.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel148.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel148.setForeground(new java.awt.Color(255, 255, 255));
        jLabel148.setText("RENITIALISER");
        jPanel112.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 40));

        jPanel109.add(jPanel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 50));

        code1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel109.add(code1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 270, 48));

        jLabel149.setFont(new java.awt.Font("Future Light", 1, 28)); // NOI18N
        jLabel149.setText("NOUVEAU");
        jPanel109.add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jPanel98.add(jPanel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 630, 130));

        jPanel110.setBackground(new java.awt.Color(255, 255, 255));
        jPanel110.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codeconf.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel110.add(codeconf, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 270, 48));

        jButton18.setBackground(new java.awt.Color(0, 0, 51));
        jButton18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("EFFECTUER");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel110.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 120, 50));

        jLabel163.setFont(new java.awt.Font("Future Light", 1, 28)); // NOI18N
        jLabel163.setText("CONFIRMER");
        jPanel110.add(jLabel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 30, 130, -1));

        jPanel98.add(jPanel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 630, 140));

        jPanel111.setBackground(new java.awt.Color(255, 255, 255));

        jLabel151.setFont(new java.awt.Font("Future Light", 1, 28)); // NOI18N
        jLabel151.setText("Changer le mot de passe est une grande ");

        jLabel164.setFont(new java.awt.Font("Future Light", 1, 28)); // NOI18N
        jLabel164.setText("Operation, alors bien retenir le mot de passe");

        javax.swing.GroupLayout jPanel111Layout = new javax.swing.GroupLayout(jPanel111);
        jPanel111.setLayout(jPanel111Layout);
        jPanel111Layout.setHorizontalGroup(
            jPanel111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel111Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel111Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel164))
                    .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel111Layout.setVerticalGroup(
            jPanel111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel111Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel151)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel164)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel98.add(jPanel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, -1, -1));

        mdpClient.addTab("tab1", jPanel98);

        supplement.addTab("tab2", mdpClient);

        principal.addTab("tab5", supplement);

        jPanel2.add(principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(-15, -5, 1330, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1292, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // QUITTER LE PROGRAMME
        int option = JOptionPane.showConfirmDialog(null, "Fermer le programme?"
                + "", "FERMETURE", JOptionPane.INFORMATION_MESSAGE);
        if (option == JOptionPane.OK_OPTION) {
            this.dispose();
            System.exit(0);
        } else {

        }


    }//GEN-LAST:event_jLabel9MouseClicked

    private void valMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valMouseEntered
        // SURVOL DU BT VALIDER IN
        val.setBackground(Color.red);
        val.setForeground(Color.white);
    }//GEN-LAST:event_valMouseEntered

    private void valMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valMouseExited
        // SURVOL DU BT VALIDER OUT
        val.setBackground(Color.blue);
        valt.setForeground(Color.white);
    }//GEN-LAST:event_valMouseExited

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // 
        String path = "pages\\index.html";
        File file = new File(path);
        try {
            if (file.exists()) {
                Process pro = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + path);
                pro.wait();
            } else {
                JOptionPane.showMessageDialog(null, "pas de file");
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void valMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valMouseClicked
        //CLICK SUR LE BT VALIDER NIVEAU USER
        principal.setSelectedIndex(1);
        /*try {
            String NmU = nomuser.getText();
            String MdU = mdpuser.getText();
            if (NmU.isEmpty() || MdU.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Remplir le vide");
            } 
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Attention a la saisie " + e.getMessage());
        }*/
        //OK


    }//GEN-LAST:event_valMouseClicked

    private void aide1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aide1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_aide1MouseClicked

    private void aide1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aide1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_aide1MouseEntered

    private void aide1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aide1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_aide1MouseExited

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        // VOIR LE MOT DE PASSE AU NIVEAU DE USER
        if (c.isSelected()) {
            mdpuser.setEchoChar((char) 0);
        } else {
            //PRESCENCE D'UN CARACTERE ASCII
            mdpuser.setEchoChar('*');
        }
    }//GEN-LAST:event_cActionPerformed

    private void mdpuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdpuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mdpuserActionPerformed

    private void jLabel65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel65MouseClicked
        // 
        String path = "pages\\index.html";
        File file = new File(path);
        try {
            if (file.exists()) {
                Process pro = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + path);
                pro.wait();
            } else {
                JOptionPane.showMessageDialog(null, "pas de file");
            }
        } catch (HeadlessException | IOException | InterruptedException e) {

        }
    }//GEN-LAST:event_jLabel65MouseClicked

    private void boutonclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonclientActionPerformed
        // CLICK SUR CLIENT INDICATEUR ROUGE -AUTRE VIDE(BLANC)
        principal.setSelectedIndex(1);
        lop.setBackground(null);
        lbi.setBackground(null);
        lau.setBackground(null);
        lcl.setBackground(Color.red);

    }//GEN-LAST:event_boutonclientActionPerformed

    private void boutonoperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonoperationActionPerformed
        // CLICK SUR OPERATION INDICATEUR ROUGE -AUTRE VIDE(BLANC)
        principal.setSelectedIndex(2);
        lcl.setBackground(null);
        lbi.setBackground(null);
        lau.setBackground(null);
        lop.setBackground(Color.red);


    }//GEN-LAST:event_boutonoperationActionPerformed

    private void boutonbilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonbilanActionPerformed
        // CLICK SUR BILAN INDICATEUR ROUGE -AUTRE VIDE(BLANC)
        principal.setSelectedIndex(3);
        lcl.setBackground(null);
        lop.setBackground(null);
        lau.setBackground(null);
        lbi.setBackground(Color.red);
    }//GEN-LAST:event_boutonbilanActionPerformed

    private void boutonclientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonclientMouseEntered
        // SURVOL DU BT +CLIENTS-IN..
        boutonclient.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_boutonclientMouseEntered

    private void boutonclientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonclientMouseExited
        // SURVOL DU BT +CLIENTS-OUT..
        boutonclient.setBackground(Color.white);

    }//GEN-LAST:event_boutonclientMouseExited

    private void boutonoperationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonoperationMouseEntered
        // SURVOL DU BT +OPERATION-IN..
        boutonoperation.setBackground(new Color(0, 255, 102));

    }//GEN-LAST:event_boutonoperationMouseEntered

    private void boutonoperationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonoperationMouseExited
        // SURVOL DU BT +OPERATION-OUT..
        boutonoperation.setBackground(Color.white);
    }//GEN-LAST:event_boutonoperationMouseExited

    private void boutonbilanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonbilanMouseEntered
        // SURVOL DU BT +BILAN-IN..
        boutonbilan.setBackground(new Color(204, 0, 255));
        boutonbilan.setForeground(Color.white);
    }//GEN-LAST:event_boutonbilanMouseEntered

    private void boutonbilanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonbilanMouseExited
        // SURVOL DU BT +BILAN-OUT..
        boutonbilan.setBackground(Color.white);
        boutonbilan.setForeground(Color.black);
    }//GEN-LAST:event_boutonbilanMouseExited

    private void blksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blksActionPerformed
        //CHANGER LA COULEUR DU FOND NOIRE
        if (blks.isSelected()) {
            barrlat.setBackground(Color.white);
            PANEAUDECONTROL.setBackground(Color.black);
            title.setForeground(Color.black);
        }
    }//GEN-LAST:event_blksActionPerformed

    private void blesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blesActionPerformed
        //CHANGER LA COULEUR DU FOND BLEUE
        if (bles.isSelected()) {
            barrlat.setBackground(Color.blue);
            PANEAUDECONTROL.setBackground(Color.white);
            title.setForeground(Color.white);
        }
    }//GEN-LAST:event_blesActionPerformed

    private void orgsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgsActionPerformed
        //CHANGER LA COULEUR DU FOND ORANGE
        if (orgs.isSelected()) {
            barrlat.setBackground(Color.black);
            PANEAUDECONTROL.setBackground(Color.orange);
            title.setForeground(Color.orange);
        }
    }//GEN-LAST:event_orgsActionPerformed

    private void vrtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vrtsActionPerformed
        //CHANGER LA COULEUR DU FOND VERT
        if (vrts.isSelected()) {
            barrlat.setBackground(Color.green);
            PANEAUDECONTROL.setBackground(Color.green);
            title.setForeground(Color.white);
        }
    }//GEN-LAST:event_vrtsActionPerformed

    private void whtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whtsActionPerformed
        //CHANGER LA COULEUR DU FOND BLANC
        if (whts.isSelected()) {
            barrlat.setBackground(Color.white);
            PANEAUDECONTROL.setBackground(Color.black);
            title.setForeground(Color.blue);
        }
    }//GEN-LAST:event_whtsActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //bouton AUTRE
        principal.setSelectedComponent(autre);
        autre.setSelectedIndex(1);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void boutonautreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonautreActionPerformed
        // CLICK SUR AUTRE INDICATEUR ROUGE -AUTRE VIDE(BLANC)
        principal.setSelectedComponent(autre);
        autre.setSelectedIndex(0);
        lcl.setBackground(null);
        lop.setBackground(null);
        lbi.setBackground(null);
        lau.setBackground(Color.red);

        pourcactuel.setText(pourc.getText());
        fraisdispofc.setText(fraisf.getText());
        fraisdispodl.setText(fraisd.getText());
        caissefc.setText(entrefranc.getText());
        caissedl.setText(entredollar.getText());
    }//GEN-LAST:event_boutonautreActionPerformed

    private void jPanel51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel51MouseClicked

    }//GEN-LAST:event_jPanel51MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //BOUTON A PROPOS 
        principal.setSelectedComponent(supplement);
        supplement.setSelectedIndex(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // 
        String path = "pages\\index.html";
        File file = new File(path);
        try {
            if (file.exists()) {
                Process pro = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + path);
                pro.wait();
            } else {
                JOptionPane.showMessageDialog(null, "pas de file");
            }
        } catch (HeadlessException | IOException | InterruptedException e) {

        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // MODIFIER LE MOT DE PASSE
        principal.setSelectedComponent(supplement);
        supplement.setSelectedIndex(1);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void boutonautreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonautreMouseEntered
        // SURVOL DU BT +AUTRE-IN..
        boutonautre.setBackground(new Color(0, 51, 51));
        boutonautre.setForeground(Color.white);

    }//GEN-LAST:event_boutonautreMouseEntered

    private void boutonautreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonautreMouseExited
        // SURVOL DU BT +AUTRE-OUT..
        boutonautre.setBackground(Color.white);
        boutonautre.setForeground(Color.black);
    }//GEN-LAST:event_boutonautreMouseExited

    private void boutonmodifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonmodifierActionPerformed
        //BOUTON DE MODIFICATION AU NIVEAU DE AJOUT CLIENTS
        principal.setSelectedComponent(autre);
        autre.setSelectedIndex(2);


    }//GEN-LAST:event_boutonmodifierActionPerformed

    private void boutonajoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonajoutMouseEntered
        // SURVOL DU BT +AJOUT-IN..
        boutonajout.setBackground(Color.white);
        boutonajout.setForeground(Color.blue);
    }//GEN-LAST:event_boutonajoutMouseEntered

    private void boutonajoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonajoutMouseExited
        // SURVOL DU BT +AJOUT-OUT..
        boutonajout.setBackground(new Color(0, 204, 204));
        boutonajout.setForeground(Color.black);
    }//GEN-LAST:event_boutonajoutMouseExited

    private void blkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blkActionPerformed
        //CHANGER LA COULEUR DU FOND NOIRE
        if (blk.isSelected()) {
            barrlat.setBackground(Color.black);
            PANEAUDECONTROL.setBackground(Color.black);
            title.setForeground(Color.white);
        }
    }//GEN-LAST:event_blkActionPerformed

    private void whtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whtActionPerformed
        //CHANGER LA COULEUR DU FOND BLANC
        if (wht.isSelected()) {
            barrlat.setBackground(Color.white);
            PANEAUDECONTROL.setBackground(Color.white);
            title.setForeground(Color.black);
        }
    }//GEN-LAST:event_whtActionPerformed

    private void bleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bleActionPerformed
        //CHANGER LA COULEUR DU FOND BLEUE
        if (ble.isSelected()) {
            barrlat.setBackground(Color.blue);
            PANEAUDECONTROL.setBackground(Color.blue);
            title.setForeground(Color.white);
        }
    }//GEN-LAST:event_bleActionPerformed

    private void orgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgActionPerformed
        //CHANGER LA COULEUR DU FOND ORANGE
        if (org.isSelected()) {
            barrlat.setBackground(Color.orange);
            PANEAUDECONTROL.setBackground(Color.orange);
            dz.setForeground(Color.black);
        }
    }//GEN-LAST:event_orgActionPerformed

    private void vrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vrtActionPerformed
        //CHANGER LA COULEUR DU FOND VERT
        if (vrt.isSelected()) {
            barrlat.setBackground(Color.green);
            PANEAUDECONTROL.setBackground(Color.green);
            title.setForeground(Color.black);
        }
    }//GEN-LAST:event_vrtActionPerformed

    private void boutoninfosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutoninfosActionPerformed
        // BOUTTON INFO POUR OUVRIR LE MENU DES INFORMATIONS
        principal.setSelectedComponent(autre);
        autre.setSelectedIndex(3);

    }//GEN-LAST:event_boutoninfosActionPerformed

    private void boutoninfosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutoninfosMouseEntered
        // SURVOL DU BT +INFOS-IN..
        boutoninfos.setBackground(Color.white);
        boutoninfos.setForeground(new Color(153, 51, 0));


    }//GEN-LAST:event_boutoninfosMouseEntered

    private void boutonajoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonajoutActionPerformed
        // BOUTON AJOUTER CLIENTS
        try {
            String NOM = nomc.getText();
            String PRENOM = prec.getText();
            String POST = postc.getText();
            String CODE = mdpc.getText();
            String TEL = telc.getText().stripLeading();
            String SEXE = sexec.getSelectedItem().toString();
            String COM = comc.getSelectedItem().toString();
            String QUAT = quatc.getText();
            String AV = avc.getText();
            int NUMP = Integer.parseInt(numc.getText());
            String BIS = "";
            if (bisc.isSelected()) {
                BIS = bisc.getText();
            } else if (!bisc.isSelected()) {
                BIS = "";
            }

            //si il y a la prescence d'une apostrophe
            if (NOM.contains("'") || NOM.contains(" \" ") || PRENOM.contains("'") || PRENOM.contains("\" ")
                    || POST.contains("'") || POST.contains(" \" ") || QUAT.contains("'") || QUAT.contains("\"")
                    || CODE.contains("'") || CODE.contains("\"") || AV.contains("'") || AV.contains("\"")) {
                JOptionPane.showMessageDialog(null, "Oups\n Une zone de saisie contient un caratere non permis( ', \" )");
            } else if (!TEL.startsWith("81") && !TEL.startsWith("82") && !TEL.startsWith("90") && !TEL.startsWith("99")
                    && !TEL.startsWith("85") && !TEL.startsWith("84")) {
                JOptionPane.showMessageDialog(null, "NUMERO DE TELEPHONE INVALIDE");
            } //Sinomn on enregistre
            else {
                String MOTIF = "ENREGISTRER";
                double SOLDE = 0;
                double TOTAL = 0;
                Date d = new Date();
                d.getDay();
                String DAT = "" + d;
                exelll();
                int j = 0;
                for (j =0; j < 10; j++) {
                    Cell cell = row.createCell(j);
                    if (cell.getColumnIndex() == 0) {
                        cell.setCellValue(NOM);
                    } else if (cell.getColumnIndex() == 1) {
                        cell.setCellValue(POST);
                    } else if (cell.getColumnIndex() == 2) {
                        cell.setCellValue(PRENOM);
                    } else if (cell.getColumnIndex() == 3) {
                        cell.setCellValue(SEXE);
                    } else if (cell.getColumnIndex() == 4) {
                        cell.setCellValue(TEL);
                    } else if (cell.getColumnIndex() == 5) {
                        cell.setCellValue(CODE);
                    } else if (cell.getColumnIndex() == 6) {
                        cell.setCellValue(COM);
                    } else if (cell.getColumnIndex() == 7) {
                        cell.setCellValue(QUAT);
                    } else if (cell.getColumnIndex() == 8) {
                        cell.setCellValue(AV);
                    } else if (cell.getColumnIndex() == 9) {
                        cell.setCellValue(NUMP + "" + BIS);
                    }
                }
                try {
                    File c = new File("voila.xlsx");
                    FileOutputStream out = new FileOutputStream(new File("voila.xlsx"));
                    if (!c.exists()) {
                        out = new FileOutputStream(new File("voila.xlsx"));
                        workbook.write(out);
                        out.close();
                    } else {
                        workbook.write(out);
                    }
                    out.close();
                    JOptionPane.showMessageDialog(null, "ENREGISTRER");
                } catch (IOException ex) {
                    Logger.getLogger(MENU_EXCEL.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Attetion a la saisie!!!!!");
        }
    }//GEN-LAST:event_boutonajoutActionPerformed

    private void boutoninfosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutoninfosMouseExited
        // SURVOL DU BT +INFOS-OUT..
        boutoninfos.setBackground(new Color(0, 204, 204));
        boutoninfos.setForeground(Color.black);
    }//GEN-LAST:event_boutoninfosMouseExited

    private void boutonmodifierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonmodifierMouseEntered
        // SURVOL DU BT +MODIFIER-IN..
        boutonmodifier.setBackground(Color.white);
        boutonmodifier.setForeground(new Color(255, 255, 0));

    }//GEN-LAST:event_boutonmodifierMouseEntered

    private void boutonmodifierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonmodifierMouseExited
        // SURVOL DU BT +MODIFIER-OUT..
        boutonmodifier.setBackground(new Color(0, 204, 204));
        boutonmodifier.setForeground(Color.black);
    }//GEN-LAST:event_boutonmodifierMouseExited

    private void ichelp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ichelp1MouseClicked
        //SE DECONNECTER
        principal.setSelectedIndex(0);
        nomuser.setText("");
        mdpuser.setText("");
        lcl.setBackground(null);
        lop.setBackground(null);
        lbi.setBackground(null);
        lau.setBackground(null);
        boutonclient.setEnabled(false);
        boutonoperation.setEnabled(false);
        boutonbilan.setEnabled(false);
        boutonautre.setEnabled(false);
    }//GEN-LAST:event_ichelp1MouseClicked

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // AJOUT D'UN GERANT(E)
        try {
            String NR = nomroot.getText();
            String MR = mdproot.getText();
            double FR = Double.parseDouble(fraisroot.getText());
            double FRCal = FR / 100;
            String ConvFR = "" + FRCal;
            if (FR > 5) {
                JOptionPane.showMessageDialog(null, "Attention a la gestion\nPAS PLUS DE 5% DU RERTRAIT");

            } else if (NR.contains("'") || NR.contains("\"") || MR.contains("'") || MR.contains("\"")) {
                JOptionPane.showMessageDialog(null, "Attention a certains carateres(' , \")");
            } else if (NR.isEmpty() || MR.isEmpty() || fraisroot.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Attention, Zone de saisie vide!!");
            } else {

                conf.setVisible(false);
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Attention aux zones de saisies");
        }
        //OK
    }//GEN-LAST:event_jButton12ActionPerformed

    private void sexecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexecActionPerformed

    private void tabmodifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabmodifMouseClicked
        // INTERFACE MODIFIER (PRENDRE LES INFOS DE LA JTABLE )
        int ligne = tabmodif.getSelectedRow();
        String nom = tabmodif.getModel().getValueAt(ligne, 0).toString();
        String post = tabmodif.getModel().getValueAt(ligne, 1).toString();
        String pre = tabmodif.getModel().getValueAt(ligne, 2).toString();
        String sex = tabmodif.getModel().getValueAt(ligne, 3).toString();
        String tel = tabmodif.getModel().getValueAt(ligne, 4).toString();
        String code = tabmodif.getModel().getValueAt(ligne, 5).toString();
        String com = tabmodif.getModel().getValueAt(ligne, 6).toString();
        String qua = tabmodif.getModel().getValueAt(ligne, 7).toString();
        String av = tabmodif.getModel().getValueAt(ligne, 8).toString();
        String num = tabmodif.getModel().getValueAt(ligne, 9).toString();
        nommd.setText(nom);
        nommemoir.setText(nom);
        postmd.setText(post);
        premd.setText(pre);
        sexemd.setText(sex);
        telmd.setText(tel);
        mdpmd.setText(code);
        commd.setText(com);
        quatmd.setText(qua);
        avmd.setText(av);
        nummd.setText(num);


    }//GEN-LAST:event_tabmodifMouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // MODIFIER LES INFORMATIONS SUR LES CLIENTS
        try {
            String N = nommd.getText();
            String Ps = postmd.getText();
            String Pr = premd.getText();
            String Sx = sexemd.getText();
            String Tl = telmd.getText();
            String Cd = mdpmd.getText();
            String Cm = commd.getText();
            String Qu = quatmd.getText();
            String Av = avmd.getText();
            int Nm = Integer.parseInt(nummd.getText());
            String Bis = "";
            if (BIS.isSelected()) {
                Bis = BIS.getText();
            } else {
                Bis = "";
            }
            if (N.contains("'") || N.contains(" \" ") || Pr.contains("'") || Pr.contains("\" ")
                    || Ps.contains("'") || Ps.contains(" \" ") || Qu.contains("'") || Qu.contains("\"")
                    || Cd.contains("'") || Cd.contains("\"") || Av.contains("'") || Av.contains("\"")
                    || Sx.contains("'") || Sx.contains("\"") || Cm.contains("'") || Cm.contains("\"")) {
                JOptionPane.showMessageDialog(null, "Pas des caracteres invalides ( ',\" )");
            } else {

            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Attention aux entrees");
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // POUR EFFACER UN CLIENT DEFINITIVEMENT
        try {
            int option = JOptionPane.showConfirmDialog(null, "Supprimer definitivement le client " + nommd.getText() + " ?"
                    + "", "SUPPRESSION", JOptionPane.INFORMATION_MESSAGE);
            if (option == JOptionPane.OK_OPTION) {

            } else {
                JOptionPane.showMessageDialog(null, "Ouff, Pas de suppression !!!");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Pas de suppression pour l'instant");
        }

    }//GEN-LAST:event_jButton10ActionPerformed

    private void infocomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infocomActionPerformed
        // ACTUALISATION PAR COMMUNE(APRES SELECTION)
        try {
            String Com = infocom.getSelectedItem().toString();

        } catch (Exception e) {

        }
    }//GEN-LAST:event_infocomActionPerformed

    private void infoSxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoSxActionPerformed
        // ACTUALISATION PAR SEXE(APRES SELECTION)
        try {
            String Sx = infoSx.getSelectedItem().toString();

        } catch (Exception e) {

        }
    }//GEN-LAST:event_infoSxActionPerformed

    private void infoTlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoTlActionPerformed
        // ACTUALISATION PAR TELEPHONE(APRES SELECTION)
        try {
            String Tl = infoTl.getSelectedItem().toString();

        } catch (Exception e) {

        }
    }//GEN-LAST:event_infoTlActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //VERIFIER LES INFORMATIONS DU CLIENTS (OPERATIONS)
        try {

            double initial = 0;
            if (entrefranc.getText().isBlank() || entredollar.getText().isBlank() || fraisf.getText().isBlank() || fraisd.getText().isBlank()) {

            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // VALIDER LES OPERATIONS
        try {
            double verf = Double.parseDouble(inserer.getText());
            if (nomop.getText().isEmpty() && codeop.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "AUTHENTIFICATOIN OBLIGATOIRE\n\nInserer les infos du client");
            } else if (!DEPOT.isSelected() && !RETRAIT.isSelected()) {
                JOptionPane.showMessageDialog(null, "Faire un ????\n(DEPOT ou RETRAIT)");
            } else if (!FC.isSelected() && !DL.isSelected()) {
                JOptionPane.showMessageDialog(null, "La devise SVP !!!!\n(FRANC ou DOLLAR)");
            } else if (inserer.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Inserer le montant");
            } else if (verf <= 0) {
                JOptionPane.showMessageDialog(null, "MONTANT INVALIDE");
            } else {

                inserer.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ATTENTION !!!!!");

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //AFFICHER LE BILAN DU CLIENT
        try {
            if (nombl.getText().isEmpty() || codebl.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Saisir les infos du client");

            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // EN FINIR AVEC UN CLIENT
        try {
            nomop.setText("");
            codeop.setText("");
            preop.setText("");
            postop.setText("");
            franc.setText("");
            dollar.setText("");
            if (DEPOT.isSelected() || RETRAIT.isSelected() || DL.isSelected() || FC.isSelected()) {
                DEPOT.setSelected(false);
                RETRAIT.setSelected(false);
                DL.setSelected(false);
                FC.setSelected(false);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Pas de fin");
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        //RETIRER LE FRAIS AQUE L'ON AS RECU
        try {
            double Rfrais = Double.parseDouble(rfrais.getText());
            if (Rfrais <= 0) {
                JOptionPane.showMessageDialog(null, "ATTENTION AU MONTANT SAISIE");
            } else {
                if (frfc.isSelected()) {
                    double FrF = Double.parseDouble(fraisdispofc.getText());
                    double restefc = FrF - Rfrais;

                    rfrais.setText("");
                    fraisdispofc.setText(fraisf.getText());
                } else if (frdl.isSelected()) {
                    double FrD = Double.parseDouble(fraisdispodl.getText());
                    double restedl = FrD - Rfrais;

                    rfrais.setText("");
                    fraisdispodl.setText(fraisd.getText());
                } else {
                    JOptionPane.showMessageDialog(null, "Faire un choix");
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Attention a la saisie");
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // MODIFIER LE TAUX DU FRAIS
        try {
            double modif = Double.parseDouble(modiff.getText());
            if (modif > 5) {
                JOptionPane.showMessageDialog(null, "ATTENTION A LA GESTION\n\nPAS PLUS DE 5% DE FRAIS ");
            } else {
                modif = modif / 100;

                pourcactuel.setText(pourc.getText());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "pas de moficaition");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // METTRE FIN A UNE SESSION DU CLIENT
        try {
            nombl.setText("");
            codebl.setText("");
            prebl.setText("");
            postbl.setText("");
            francbl.setText("");
            dlbl.setText("");
            DefaultTableModel dm = (DefaultTableModel) tabbl.getModel();
            for (int i = 0; i <= dm.getRowCount(); i++) {
                for (int j = 0; j <= dm.getColumnCount(); j++) {
                    dm.removeRow(i);
                    dm.setValueAt("", i, j);
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // PAS D'ENREGISTREMENT DU USER PRINCIPAL
        conf.setVisible(false);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jPanel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseClicked
        // 
        String path = "pages\\index.html";
        File file = new File(path);
        try {
            if (file.exists()) {
                Process pro = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + path);
                pro.wait();
            } else {
                JOptionPane.showMessageDialog(null, "pas de file");
            }
        } catch (HeadlessException | IOException | InterruptedException e) {

        }
    }//GEN-LAST:event_jPanel14MouseClicked

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // VERIFIER SI LE CLIENT EXISTE
        try {
            if (nomau.getText().isEmpty() || telau.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Inserer les informations");
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Attention");
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // MODIFICATION DU MOT DE PASSE CLIENT
        try {
            String a = code1.getText();
            String b = codeconf.getText();
            if (nomau.getText().isEmpty() || telau.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Remplire la premiere etape svp\nNom et Numero de telephone");
            } else if (!a.equals(b)) {
                JOptionPane.showMessageDialog(null, "Le mot de passe na match pas");
            } else if (a.isEmpty() || b.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Saisir le mot de passe");
            } else {

                nomau.setText("");
                telau.setText("");
                preau.setText("");
                postau.setText("");
                code1.setText("");
                codeconf.setText("");
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "ATTENTION");
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jPanel62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel62MouseClicked
        // 
        String path = "pages\\index.html";
        File file = new File(path);
        try {
            if (file.exists()) {
                Process pro = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + path);
                pro.wait();
            } else {
                JOptionPane.showMessageDialog(null, "pas de file");
            }
        } catch (HeadlessException | IOException | InterruptedException e) {

        }
    }//GEN-LAST:event_jPanel62MouseClicked

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
            java.util.logging.Logger.getLogger(MENU_EXCEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU_EXCEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU_EXCEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU_EXCEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MENU_EXCEL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane AjoutClient;
    private javax.swing.JRadioButton BIS;
    private javax.swing.ButtonGroup Couleur;
    private javax.swing.JRadioButton DEPOT;
    private javax.swing.JRadioButton DL;
    private javax.swing.JRadioButton FC;
    private javax.swing.JPanel PANEAUDECONTROL;
    private javax.swing.JRadioButton RETRAIT;
    private javax.swing.JTabbedPane apropos;
    private javax.swing.JTabbedPane autre;
    private javax.swing.JTextField avc;
    private javax.swing.JTextField avmd;
    private javax.swing.JPanel barrlat;
    private javax.swing.JTabbedPane bilan;
    private javax.swing.JRadioButton bisc;
    private javax.swing.JRadioButton ble;
    private javax.swing.JRadioButton bles;
    private javax.swing.JRadioButton blk;
    private javax.swing.JRadioButton blks;
    private javax.swing.JButton boutonajout;
    private javax.swing.JButton boutonautre;
    private javax.swing.JButton boutonbilan;
    private javax.swing.JButton boutonclient;
    private javax.swing.JButton boutoninfos;
    private javax.swing.JButton boutonmodifier;
    private javax.swing.JButton boutonoperation;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox c;
    private javax.swing.JTextField caissedl;
    private javax.swing.JTextField caissefc;
    private javax.swing.JTextField code1;
    private javax.swing.JPasswordField codebl;
    private javax.swing.JTextField codeconf;
    private javax.swing.JPasswordField codeop;
    private javax.swing.JComboBox<String> comc;
    private javax.swing.JTextField commd;
    private javax.swing.JPanel conf;
    private javax.swing.ButtonGroup couleurSuite;
    private javax.swing.JTextField dlbl;
    private javax.swing.JTextField dollar;
    private javax.swing.JLabel dz;
    private javax.swing.JLabel dz1;
    private javax.swing.JLabel dz2;
    private javax.swing.JLabel entredollar;
    private javax.swing.JLabel entrefranc;
    private javax.swing.JLabel fakecode;
    private javax.swing.JPanel fondaj;
    private javax.swing.JPanel fondau;
    private javax.swing.JPanel fondbl;
    private javax.swing.JPanel fondop;
    private javax.swing.JLabel fraisd;
    private javax.swing.JTextField fraisdispodl;
    private javax.swing.JTextField fraisdispofc;
    private javax.swing.JLabel fraisf;
    private javax.swing.JTextField fraisroot;
    private javax.swing.JTextField franc;
    private javax.swing.JTextField francbl;
    private javax.swing.JRadioButton frdl;
    private javax.swing.JRadioButton frfc;
    private javax.swing.JLabel ichelp1;
    private javax.swing.JComboBox<String> infoSx;
    private javax.swing.JComboBox<String> infoTl;
    private javax.swing.JComboBox<String> infocom;
    private javax.swing.JTabbedPane infos;
    private javax.swing.JTextField inserer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel100;
    private javax.swing.JPanel jPanel101;
    private javax.swing.JPanel jPanel102;
    private javax.swing.JPanel jPanel103;
    private javax.swing.JPanel jPanel104;
    private javax.swing.JPanel jPanel105;
    private javax.swing.JPanel jPanel106;
    private javax.swing.JPanel jPanel107;
    private javax.swing.JPanel jPanel108;
    private javax.swing.JPanel jPanel109;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel110;
    private javax.swing.JPanel jPanel111;
    private javax.swing.JPanel jPanel112;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel88;
    private javax.swing.JPanel jPanel89;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel93;
    private javax.swing.JPanel jPanel94;
    private javax.swing.JPanel jPanel95;
    private javax.swing.JPanel jPanel96;
    private javax.swing.JPanel jPanel97;
    private javax.swing.JPanel jPanel98;
    private javax.swing.JPanel jPanel99;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel lau;
    private javax.swing.JPanel lbi;
    private javax.swing.JPanel lcl;
    private javax.swing.JPanel lop;
    private javax.swing.JTabbedPane mdpClient;
    private javax.swing.JPasswordField mdpc;
    private javax.swing.JPasswordField mdpmd;
    private javax.swing.JPasswordField mdproot;
    private javax.swing.JPasswordField mdpuser;
    private javax.swing.JTextField modiff;
    private javax.swing.JTabbedPane moi;
    private javax.swing.JTextField nbclients;
    private javax.swing.JTextField ndfemme;
    private javax.swing.JTextField ndhomme;
    private javax.swing.JTextField nomau;
    private javax.swing.JTextField nombl;
    private javax.swing.JTextField nomc;
    private javax.swing.JTextField nommd;
    private javax.swing.JLabel nommemoir;
    private javax.swing.JTextField nomop;
    private javax.swing.JTextField nomroot;
    private javax.swing.JTextField nomuser;
    private javax.swing.JLabel nomusercon;
    private javax.swing.JTextField numc;
    private javax.swing.JTextField nummd;
    private javax.swing.JTabbedPane operation;
    private javax.swing.JRadioButton org;
    private javax.swing.JRadioButton orgs;
    private javax.swing.JTabbedPane parametre;
    private javax.swing.JTextField postau;
    private javax.swing.JTextField postbl;
    private javax.swing.JTextField postc;
    private javax.swing.JTextField postmd;
    private javax.swing.JTextField postop;
    private javax.swing.JLabel pourc;
    private javax.swing.JTextField pourcactuel;
    private javax.swing.JTextField preau;
    private javax.swing.JTextField prebl;
    private javax.swing.JTextField prec;
    private javax.swing.JTextField premd;
    private javax.swing.JTextField preop;
    private javax.swing.JTabbedPane principal;
    private javax.swing.JTextField quatc;
    private javax.swing.JTextField quatmd;
    private javax.swing.JTextField rfrais;
    private javax.swing.JComboBox<String> sexec;
    private javax.swing.JTextField sexemd;
    private javax.swing.JTabbedPane supplement;
    private javax.swing.JTable tab;
    private javax.swing.JTable tabbl;
    private javax.swing.JTable tabinfo;
    private javax.swing.JTable tabmodif;
    private javax.swing.JFormattedTextField telau;
    private javax.swing.JFormattedTextField telc;
    private javax.swing.JFormattedTextField telmd;
    private javax.swing.JLabel title;
    private javax.swing.JLabel titlemove;
    private javax.swing.JTextField total;
    private javax.swing.JTabbedPane updateClient;
    private javax.swing.JTabbedPane user;
    private javax.swing.JPanel val;
    private javax.swing.JLabel valt;
    private javax.swing.JRadioButton vrt;
    private javax.swing.JRadioButton vrts;
    private javax.swing.JRadioButton wht;
    private javax.swing.JRadioButton whts;
    // End of variables declaration//GEN-END:variables

    //-----------------------------------------------PARTIE USER--------------------------------------------------
    //METHODE QUI PERMET DE FAIRE LA VERIFICATION DU L'UTILISATEUR
}
                                                                                                                                                 