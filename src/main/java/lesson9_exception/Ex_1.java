package lesson9_exception;

import java.util.concurrent.ExecutionException;

public class Ex_1 {

//1. Create method to check: if number < 0 print “Number < 0”, if number > 0 print “Number > 0” if number = 0 throw your own exception
    public static void main(String[] arg) throws Exception {

        Ex_1 e = new Ex_1();
        e.numberCheck(-1);
        e.numberCheck(0);
        e.numberCheck(1);
    }

    public void numberCheck (int i) throws Exception {
        if (i<0) System.out.println("Number < 0");
        else if(i>0) System.out.println("Number > 0");
        else if (i==0) throw new MyException("Number = "+i);
    }

}

class MyException extends Exception{
    public MyException(String str){
        super(str);
    }
}
