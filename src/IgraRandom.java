import java.util.Random;
import java.util.Scanner;

public class IgraRandom {
    public static void main(String[] args){
        Random random = new Random();
        int randInt = random.nextInt(10) + 1;

        Scanner scan = new Scanner(System.in);

       while (true){
           System.out.println("Wait this rondom nuber 1 - 10: ");
           int num = scan.nextInt();

           if(num == randInt){
               System.out.println("Thi is TRUE");
               break;
           }
           if(num > randInt){
               System.out.println("I have number < :");
           }
           if(num < randInt){
               System.out.println("I have number > :");
           }
       }
        System.out.println("End");
        System.out.println("My number " + randInt + " this");

    }
}
