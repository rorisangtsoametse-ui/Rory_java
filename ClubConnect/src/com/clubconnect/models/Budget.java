package com.clubconnect.models;

import java.time.LocalDateTime;

/**
 * Budget model class representing budget requests and transactions for clubs.
 * Tracks budget allocations, expenses, and approval workflow.
 * 
 * @author ClubConnect Team
 * @version 1.0
 */
public class Budget {
    
    /**
     * Enum representing budget request status
     */
    public enum Status {
        PENDING,    // Awaiting admin approval
        APPROVED,   // Approved by admin
        REJECTED,   // Rejected by admin
        ALLOCATED   // Funds allocated
    }
    
    /**
     * Enum representing transaction type
     */
    public enum TransactionType {
        ALLOCATION,     // Budget allocation
        EXPENSE,        // Expense/spending
        REVENUE,        // Income/revenue
        ADJUSTMENT      // Budget adjustment
    }
    
    /**
     * Enum representing expense category
     */
    public enum Category {
        EVENT,
        EQUIPMENT,
        MARKETING,
        TRAVEL,
        SUPPLIES,
        VENUE,
        FOOD,
        OTHER
    }
    
    private int budgetId;
    private int clubId;
    private String clubName;  // For display purposes
    private int eventId;  // 0 if not event-specific
    private String eventTitle;  // For display purposes
    private TransactionType transactionType;
    private Category category;
    private double amount;
    private String description;
    private Status status;
    private String rejectionReason;
    private int requestedBy;  // User ID
    private String requestedByName;  // For display
    private int approvedBy;  // User ID (admin)
    private String approvedByName;  // For display
    private LocalDateTime requestedAt;
    private LocalDateTime approvedAt;
    private LocalDateTime transactionDate;
    
    /**
     * Default constructor
     */
    public Budget() {
        this.status = Status.PENDING;
        this.requestedAt = LocalDateTime.now();
        this.transactionDate = LocalDateTime.now();
    }
    
    /**
     * Parameterized constructor for creating a new budget request
     * 
     * @param clubId Club ID
     * @param transactionType Transaction type
     * @param category Budget category
     * @param amount Amount
     * @param description Description
     * @param requestedBy Requester's user ID
     */
    public Budget(int clubId, TransactionType transactionType, Category category,
                  double amount, String description, int requestedBy) {
        this();
        this.clubId = clubId;
        this.transactionType = transactionType;
        this.category = category;
        this.amount = amount;
        this.description = description;
        this.requestedBy = requestedBy;
    }
    
    // Getters and Setters
    
    /**
     * Gets the budget ID
     * @return budget ID
     */
    public int getBudgetId() {
        return budgetId;
    }
    
    /**
     * Sets the budget ID
     * @param budgetId budget ID
     */
    public void setBudgetId(int budgetId) {
        this.budgetId = budgetId;
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
     * Gets the event ID
     * @return event ID (0 if not event-specific)
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
     * Gets the transaction type
     * @return transaction type
     */
    public TransactionType getTransactionType() {
        return transactionType;
    }
    
    /**
     * Sets the transaction type
     * @param transactionType transaction type
     */
    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }
    
    /**
     * Gets the budget category
     * @return category
     */
    public Category getCategory() {
        return category;
    }
    
    /**
     * Sets the budget category
     * @param category category
     */
    public void setCategory(Category category) {
        this.category = category;
    }
    
    /**
     * Gets the amount
     * @return amount
     */
    public double getAmount() {
        return amount;
    }
    
    /**
     * Sets the amount
     * @param amount amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    /**
     * Gets the description
     * @return description
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Sets the description
     * @param description description
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Gets the status
     * @return status
     */
    public Status getStatus() {
        return status;
    }
    
    /**
     * Sets the status
     * @param status status
     */
    public void setStatus(Status status) {
        this.status = status;
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
     * Gets the requester's user ID
     * @return requester user ID
     */
    public int getRequestedBy() {
        return requestedBy;
    }
    
    /**
     * Sets the requester's user ID
     * @param requestedBy requester user ID
     */
    public void setRequestedBy(int requestedBy) {
        this.requestedBy = requestedBy;
    }
    
    /**
     * Gets the requester's name
     * @return requester name
     */
    public String getRequestedByName() {
        return requestedByName;
    }
    
    /**
     * Sets the requester's name
     * @param requestedByName requester name
     */
    public void setRequestedByName(String requestedByName) {
        this.requestedByName = requestedByName;
    }
    
    /**
     * Gets the approver's user ID
     * @return approver user ID
     */
    public int getApprovedBy() {
        return approvedBy;
    }
    
    /**
     * Sets the approver's user ID
     * @param approvedBy approver user ID
     */
    public void setApprovedBy(int approvedBy) {
        this.approvedBy = approvedBy;
    }
    
    /**
     * Gets the approver's name
     * @return approver name
     */
    public String getApprovedByName() {
        return approvedByName;
    }
    
    /**
     * Sets the approver's name
     * @param approvedByName approver name
     */
    public void setApprovedByName(String approvedByName) {
        this.approvedByName = approvedByName;
    }
    
    /**
     * Gets the request timestamp
     * @return request timestamp
     */
    public LocalDateTime getRequestedAt() {
        return requestedAt;
    }
    
    /**
     * Sets the request timestamp
     * @param requestedAt request timestamp
     */
    public void setRequestedAt(LocalDateTime requestedAt) {
        this.requestedAt = requestedAt;
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
     * Gets the transaction date
     * @return transaction date
     */
    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }
    
    /**
     * Sets the transaction date
     * @param transactionDate transaction date
     */
    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }
    
    /**
     * Checks if budget request is pending
     * @return true if pending, false otherwise
     */
    public boolean isPending() {
        return status == Status.PENDING;
    }
    
    /**
     * Checks if budget request is approved
     * @return true if approved, false otherwise
     */
    public boolean isApproved() {
        return status == Status.APPROVED || status == Status.ALLOCATED;
    }
    
    @Override
    public String toString() {
        return "Budget{" +
                "budgetId=" + budgetId +
                ", clubName='" + clubName + '\'' +
                ", transactionType=" + transactionType +
                ", category=" + category +
                ", amount=" + amount +
                ", status=" + status +
                ", requestedAt=" + requestedAt +
                '}';
    }
}
