package views;

import javax.swing.*;
import java.awt.*;

public class frmMemberDashboard extends JFrame {

    private JPanel sidebarPanel, mainPanel;
    private JButton btnDashboard, btnMyClubs, btnEvents, btnAnnouncements, btnDiscussionBoard, btnSettings, btnLogout;
    private CardLayout cardLayout;

    public frmMemberDashboard() {
        setTitle("ClubConnect - Member Dashboard");
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
        btnMyClubs = new JButton("My Clubs");
        btnEvents = new JButton("Events");
        btnAnnouncements = new JButton("Announcements");
        btnDiscussionBoard = new JButton("Discussion Board");
        btnSettings = new JButton("Settings");
        btnLogout = new JButton("Logout");

        sidebarPanel.add(btnDashboard);
        sidebarPanel.add(btnMyClubs);
        sidebarPanel.add(btnEvents);
        sidebarPanel.add(btnAnnouncements);
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
        dashboardPanel.add(new JLabel("Upcoming Events and Recent Activity"));
        mainPanel.add(dashboardPanel, "Dashboard");

        // My Clubs Panel
        JPanel myClubsPanel = new JPanel();
        myClubsPanel.add(new JLabel("My Clubs"));
        // TODO: Add JTable inside JScrollPane for lists
        mainPanel.add(myClubsPanel, "My Clubs");

        // Events Panel
        JPanel eventsPanel = new JPanel();
        eventsPanel.add(new JLabel("Events"));
        mainPanel.add(eventsPanel, "Events");

        // Announcements Panel
        JPanel announcementsPanel = new JPanel();
        announcementsPanel.add(new JLabel("Announcements"));
        mainPanel.add(announcementsPanel, "Announcements");

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
        btnMyClubs.addActionListener(e -> cardLayout.show(mainPanel, "My Clubs"));
        btnEvents.addActionListener(e -> cardLayout.show(mainPanel, "Events"));
        btnAnnouncements.addActionListener(e -> cardLayout.show(mainPanel, "Announcements"));
        btnDiscussionBoard.addActionListener(e -> cardLayout.show(mainPanel, "Discussion Board"));
        btnSettings.addActionListener(e -> cardLayout.show(mainPanel, "Settings"));
        btnLogout.addActionListener(e -> {
            // TODO: Logout functionality
            JOptionPane.showMessageDialog(frmMemberDashboard.this, "Logging out...");
            dispose(); // Close the dashboard
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new frmMemberDashboard().setVisible(true);
        });
    }
}
