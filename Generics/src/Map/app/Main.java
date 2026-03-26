package Map.app;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    static void main() {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99711122");

        cookies.remove("email");
        cookies.put("phone", "99711133");

        System.out.println(cookies.containsKey("phone"));
        System.out.println(cookies.get("email"));
        System.out.println(cookies.size());

        for (String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
