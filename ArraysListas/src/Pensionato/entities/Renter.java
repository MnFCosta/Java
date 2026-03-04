package Pensionato.entities;

public class Renter {
    String name;
    String email;
    int room;

    public Renter(String name, String email, int room){
        this.name = name;
        this.email = email;
        this.room = room;
    }

    public String toString(){
        return String.format("Renter Data:%n" +
                                    "Name: %s%n" +
                                    "Email: %s%n" +
                                    "Room: %d%n", this.name, this.email, this.room);
    }

}
