import java.util.*;
public class Fibonacci {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms for Fibonacci series: ");
        int n = sc.nextInt();
        int a = 0, b =1;
        int c;
        for(int i=0;i < n;i++)
        {
            System.out.print(a +  " ");
            c = a + b;
            a= b;
            b = c;
        }
        sc.close();
    }
}
