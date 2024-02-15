import java.util.Scanner;
class Main{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        // Circle c = new Circle;
        float pi = 22/7f;
        System.out.println("Enter the radius of circle :");
        float rad = sc.nextFloat();
        float area = pi * rad * rad;
        System.out.printf("The area of circle is %.2f.", area);
    }
}