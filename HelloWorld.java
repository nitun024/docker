import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args){

        System.out.println("Lets multiply numbers!!!!");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = input.nextInt();
        System.out.println("Result is: " +num1*num2);
        System.out.println("Ciao");

    }
}