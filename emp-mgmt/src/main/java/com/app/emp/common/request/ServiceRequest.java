package com.app.emp.common.request;

import com.app.emp.common.ServiceHeader;

public class ServiceRequest<T> {
    T payload;
    ServiceHeader headerAttributes;

    public T getPayload() {
        return payload;
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }

    public ServiceHeader getHeaderAttributes() {
        return headerAttributes;
    }

    public void setHeaderAttributes(ServiceHeader headerAttributes) {
        this.headerAttributes = headerAttributes;
    }
}
