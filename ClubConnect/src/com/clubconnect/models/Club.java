package com.clubconnect.models;

import java.time.LocalDateTime;

/**
 * Club model class representing a university club in the ClubConnect system.
 * 
 * @author ClubConnect Team
 * @version 1.0
 */
public class Club {
    
    /**
     * Enum representing club status
     */
    public enum Status {
        PENDING,    // Awaiting admin approval
        ACTIVE,     // Approved and operational
        INACTIVE,   // Temporarily inactive
        ARCHIVED    // Permanently archived
    }
    
    /**
     * Enum representing club categories
     */
    public enum Category {
        ACADEMIC,
        SPORTS,
        ARTS,
        TECHNOLOGY,
        SOCIAL,
        CULTURAL,
        VOLUNTEER,
        OTHER
    }
    
    private int clubId;
    private String clubName;
    private String description;
    private String missionStatement;
    private Category category;
    private Status status;
    private int leaderId;  // User ID of the club leader
    private String leaderName;  // For display purposes
    private double budget;
    private int memberCount;
    private int maxMembers;  // 0 means unlimited
    private String logoPath;
    private String contactEmail;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    
    /**
     * Default constructor
     */
    public Club() {
        this.status = Status.PENDING;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.memberCount = 0;
        this.maxMembers = 0;
        this.budget = 0.0;
    }
    
    /**
     * Parameterized constructor for creating a new club
     * 
     * @param clubName Name of the club
     * @param description Club description
     * @param missionStatement Mission statement
     * @param category Club category
     * @param leaderId Leader's user ID
     * @param budget Initial budget
     */
    public Club(String clubName, String description, String missionStatement, 
                Category category, int leaderId, double budget) {
        this();
        this.clubName = clubName;
        this.description = description;
        this.missionStatement = missionStatement;
        this.category = category;
        this.leaderId = leaderId;
        this.budget = budget;
    }
    
    // Getters and Setters
    
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
     * Gets the club description
     * @return description
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Sets the club description
     * @param description description
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Gets the mission statement
     * @return mission statement
     */
    public String getMissionStatement() {
        return missionStatement;
    }
    
    /**
     * Sets the mission statement
     * @param missionStatement mission statement
     */
    public void setMissionStatement(String missionStatement) {
        this.missionStatement = missionStatement;
    }
    
    /**
     * Gets the club category
     * @return category
     */
    public Category getCategory() {
        return category;
    }
    
    /**
     * Sets the club category
     * @param category category
     */
    public void setCategory(Category category) {
        this.category = category;
    }
    
    /**
     * Gets the club status
     * @return status
     */
    public Status getStatus() {
        return status;
    }
    
    /**
     * Sets the club status
     * @param status status
     */
    public void setStatus(Status status) {
        this.status = status;
    }
    
    /**
     * Gets the leader ID
     * @return leader ID
     */
    public int getLeaderId() {
        return leaderId;
    }
    
    /**
     * Sets the leader ID
     * @param leaderId leader ID
     */
    public void setLeaderId(int leaderId) {
        this.leaderId = leaderId;
    }
    
    /**
     * Gets the leader name
     * @return leader name
     */
    public String getLeaderName() {
        return leaderName;
    }
    
    /**
     * Sets the leader name
     * @param leaderName leader name
     */
    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }
    
    /**
     * Gets the club budget
     * @return budget
     */
    public double getBudget() {
        return budget;
    }
    
    /**
     * Sets the club budget
     * @param budget budget
     */
    public void setBudget(double budget) {
        this.budget = budget;
    }
    
    /**
     * Gets the member count
     * @return member count
     */
    public int getMemberCount() {
        return memberCount;
    }
    
    /**
     * Sets the member count
     * @param memberCount member count
     */
    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }
    
    /**
     * Gets the maximum members allowed
     * @return max members (0 = unlimited)
     */
    public int getMaxMembers() {
        return maxMembers;
    }
    
    /**
     * Sets the maximum members allowed
     * @param maxMembers max members (0 = unlimited)
     */
    public void setMaxMembers(int maxMembers) {
        this.maxMembers = maxMembers;
    }
    
    /**
     * Checks if club has reached capacity
     * @return true if at capacity, false otherwise
     */
    public boolean isAtCapacity() {
        return maxMembers > 0 && memberCount >= maxMembers;
    }
    
    /**
     * Gets the logo file path
     * @return logo path
     */
    public String getLogoPath() {
        return logoPath;
    }
    
    /**
     * Sets the logo file path
     * @param logoPath logo path
     */
    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }
    
    /**
     * Gets the contact email
     * @return contact email
     */
    public String getContactEmail() {
        return contactEmail;
    }
    
    /**
     * Sets the contact email
     * @param contactEmail contact email
     */
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
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
     * Checks if club is active
     * @return true if active, false otherwise
     */
    public boolean isActive() {
        return status == Status.ACTIVE;
    }
    
    /**
     * Checks if club is pending approval
     * @return true if pending, false otherwise
     */
    public boolean isPending() {
        return status == Status.PENDING;
    }
    
    @Override
    public String toString() {
        return "Club{" +
                "clubId=" + clubId +
                ", clubName='" + clubName + '\'' +
                ", category=" + category +
                ", status=" + status +
                ", leaderName='" + leaderName + '\'' +
                ", memberCount=" + memberCount +
                ", budget=" + budget +
                '}';
    }
}
