import java.util.Scanner;

public class Problem10 {
    //JAVA program to find the Largest among three numbers
    public static void main(String[] args) {
        System.out.println("Enter three numbers :");
        Scanner number1 = new Scanner(System.in);
        int num1 = number1.nextInt();
        Scanner number2 = new Scanner(System.in);
        int num2 = number2.nextInt();
        Scanner number3 = new Scanner(System.in);
        int num3 = number3.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("The Largest number = " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The Largest number = " + num2);
        } else {
            System.out.println("The Largest number = " + num3);
        }
    }
}