package Predicate;

import Predicate.model.entities.Produto;
import Predicate.model.entities.MyPredicate;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Produto> list = new ArrayList<>();

        list.add(new Produto("TV", 900.0));
        list.add(new Produto("Mouse", 50.0));
        list.add(new Produto("Tablet", 350.50));
        list.add(new Produto("HD Case", 80.90));

        list.removeIf(new MyPredicate());

        for(Produto produto : list){
            System.out.println(produto.getName());
        }
    }
}
