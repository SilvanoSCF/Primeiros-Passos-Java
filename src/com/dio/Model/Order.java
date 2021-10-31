package com.dio.Model;

public class Order {

    private final String code;
    int numero = 10;
    
    public Order(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Order{"+code+"}";
    }
    
    
    
    
}
