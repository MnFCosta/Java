package Construtores.entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity){
            this.name = name;
            this.price = price;
            this.quantity = quantity;
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return this.price;
    }

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProduts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return String.format("Product data: %s, $ %.2f, %d units, Total: $ %.2f\n", name, price, quantity, totalValueInStock());
    }


}
