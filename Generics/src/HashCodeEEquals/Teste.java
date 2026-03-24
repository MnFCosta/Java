package HashCodeEEquals;

public class Teste {
    static void main() {
        String a = "Maria";
        String b = "Alex";

        System.out.println(a.equals(b));

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
