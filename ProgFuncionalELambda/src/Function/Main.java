package Function;

import Function.util.UpperCaseName;
import Predicate.model.entities.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    static void main() {
        List<Produto> list = new ArrayList<>();

        list.add(new Produto("TV", 900.0));
        list.add(new Produto("Mouse", 50.0));
        list.add(new Produto("Tablet", 350.50));
        list.add(new Produto("HD Case", 80.90));

        //Usando classe Function
        //List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        //Usando método estático (e uma abreviação do toList)
        //List<String> names = list.stream().map(Produto::staticUpperCaseName).toList();

        //Usando método não estático
        //List<String> names = list.stream().map(Produto::upperCaseName).toList();

        //Usando lambda declarada
        //Function<Produto, String> lambda = p -> p.getName().toUpperCase();
        //List<String> names = list.stream().map(lambda).toList();

        //Lambda Inline
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).toList();

        names.forEach(System.out::println);
    }
}
