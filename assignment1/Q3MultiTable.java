import java.util.Scanner;

public class Q3MultiTable
{
    static  void Multiply()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a  number for Table :");
        int table = input.nextInt();

        for (int i=1;i<=10;i++)
        {
            System.out.println(table + "*" + i +" = " + table *i);
        }

    }

    public static void main(String[] args) {
        Multiply();
    }
}
