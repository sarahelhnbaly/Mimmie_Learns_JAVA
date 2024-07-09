import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String [] fruits = {"Apple", "Banana", "Orange", "Grape"};
        int index=0;
        int length=fruits.length;

     while(length>index){
         System.out.println("The value of the:"+ fruits[index]);
         System.out.println("iam in the loop ");
         index++;



     }
     System.out.println("iam out side the loop ");

    }
}


