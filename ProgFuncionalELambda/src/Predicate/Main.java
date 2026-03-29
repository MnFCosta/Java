package Predicate;

import Predicate.model.entities.Produto;
import Predicate.model.util.MyPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    static void main() {
        List<Produto> list = new ArrayList<>();

        list.add(new Produto("TV", 900.0));
        list.add(new Produto("Mouse", 50.0));
        list.add(new Produto("Tablet", 350.50));
        list.add(new Produto("HD Case", 80.90));

        //Usando classe de predicado
        //list.removeIf(new MyPredicate());

        //Usando method reference como predicado
        //list.removeIf(Produto::staticProductPredicate);

        //Usando método comum
        //list.removeIf(Produto::productPredicate);

        //Usando expressão lambda declarada
        //Predicate<Produto> pred = p -> p.getValue() >= 100;
        //list.removeIf(pred);

        //Expressão lambda inline
        list.removeIf(p -> p.getValue() >= 100);

        for(Produto produto : list){
            System.out.println(produto);
        }
    }
}
