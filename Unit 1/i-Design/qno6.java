import java.util.*;
public class Main {
    public static void main(String[] args) {
        //fill your code here
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer");
        num = s.nextInt();
        Integer intObj = num;
    
        System.out.println("The binary equivalent of "+num+" is " + Integer.toBinaryString(num));
        System.out.println("The hexadecimal equivalent of "+num+" is " + Integer.toHexString(num));
        System.out.println("The octal equivalent of "+num+" is " + Integer.toOctalString(num));
        System.out.println("Byte value of "+num+" is " + intObj.byteValue());
        System.out.println("Short value of "+num+" is " + intObj.shortValue());
        System.out.println("Long value of "+num+" is " + intObj.longValue());
        System.out.println("Float value of "+num+" is " + intObj.floatValue());
        System.out.println("Double value of "+num+" is " + intObj.doubleValue());
        
}
}