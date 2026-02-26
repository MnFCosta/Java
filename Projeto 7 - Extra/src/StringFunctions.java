public class StringFunctions {
    static void main() {
        String s = "a b c d e f g";

        s = s.toUpperCase().trim();
        String s02 = s.substring(2);
        String s03 = s.substring(3, 6);
        String s04 = s.replace(" ", "-");

        System.out.println(s);
        System.out.println(s02);
        System.out.println(s03);
        System.out.println(s04);

        String[] wordVect = s.split(" ");

        for (int i = 0; i < wordVect.length; i++) {
            System.out.println(wordVect[i]);
        }

    }
}
