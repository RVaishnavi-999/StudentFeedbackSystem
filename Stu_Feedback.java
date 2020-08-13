import java.io.*;
import java.util.*;
import java.lang.*;

class Student
{
 String name;
 int stu_id;
 String fac_name;
 String dept;
 int feedback;

 //creating constructor and initializing variables to user data
 public Student(String initName, int initstu_id, String initFac_Name, String initDept, int initfeedback)
 {
   name = initName;
   stu_id = initstu_id;
   fac_name = initFac_Name;
   dept = initDept;
   feedback = initfeedback;
 }
}

public class Stu_Feedback        //main class
{
public static void main(String args[])
 {
 try
  {  
    /*Scanner in = new Scanner(System.in);*/
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("ENTER THE DETAILES HERE");
    System.out.println("DIRECTIONS FOR GIVING FEEDBACK:1=POOR  2=FAIR  3=GOOD  4=VERY GOOD  5=EXCELLENT");
    System.out.println("ENTER YOUR CHOICE");
    Student[] S = new Student[3];
    for(int i=0; i<3; i++)
    {
      System.out.println("Name: ");
      String name=in.readLine();
      System.out.println("ID no: ");
      int stu_id=Integer.parseInt(in.readLine());
      System.out.println("Faculty Name: ");               
      String fac_name=in.readLine();
      System.out.println("Department: ");
      String dept=in.readLine();
      System.out.println("Feedback: ");
      int feedback=Integer.parseInt(in.readLine());
      if(feedback == 5)
       {
       System.out.println("Excellent");
      }
      else if(feedback == 4)
      {
        System.out.println("Very Good");
      }
      else if(feedback == 3)
      {
        System.out.println("Good"); 
      }
      else if(feedback == 2)
      {
        System.out.println("Fair"); 
      }
      else if(feedback == 1)
      {
        System.out.println("Poor"); 
      }
      S[i] = new Student(name,stu_id,fac_name,dept,feedback);    //calling Student constructor 
     }
   }
   catch(Exception e){}
  }
}

   





 
