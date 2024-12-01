package com.shweta.chainOfResponsibility;

public class UsualIncidentHandler implements IncidentHandler{
    private  IncidentHandler nextHandler;

    @Override
    public void handleRequest(Request request) {

        if (request != null) {
            System.out.println("Checking if request will bne handled in  UsualIncidentHandler " );
            if (request != null && request.getRequestType() == RequestType.USUAL) {
                System.out.println("Handling request: of " + request.getRequestType() + " in UsualIncidentHandler");
            } else {
                System.out.println("No , moving to next handler" );
                nextHandler.handleRequest(request);

            }
        } else {
            System.out.println("Handling request: of " + request.getRequestType() + " in UsualIncidentHandler");
        }
    }

    @Override
    public void setNextHandler(IncidentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
