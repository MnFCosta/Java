package EX1.model.entities;

public class Prod implements Comparable<Prod>{
    private String name;
    private Double price;

    public Prod(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Prod p) {
        return - this.name.compareTo(p.getName());
    }
}
