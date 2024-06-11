package mfc.datastructures;

public class DynamicArrays {
    public static void main(String[] args){
//      ArrayLists are Java's implementation of dynamic arrays.
//      ArrayList<String> stringArray = new ArrayList<String>();

//      Instantiating objects of the same class in different ways using constructor overloading
        DynamicArray dynamicArray = new DynamicArray();
        DynamicArray setCapacityDynamicArray = new DynamicArray(5);

//      Capacity difference between the two instances
        System.out.println(dynamicArray.capacity);
        System.out.println(setCapacityDynamicArray.capacity);

//      Adding elements to the array, will add the element on the current size index o the array, and then increase the size by 1
        setCapacityDynamicArray.add("B");
        setCapacityDynamicArray.add("C");

//      Inserting elements to the array, will shift elements to the right, and then add the element to a specific index, increasing size by 1
        setCapacityDynamicArray.insert(0, "A");
        setCapacityDynamicArray.insert(3, "D");
        setCapacityDynamicArray.insert(4, "E");
        setCapacityDynamicArray.insert(5, "F");

//      Deleting elements to the array, will shift elements to the left, then null the removed elements index, decreasing size by 1
        setCapacityDynamicArray.delete("F");
        setCapacityDynamicArray.delete("E");
        setCapacityDynamicArray.delete("D");

//      Searches element in an array by passing data and checking all indexes in the array to see which index has said data, then returns the index.
        System.out.println(setCapacityDynamicArray.search("A"));
        System.out.println(setCapacityDynamicArray.search("X"));

//      Calls DynamicArray class toString method to print array elements
        System.out.println(setCapacityDynamicArray);
//      Prints Array size/capacity attribute
        System.out.println("Size: " + setCapacityDynamicArray.size);
        System.out.println("Capacity: " + setCapacityDynamicArray.capacity);

//      Checks if array is currently empty
        System.out.println(setCapacityDynamicArray.isEmpty());
    }
}
