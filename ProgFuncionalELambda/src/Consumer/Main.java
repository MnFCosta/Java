package Consumer;

import Comparator.model.entities.Product;
import Consumer.model.util.PriceUpdate;
import Predicate.model.entities.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    static void main() {
        List<Produto> list = new ArrayList<>();

        list.add(new Produto("TV", 900.0));
        list.add(new Produto("Mouse", 50.0));
        list.add(new Produto("Tablet", 350.50));
        list.add(new Produto("HD Case", 80.90));

        //Atualizando preço com uma classe Consumer
        //list.forEach(new PriceUpdate());

        //Reference method para método static
        //list.forEach(Produto::staticProductConsumer);

        //Reference method para metodo não estático
        //list.forEach(Produto::nonStaticProductConsumer);

        //Lambda declarada
        //Consumer<Produto> lambda = p -> p.setValue(p.getValue() * 1.1);
        //list.forEach(lambda);

        //Expressão lambda inline
        list.forEach( p -> p.setValue(p.getValue() * 1.1));

        list.forEach(System.out::println);
    }
}
