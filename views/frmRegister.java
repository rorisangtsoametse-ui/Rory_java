package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmRegister extends JFrame {

    private JTextField txtUsername, txtEmail;
    private JPasswordField txtPassword, txtConfirmPassword;
    private JButton btnRegister, btnCancel;

    public frmRegister() {
        setTitle("ClubConnect Registration");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Main Panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(6, 2, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));

        // Title
        JLabel lblTitle = new JLabel("ClubConnect Registration");
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 20));
        mainPanel.add(lblTitle);
        mainPanel.add(new JLabel()); // Empty label for spacing

        // Username
        JLabel lblUsername = new JLabel("Username:");
        mainPanel.add(lblUsername);
        txtUsername = new JTextField();
        mainPanel.add(txtUsername);

        // Email
        JLabel lblEmail = new JLabel("Email:");
        mainPanel.add(lblEmail);
        txtEmail = new JTextField();
        mainPanel.add(txtEmail);

        // Password
        JLabel lblPassword = new JLabel("Password:");
        mainPanel.add(lblPassword);
        txtPassword = new JPasswordField();
        mainPanel.add(txtPassword);

        // Confirm Password
        JLabel lblConfirmPassword = new JLabel("Confirm Password:");
        mainPanel.add(lblConfirmPassword);
        txtConfirmPassword = new JPasswordField();
        mainPanel.add(txtConfirmPassword);

        // Buttons
        btnRegister = new JButton("Register");
        btnRegister.setBackground(new Color(66, 133, 244));
        btnRegister.setForeground(Color.WHITE);
        btnRegister.setFocusPainted(false);
        mainPanel.add(btnRegister);

        btnCancel = new JButton("Cancel");
        btnCancel.setBackground(new Color(66, 133, 244));
        btnCancel.setForeground(Color.WHITE);
        btnCancel.setFocusPainted(false);
        mainPanel.add(btnCancel);

        // Add main panel to frame
        add(mainPanel, BorderLayout.CENTER);

        // Button Actions
        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Connect to MySQL and register user
                String username = txtUsername.getText();
                String email = txtEmail.getText();
                String password = new String(txtPassword.getPassword());
                String confirmPassword = new String(txtConfirmPassword.getPassword());

                if (!password.equals(confirmPassword)) {
                    JOptionPane.showMessageDialog(frmRegister.this, "Passwords do not match!");
                    return;
                }

                JOptionPane.showMessageDialog(frmRegister.this, "Registration Successful!");
                dispose(); // Close the registration form
            }
        });

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the registration form
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new frmRegister().setVisible(true);
        });
    }
}
