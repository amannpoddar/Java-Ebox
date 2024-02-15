import java.util.*;
class Main
{
    public static void main(String args[])
    {
        //Fill your code here
        float mag;
        Scanner sc = new Scanner(System.in);
        System.out.println("Richter Magnitude:");
        mag = sc.nextFloat();
        if(mag<=2.4)
            System.out.println("Micro");
        else if(mag >=2.5 && mag <=5.4)
            System.out.println("Light");
        else if(mag >=5.5 && mag <=6.0)
            System.out.println("Moderate");
        else if(mag>=6.1 && mag <=6.9)
            System.out.println("Strong");
        else if(mag>=7.0 && mag <=7.9)
            System.out.println("Major");
        else
            System.out.println("Great");
    }
}