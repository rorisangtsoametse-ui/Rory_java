
package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmLogin extends JFrame {

    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin, btnRegister, btnGuest;
    private JCheckBox chkShowPassword;
    private JLabel lblForgotPassword;

    public frmLogin() {
        setTitle("ClubConnect Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Main Panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(5, 2, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));

        // Title
        JLabel lblTitle = new JLabel("ClubConnect Login");
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 20));
        mainPanel.add(lblTitle);
        mainPanel.add(new JLabel()); // Empty label for spacing

        // Username
        JLabel lblUsername = new JLabel("Username/Email:");
        mainPanel.add(lblUsername);
        txtUsername = new JTextField();
        mainPanel.add(txtUsername);

        // Password
        JLabel lblPassword = new JLabel("Password:");
        mainPanel.add(lblPassword);
        txtPassword = new JPasswordField();
        mainPanel.add(txtPassword);

        // Show Password Checkbox
        chkShowPassword = new JCheckBox("Show Password");
        mainPanel.add(chkShowPassword);
        mainPanel.add(new JLabel()); // Empty label for spacing

        // Forgot Password
        lblForgotPassword = new JLabel("Forgot Password?");
        lblForgotPassword.setForeground(Color.BLUE);
        lblForgotPassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        mainPanel.add(lblForgotPassword);
        mainPanel.add(new JLabel()); // Empty label for spacing

        // Buttons
        btnLogin = new JButton("Login");
        btnLogin.setBackground(new Color(66, 133, 244));
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setFocusPainted(false);
        mainPanel.add(btnLogin);

        btnRegister = new JButton("Register");
        btnRegister.setBackground(new Color(66, 133, 244));
        btnRegister.setForeground(Color.WHITE);
        btnRegister.setFocusPainted(false);
        mainPanel.add(btnRegister);

        btnGuest = new JButton("Continue as Guest");
        btnGuest.setBackground(new Color(66, 133, 244));
        btnGuest.setForeground(Color.WHITE);
        btnGuest.setFocusPainted(false);
        mainPanel.add(btnGuest);
        mainPanel.add(new JLabel()); // Empty label for spacing

        // Add main panel to frame
        add(mainPanel, BorderLayout.CENTER);

        // Button Actions
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Connect to MySQL and validate credentials
                String username = txtUsername.getText();
                String password = new String(txtPassword.getPassword());

                if (username.equals("admin") && password.equals("password")) {
                    JOptionPane.showMessageDialog(frmLogin.this, "Admin Login Successful!");
                    // TODO: Open Admin Dashboard
                } else if (username.equals("leader") && password.equals("password")) {
                    JOptionPane.showMessageDialog(frmLogin.this, "Club Leader Login Successful!");
                    // TODO: Open Club Leader Dashboard
                } else if (username.equals("member") && password.equals("password")) {
                    JOptionPane.showMessageDialog(frmLogin.this, "Member Login Successful!");
                    // TODO: Open Member Dashboard
                } else {
                    JOptionPane.showMessageDialog(frmLogin.this, "Invalid Login!");
                }
            }
        });

        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Open Register Form
                JOptionPane.showMessageDialog(frmLogin.this, "Opening Registration Form...");
            }
        });

        btnGuest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Open Guest Dashboard
                JOptionPane.showMessageDialog(frmLogin.this, "Opening Guest Dashboard...");
            }
        });

        chkShowPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (chkShowPassword.isSelected()) {
                    txtPassword.setEchoChar((char) 0);
                } else {
                    txtPassword.setEchoChar('•');
                }
            }
        });

        lblForgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // TODO: Show temporary reset code dialog
                JOptionPane.showMessageDialog(frmLogin.this, "Forgot Password? (Placeholder)");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new frmLogin().setVisible(true);
        });
    }
}
