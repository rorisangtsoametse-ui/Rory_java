package com.clubconnect.models;

import java.time.LocalDateTime;

/**
 * Membership model class representing a user's membership in a club.
 * Tracks membership status and application workflow.
 * 
 * @author ClubConnect Team
 * @version 1.0
 */
public class Membership {
    
    /**
     * Enum representing membership status
     */
    public enum Status {
        PENDING,    // Application pending approval
        ACTIVE,     // Active member
        REJECTED,   // Application rejected
        ALUMNI,     // Former member
        SUSPENDED   // Temporarily suspended
    }
    
    private int membershipId;
    private int userId;
    private String userName;  // For display purposes
    private String studentId;
    private int clubId;
    private String clubName;  // For display purposes
    private Status status;
    private String applicationMessage;
    private String rejectionReason;
    private LocalDateTime appliedAt;
    private LocalDateTime approvedAt;
    private LocalDateTime updatedAt;
    
    /**
     * Default constructor
     */
    public Membership() {
        this.status = Status.PENDING;
        this.appliedAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }
    
    /**
     * Parameterized constructor for creating a new membership application
     * 
     * @param userId User ID
     * @param clubId Club ID
     * @param applicationMessage Application message
     */
    public Membership(int userId, int clubId, String applicationMessage) {
        this();
        this.userId = userId;
        this.clubId = clubId;
        this.applicationMessage = applicationMessage;
    }
    
    // Getters and Setters
    
    /**
     * Gets the membership ID
     * @return membership ID
     */
    public int getMembershipId() {
        return membershipId;
    }
    
    /**
     * Sets the membership ID
     * @param membershipId membership ID
     */
    public void setMembershipId(int membershipId) {
        this.membershipId = membershipId;
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
     * Gets the student ID
     * @return student ID
     */
    public String getStudentId() {
        return studentId;
    }
    
    /**
     * Sets the student ID
     * @param studentId student ID
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
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
     * Gets the membership status
     * @return status
     */
    public Status getStatus() {
        return status;
    }
    
    /**
     * Sets the membership status
     * @param status status
     */
    public void setStatus(Status status) {
        this.status = status;
    }
    
    /**
     * Gets the application message
     * @return application message
     */
    public String getApplicationMessage() {
        return applicationMessage;
    }
    
    /**
     * Sets the application message
     * @param applicationMessage application message
     */
    public void setApplicationMessage(String applicationMessage) {
        this.applicationMessage = applicationMessage;
    }
    
    /**
     * Gets the rejection reason
     * @return rejection reason
     */
    public String getRejectionReason() {
        return rejectionReason;
    }
    
    /**
     * Sets the rejection reason
     * @param rejectionReason rejection reason
     */
    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }
    
    /**
     * Gets the application timestamp
     * @return application timestamp
     */
    public LocalDateTime getAppliedAt() {
        return appliedAt;
    }
    
    /**
     * Sets the application timestamp
     * @param appliedAt application timestamp
     */
    public void setAppliedAt(LocalDateTime appliedAt) {
        this.appliedAt = appliedAt;
    }
    
    /**
     * Gets the approval timestamp
     * @return approval timestamp
     */
    public LocalDateTime getApprovedAt() {
        return approvedAt;
    }
    
    /**
     * Sets the approval timestamp
     * @param approvedAt approval timestamp
     */
    public void setApprovedAt(LocalDateTime approvedAt) {
        this.approvedAt = approvedAt;
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
     * Checks if membership is pending
     * @return true if pending, false otherwise
     */
    public boolean isPending() {
        return status == Status.PENDING;
    }
    
    /**
     * Checks if membership is active
     * @return true if active, false otherwise
     */
    public boolean isActive() {
        return status == Status.ACTIVE;
    }
    
    /**
     * Checks if membership is rejected
     * @return true if rejected, false otherwise
     */
    public boolean isRejected() {
        return status == Status.REJECTED;
    }
    
    @Override
    public String toString() {
        return "Membership{" +
                "membershipId=" + membershipId +
                ", userName='" + userName + '\'' +
                ", clubName='" + clubName + '\'' +
                ", status=" + status +
                ", appliedAt=" + appliedAt +
                '}';
    }
}
