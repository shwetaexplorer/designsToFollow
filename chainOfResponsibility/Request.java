package com.shweta.chainOfResponsibility;

public interface Request {
    RequestType getRequestType();
    String getDescription();
}
