package com.ZahidHasanJamil.JamilOnlineMart.dto;

import com.ZahidHasanJamil.JamilOnlineMart.entity.Address;
import com.ZahidHasanJamil.JamilOnlineMart.entity.Customer;
import com.ZahidHasanJamil.JamilOnlineMart.entity.Order;
import com.ZahidHasanJamil.JamilOnlineMart.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
