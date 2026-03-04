package Pensionato;

import Pensionato.entities.Renter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Renter[] rooms = new Renter[10];

        int control = 0;

        while(control != 1){

            System.out.println("RENTER MANAGER");
            System.out.println("1 - Register new renter(s)" + "\n2 - Show renters" + "\n3 - Exit");

            int scase = sc.nextInt();

            switch (scase){
                case 1:
                    System.out.println("How many rooms will be rented?");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.printf("RENT #%d%n", i+1);
                        System.out.print("Renter name: ");
                        sc.nextLine();
                        String name = sc.nextLine();
                        System.out.print("Renter email: ");
                        String email = sc.nextLine();
                        System.out.print("Renter room (0 to 9): ");
                        int room = sc.nextInt();
                        rooms[room] = new Renter(name, email, room);
                    }
                break;

                case 2:
                    System.out.println("Busy rooms:");
                    for (int i = 0; i < rooms.length; i++) {
                        if (rooms[i] != null){
                            System.out.printf("ROOM #%d:%n", i);
                            System.out.println(rooms[i]);
                        }
                    }
                break;

                case 3:
                    System.out.println("Exiting.......");
                    control = 1;
                    break;


                default:
                    System.out.println("Invalid number selected");
            }
        }

    }
}
