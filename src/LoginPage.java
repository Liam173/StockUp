
import com.mysql.cj.jdbc.exceptions.SQLError;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Liam
 * @author Henry
 * @author Kyle
 */
public class LoginPage extends javax.swing.JFrame {

    String DB_URL = "jdbc:mysql://remotemysql.com:3306/8zzEvO42x5";
    String DB_Username = "8zzEvO42x5";
    String DB_Password = "rQCELYaPvq";
    boolean serverFound = false;
    boolean DBFound = false;

    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
        UsernameTf.setText("");
        PasswordTf.setText("");
        testConnection();
        setSize(1270, 730);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblConnectStatus = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        UsernameTf = new javax.swing.JTextField();
        UsernameLbl = new javax.swing.JLabel();
        PasswordLbl = new javax.swing.JLabel();
        buttonLogin = new javax.swing.JButton();
        PasswordTf = new javax.swing.JPasswordField();
        labelLoading = new javax.swing.JLabel();
        ExitLbl = new javax.swing.JLabel();
        MinLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        lblConnectStatus.setText("status");
        jPanel2.add(lblConnectStatus);
        lblConnectStatus.setBounds(20, 10, 120, 14);

        jPanel1.setBackground(new java.awt.Color(133, 1, 41));
        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Capture2.PNG"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(250, 0, 260, 394);
        jPanel1.add(UsernameTf);
        UsernameTf.setBounds(100, 130, 140, 30);

        UsernameLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UsernameLbl.setForeground(new java.awt.Color(255, 255, 255));
        UsernameLbl.setText("Username:");
        jPanel1.add(UsernameLbl);
        UsernameLbl.setBounds(20, 130, 80, 30);

        PasswordLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PasswordLbl.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLbl.setText("Password:");
        jPanel1.add(PasswordLbl);
        PasswordLbl.setBounds(20, 180, 80, 30);

