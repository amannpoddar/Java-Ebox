import java.util.*;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of people");
        int x = sc.nextInt();
        int day1 = (x*2)/7;
        int day2 = day1*2;
        int day3 = day1/2;
        System.out.println("Number of attendees on day 1 : "+day1);
        System.out.println("Number of attendees on day 2 : "+day2);
        System.out.println("Number of attendees on day 3 : "+day3);
     }
}