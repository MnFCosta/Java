package Set.EX1;

import Set.EX1.entities.Log;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    static void main() {
        Set<Log> logs = new HashSet<>();
        String path = "c:\\temp\\logs.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while (line != null){
                logs.add(new Log(line.split(" ")[0], Instant.parse(line.split(" ")[1])));
                line = br.readLine();
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println(logs.size());

        for (Log log : logs){
            System.out.println(log.toString());
        }
    }
}
