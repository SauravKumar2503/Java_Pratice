import java.util.*;
public class SearchEle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements inside the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int key = sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == key)
            {
                System.out.println("Element found at index: " + i);
                break;
            }
            else if(i == arr.length -1)
            {
                System.out.println("Element not found in the array");
            }
        }
        sc.close();
    }
}
