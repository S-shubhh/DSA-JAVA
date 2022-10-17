import java.util.Scanner;

public class q4LcmHcf {
    public static void main(String[] args)
    {
      int a,b,hcf,lcm;
        Scanner inou = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        a= inou.nextInt();
        b=inou.nextInt();

        if (a<b)
        {
            hcf = a;
        }
        else hcf=b;

            while (true) {
                if (a % hcf == 0 && b % hcf == 0) {
                    break;
                } else
                    hcf--;
            }
                  lcm = (a*b)/hcf;


        System.out.println("HCF of " + a +" AND " + b+" is " + hcf) ;
        System.out.println("LCM of " + a +" AND " + b+" is " + lcm) ;
    }
}
