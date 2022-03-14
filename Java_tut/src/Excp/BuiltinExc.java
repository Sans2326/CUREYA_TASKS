package Excp;

public class BuiltinExc {
    static void av() throws ArrayIndexOutOfBoundsException{
        try{
            throw new ArrayIndexOutOfBoundsException("demo");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught");
        }
    }
    public static void main(String[] args) {
        try{
            av();
            int a =10, b = 0;
            int c = a/b;
            System.out.println("result = "+c);
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide a number by zero");
        }
        finally{
            System.out.println("all done!");
        }

    }
}
