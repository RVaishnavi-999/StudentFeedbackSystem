//LAB 3 AND 4
import java.io.*;
import java.util.*;
import java.lang.*;

class Student
{
 //instance variable
 String name;  
 int stu_id;
 String fac_name;
 String dept;
 int feedback;
 //Using static Keyword as satic variable
 static String college="GFGC";   
 
 //Default constructor
 public Student()   
 {
   name = "Vaishnavi";
   stu_id = 100;
   fac_name = "Dr.Tom";
   dept = "Scince";
   feedback = 5;
 }
 

 //creating parameterized constructor 
 public Student(String Name, int Stu_id, String Fac_Name, String Dept, int Feedback)
 { 
   name = Name;           
   stu_id = Stu_id;
   fac_name = Fac_Name;
   dept = Dept;
   feedback = Feedback;
 }
 
 public Student(String n)
 {    
   name = n;  
 }

 //Getter and setter methods
 public String getName()
 {
   return name;
 }
 public void setName(String name)
 {
   this.name = name;
 }
 public int getStu_id()
 {
   return stu_id;
 }
 public void setStu_id(int stu_id)
 {
   this.stu_id = stu_id;
 }
 public String getFac_name()
 {
   return fac_name;
 }
 public void setFac_name(String fac_name)
 {
   this.fac_name = fac_name;
 }
 public String getDept()
 {
   return dept;
 }
 public void setDept(String dept)
 {
   this.dept = dept;
 }
 public int getFeedback()
 {
   return feedback;
 }
 public void setFeedback(int feedback)
 {
   this.feedback = feedback;
 }

 //Method Overloading 
 //same method name:'total'and 2 parameters
 int total(int f1, int f2)
 {
   return (f1+f2)/2;
 }

 //same method name: 'total' and 3  parameters
 int total(int f1, int f2, int f3)
 {
   return (f1+f2+f3)/3;
 }
 //method to display the values and to show static variable usage.
 void display ()
 {
   System.out.println(name+"  "+college);
 }
}

public class Labwork    //main class
{
public static void main(String args[])
 {
 try
  {  
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("\nENTER THE DETAILES HERE");
    System.out.println("DIRECTIONS FOR GIVING FEEDBACK:1=POOR  2=FAIR  3=GOOD  4=VERY GOOD  5=EXCELLENT");
    
    //Usage of constructor overloading
    //This object creation would call the default constructor 
    Student a = new Student();
    System.out.println("\nStudent Name is : "+a.getName());
    System.out.println("Student Id is   : "+a.getStu_id());
    System.out.println("Faculty Name is : "+a.getFac_name());
    System.out.println("Department is   : "+a.getDept());
    System.out.println("Feedback        : "+a.getFeedback());

    //This object creation would call the parameterized constructor
    Student b = new Student("Divya" , 200 , "MR.Kevin", "Arts", 4);
    System.out.println("\nStudent Name is : "+b.getName());
    System.out.println("Student Id is   : "+b.getStu_id());
    System.out.println("Faculty Name is : "+b.getFac_name());
    System.out.println("Department is   : "+b.getDept());
    System.out.println("Feedback        : "+b.getFeedback());

    //This object c is for method overloading
    Student c = new Student();
    System.out.println("\n---Feedback Regarding---");
    System.out.println("1.Teacher is responsive to questions");
    System.out.println("2.Teacher is always well prepared for each class");
    System.out.println("3.Teacher demonstrates good knowledge of the subject");
    
    System.out.println("\nTotal feedback is "+c.total(5,3));
    Student s1 = new Student("Joseph");       //To show the usage of static variable
    s1.display();
    System.out.println("Total feedback is "+c.total(5,3,1));
    Student s2 = new Student("Ian");
    s2.display();

    System.out.println("\nENTER YOUR CHOICE");
    //Array of objects implemented here
    //Student class datatype, S is array name and here used as object.
    //For the array of 2 students.
    Student[] S = new Student[2];      
    for(int i=0; i<2; i++)
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
      S[i] = new Student(name,stu_id,fac_name,dept,feedback);    //calling Student constructor using the object S 
     }
   }
   catch(Exception e){}
  }
}