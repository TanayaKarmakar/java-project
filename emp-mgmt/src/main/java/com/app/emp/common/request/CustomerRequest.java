package com.app.emp.common.request;


import java.util.List;

public class CustomerRequest {
    private String id;
    private Long customerId;
    private String name;
    private String city;
    private List<OrderRequest> orders;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<OrderRequest> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderRequest> orders) {
        this.orders = orders;
    }
}
