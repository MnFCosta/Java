package Function.util;

import Predicate.model.entities.Produto;

import java.util.function.Function;

public class UpperCaseName implements Function<Produto, String> {

    public String apply(Produto p){
        return p.getName().toUpperCase();
    }

}
