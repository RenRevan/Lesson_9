package lesson9_exception;

public class EX_2 {
    public static void main(String[] args){
        System.out.println(divideByZero());
    }

    public static int divideByZero(){
        int a=5;
        int b=0;
        try{
        return a/b;
        }
        catch (Exception e){
            return b/a;
        }
    }
}
