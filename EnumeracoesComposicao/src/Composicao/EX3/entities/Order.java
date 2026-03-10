package Composicao.EX3.entities;

import Composicao.EX3.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final LocalDateTime moment = LocalDateTime.now();
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<>();
    private Client client;

    public Order(OrderStatus status, Client client){
        this.status = status;
        this.client = client;
    }

    public void addItem(OrderItem item){
        this.items.add(item);
    }

    public void removeItem(OrderItem item){
        this.items.add(item);
    }

    public Double total(){
        Double total = 0.0;

        for (OrderItem item: this.items){
            total += item.subTotal();
        }

        return total;
    }

    public void orderSummary(){
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("ORDER SUMMARY: ");
        System.out.printf("Order moment: %s%n", moment.format(format2));
        System.out.printf("Order status: %s%n", status);
        System.out.printf("Client: %s (%s) - %s%n", this.client.getName(), this.client.getBirthDate().format(format1), this.client.getEmail());
        System.out.printf("Order items: %n%s", printOrderItems());
        System.out.printf("Total price: $%.2f", total());
    }

    public String printOrderItems(){
        StringBuilder sb = new StringBuilder();

        for (OrderItem item : items){
            sb.append(item.toString()).append("\n");
        }

        return sb.toString();
    }




}
