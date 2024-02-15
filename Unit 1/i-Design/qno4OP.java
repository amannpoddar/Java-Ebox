import java.util.*;
public class Main {
    public static void main(String[] args) {
        //fill your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Temparature in Celsius:");
        float c = sc.nextFloat();
        float fah = (c*9/5)+32;
        System.out.printf("Temparature in Fahrenheit is %.1fF",fah);
    }
}