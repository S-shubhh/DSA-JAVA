import java.util.Scanner;
public class fabon
{
    
        public static void main(String[] args)
        {
            int temp,a=0,b=1;
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the n number :");
            int n = in.nextInt();
            int i=0;
            System.out.print(a + "" + b);


            while(i<n)
            {

                 temp = b;
                 b=b+a;
                 a=temp;
                 i++;
                System.out.print(b);
            }
        }
}




