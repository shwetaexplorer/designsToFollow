package com.shweta.chainOfResponsibility;

public class MajorIncidentHandler implements IncidentHandler{
    private  IncidentHandler nextHandler;
    @Override
    public void handleRequest(Request request) {
        if (request != null) {
            System.out.println("Checking if request will bne handled in  MajorIncidentHandler " );
            if (request != null && request.getRequestType() == RequestType.MAJOR) {
                System.out.println("Handling request: of " + request.getRequestType() + " in MajorIncidentHandler");
            } else {
                System.out.println("No, moving to next handler " );
                nextHandler.handleRequest(request);

            }
        } else {
            System.out.println("Handling request: of " + request.getRequestType() + " in MajorIncidentHandler");
        }
    }

    @Override
    public void setNextHandler(IncidentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
