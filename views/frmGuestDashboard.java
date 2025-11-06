package views;

import javax.swing.*;
import java.awt.*;

public class frmGuestDashboard extends JFrame {

    private JPanel topPanel, mainPanel;
    private JButton btnHome, btnClubs, btnEvents, btnAbout, btnLoginRegister;
    private CardLayout cardLayout;

    public frmGuestDashboard() {
        setTitle("ClubConnect - Guest Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Top Navigation Panel
        topPanel = new JPanel();
        topPanel.setBackground(new Color(220, 220, 220));
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));

        btnHome = new JButton("Home");
        btnClubs = new JButton("Clubs");
        btnEvents = new JButton("Events");
        btnAbout = new JButton("About");
        btnLoginRegister = new JButton("Login/Register");

        topPanel.add(btnHome);
        topPanel.add(btnClubs);
        topPanel.add(btnEvents);
        topPanel.add(btnAbout);
        topPanel.add(btnLoginRegister);

        add(topPanel, BorderLayout.NORTH);

        // Main Content Panel
        mainPanel = new JPanel();
        cardLayout = new CardLayout();
        mainPanel.setLayout(cardLayout);

        // Home Panel
        JPanel homePanel = new JPanel();
        homePanel.add(new JLabel("Welcome to ClubConnect! (Guest View)"));
        mainPanel.add(homePanel, "Home");

        // Clubs Panel
        JPanel clubsPanel = new JPanel();
        clubsPanel.add(new JLabel("List of Public Clubs"));
        // TODO: Add search/filter functionality for clubs
        mainPanel.add(clubsPanel, "Clubs");

        // Events Panel
        JPanel eventsPanel = new JPanel();
        eventsPanel.add(new JLabel("Upcoming Events"));
        // TODO: Add calendar preview
        mainPanel.add(eventsPanel, "Events");

        // About Panel
        JPanel aboutPanel = new JPanel();
        aboutPanel.add(new JLabel("About ClubConnect"));
        mainPanel.add(aboutPanel, "About");

        // Add main panel to frame
        add(mainPanel, BorderLayout.CENTER);

        // Button Actions
        btnHome.addActionListener(e -> cardLayout.show(mainPanel, "Home"));
        btnClubs.addActionListener(e -> cardLayout.show(mainPanel, "Clubs"));
        btnEvents.addActionListener(e -> cardLayout.show(mainPanel, "Events"));
        btnAbout.addActionListener(e -> cardLayout.show(mainPanel, "About"));
        btnLoginRegister.addActionListener(e -> {
            // TODO: Open Login/Register Form
            JOptionPane.showMessageDialog(frmGuestDashboard.this, "Opening Login/Register Form...");
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new frmGuestDashboard().setVisible(true);
        });
    }
}
