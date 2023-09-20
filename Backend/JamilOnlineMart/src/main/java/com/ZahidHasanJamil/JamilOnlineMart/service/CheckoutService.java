package com.ZahidHasanJamil.JamilOnlineMart.service;


import com.ZahidHasanJamil.JamilOnlineMart.dto.Purchase;
import com.ZahidHasanJamil.JamilOnlineMart.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
