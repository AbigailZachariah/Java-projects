import java.util.Scanner;
import java.util.Random;

public class Numberguessing {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int number;
        number=random.nextInt(1,101);

        int guess=0;
        int attempts=0;

        do{System.out.print("Enter guess(1-100):");
        guess=sc.nextInt();
        attempts++;
        if(guess>number){
            System.out.println("Too high!");
        }
        else if(guess<number){
            System.out.println("Too low!");
        }
        else{
            System.out.println("CORRECT!!");
        }}while(guess!=number);

        System.out.printf("You have won in %d attempts.",attempts);

        sc.close();
    }
}
