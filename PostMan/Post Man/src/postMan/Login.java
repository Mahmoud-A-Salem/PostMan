package postMan;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Loginpanel = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        LoginButton = new javax.swing.JButton();
        LoginTitle = new javax.swing.JLabel();
        LoginIcon = new javax.swing.JLabel();
        SignIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Loginpanel.setBackground(new java.awt.Color(255, 255, 255));
        Loginpanel.setPreferredSize(new java.awt.Dimension(750, 500));

        username.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usernameKeyTyped(evt);
            }
        });

        LoginButton.setBackground(new java.awt.Color(0, 102, 255));
        LoginButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("Login");
        LoginButton.setFocusable(false);
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        LoginTitle.setBackground(new java.awt.Color(255, 255, 255));
        LoginTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LoginTitle.setForeground(new java.awt.Color(0, 102, 255));
        LoginTitle.setText("Enter Your Username");

        LoginIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/postMan/loginIcon_1.jpg"))); // NOI18N

        SignIn.setBackground(new java.awt.Color(0, 102, 255));
        SignIn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        SignIn.setForeground(new java.awt.Color(255, 255, 255));
        SignIn.setText("Sign in");
        SignIn.setFocusable(false);
        SignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginpanelLayout = new javax.swing.GroupLayout(Loginpanel);
        Loginpanel.setLayout(LoginpanelLayout);
        LoginpanelLayout.setHorizontalGroup(
            LoginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginpanelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(LoginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LoginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LoginIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginpanelLayout.setVerticalGroup(
            LoginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginpanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(LoginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginpanelLayout.createSequentialGroup()
                        .addComponent(LoginTitle)
                        .addGap(33, 33, 33)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(SignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addComponent(LoginIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Loginpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 844, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Loginpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed

        dispose();
        Orders loc = new Orders();
        loc.setVisible(true);
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        String url = "jdbc:sqlserver://localhost:1433;databaseName=History"; // اتأكد من اسم الداتابيز بتاعتك صح
        String username = "mahmoudd";// اتأكد من اليوزر 
        String password = "123456"; // اتأكد من الباسورد
        try {
            con = DriverManager.getConnection(url, username, password);
            ss = con.createStatement();
            System.out.println("Database CONNECTED");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_formWindowOpened

    private void usernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyTyped
        // TODO add your handling code here:
        if (evt.getKeyChar() == 10)
            LoginButtonActionPerformed(null);
    }//GEN-LAST:event_usernameKeyTyped

    private void SignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInActionPerformed
        // TODO add your handling code here:
        if (username.getText().trim() != "") {
            query = "insert into _login values('" + username.getText().trim() + "')";
            try {
                ss.execute(query);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "username already exist");
            }
        }
    }//GEN-LAST:event_SignInActionPerformed

    public static void main(String args[]) throws ClassNotFoundException {
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    public static Connection con;
    public static Statement ss;
    public static String query;
    public static ResultSet rs;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginIcon;
    private javax.swing.JLabel LoginTitle;
    private javax.swing.JPanel Loginpanel;
    private javax.swing.JButton SignIn;
    public static javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
