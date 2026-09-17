import java.util.*;
public class Transpose {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row: ");
        int row = sc.nextInt();
        System.out.println("Enter number of column: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter elements inside the matrix: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The original matrix is: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The transpose of the matrix is: ");
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
