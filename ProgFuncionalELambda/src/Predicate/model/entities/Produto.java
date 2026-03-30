package Predicate.model.entities;

public class Produto {
    private String name;
    private Double value;

    public Produto(String name, Double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public static boolean staticProductPredicate(Produto p){
        return p.getValue() >= 100;
    }

    public boolean productPredicate(){
        return this.value >= 100;
    }

    public void nonStaticProductConsumer(){
        this.value = this.value * 1.1;
    }

    public static void staticProductConsumer(Produto p){
        p.setValue(p.getValue() * 1.1);
    }

    public static String staticUpperCaseName(Produto p){
        return p.getName().toUpperCase();
    }

    public String upperCaseName(){
        return this.name.toUpperCase();
    }

    @Override
    public String toString() {
        return String.format("Produto: %s, %.2f", this.name, this.value);
    }
}
