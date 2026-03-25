package Set.app4;

import Set.app4.model.entities.Product;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    static void main() {
        Set<Product> set = new TreeSet<>();
        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));
        for (Product p : set) {
            System.out.println(p);
        }
    }
}
