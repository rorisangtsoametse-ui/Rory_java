package views;

import javax.swing.*;
import java.awt.*;

public class frmAdminDashboard extends JFrame {

    private JPanel sidebarPanel, mainPanel;
    private JButton btnDashboard, btnManageUsers, btnManageClubs, btnManageEvents, btnNotifications, btnReports, btnSettings, btnLogout;
    private CardLayout cardLayout;

    public frmAdminDashboard() {
        setTitle("ClubConnect - Admin Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Sidebar Panel
        sidebarPanel = new JPanel();
        sidebarPanel.setBackground(new Color(70, 130, 180)); // Dark blue-gray
        sidebarPanel.setPreferredSize(new Dimension(200, 0));
        sidebarPanel.setLayout(new GridLayout(8, 1, 0, 10));
        sidebarPanel.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));

        btnDashboard = new JButton("Dashboard");
        btnManageUsers = new JButton("Manage Users");
        btnManageClubs = new JButton("Manage Clubs");
        btnManageEvents = new JButton("Manage Events");
        btnNotifications = new JButton("Notifications");
        btnReports = new JButton("Reports");
        btnSettings = new JButton("Settings");
        btnLogout = new JButton("Logout");

        sidebarPanel.add(btnDashboard);
        sidebarPanel.add(btnManageUsers);
        sidebarPanel.add(btnManageClubs);
        sidebarPanel.add(btnManageEvents);
        sidebarPanel.add(btnNotifications);
        sidebarPanel.add(btnReports);
        sidebarPanel.add(btnSettings);
        sidebarPanel.add(btnLogout);

        add(sidebarPanel, BorderLayout.WEST);

        // Main Content Panel
        mainPanel = new JPanel();
        mainPanel.setBackground(new Color(211, 211, 211)); // Light gray
        cardLayout = new CardLayout();
        mainPanel.setLayout(cardLayout);

        // Dashboard Panel
        JPanel dashboardPanel = new JPanel();
        dashboardPanel.add(new JLabel("Admin Dashboard"));
        mainPanel.add(dashboardPanel, "Dashboard");

        // Manage Users Panel
        JPanel manageUsersPanel = new JPanel();
        manageUsersPanel.add(new JLabel("Manage Users"));
        mainPanel.add(manageUsersPanel, "Manage Users");

        // Manage Clubs Panel
        JPanel manageClubsPanel = new JPanel();
        manageClubsPanel.add(new JLabel("Manage Clubs"));
        mainPanel.add(manageClubsPanel, "Manage Clubs");

        // Manage Events Panel
        JPanel manageEventsPanel = new JPanel();
        manageEventsPanel.add(new JLabel("Manage Events"));
        mainPanel.add(manageEventsPanel, "Manage Events");

        // Notifications Panel
        JPanel notificationsPanel = new JPanel();
        notificationsPanel.add(new JLabel("Notifications"));
        mainPanel.add(notificationsPanel, "Notifications");

        // Reports Panel
        JPanel reportsPanel = new JPanel();
        reportsPanel.add(new JLabel("Reports"));
        mainPanel.add(reportsPanel, "Reports");

        // Settings Panel
        JPanel settingsPanel = new JPanel();
        settingsPanel.add(new JLabel("Settings"));
        mainPanel.add(settingsPanel, "Settings");

        add(mainPanel, BorderLayout.CENTER);

        // Button Actions
        btnDashboard.addActionListener(e -> cardLayout.show(mainPanel, "Dashboard"));
        btnManageUsers.addActionListener(e -> cardLayout.show(mainPanel, "Manage Users"));
        btnManageClubs.addActionListener(e -> cardLayout.show(mainPanel, "Manage Clubs"));
        btnManageEvents.addActionListener(e -> cardLayout.show(mainPanel, "Manage Events"));
        btnNotifications.addActionListener(e -> cardLayout.show(mainPanel, "Notifications"));
        btnReports.addActionListener(e -> cardLayout.show(mainPanel, "Reports"));
        btnSettings.addActionListener(e -> cardLayout.show(mainPanel, "Settings"));
        btnLogout.addActionListener(e -> {
            // TODO: Logout functionality
            JOptionPane.showMessageDialog(frmAdminDashboard.this, "Logging out...");
            dispose(); // Close the dashboard
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new frmAdminDashboard().setVisible(true);
        });
    }
}
