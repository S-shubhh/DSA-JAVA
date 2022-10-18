//INR TO USD
import java.util.Scanner;

public class Q6
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the INR : ");
        int inr = input.nextInt();

        float usd = inr/80;
        System.out.println(inr + "in USD is  " + usd);

    }
}
