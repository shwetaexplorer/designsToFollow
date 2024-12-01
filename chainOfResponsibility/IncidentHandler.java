package com.shweta.chainOfResponsibility;

public interface IncidentHandler {

   void handleRequest(Request request);
    void setNextHandler(IncidentHandler nextHandler);
}
