package Set.EX1.entities;

import java.time.Instant;
import java.util.Objects;

public class Log implements Comparable<Log>{
    private String username;
    private Instant accessTime;

    public Log(String username, Instant accessTime){
        this.username = username;
        this.accessTime = accessTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Instant getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(Instant accessTime) {
        this.accessTime = accessTime;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Log log = (Log) o;
        return Objects.equals(username, log.username);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(username);
    }

    @Override
    public String toString() {
        return "Log{" +
                "username='" + username + '\'' +
                ", accessTime=" + accessTime +
                '}';
    }

    public int compareTo(Log log){
        int usernameComparison = this.username.compareTo(log.getUsername());
        if (usernameComparison != 0) return usernameComparison;

        return 0;
    }

}
