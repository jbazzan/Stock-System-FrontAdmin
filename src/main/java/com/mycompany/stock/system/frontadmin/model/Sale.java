package com.mycompany.stock.system.frontadmin.model;

public class Sale {
    private Long id;
    private Long client_id;
    private String date;
    private double total;
    private Long discount_id;
    private double subtotal;

    public Sale(Long id, Long client_id, String date, double total, Long discount_id, double subtotal) {
        this.id = id;
        this.client_id = client_id;
        this.date = date;
        this.total = total;
        this.discount_id = discount_id;
        this.subtotal = subtotal;
    }

    public Sale() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Long getDiscount_id() {
        return discount_id;
    }

    public void setDiscount_id(Long discount_id) {
        this.discount_id = discount_id;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
}
