import java.util.*;
public class Armstrong {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;
        while (num != 0)
        {
            int digit = num % 10;
            sum  = sum + digit * digit * digit;
            num = num/10;
        }
        if(sum == originalNum)
        {
            System.out.println("The number is an Armstrong number");
        }
        else{
            System.out.println("The number is not an Armstrong number");
        }
        sc.close();
    }
}
