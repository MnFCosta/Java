package mfc.datastructures;

public class LinearTvsConstT {
    public static void main(String[] args){
        long startTime;
        long endTime;
        long elapsedTime;

        //Linear time
        startTime = System.nanoTime();
        System.out.println(linearAdd(1000000));
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println(elapsedTime + "ns");

        //Constant time
        startTime = System.nanoTime();
        System.out.println(constantAdd(1000000));
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println(elapsedTime + "ns");
    }

    private static long linearAdd(int n){
        long sum = 0;
        for(int i = 0; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    private static long constantAdd(int n){
        long sum = (long) n * (n + 1) / 2;
        return sum;
    }
}
