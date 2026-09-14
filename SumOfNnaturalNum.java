import java.util.*;

public class SumOfNnaturalNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
            sum += i;
        }
        System.out.println("Sum of first "+ n + " natural numbse is: " + sum);
        sc.close();
    }
}
