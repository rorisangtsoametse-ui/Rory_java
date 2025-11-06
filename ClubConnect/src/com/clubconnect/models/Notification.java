package com.clubconnect.models;

import java.time.LocalDateTime;

/**
 * Notification model class representing system notifications and announcements.
 * Used for club announcements, event reminders, and system messages.
 * 
 * @author ClubConnect Team
 * @version 1.0
 */
public class Notification {
    
    /**
     * Enum representing notification types
     */
    public enum NotificationType {
        ANNOUNCEMENT,       // Club announcement
        EVENT_REMINDER,     // Event reminder
        MEMBERSHIP_UPDATE,  // Membership status update
        BUDGET_UPDATE,      // Budget approval/rejection
        SYSTEM_MESSAGE,     // System-wide message
        DISCUSSION_REPLY    // Discussion board reply
    }
    
    /**
     * Enum representing notification priority
     */
    public enum Priority {
        LOW,
        NORMAL,
        HIGH,
        URGENT
    }
    
    private int notificationId;
    private int userId;  // Recipient user ID (0 for broadcast)
    private int clubId;  // Related club ID (0 if not club-specific)
    private String clubName;  // For display purposes
    private NotificationType type;
    private Priority priority;
    private String title;
    private String message;
    private boolean isRead;
    private boolean sendEmail;  // Whether to send email notification
    private int createdBy;  // Sender user ID
    private String createdByName;  // For display
    private LocalDateTime createdAt;
    private LocalDateTime readAt;
    
    /**
     * Default constructor
     */
    public Notification() {
        this.isRead = false;
        this.sendEmail = false;
        this.priority = Priority.NORMAL;
        this.createdAt = LocalDateTime.now();
    }
    
    /**
     * Parameterized constructor for creating a new notification
     * 
     * @param userId Recipient user ID
     * @param clubId Related club ID
     * @param type Notification type
     * @param title Notification title
     * @param message Notification message
     * @param createdBy Sender user ID
     */
    public Notification(int userId, int clubId, NotificationType type, 
                       String title, String message, int createdBy) {
        this();
        this.userId = userId;
        this.clubId = clubId;
        this.type = type;
        this.title = title;
        this.message = message;
        this.createdBy = createdBy;
    }
    
    // Getters and Setters
    
    /**
     * Gets the notification ID
     * @return notification ID
     */
    public int getNotificationId() {
        return notificationId;
    }
    
    /**
     * Sets the notification ID
     * @param notificationId notification ID
     */
    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }
    
    /**
     * Gets the recipient user ID
     * @return user ID
     */
    public int getUserId() {
        return userId;
    }
    
    /**
     * Sets the recipient user ID
     * @param userId user ID
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    /**
     * Gets the related club ID
     * @return club ID
     */
    public int getClubId() {
        return clubId;
    }
    
    /**
     * Sets the related club ID
     * @param clubId club ID
     */
    public void setClubId(int clubId) {
        this.clubId = clubId;
    }
    
    /**
     * Gets the club name
     * @return club name
     */
    public String getClubName() {
        return clubName;
    }
    
    /**
     * Sets the club name
     * @param clubName club name
     */
    public void setClubName(String clubName) {
        this.clubName = clubName;
    }
    
    /**
     * Gets the notification type
     * @return notification type
     */
    public NotificationType getType() {
        return type;
    }
    
    /**
     * Sets the notification type
     * @param type notification type
     */
    public void setType(NotificationType type) {
        this.type = type;
    }
    
    /**
     * Gets the priority
     * @return priority
     */
    public Priority getPriority() {
        return priority;
    }
    
    /**
     * Sets the priority
     * @param priority priority
     */
    public void setPriority(Priority priority) {
        this.priority = priority;
    }
    
    /**
     * Gets the notification title
     * @return title
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * Sets the notification title
     * @param title title
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
    /**
     * Gets the notification message
     * @return message
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * Sets the notification message
     * @param message message
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * Checks if notification is read
     * @return true if read, false otherwise
     */
    public boolean isRead() {
        return isRead;
    }
    
    /**
     * Sets the read status
     * @param read read status
     */
    public void setRead(boolean read) {
        isRead = read;
    }
    
    /**
     * Checks if email should be sent
     * @return true if email should be sent, false otherwise
     */
    public boolean isSendEmail() {
        return sendEmail;
    }
    
    /**
     * Sets whether to send email
     * @param sendEmail send email flag
     */
    public void setSendEmail(boolean sendEmail) {
        this.sendEmail = sendEmail;
    }
    
    /**
     * Gets the creator's user ID
     * @return creator user ID
     */
    public int getCreatedBy() {
        return createdBy;
    }
    
    /**
     * Sets the creator's user ID
     * @param createdBy creator user ID
     */
    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }
    
    /**
     * Gets the creator's name
     * @return creator name
     */
    public String getCreatedByName() {
        return createdByName;
    }
    
    /**
     * Sets the creator's name
     * @param createdByName creator name
     */
    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName;
    }
    
    /**
     * Gets the creation timestamp
     * @return creation timestamp
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    
    /**
     * Sets the creation timestamp
     * @param createdAt creation timestamp
     */
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    
    /**
     * Gets the read timestamp
     * @return read timestamp
     */
    public LocalDateTime getReadAt() {
        return readAt;
    }
    
    /**
     * Sets the read timestamp
     * @param readAt read timestamp
     */
    public void setReadAt(LocalDateTime readAt) {
        this.readAt = readAt;
    }
    
    @Override
    public String toString() {
        return "Notification{" +
                "notificationId=" + notificationId +
                ", type=" + type +
                ", priority=" + priority +
                ", title='" + title + '\'' +
                ", isRead=" + isRead +
                ", createdAt=" + createdAt +
                '}';
    }
}
