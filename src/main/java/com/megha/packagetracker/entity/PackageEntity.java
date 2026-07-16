package com.megha.packagetracker.entity;

public class PackageEntity {
	private Long id;
	private String trackingId;
    private String courierName;
    private String sender;
    private String receiver;
    private String status;
    
    public PackageEntity() {
    	
    }
    
    public PackageEntity(Long id, String trackingId,String courierName,
            String sender, String receiver, String status) {
    	   this.id = id;
           this.trackingId = trackingId;
           this.courierName = courierName;
           this.sender = sender;
           this.receiver = receiver;
           this.status = status;
    }
    
    public Long getId() {
    	return id;
    }
    
    public void setId(Long id) {
    	this.id=id;
    	}
    
    public String getTracking() {
    	return trackingId;
    }
    
    public void setTrackingId(String trackingId) {
    	this.trackingId=trackingId;
    }
    
    public String getCourierName() {
        return courierName;
    }

    public void setCourierName(String courierName) {
        this.courierName = courierName;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
