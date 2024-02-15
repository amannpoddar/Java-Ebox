import java.util.*;
 class Student{
           private  String studentName;
            private int registerNumber;
            private static int noOfStudents = 0;
            public  Student(String studentName, int registerNumber){
                this.studentName = studentName;
                this.registerNumber = registerNumber;
                noOfStudents++;
            }
             public static int getNoOfStudents(){
                 return noOfStudents;
             }
             public int getRegisterNumber(){
                 return registerNumber;
             }
             public String getStudentName(){
                     return studentName;
             }
 }
public class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Student[] stArray = new Student[100];
        int stIndex = 0;
        String choice = "Yes";
        System.out.println("Enter the student details :");
        while(choice.equalsIgnoreCase("Yes")){ 