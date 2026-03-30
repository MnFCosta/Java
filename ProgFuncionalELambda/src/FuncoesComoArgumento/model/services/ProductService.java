package FuncoesComoArgumento.model.services;

import Predicate.model.entities.Produto;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filteredSum(List<Produto> list, Predicate<Produto> predicate){
        double sum = 0.0;
        for (Produto p : list){
            if (predicate.test(p)){
                sum += p.getValue();
            }
        }
        return sum;
    }
}
