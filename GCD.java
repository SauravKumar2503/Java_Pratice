import java.util.*;
public class GCD {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number to find GCD: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gdc = 1;
        for(int i = 1; i<= a && i <= b;i++)
        {
            if(a % i == 0 && b % i == 0)
            {
                gdc = i;
            }
        }
        System.out.println("GCD of "+ a + " and " + b + " is: "+ gdc);
        sc.close();
    }
}