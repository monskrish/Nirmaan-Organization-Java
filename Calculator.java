package Day3;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Key : ");
        int key = sc.nextInt();

        int num1 = 10;
        int num2 = 5;

        switch(key){
            case 1:
            {
                System.out.println("Addition : "+(num1 + num2));
                break;
            }
            case 2:
            {
                System.out.println("Subtraction : "+(num1 - num2));
                break;
            }
            case 3:
            {
                System.out.println("Multiplication : "+(num1 * num2));
                break;
            }
            case 4:
            {
                System.out.println("Division : "+(num1 / num2));
                break;
            }
            default:
            {
                System.out.println("Invalid Key..");
            }
        }
    }
}
