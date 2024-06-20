package mfc.datastructures;
import java.util.*;

public class HashTable {
    public static void main(String[] args){
        Hashtable<String,String> table = new Hashtable<>(21);

//      Add items to hashtable
        table.put("100", "Manoel");
        table.put("123", "Pedro");
        table.put("321", "Alexandre");
        table.put("555", "Samuel");
        table.put("777", "Michel");

//      Remove an item from a hashtable
        //table.remove(777);

//      Iterate through a hashtable
        for(String key : table.keySet()){
            System.out.println(key.hashCode() % 11 + "\t" + key + "\t" + table.get(key));
        }

    }

}
