import java.util.*;
public class Main {
    public static void main(String[] args) {
        //fill your code here
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(Character.isUpperCase(ch))
            System.out.println(ch + " is uppercase letter");
        else if(Character.isLowerCase(ch))
            System.out.println(ch + " is lowercase letter");
        else
            System.out.println(ch + " is neither an uppercase or lowercase letter");
    }
}