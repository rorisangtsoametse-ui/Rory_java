package com.clubconnect.models;

import java.time.LocalDateTime;

/**
 * Attendance model class representing attendance records for events and meetings.
 * Tracks member attendance at club events.
 * 
 * @author ClubConnect Team
 * @version 1.0
 */
public class Attendance {
    
    /**
     * Enum representing attendance status
     */
    public enum Status {
        PRESENT,    // Attended
        ABSENT,     // Did not attend
        LATE,       // Attended but late
        EXCUSED     // Excused absence
    }
    
    private int attendanceId;
    private int eventId;
    private String eventTitle;  // For display purposes
    private int userId;
    private String userName;  // For display purposes
    private String studentId;
    private Status status;
    private LocalDateTime checkedInAt;
    private String notes;
    private int markedBy;  // User ID of person who marked attendance
    private LocalDateTime createdAt;
    
    /**
     * Default constructor
     */
    public Attendance() {
        this.status = Status.ABSENT;
        this.createdAt = LocalDateTime.now();
    }
    
    /**
     * Parameterized constructor for creating a new attendance record
     * 
     * @param eventId Event ID
     * @param userId User ID
     * @param status Attendance status
     * @param markedBy User ID of person marking attendance
     */
    public Attendance(int eventId, int userId, Status status, int markedBy) {
        this();
        this.eventId = eventId;
        this.userId = userId;
        this.status = status;
        this.markedBy = markedBy;
        if (status == Status.PRESENT || status == Status.LATE) {
            this.checkedInAt = LocalDateTime.now();
        }
    }
    
    // Getters and Setters
    
    /**
     * Gets the attendance ID
     * @return attendance ID
     */
    public int getAttendanceId() {
        return attendanceId;
    }
    
    /**
     * Sets the attendance ID
     * @param attendanceId attendance ID
     */
    public void setAttendanceId(int attendanceId) {
        this.attendanceId = attendanceId;
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
     * Gets the attendance status
     * @return status
     */
    public Status getStatus() {
        return status;
    }
    
    /**
     * Sets the attendance status
     * @param status status
     */
    public void setStatus(Status status) {
        this.status = status;
    }
    
    /**
     * Gets the check-in timestamp
     * @return check-in timestamp
     */
    public LocalDateTime getCheckedInAt() {
        return checkedInAt;
    }
    
    /**
     * Sets the check-in timestamp
     * @param checkedInAt check-in timestamp
     */
    public void setCheckedInAt(LocalDateTime checkedInAt) {
        this.checkedInAt = checkedInAt;
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
     * Gets the user ID of person who marked attendance
     * @return marked by user ID
     */
    public int getMarkedBy() {
        return markedBy;
    }
    
    /**
     * Sets the user ID of person who marked attendance
     * @param markedBy marked by user ID
     */
    public void setMarkedBy(int markedBy) {
        this.markedBy = markedBy;
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
     * Checks if user was present
     * @return true if present or late, false otherwise
     */
    public boolean wasPresent() {
        return status == Status.PRESENT || status == Status.LATE;
    }
    
    @Override
    public String toString() {
        return "Attendance{" +
                "attendanceId=" + attendanceId +
                ", eventTitle='" + eventTitle + '\'' +
                ", userName='" + userName + '\'' +
                ", studentId='" + studentId + '\'' +
                ", status=" + status +
                ", checkedInAt=" + checkedInAt +
                '}';
    }
}
