import java.util.*;
class Main
{
    public static void main(String args[])
    {
        //Fill your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of the item");
        int costOfItem = sc.nextInt();
        System.out.println("Enter the number of items");
        int noOfItem = sc.nextInt();
        System.out.println("Total cost is Rs."+(costOfItem*noOfItem));
    }
}