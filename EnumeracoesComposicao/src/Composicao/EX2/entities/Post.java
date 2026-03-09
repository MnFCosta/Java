package Composicao.EX2.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private LocalDateTime moment;
    private String title;
    private String content;
    private Integer likes;
    private List<Comment> comments = new ArrayList<>();

    public Post (LocalDateTime moment, String title, String content, Integer likes){
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public void addComment (String comment){
        this.comments.add(new Comment(comment));
    }

    public String toString(){
        return String.format("%s%n"
                            + "%d Likes - %s%n"
                            + "%s%n"
                            + "Comments:%n%s", this.title, this.likes, this.moment.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")), this.content, printComments());
    }

    public String printComments() {
        StringBuilder sb = new StringBuilder();
        for (Comment comment : comments) {
            sb.append(comment.getText()).append("\n");
        }
        return sb.toString();
    }
}
