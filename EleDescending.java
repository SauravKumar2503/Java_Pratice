import java.util.*;
public class EleDescending {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements inside the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Elements in descending order: ");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
