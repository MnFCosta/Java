package Composicao.EX2;

import Composicao.EX2.entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    static void main() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime date1 = LocalDateTime.parse("21/06/2018 13:05:44", format);
        Post post1 = new Post(date1, "Travelling to New Zealand", "Im going to visit this wonderful country!", 12);
        post1.addComment("Have a nice trip");
        post1.addComment("Wow that's awesome!");


        LocalDateTime date2 = LocalDateTime.parse("28/07/2018 23:14:19", format);
        Post post2 = new Post(date2, "Good night guys", "See you tomorrow", 5);
        post2.addComment("Good night");
        post2.addComment("May the Force be with you");

        System.out.println(post1);

        System.out.println(post2);
    }
}
