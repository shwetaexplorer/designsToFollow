package com.shweta.chainOfResponsibility;

public class IncidentRequest implements Request {
    private RequestType requestType;
    private String description;

    public IncidentRequest(RequestType requestType, String description) {
        this.requestType = requestType;
        this.description = description;
    }
    @Override
    public RequestType getRequestType() {
        return requestType;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
