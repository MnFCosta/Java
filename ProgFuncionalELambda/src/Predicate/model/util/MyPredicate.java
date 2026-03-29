package Predicate.model.util;

import Predicate.model.entities.Produto;

import java.util.function.Predicate;

public class  MyPredicate implements Predicate<Produto> {

    @Override
    public boolean test(Produto p) {
        return p.getValue() >= 100.0;
    }
}
