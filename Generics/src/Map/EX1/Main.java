package Map.EX1;

import Map.EX1.model.entities.Candidate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main() {
        String path = "c:\\temp\\votes.csv";

        Map<Candidate, Integer> votes = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] split = line.split(",");
                Candidate candidate = new Candidate(split[0], Integer.parseInt(split[1]));
                int voteAmount = candidate.getVotes() + Integer.parseInt(split[1]);
                if (votes.containsKey(candidate)) {
                    votes.put(candidate, voteAmount);
                } else {
                    votes.put(candidate, candidate.getVotes());
                }
                line = br.readLine();
            }

            for (Candidate candidate : votes.keySet()) {
                System.out.println(candidate.getName() + " " + votes.get(candidate));
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
