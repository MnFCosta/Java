package mfc.datastructures;

public class MergeSort {
    public static void main(String[] args){
        int[] array = {8,2,4,5,1,3,6,9,7};

        mergeSort(array);

        for(int i: array){
            System.out.print(i + " ");
        }
    }

    private static void mergeSort(int[] array){
        int length = array.length;
        if(length <= 1) return;

        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0;
        int j = 0;

        for(; i < length; i++){
            if(i < middle){
                leftArray[i] = array[i];
            }else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);

    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array){
        int leftSize = array.length/2;
        int rightSize = array.length - leftSize;
        int i , l , r;
        r = l = i = 0;

        //check conditions for merging (while there is still elements on right and left array)
        while(l < leftSize && r < rightSize){
            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }else{
                    array[i] = rightArray[r];
                    i++;
                    r++;
            }
        }
        while(l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while(r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
