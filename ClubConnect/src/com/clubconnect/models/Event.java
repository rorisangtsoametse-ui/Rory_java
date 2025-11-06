package com.clubconnect.models;

import java.time.LocalDateTime;

/**
 * Event model class representing club events, meetings, and seatings.
 * All club activities including meetings must be registered as events.
 * 
 * @author ClubConnect Team
 * @version 1.0
 */
public class Event {
    
    /**
     * Enum representing event types
     */
    public enum EventType {
        MEETING,        // Regular club meeting
        SEATING,        // Club seating/gathering
        WORKSHOP,       // Educational workshop
        COMPETITION,    // Competition or contest
        SOCIAL,         // Social gathering
        FUNDRAISER,     // Fundraising event
        OTHER           // Other event types
    }
    
    /**
     * Enum representing event status
     */
    public enum Status {
        PENDING,        // Awaiting approval
        APPROVED,       // Approved and scheduled
        CANCELLED,      // Cancelled
        COMPLETED       // Event has occurred
    }
    
    private int eventId;
    private int clubId;
    private String clubName;  // For display purposes
    private String eventTitle;
    private String description;
    private EventType eventType;
    private Status status;
    private LocalDateTime eventDate;
    private LocalDateTime endDate;
    private String venue;
    private int resourceId;  // Room/resource booking ID
    private String resourceName;  // For display
    private int capacity;
    private int rsvpCount;
    private boolean requiresBudget;
    private int budgetRequestId;  // Link to budget request if applicable
    private double estimatedCost;
    private int createdBy;  // User ID of creator (leader)
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    
    /**
     * Default constructor
     */
    public Event() {
        this.status = Status.PENDING;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.rsvpCount = 0;
        this.requiresBudget = false;
        this.estimatedCost = 0.0;
    }
    
    /**
     * Parameterized constructor for creating a new event
     * 
     * @param clubId Club ID
     * @param eventTitle Event title
     * @param description Event description
     * @param eventType Type of event
     * @param eventDate Event date and time
     * @param venue Venue/location
     * @param capacity Maximum capacity
     * @param createdBy Creator's user ID
     */
    public Event(int clubId, String eventTitle, String description, EventType eventType,
                 LocalDateTime eventDate, String venue, int capacity, int createdBy) {
        this();
        this.clubId = clubId;
        this.eventTitle = eventTitle;
        this.description = description;
        this.eventType = eventType;
        this.eventDate = eventDate;
        this.venue = venue;
        this.capacity = capacity;
        this.createdBy = createdBy;
    }
    
    // Getters and Setters
    
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
     * Gets the club ID
     * @return club ID
     */
    public int getClubId() {
        return clubId;
    }
    
    /**
     * Sets the club ID
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
     * Gets the event description
     * @return description
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Sets the event description
     * @param description description
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Gets the event type
     * @return event type
     */
    public EventType getEventType() {
        return eventType;
    }
    
    /**
     * Sets the event type
     * @param eventType event type
     */
    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }
    
    /**
     * Gets the event status
     * @return status
     */
    public Status getStatus() {
        return status;
    }
    
    /**
     * Sets the event status
     * @param status status
     */
    public void setStatus(Status status) {
        this.status = status;
    }
    
    /**
     * Gets the event date and time
     * @return event date
     */
    public LocalDateTime getEventDate() {
        return eventDate;
    }
    
    /**
     * Sets the event date and time
     * @param eventDate event date
     */
    public void setEventDate(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }
    
    /**
     * Gets the event end date and time
     * @return end date
     */
    public LocalDateTime getEndDate() {
        return endDate;
    }
    
    /**
     * Sets the event end date and time
     * @param endDate end date
     */
    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
    
    /**
     * Gets the venue
     * @return venue
     */
    public String getVenue() {
        return venue;
    }
    
    /**
     * Sets the venue
     * @param venue venue
     */
    public void setVenue(String venue) {
        this.venue = venue;
    }
    
    /**
     * Gets the resource ID
     * @return resource ID
     */
    public int getResourceId() {
        return resourceId;
    }
    
    /**
     * Sets the resource ID
     * @param resourceId resource ID
     */
    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }
    
    /**
     * Gets the resource name
     * @return resource name
     */
    public String getResourceName() {
        return resourceName;
    }
    
    /**
     * Sets the resource name
     * @param resourceName resource name
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
    
    /**
     * Gets the event capacity
     * @return capacity
     */
    public int getCapacity() {
        return capacity;
    }
    
    /**
     * Sets the event capacity
     * @param capacity capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    /**
     * Gets the RSVP count
     * @return RSVP count
     */
    public int getRsvpCount() {
        return rsvpCount;
    }
    
    /**
     * Sets the RSVP count
     * @param rsvpCount RSVP count
     */
    public void setRsvpCount(int rsvpCount) {
        this.rsvpCount = rsvpCount;
    }
    
    /**
     * Checks if event is at capacity
     * @return true if at capacity, false otherwise
     */
    public boolean isAtCapacity() {
        return capacity > 0 && rsvpCount >= capacity;
    }
    
    /**
     * Checks if event requires budget
     * @return true if requires budget, false otherwise
     */
    public boolean isRequiresBudget() {
        return requiresBudget;
    }
    
    /**
     * Sets whether event requires budget
     * @param requiresBudget requires budget flag
     */
    public void setRequiresBudget(boolean requiresBudget) {
        this.requiresBudget = requiresBudget;
    }
    
    /**
     * Gets the budget request ID
     * @return budget request ID
     */
    public int getBudgetRequestId() {
        return budgetRequestId;
    }
    
    /**
     * Sets the budget request ID
     * @param budgetRequestId budget request ID
     */
    public void setBudgetRequestId(int budgetRequestId) {
        this.budgetRequestId = budgetRequestId;
    }
    
    /**
     * Gets the estimated cost
     * @return estimated cost
     */
    public double getEstimatedCost() {
        return estimatedCost;
    }
    
    /**
     * Sets the estimated cost
     * @param estimatedCost estimated cost
     */
    public void setEstimatedCost(double estimatedCost) {
        this.estimatedCost = estimatedCost;
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
     * Checks if event is upcoming
     * @return true if event is in the future, false otherwise
     */
    public boolean isUpcoming() {
        return eventDate != null && eventDate.isAfter(LocalDateTime.now());
    }
    
    /**
     * Checks if event is completed
     * @return true if completed, false otherwise
     */
    public boolean isCompleted() {
        return status == Status.COMPLETED;
    }
    
    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", clubName='" + clubName + '\'' +
                ", eventTitle='" + eventTitle + '\'' +
                ", eventType=" + eventType +
                ", status=" + status +
                ", eventDate=" + eventDate +
                ", venue='" + venue + '\'' +
                ", rsvpCount=" + rsvpCount +
                ", capacity=" + capacity +
                '}';
    }
}
