package Pattern;

public class Pattern19 {
    public void pattern19(int n) {
        int space = 0;

        // Loop for upper half rows
        for (int i = 0; i < n; i++) {
            // Left stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            // Middle spaces
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            space += 2;
            System.out.println();
        }

        space = 2 * n-2;

        for(int i=1;i<=n;i++)
        {
            for(int j = 1; j<= i;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<space;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<= i;j++)
            {
                System.out.print("*");
            }
            space -= 2;
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        Pattern19 obj = new Pattern19();
        int n = 5;
        obj.pattern19(n);
    }
}
