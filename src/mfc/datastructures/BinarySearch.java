package mfc.datastructures;
import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args){
        int array[] = new int[1000000];
        int target = 690000;

        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }

//      Using the built-in binarySearch method of Arrays
        //int index = Arrays.binarySearch(array, target);

        int index = binarySearch(array, target);
        System.out.println(index);

    }

    private static int binarySearch(int[] array, int target){
        int start = 0;
        int end = array.length - 1;

        while(start <= end){

            int mid = start + (end - start) / 2;
            int value = array[mid];

            System.out.println("middle: " + value);

            if(value < target) start = mid + 1;
            else if (value > target) end = mid - 1;
            else return mid;

        }

        return -1;
    }
}
