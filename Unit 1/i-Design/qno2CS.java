import java.util.*;
class Main
{
    public static void main(String args[])
    {
        //Fill your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2 == 0 || num%3 == 0)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}