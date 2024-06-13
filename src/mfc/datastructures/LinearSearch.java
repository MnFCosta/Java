package mfc.datastructures;

public class LinearSearch {
    public static void main(String[] args){
        int[] array = {9,1,8, 10, 12, 13, 15};
        int index = linearSearch(array, 15);
        System.out.println(index);
    }

    private static int linearSearch(int[] array, int value){
        for(int i  = 0; i< array.length; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }
}
