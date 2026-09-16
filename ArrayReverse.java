import java.util.*;
public class ArrayReverse {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements inside the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array after reverse: ");
        for(int j=arr.length-1; j>=0;j--)
        {
            System.out.print(arr[j] + " ");
        }
        sc.close();
    }
}
