package com.clubconnect.models;

import java.time.LocalDateTime;

/**
 * RSVP model class representing event RSVPs and waitlist management.
 * Tracks member responses to event invitations.
 * 
 * @author ClubConnect Team
 * @version 1.0
 */
public class RSVP {
    
    /**
     * Enum representing RSVP status
     */
    public enum Status {
        GOING,      // Confirmed attendance
        MAYBE,      // Tentative
        NOT_GOING,  // Declined
        WAITLIST    // On waitlist
    }
    
    private int rsvpId;
    private int eventId;
    private String eventTitle;  // For display purposes
    private int userId;
    private String userName;  // For display purposes
    private Status status;
    private String notes;
    private LocalDateTime rsvpedAt;
    private LocalDateTime updatedAt;
    
    /**
     * Default constructor
     */
    public RSVP() {
        this.rsvpedAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }
    
    /**
     * Parameterized constructor for creating a new RSVP
     * 
     * @param eventId Event ID
     * @param userId User ID
     * @param status RSVP status
     */
    public RSVP(int eventId, int userId, Status status) {
        this();
        this.eventId = eventId;
        this.userId = userId;
        this.status = status;
    }
    
    // Getters and Setters
    
    /**
     * Gets the RSVP ID
     * @return RSVP ID
     */
    public int getRsvpId() {
        return rsvpId;
    }
    
    /**
     * Sets the RSVP ID
     * @param rsvpId RSVP ID
     */
    public void setRsvpId(int rsvpId) {
        this.rsvpId = rsvpId;
    }
    
    /**
     * Gets the event ID
     * @return event ID
     */
    public int getEventId() {
        return eventId;
    }
    
    /**
     * Sets the event ID
     * @param eventId event ID
     */
    public void setEventId(int eventId) {
        this.eventId = eventId;
    }
    
    /**
     * Gets the event title
     * @return event title
     */
    public String getEventTitle() {
        return eventTitle;
    }
    
    /**
     * Sets the event title
     * @param eventTitle event title
     */
    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }
    
    /**
     * Gets the user ID
     * @return user ID
     */
    public int getUserId() {
        return userId;
    }
    
    /**
     * Sets the user ID
     * @param userId user ID
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    /**
     * Gets the user name
     * @return user name
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Sets the user name
     * @param userName user name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Gets the RSVP status
     * @return status
     */
    public Status getStatus() {
        return status;
    }
    
    /**
     * Sets the RSVP status
     * @param status status
     */
    public void setStatus(Status status) {
        this.status = status;
    }
    
    /**
     * Gets the notes
     * @return notes
     */
    public String getNotes() {
        return notes;
    }
    
    /**
     * Sets the notes
     * @param notes notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    /**
     * Gets the RSVP timestamp
     * @return RSVP timestamp
     */
    public LocalDateTime getRsvpedAt() {
        return rsvpedAt;
    }
    
    /**
     * Sets the RSVP timestamp
     * @param rsvpedAt RSVP timestamp
     */
    public void setRsvpedAt(LocalDateTime rsvpedAt) {
        this.rsvpedAt = rsvpedAt;
    }
    
    /**
     * Gets the last update timestamp
     * @return update timestamp
     */
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
    
    /**
     * Sets the last update timestamp
     * @param updatedAt update timestamp
     */
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
    
    /**
     * Checks if user is going
     * @return true if going, false otherwise
     */
    public boolean isGoing() {
        return status == Status.GOING;
    }
    
    /**
     * Checks if user is on waitlist
     * @return true if on waitlist, false otherwise
     */
    public boolean isWaitlisted() {
        return status == Status.WAITLIST;
    }
    
    @Override
    public String toString() {
        return "RSVP{" +
                "rsvpId=" + rsvpId +
                ", eventTitle='" + eventTitle + '\'' +
                ", userName='" + userName + '\'' +
                ", status=" + status +
                ", rsvpedAt=" + rsvpedAt +
                '}';
    }
}
