package com.shweta.chainOfResponsibility;

public class CHRAppMAin {
    public static void main(String[] args) {
        IncidentHandler usualIncidentHandler = new UsualIncidentHandler();
        IncidentHandler majorIncidentHandler = new MajorIncidentHandler();
        IncidentHandler criticalIncidentHandler = new CriticalIncidentHandler();
        usualIncidentHandler.setNextHandler(majorIncidentHandler);
        majorIncidentHandler.setNextHandler(criticalIncidentHandler);
        criticalIncidentHandler.setNextHandler(usualIncidentHandler);

        Request request1 = new IncidentRequest(RequestType.CRITICAL , "Critical Request");
        usualIncidentHandler.handleRequest(request1);



    }
}
