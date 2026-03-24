package HashCodeEEquals.app1;

import HashCodeEEquals.model.entities.Client;

public class Main {
    static void main() {
        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Alex", "alex@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        System.out.println(c1.equals(c2));
    }
}
