/*Lab 5: Implementation of String and StringBuffer class
  Lab 6: Implementation of this keyword*/
 
import java.io.*;
import java.util.*;
import java.lang.*;

class Student
{
 //The student name and id are all strings
 String name;
 int stu_id;
 String fac_name;
 String dept;
 int feedback;
 

 //creating constructor and using this keyword 
 public Student(String Name, int Stu_id, String Fac_Name, String Dept, int Feedback)
 {
   this.name = Name;
   this.stu_id = Stu_id;
   this.fac_name = Fac_Name;
   this.dept = Dept;
   this.feedback = Feedback;
 }
 void display()
 {
   System.out.println(name+" "+stu_id+" "+fac_name+" "+dept+" "+feedback);
 } 
}

public class Lab5and6        //main class
{
public static void main(String args[])
 {
 try
  {  
    //Usage of StringBuffer class 
    StringBuffer s = new StringBuffer("Project name: YOUR VOICE-YOUR CHOICE\n");
    //append() method of string buffer class.
    s.append("To receive feedbacks from the students \n");
    System.out.println(s);
    
    //usage of String class
    String str = "College Name : 'BTS' \n";
    System.out.println(str); 

    System.out.println("ENTER THE DETAILES HERE");
    System.out.println("DIRECTIONS FOR GIVING FEEDBACK:1=POOR  2=FAIR  3=GOOD  4=VERY GOOD  5=EXCELLENT");
    System.out.println("ENTER YOUR CHOICE\n");

    //This object creation would call the parameterized constructor
    Student s1=new Student("Lisa",111,"Linda","Science",5);  
    Student s2=new Student("Tom",112,"Daniel","Economics",4); 
    s1.display();  
    s2.display();    
    
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    Student[] S = new Student[3];   //Student class datatype, S is array name and here used as object. for the array of 3 students.  
    for(int i=0; i<3; i++)
    {
      System.out.println("\nName: ");
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
       System.out.println("Excellent\n");
      }
      else if(feedback == 4)
      {
        System.out.println("Very Good\n");
      }
      else if(feedback == 3)
      {
        System.out.println("Good\n"); 
      }
      else if(feedback == 2)
      {
        System.out.println("Fair\n"); 
      }
      else if(feedback == 1)
      {
        System.out.println("Poor\n"); 
      }
      else if(feedback >= 6)
      {
        System.out.println("Please enter feedbacks between 1 and 5 \n");
      }
      S[i] = new Student(name,stu_id,fac_name,dept,feedback);    //calling Student constructor using the object S 
    }
   }
   catch(Exception e){}
  }
}

   





 