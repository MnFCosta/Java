package Set.app3;

import Set.app3.model.entities.Product;
import Set.app3.model.entities.ProductSemHash;

import java.util.HashSet;
import java.util.Set;

public class Main {
    static void main() {
        Set<ProductSemHash> setSemHash = new HashSet<>();
        setSemHash.add(new ProductSemHash("TV", 900.0));
        setSemHash.add(new ProductSemHash("Notebook", 1200.0));
        setSemHash.add(new ProductSemHash("Tablet", 400.0));


        Set<Product> set = new HashSet<>();
        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        ProductSemHash prod = new ProductSemHash("Notebook", 1200.0);
        Product prod2 = new Product("Notebook", 1200.0);


        System.out.println(set.contains(prod));
        System.out.println(set.contains(prod2));
    }
}
