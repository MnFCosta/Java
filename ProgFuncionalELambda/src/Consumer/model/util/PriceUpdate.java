package Consumer.model.util;

import Predicate.model.entities.Produto;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Produto> {

    @Override
    public void accept(Produto p){
        p.setValue(p.getValue() * 1.1);
    }
}
