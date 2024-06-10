package mfc.datastructures;
import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<String>();

//      LinkedList as a stack
//       linkedList.push("A");
//       linkedList.push("B");
//       linkedList.push("C");
//       linkedList.push("D");
//       linkedList.push("F");
//       linkedList.pop();
//      LinkedList as a queue

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        //linkedList.poll();

//      Adding new element to linked list
        linkedList.add(4, "E");

//      Remove element of linked list
        linkedList.remove("E");

//      Searching for element in linkedList
        System.out.println(linkedList.indexOf("F"));

//      Peek at head/tail
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

//      Add node to head/tail
        linkedList.addFirst("0");
        linkedList.addLast("G");

        System.out.println(linkedList);
    }
}
