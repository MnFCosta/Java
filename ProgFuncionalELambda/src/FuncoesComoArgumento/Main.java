package FuncoesComoArgumento;

import FuncoesComoArgumento.model.services.ProductService;
import Predicate.model.entities.Produto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Produto> list = new ArrayList<>();

        list.add(new Produto("TV", 900.0));
        list.add(new Produto("Mouse", 50.0));
        list.add(new Produto("Tablet", 350.50));
        list.add(new Produto("HD Case", 80.90));

        ProductService ps = new ProductService();

        System.out.printf("%.2f", ps.filteredSum(list, p -> p.getName().charAt(0) == 'M'));


    }
}
