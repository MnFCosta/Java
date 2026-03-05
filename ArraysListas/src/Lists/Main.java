package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static void main() {

        List<String> list = new ArrayList<>();

        list.add("Manoel");
        list.add("Alex");
        list.add("Jorge");
        list.add("Ana");

        list.add(2,"Walter");

        for(String name : list){
            System.out.println(name);
        }

        System.out.println(list.size());

        System.out.println("--------------------------------------------");

        //Remover usando predicado
        list.removeIf(x -> x.charAt(0) == 'A');

        for(String name : list){
            System.out.println(name);
        }

        System.out.println("--------------------------------------------");

        System.out.println("Index of Walter: " + list.indexOf("Walter"));

        System.out.println("--------------------------------------------");

        //Filtrar lista

        List<String> result = list.stream().filter(x -> x.charAt(1) == 'a').collect(Collectors.toList());

        for(String name: result){
            System.out.println(name);
        }

        System.out.println("--------------------------------------------");

        //Encontrar primeiro elemento que atenda ao predicado

        String firstName = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);

        System.out.println(firstName);

    }
}
