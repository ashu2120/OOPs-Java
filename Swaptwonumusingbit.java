import java.util.Scanner;
public class Swaptwonumusingbit 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();    
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping, first number is: " + a);
        System.out.println("After swapping, second number is: " + b);
        sc.close();
    }
}