        buttonLogin.setBackground(new java.awt.Color(168, 153, 104));
        buttonLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonLogin.setText("Login");
        buttonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonLoginMousePressed(evt);
            }
        });
        jPanel1.add(buttonLogin);
        buttonLogin.setBounds(80, 230, 120, 30);

        PasswordTf.setText("jPasswordField1");
        PasswordTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTfActionPerformed(evt);
            }
        });
        jPanel1.add(PasswordTf);
        PasswordTf.setBounds(100, 180, 140, 30);

        labelLoading.setPreferredSize(new java.awt.Dimension(190, 109));
        jPanel1.add(labelLoading);
        labelLoading.setBounds(100, 210, 120, 70);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(380, 170, 510, 390);

        ExitLbl.setFont(new java.awt.Font("Leelawadee UI", 1, 48)); // NOI18N
        ExitLbl.setForeground(new java.awt.Color(255, 255, 255));
        ExitLbl.setText("x");
        ExitLbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ExitLblMouseMoved(evt);
            }
        });
        ExitLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitLblMouseClicked(evt);
            }
        });
        jPanel2.add(ExitLbl);
        ExitLbl.setBounds(1220, 0, 27, 64);

        MinLbl.setFont(new java.awt.Font("Leelawadee UI", 1, 48)); // NOI18N
        MinLbl.setForeground(new java.awt.Color(255, 255, 255));
        MinLbl.setText("-");
        MinLbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MinLblMouseMoved(evt);
            }
        });
        MinLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinLblMouseClicked(evt);
            }
        });
        jPanel2.add(MinLbl);
        MinLbl.setBounds(1180, 0, 19, 64);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Lifestyle_Overlay.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1270, 730);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1270, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTfActionPerformed

    private void ExitLblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitLblMouseMoved
        ExitLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_ExitLblMouseMoved

    private void MinLblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinLblMouseMoved
        MinLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_MinLblMouseMoved

    private void buttonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLoginMouseClicked

    }//GEN-LAST:event_buttonLoginMouseClicked

    boolean done = false;
    private void buttonLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLoginMousePressed
        buttonLogin.setVisible(false);
        labelLoading.setIcon(new ImageIcon("src/Resources/loading/checken_cropped.gif"));
        labelLoading.setVisible(true);

        new Thread(new Runnable() {

            @Override
            public void run() {
                login(UsernameTf.getText(), PasswordTf.getText());
                done = true;
                if (done) {
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            buttonLogin.setVisible(true);
                            labelLoading.setVisible(false);
                        }
                    });
                }
            }

        }).start();
    }//GEN-LAST:event_buttonLoginMousePressed

    private void ExitLblMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_ExitLblMouseClicked
        System.exit(0);
    }// GEN-LAST:event_ExitLblMouseClicked

    private void MinLblMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_MinLblMouseClicked
        this.setState(JFrame.ICONIFIED);
    }// GEN-LAST:event_MinLblMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ExitLbl;
    private javax.swing.JLabel MinLbl;
    private javax.swing.JLabel PasswordLbl;
    private javax.swing.JPasswordField PasswordTf;
    private javax.swing.JLabel UsernameLbl;
    private javax.swing.JTextField UsernameTf;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelLoading;
    private javax.swing.JLabel lblConnectStatus;
    // End of variables declaration//GEN-END:variables

    private void login(String text, String password) {
        while (conn == null) {
            conn = getConnection();
        }
        //System.out.println("1");
        st = createStatement();

        //System.out.println("1");
        try {
            rs = returnUser("Admins", text, password);
            if (rs.next()) {
                new AdminPage(this, rs, conn);
            } else {
                rs = returnUser("Staff", text, password);
                if (rs.next()) {
                    new StorePage(this, rs, conn);
                } else {
                    rs = returnUser("Dispatch", text, password);
                    if (rs.next()) {
                        new DispatchPage(this, rs, conn);
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect login details. Please try again.");
                    }
                }
            }
        } catch (SQLException ex) {

            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void testConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            showErrorAndTerminate("Invalid Class.forName statement. Please Fix");
        }
        try {
            DriverManager.getConnection(DB_URL, DB_Username, DB_Password);
            setConnected(true, true);

        } catch (SQLException ex) {
            //returns 1045 for when the cridentials are invalid (so the server was actually found)
            switch (ex.getErrorCode()) {

                //returns 1045 for when the cridentials are invalid (so the server was actually found)
                case 1045:
                    setConnected(true, false);
                    break;

                //returns 0 if the server could not be reached   
                case 0:
                    setConnected(false, false);

                    break;
                default:
                    throw new AssertionError();
            }
            ex.printStackTrace();
        }
    }

    private Connection getConnection() {
        while (!serverFound) {
            DB_URL = enterDB_URL(DB_URL);
            testConnection();
        }
        while (!DBFound) {
            DB_URL = enterDB_URL(DB_URL);
            DB_Username = enterDB_Username(DB_Username);
            DB_Password = enterDB_Password(DB_Password);
            testConnection();
        }

        try {
            // THIS IS JUST AN EXAMPLE OF THE PATH OF MY JDBC MYSQL SERVER URL
            // MIGHT BE DIFFERENT ON YOUR MACHINE (I.E. DIFFERENT PORT, ALTHOUGH 3306 is
            // default):
            // "jdbc:mysql://localhost:3306/stockup_db"
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                showErrorAndTerminate("Invalid Class.forName statement. Please Fix");
            }
            return DriverManager.getConnection(DB_URL, DB_Username, DB_Password);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Incorrect URL or login for database. \n Please enter valid details." + ex);
            return null;
        }
    }

    private String enterDB_URL(String DB_URL) {
        DB_URL = JOptionPane.showInputDialog(null, "Database URL:", DB_URL);
        while (DB_URL.isEmpty()) {
            DB_URL = JOptionPane.showInputDialog(null, "Database URL:");
        }
        if (DB_URL == null) {
            System.exit(0);
        }
        return DB_URL;
    }

    private String enterDB_Username(String DB_Username) {
        DB_Username = JOptionPane.showInputDialog(null, "Database Username:", DB_Username);
        while (DB_Username.isEmpty()) {
            DB_Username = JOptionPane.showInputDialog(null, "Database Username:");
        }
        if (DB_Username == null) {
            System.exit(0);
        }
        return DB_Username;
    }

    private String enterDB_Password(String DB_Password) {
        DB_Password = JOptionPane.showInputDialog(null, "Database Password:", DB_Password);
        while (DB_Password.isEmpty()) {
            DB_Password = JOptionPane.showInputDialog(null, "Database Password:");
        }
        if (DB_Password == null) {
            System.exit(0);
        }
        return DB_Password;
    }

    private Statement createStatement() {
        try {
            return conn.createStatement(); // To change body of generated methods, choose Tools | Templates.

        } catch (SQLException ex) {
            Logger.getLogger(LoginPage.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private void showErrorAndTerminate(String error) {
        JOptionPane.showMessageDialog(null, error);
        System.exit(0);
    }

    private void setConnected(boolean s, boolean d) {

        serverFound = s;
        DBFound = d;
        if (serverFound & DBFound) {
            lblConnectStatus.setForeground(Color.GREEN);
            lblConnectStatus.setText("CONNECTED!");
        } else {
            if (serverFound & !DBFound) {
                lblConnectStatus.setForeground(Color.ORANGE);
                lblConnectStatus.setText("NO DB MATCH");
            } else {
                lblConnectStatus.setForeground(Color.RED);
                lblConnectStatus.setText("SERVER ERROR");
            }
        }
    }

    private ResultSet returnUser(String roleTableName, String username, String password) {
        try {
            return st.executeQuery("SELECT * FROM " + roleTableName + " WHERE username = '" + username + "' AND password = '" + password + "';");

        } catch (SQLException ex) {
            Logger.getLogger(LoginPage.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public void signOut(AdminPage page) {
        page.dispose();
        showLogin(true);
        clearPassword();
    }

    public void signOut(DispatchPage page) {
        page.dispose();
        showLogin(true);
        clearPassword();
    }

    public void signOut(StorePage page) {
        page.dispose();
        showLogin(true);
        clearPassword();
    }

    private void showLogin(boolean b) {
        this.setEnabled(b);
        this.setVisible(b);
    }

    private void clearPassword() {
        PasswordTf.setText("");
    }

    boolean loadingDone = false;
    int count = 0;

    Timer timer = null;

    public ImageIcon getImageIcon(File f) {

        ImageIcon ii = null;
        try {
            Image im = ImageIO.read(f);

            ii = new ImageIcon("ajax-loader.gif");

        } catch (IOException i) {

            i.printStackTrace();

        } finally {

            return ii;

        }
    }

}
