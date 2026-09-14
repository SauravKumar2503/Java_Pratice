import java.util.*;
public class OddNum1ToN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i+=2){
            System.out.print(i + " ");
        }
        sc.close();
    }
}