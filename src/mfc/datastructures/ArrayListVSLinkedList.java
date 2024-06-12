package mfc.datastructures;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVSLinkedList {
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for(int i = 0; i < 1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }

//      LinkedList
        startTime = System.nanoTime();

//      Testing element access times with LinkedLists, head and tail elements are quickly accessed due to doubly LinkedLists implementation,
//      but elements in the middle take a long time to access because starting from the head or the tail of the list doesn't matter.
        //linkedList.get(0);
        //linkedList.get(500000);
        //linkedList.get(999999);

//      Deleting elements in LinkedLists is faster on the head due to not needing to shift elements, but much slower in the middle of the list,
//      and still slower than ArrayLists at the tail, even though it is a doubly LinkedList

        //linkedList.remove(0);
        //linkedList.remove(500000);
        //linkedList.remove(999999);

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.printf("LinkedList elapsed time: %d ns\n", elapsedTime);
//      Arraylist
        startTime = System.nanoTime();

//      Testing element access times with ArrayLists, almost the same time no matter the element
        //arrayList.get(0);
        //arrayList.get(500000);
        //arrayList.get(999999);

//      Arraylists are faster both in removing elements in the middle of the list and from the tail due to less
//      element shifting the closer we get to the tail, but lose when removing elements close to the head due to shifting

        //arrayList.remove(0);
        //arrayList.remove(500000);
        //arrayList.remove(999999);

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.printf("ArrayList elapsed time: %d ns", elapsedTime);
    }
}
