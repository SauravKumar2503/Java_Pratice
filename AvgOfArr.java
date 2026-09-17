import java.util.*;
public class AvgOfArr{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements inside the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum += arr[i];
        }
        double avg = (double)sum / arr.length;
        System.out.println(avg);
        sc.close();
    }
}