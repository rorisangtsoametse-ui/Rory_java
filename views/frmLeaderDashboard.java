package views;

import javax.swing.*;
import java.awt.*;

public class frmLeaderDashboard extends JFrame {

    private JPanel sidebarPanel, mainPanel;
    private JButton btnDashboard, btnClubProfile, btnMembers, btnEvents, btnBudgets, btnNotifications, btnReports, btnDiscussionBoard, btnSettings, btnLogout;
    private CardLayout cardLayout;

    public frmLeaderDashboard() {
        setTitle("ClubConnect - Club Leader Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Sidebar Panel
        sidebarPanel = new JPanel();
        sidebarPanel.setBackground(new Color(70, 130, 180)); // Dark blue-gray
        sidebarPanel.setPreferredSize(new Dimension(200, 0));
        sidebarPanel.setLayout(new GridLayout(10, 1, 0, 10));
        sidebarPanel.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));

        btnDashboard = new JButton("Dashboard");
        btnClubProfile = new JButton("Club Profile");
        btnMembers = new JButton("Members");
        btnEvents = new JButton("Events");
        btnBudgets = new JButton("Budgets");
        btnNotifications = new JButton("Notifications");
        btnReports = new JButton("Reports");
        btnDiscussionBoard = new JButton("Discussion Board");
        btnSettings = new JButton("Settings");
        btnLogout = new JButton("Logout");

        sidebarPanel.add(btnDashboard);
        sidebarPanel.add(btnClubProfile);
        sidebarPanel.add(btnMembers);
        sidebarPanel.add(btnEvents);
        sidebarPanel.add(btnBudgets);
        sidebarPanel.add(btnNotifications);
        sidebarPanel.add(btnReports);
        sidebarPanel.add(btnDiscussionBoard);
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
        dashboardPanel.add(new JLabel("Club Leader Dashboard"));
        mainPanel.add(dashboardPanel, "Dashboard");

        // Club Profile Panel
        JPanel clubProfilePanel = new JPanel();
        clubProfilePanel.add(new JLabel("Club Profile"));
        mainPanel.add(clubProfilePanel, "Club Profile");

        // Members Panel
        JPanel membersPanel = new JPanel();
        membersPanel.add(new JLabel("Members"));
        mainPanel.add(membersPanel, "Members");

        // Events Panel
        JPanel eventsPanel = new JPanel();
        eventsPanel.add(new JLabel("Events"));
        mainPanel.add(eventsPanel, "Events");

        // Budgets Panel
        JPanel budgetsPanel = new JPanel();
        budgetsPanel.add(new JLabel("Budgets"));
        mainPanel.add(budgetsPanel, "Budgets");

        // Notifications Panel
        JPanel notificationsPanel = new JPanel();
        notificationsPanel.add(new JLabel("Notifications"));
        mainPanel.add(notificationsPanel, "Notifications");

        // Reports Panel
        JPanel reportsPanel = new JPanel();
        reportsPanel.add(new JLabel("Reports"));
        mainPanel.add(reportsPanel, "Reports");

        // Discussion Board Panel
        JPanel discussionBoardPanel = new JPanel();
        discussionBoardPanel.add(new JLabel("Discussion Board"));
        mainPanel.add(discussionBoardPanel, "Discussion Board");

        // Settings Panel
        JPanel settingsPanel = new JPanel();
        settingsPanel.add(new JLabel("Settings"));
        mainPanel.add(settingsPanel, "Settings");

        add(mainPanel, BorderLayout.CENTER);

        // Button Actions
        btnDashboard.addActionListener(e -> cardLayout.show(mainPanel, "Dashboard"));
        btnClubProfile.addActionListener(e -> cardLayout.show(mainPanel, "Club Profile"));
        btnMembers.addActionListener(e -> cardLayout.show(mainPanel, "Members"));
        btnEvents.addActionListener(e -> cardLayout.show(mainPanel, "Events"));
        btnBudgets.addActionListener(e -> cardLayout.show(mainPanel, "Budgets"));
        btnNotifications.addActionListener(e -> cardLayout.show(mainPanel, "Notifications"));
        btnReports.addActionListener(e -> cardLayout.show(mainPanel, "Reports"));
        btnDiscussionBoard.addActionListener(e -> cardLayout.show(mainPanel, "Discussion Board"));
        btnSettings.addActionListener(e -> cardLayout.show(mainPanel, "Settings"));
        btnLogout.addActionListener(e -> {
            // TODO: Logout functionality
            JOptionPane.showMessageDialog(frmLeaderDashboard.this, "Logging out...");
            dispose(); // Close the dashboard
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new frmLeaderDashboard().setVisible(true);
        });
    }
}
