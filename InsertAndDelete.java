import java.util.*;
public class InsertAndDelete {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size + 1];   // extra space for insertion

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be inserted: ");
        int element = sc.nextInt();
        System.out.println("Enter the position to insert the element: ");
        int position = sc.nextInt();

        for(int i = size - 1; i >= position; i--) {
            arr[i + 1] = arr[i];
        }
        arr[position] = element;
        size++;  // array size increased after insertion

        System.out.println("Enter the position of the element to be deleted: ");
        int deletePosition = sc.nextInt();
        for(int i = deletePosition; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;  // array size decreased after deletion

        System.out.println("The final array is: ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
