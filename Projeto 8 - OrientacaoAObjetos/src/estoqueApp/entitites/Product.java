package estoqueApp.entitites;

public class Product {
    public String name;
    public double price;
    public int quantity;

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
