package com.pos.pi_cafe.models;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Order {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long OrderId;
    private Long customerId;
    private Long storeId;
    private Date date;
    private double price;
    private String orderMode;

    public void setOrderId(Long orderId) {
        this.OrderId = OrderId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Date getDate() {
        return date;
    }
}