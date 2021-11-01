package com.dio.Model;

public class Order {

    private final String code;
    int numero = 10;

    /**
     * Método Construtor
     * @param code
     */
    public Order(String code) {
        this.code = code;
    }

    /**
     * Retorna o valor que será inserido em Main.
     * @return
     */
    @Override
    public String toString() {
        return "Order{"+code+"}";
    }
    
    
    
    
}
