package Comparator;

import Comparator.model.entities.MyComparator;
import Comparator.model.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    static void main() {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        //Usando classe que implementa Comparator
        //list.sort(new MyComparator());

        //Usando sintaxe de classe anônima
        /*Comparator<Product> comp = new Comparator<Product>() {

            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };*/

        //Utilizando expressões lambda
        /*Comparator<Product> comp = (p1,p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };*/

        //Melhorando a implementação
        Comparator<Product> comp = (p1,p2) -> - p1.getPrice().compareTo(p2.getPrice());

        list.sort(comp);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
