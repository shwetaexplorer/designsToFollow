package com.shweta.chainOfResponsibility;

public class CriticalIncidentHandler implements IncidentHandler{
    private  IncidentHandler nextHandler;
    @Override
    public void handleRequest(Request request) {
        if (request != null) {
            System.out.println("Checking if request will bne handled in  CriticalIncidentHandler " );
            if (request != null && request.getRequestType() == RequestType.CRITICAL) {
                System.out.println("Handling request: of " + request.getRequestType() + " in CriticalIncidentHandler");
            } else {
                nextHandler.handleRequest(request);

            }
        } else {
            System.out.println("Handling request: of " + request.getRequestType() + " in CriticalIncidentHandler");
        }
    }

    @Override
    public void setNextHandler(IncidentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
