package lesson9_exception;

public class Ex_5 {
    public static void main(String[] args) {
        iCanTrowException();
    }

    public static void iCanTrowException(){
        throw new NullPointerException();
    }
}
