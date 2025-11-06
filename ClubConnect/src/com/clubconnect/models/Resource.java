package com.clubconnect.models;

/**
 * Resource model class representing bookable resources like rooms and equipment.
 * Used for event venue booking and resource management.
 * 
 * @author ClubConnect Team
 * @version 1.0
 */
public class Resource {
    
    /**
     * Enum representing resource types
     */
    public enum ResourceType {
        ROOM,           // Meeting room
        AUDITORIUM,     // Auditorium
        HALL,           // Event hall
        EQUIPMENT,      // Equipment (projector, etc.)
        OUTDOOR_SPACE,  // Outdoor venue
        OTHER           // Other resources
    }
    
    private int resourceId;
    private String resourceName;
    private ResourceType resourceType;
    private String location;
    private int capacity;
    private String description;
    private boolean isAvailable;
    private String facilities;  // Comma-separated list of facilities
    
    /**
     * Default constructor
     */
    public Resource() {
        this.isAvailable = true;
    }
    
    /**
     * Parameterized constructor for creating a new resource
     * 
     * @param resourceName Resource name
     * @param resourceType Resource type
     * @param location Location
     * @param capacity Capacity
     */
    public Resource(String resourceName, ResourceType resourceType, 
                   String location, int capacity) {
        this();
        this.resourceName = resourceName;
        this.resourceType = resourceType;
        this.location = location;
        this.capacity = capacity;
    }
    
    // Getters and Setters
    
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
     * Gets the resource type
     * @return resource type
     */
    public ResourceType getResourceType() {
        return resourceType;
    }
    
    /**
     * Sets the resource type
     * @param resourceType resource type
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }
    
    /**
     * Gets the location
     * @return location
     */
    public String getLocation() {
        return location;
    }
    
    /**
     * Sets the location
     * @param location location
     */
    public void setLocation(String location) {
        this.location = location;
    }
    
    /**
     * Gets the capacity
     * @return capacity
     */
    public int getCapacity() {
        return capacity;
    }
    
    /**
     * Sets the capacity
     * @param capacity capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
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
     * Checks if resource is available
     * @return true if available, false otherwise
     */
    public boolean isAvailable() {
        return isAvailable;
    }
    
    /**
     * Sets the availability status
     * @param available availability status
     */
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    
    /**
     * Gets the facilities
     * @return facilities
     */
    public String getFacilities() {
        return facilities;
    }
    
    /**
     * Sets the facilities
     * @param facilities facilities
     */
    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }
    
    @Override
    public String toString() {
        return "Resource{" +
                "resourceId=" + resourceId +
                ", resourceName='" + resourceName + '\'' +
                ", resourceType=" + resourceType +
                ", location='" + location + '\'' +
                ", capacity=" + capacity +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
