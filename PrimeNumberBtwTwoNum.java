import java.util.*;
public class PrimeNumberBtwTwoNum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Prime numbers between " + num1 + " and " + num2 + " are: ");
        for(int i = num1; i <= num2; i++)
        {
            boolean isPrime = true;

            if (i <= 1) {
                isPrime = false; // 0 and 1 are not prime
            } else {
                for(int j = 2; j < i; j++)
                {
                    if(i % j == 0)
                    {
                        isPrime = false;
                        break;
                    }
                }
            }

            if(isPrime) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
