import java.util.*;
public class Tribonaci {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();
        int a=0,b=1,c=1,d;
        for(int i=0;i<n;i++)
        {
            System.out.print(a + " ");
            d = a + b + c;
            a = b;
            b=c;
            c=d;
        }
        sc.close();
    }
}
