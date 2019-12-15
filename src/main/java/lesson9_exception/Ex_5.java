package lesson9_exception;

public class Ex_5 {
    public static void main(String[] args) {

        try {
            iCanTrowException();
        }catch (NullPointerException e){
            System.out.println("There is error");
        }
    }

    public static void iCanTrowException(){
        throw new NullPointerException();
    }
}
