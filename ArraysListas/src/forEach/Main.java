package forEach;

public class Main {
    static void main() {
        String[] vect = new String[] {"Maria", "João", "Alex\n"};

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        for (String obj: vect){
            System.out.println(obj);
        }
    }
}
