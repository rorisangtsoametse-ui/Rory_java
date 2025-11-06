package com.clubconnect.models;

import java.time.LocalDateTime;

/**
 * Discussion model class representing discussion board posts and comments.
 * Used for club and event discussions.
 * 
 * @author ClubConnect Team
 * @version 1.0
 */
public class Discussion {
    
    /**
     * Enum representing discussion types
     */
    public enum DiscussionType {
        CLUB_DISCUSSION,    // General club discussion
        EVENT_DISCUSSION,   // Event-specific discussion
        ANNOUNCEMENT,       // Announcement with comments
        POLL               // Poll/survey
    }
    
    private int discussionId;
    private int clubId;
    private String clubName;  // For display purposes
    private int eventId;  // 0 if not event-specific
    private String eventTitle;  // For display purposes
    private DiscussionType type;
    private String title;
    private String content;
    private int postedBy;  // User ID
    private String postedByName;  // For display purposes
    private int parentId;  // 0 if top-level post, otherwise reply to another post
    private boolean isPinned;
    private boolean isModerated;
    private int replyCount;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    
    /**
     * Default constructor
     */
    public Discussion() {
        this.isPinned = false;
        this.isModerated = false;
        this.replyCount = 0;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }
    
    /**
     * Parameterized constructor for creating a new discussion post
     * 
     * @param clubId Club ID
     * @param type Discussion type
     * @param title Discussion title
     * @param content Discussion content
     * @param postedBy Poster's user ID
     */
    public Discussion(int clubId, DiscussionType type, String title, 
                     String content, int postedBy) {
        this();
        this.clubId = clubId;
        this.type = type;
        this.title = title;
        this.content = content;
        this.postedBy = postedBy;
    }
    
    // Getters and Setters
    
    /**
     * Gets the discussion ID
     * @return discussion ID
     */
    public int getDiscussionId() {
        return discussionId;
    }
    
    /**
     * Sets the discussion ID
     * @param discussionId discussion ID
     */
    public void setDiscussionId(int discussionId) {
        this.discussionId = discussionId;
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
     * Gets the discussion type
     * @return discussion type
     */
    public DiscussionType getType() {
        return type;
    }
    
    /**
     * Sets the discussion type
     * @param type discussion type
     */
    public void setType(DiscussionType type) {
        this.type = type;
    }
    
    /**
     * Gets the discussion title
     * @return title
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * Sets the discussion title
     * @param title title
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
    /**
     * Gets the discussion content
     * @return content
     */
    public String getContent() {
        return content;
    }
    
    /**
     * Sets the discussion content
     * @param content content
     */
    public void setContent(String content) {
        this.content = content;
    }
    
    /**
     * Gets the poster's user ID
     * @return poster user ID
     */
    public int getPostedBy() {
        return postedBy;
    }
    
    /**
     * Sets the poster's user ID
     * @param postedBy poster user ID
     */
    public void setPostedBy(int postedBy) {
        this.postedBy = postedBy;
    }
    
    /**
     * Gets the poster's name
     * @return poster name
     */
    public String getPostedByName() {
        return postedByName;
    }
    
    /**
     * Sets the poster's name
     * @param postedByName poster name
     */
    public void setPostedByName(String postedByName) {
        this.postedByName = postedByName;
    }
    
    /**
     * Gets the parent discussion ID
     * @return parent ID (0 if top-level)
     */
    public int getParentId() {
        return parentId;
    }
    
    /**
     * Sets the parent discussion ID
     * @param parentId parent ID
     */
    public void setParentId(int parentId) {
        this.parentId = parentId;
    }
    
    /**
     * Checks if discussion is pinned
     * @return true if pinned, false otherwise
     */
    public boolean isPinned() {
        return isPinned;
    }
    
    /**
     * Sets the pinned status
     * @param pinned pinned status
     */
    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }
    
    /**
     * Checks if discussion is moderated
     * @return true if moderated, false otherwise
     */
    public boolean isModerated() {
        return isModerated;
    }
    
    /**
     * Sets the moderated status
     * @param moderated moderated status
     */
    public void setModerated(boolean moderated) {
        isModerated = moderated;
    }
    
    /**
     * Gets the reply count
     * @return reply count
     */
    public int getReplyCount() {
        return replyCount;
    }
    
    /**
     * Sets the reply count
     * @param replyCount reply count
     */
    public void setReplyCount(int replyCount) {
        this.replyCount = replyCount;
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
     * Checks if this is a top-level post
     * @return true if top-level, false if reply
     */
    public boolean isTopLevel() {
        return parentId == 0;
    }
    
    @Override
    public String toString() {
        return "Discussion{" +
                "discussionId=" + discussionId +
                ", clubName='" + clubName + '\'' +
                ", type=" + type +
                ", title='" + title + '\'' +
                ", postedByName='" + postedByName + '\'' +
                ", replyCount=" + replyCount +
                ", createdAt=" + createdAt +
                '}';
    }
}
