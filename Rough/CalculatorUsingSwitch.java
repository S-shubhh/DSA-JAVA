import java.util.Scanner;

public class CalculatorUsingSwitch
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter operator to perform calc");
        String letter = in.next().trim();
        int a, b;
        System.out.print("Enter two number");
        a = in.nextInt();
        b = in.nextInt();
        switch (letter)
        {
            case "+":
                System.out.println(a + b);
                break;

            case "-":
                System.out.println(a - b);
                break;

            case "/":
                System.out.println(a / b);
                break;
            case "*":
                System.out.println(a * b);
            case "%":
                System.out.println(a % b);
                break;
            default:
                System.out.println("Enter valid operator");
        }
    }
}