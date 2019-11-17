package lesson9_exception;

import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {
        readData();
    }

    public static void readData(){
       int i=0;
       char q = 'n';
        Scanner inNumber = new Scanner(System.in);
        Scanner inAnswer = new Scanner(System.in);
      while(q!='y'){
          if(q=='n') {
              try {
                  System.out.println("Input int number:");
                  i = inNumber.nextInt();
                  System.out.println("If you want to stop if, press y else n:");
                  q = inAnswer.next().toLowerCase().toCharArray()[0];
              } catch (NumberFormatException e) {
                  e.fillInStackTrace();
              }
          }
        }
      }
}
