package mfc.datastructures;


public class Recursion {
    public static void main(String[] args){
        //recursiveWalk(5);
        //System.out.println(factorial(5));
        //System.out.println(power(2, 2));
        System.out.println(fibonacci(9));

    }

    //iterative approach
    private static void iterativeWalk(int steps){
        for(int i = 0; i < steps; i++){
            System.out.println("You took a step");
        }
    }

    //recursive approach
    private static void recursiveWalk(int steps){
        if(steps < 1) return;//base case
        System.out.println("You took a step");
        recursiveWalk(steps - 1); //recursive
    }

    //recursive approach to finding the factorial of a number
    private static int factorial(int num){
        if(num < 1) return 1; //base case
        return num * factorial(num - 1); //recursive case
    }

    private static int power(int base, int exponent){
        if(exponent < 1) return 1; //base case
        return base * power(base, exponent -1); //recursive case
    }

    private static int fibonacci(int index){
        if(index <= 1) return 1;

        return fibonacci(index - 1) + fibonacci(index - 2);
    }


}
