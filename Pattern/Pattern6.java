package Pattern;

public class Pattern6 {
    public static void main(String[] args)
    {
        int n = 5;
        for (int i = 0; i < n; i++) {
            // Inner loop for columns
            // Prints numbers from 1 up to (N - i)
            for (int j = n; j > i; j--) {
                System.out.print((n - j + 1) + " ");
            }
            // Move to next line
            System.out.println();
        }
    }
}
