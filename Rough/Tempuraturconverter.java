import java.util.Scanner;

public class Tempuraturconverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the tempurature in Celcius");
        float temp = input.nextFloat();

        float fahr = (temp * 9/5) + 32;
        System.out.println("Tempurature in fahren  is : " + fahr);

    }
}
