package com.app.emp.common.response;

import org.springframework.http.HttpStatus;

public class ServiceResponse<T> {
    T responsePayload;
    HttpStatus status;

    public T getResponsePayload() {
        return responsePayload;
    }

    public void setResponsePayload(T responsePayload) {
        this.responsePayload = responsePayload;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
