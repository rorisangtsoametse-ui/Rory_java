package com.clubconnect.models;

import java.time.LocalDateTime;

/**
 * User model class representing a user in the ClubConnect system.
 * Supports multiple roles: ADMIN, LEADER, MEMBER, GUEST
 * 
 * @author ClubConnect Team
 * @version 1.0
 */
public class User {
    
    /**
     * Enum representing user roles in the system
     */
    public enum Role {
        ADMIN,      // University staff/advisor with full system access
        LEADER,     // Club president/leader managing specific clubs
        MEMBER,     // Regular student member
        GUEST       // Unauthenticated user with limited access
    }
    
    private int userId;
    private String studentId;
    private String username;
    private String password;  // Should be hashed
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Role role;
    private boolean isActive;
    private LocalDateTime createdAt;
    private LocalDateTime lastLogin;
    
    /**
     * Default constructor
     */
    public User() {
        this.isActive = true;
        this.createdAt = LocalDateTime.now();
        this.role = Role.MEMBER;
    }
    
    /**
     * Parameterized constructor for creating a new user
     * 
     * @param studentId Unique student ID
     * @param username Username for login
     * @param password Hashed password
     * @param email Email address
     * @param firstName First name
     * @param lastName Last name
     * @param role User role
     */
    public User(String studentId, String username, String password, String email, 
                String firstName, String lastName, Role role) {
        this();
        this.studentId = studentId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }
    
    // Getters and Setters
    
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
     * Gets the username
     * @return username
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * Sets the username
     * @param username username
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * Gets the password (hashed)
     * @return hashed password
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * Sets the password (should be hashed before setting)
     * @param password hashed password
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * Gets the email address
     * @return email address
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * Sets the email address
     * @param email email address
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * Gets the first name
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Sets the first name
     * @param firstName first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    /**
     * Gets the last name
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * Sets the last name
     * @param lastName last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /**
     * Gets the full name
     * @return full name (firstName + lastName)
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    /**
     * Gets the phone number
     * @return phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    /**
     * Sets the phone number
     * @param phoneNumber phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    /**
     * Gets the user role
     * @return user role
     */
    public Role getRole() {
        return role;
    }
    
    /**
     * Sets the user role
     * @param role user role
     */
    public void setRole(Role role) {
        this.role = role;
    }
    
    /**
     * Checks if user is active
     * @return true if active, false otherwise
     */
    public boolean isActive() {
        return isActive;
    }
    
    /**
     * Sets the active status
     * @param active active status
     */
    public void setActive(boolean active) {
        isActive = active;
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
     * Gets the last login timestamp
     * @return last login timestamp
     */
    public LocalDateTime getLastLogin() {
        return lastLogin;
    }
    
    /**
     * Sets the last login timestamp
     * @param lastLogin last login timestamp
     */
    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }
    
    /**
     * Checks if user is an admin
     * @return true if admin, false otherwise
     */
    public boolean isAdmin() {
        return role == Role.ADMIN;
    }
    
    /**
     * Checks if user is a club leader
     * @return true if leader, false otherwise
     */
    public boolean isLeader() {
        return role == Role.LEADER;
    }
    
    /**
     * Checks if user is a member
     * @return true if member, false otherwise
     */
    public boolean isMember() {
        return role == Role.MEMBER;
    }
    
    /**
     * Checks if user is a guest
     * @return true if guest, false otherwise
     */
    public boolean isGuest() {
        return role == Role.GUEST;
    }
    
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", studentId='" + studentId + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", role=" + role +
                ", isActive=" + isActive +
                '}';
    }
}
