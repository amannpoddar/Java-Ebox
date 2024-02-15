import java.util.*;
class Main
{
    public static void main(String args[])
    {
        //Fill your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter branding expenses");
        float be = sc.nextFloat();
        System.out.println("Enter travel expenses");
        float te = sc.nextFloat();
        System.out.println("Enter food expenses");
        float fe = sc.nextFloat();
        System.out.println("Enter logistics expenses");
        float le = sc.nextFloat();
        float total = be+te+fe+le;
        float bPer = (be/total)*100;
        float tPer = (te/total)*100;
        float fPer = (fe/total)*100;
        float lPer = (le/total)*100;
        System.out.printf("Total expenses : Rs.%.2f\n",total);
        System.out.printf("Branding expenses percentage : %.2f%%\n",bPer);
        System.out.printf("Travel expenses percentage : %.2f%%\n",tPer);
        System.out.printf("Food expenses percentage : %.2f%%\n",fPer);
        System.out.printf("Logistics expenses percentage : %.2f%%\n",lPer);