import java.util.*;
import java.io.*;

class Person
{
  String name,city;
  int phone;
    
  void read() {
  //scanner object
  Scanner sc= new Scanner(System.in);

  System.out.print("Enter Name : ");  
  this.name= sc.nextLine();

  System.out.print("Enter City : ");  
  this.city= sc.nextInt();

  System.out.print("Enter Contact Number :");  
  this.phone= sc.nextInt();
}
    
void display()
{
        System.out.println("Name - \t\t"+this.name);
        System.out.println("City - \t\t"+this.city);
        System.out.println("Contact Number - \t"+this.phone+");
}

public class Lab7and8    //main class
{
   public static void main(String args[])
  {
   try
   {
        GraduateStudent[] stud = new GraduateStudent[2];
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------Give your feedback-----------");
        System.out.println("DIRECTIONS FOR GIVING FEEDBACK:1=POOR  2=FAIR  3=GOOD  4=VERY GOOD  5=EXCELLENT");
        System.out.print("\t ENTER YOUR CHOICE ");
       /* for (int i = 0; i < 2; i++)
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
      else if(feedback > 6)
      {
        System.out.println("Please enter feedbacks between 1 and 5 \n");
      } */

      S[i] = new Student(name,stu_id,fac_name,dept,feedback);    //calling Student constructor using the object S
      }
    }
    catch(Exception e){}
  }
} 

class Student extends Person
{
    String name,fac_name,dept;
    int stu_id,feedback;
    static int number = 0;
    
    void read()
   {
        super.read();
        System.out.println("Enter Name : \n");
        this.name = name;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter ID : \n");
        this.stu_id = stu_id;
        Scanner sc= new Scanner(System.in);
        System.out.println("Faculty Name : \n");
        this.fac_name = fac_name;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Department : \n");
        this.dept=dept;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Feedback : \n");
        this.feedback=feedback;
        Scanner sc= new Scanner(System.in);
    }
    
    void display()
   {
        super.display();

        System.out.println("Student Name - \t"+this.name);
        System.out.println("ID - \t"+this.stu_id);
        System.out.println("Faculty Name - \t"+this.fac_name);
        System.out.println("Department - \t"+this.dept);
        System.out.println("Feedback - \t"+this.feedback);
    }
}

class GraduateStudent extends Student
{
    String programName,classTeacherName;
    int noOfSubjects;

    void read()
    {
        super.read();

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Program Name : ");  
        this.programName= sc.nextLine();

        System.out.print("Enter Class Teacher Name :");  
        this.classTeacherName= sc.nextLine();

        System.out.print("Enter Number of Subjects : ");
        this.noOfSubjects = sc.nextInt();
    }
    
    void display()
   {
        super.display();

        System.out.println("Program  - \t"+this.programName);
        System.out.println("Class Teacher - "+this.classTeacherName);   
        System.out.println("No. of Subjects - "+this.noOfSubjects);
    }
}