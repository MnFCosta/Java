package Composicao.EX3.entities;

import java.time.format.DateTimeFormatter;

public class OrderItem {
    private Product product;
    private Integer quantity;
    private Double price;

    public OrderItem(Product product, Integer quantity){
        this.product = product;
        this.quantity = quantity;
        this.price = product.getPrice();
    }

    public Double subTotal(){
        return this.quantity * this.price;
    }

    public String toString(){
        return String.format("%s, $%.2f, Quantity: %d, Subtotal: $%.2f", this.product.getName(), this.price, this.quantity, subTotal());
    }
}
