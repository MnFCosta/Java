package BoxingUnboxingWrapper;

public class Main {
    static void main() {
        //BOXING
        int x = 20;

        Object obj = x;

        System.out.println(obj);
        //BOXING

        //UNBOXING
        int y = (int) obj;
        System.out.println(y);
        //UNBOXING

        //BOXING E UNBOXING USANDO WRAPPER CLASSES
        //BOXING
        int xWrapper = 20;

        Integer objWrapper = xWrapper;

        System.out.println(objWrapper);
        //BOXING

        //UNBOXING
        int yWrapper = objWrapper;
        System.out.println(yWrapper);
        //UNBOXING


    }
}
