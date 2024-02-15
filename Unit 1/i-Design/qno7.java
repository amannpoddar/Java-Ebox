import java.util.*;
public class Main {
    public static void main(String[] args) {
        //fill your code here
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the binary number");
        String bin = s.nextLine();
        System.out.println("Enter the octal number");
        String oct = s.nextLine();
        System.out.println("Enter the hexadecimal number");
        String hex = s.nextLine();
        
        System.out.println("The integer value of the binary number " + bin + " is " + Integer.parseInt(bin,2));
        System.out.println("The integer value of the octal number " + oct + " is " + Integer.parseInt(oct,8));
        System.out.println("The integer value of the hexadecimal number " + hex + " is " + Integer.parseInt(hex,16));
    }
}