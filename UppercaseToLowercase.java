import java.util.*;
public class UppercaseToLowercase {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        String Lowercase = str.toLowerCase();
        System.out.println("Lowercasw String: "+ Lowercase);
        String Uppercase = str.toUpperCase();
        System.out.println("Uppercase String: " + Uppercase);
        sc.close();
    }
}
