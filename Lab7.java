/*Lab 7 : Implementation of inheritance, super keyword.   */

import java.io.*;

class Student  //super class : Student
{
      String name = "Tom";
}
 
class CollegeStudent extends Student   // subclass CollegeStudent
{
      String className = "MSC";
}
 
class MscStudent extends CollegeStudent  //subclass MscStudent
{
      String semester = "1st sem.";
 
      public void showDetail()
     {
         System.out.println("Student name = " + name);
         System.out.println("Student class name = " + className);
         System.out.println("Student semester = " + semester);               
   }
} 
 
class College  //Base class
{ 
    void message() 
    { 
        System.out.println("\nCollege Name: MMIT"); 
    } 
} 
class Teacher extends College  //Derived class 
{ 
    void message() 
    { 
        System.out.println("Teacher Name: Michel");
        System.out.println("Class : Msc");
        System.out.println("Semester : 1st Sem");
        System.out.println("Department : Computer Science"); 
    }  
    void display() 
    { 
       
        // will invoke parent College class message() method 
        super.message();
        
       // will invoke current Teacher class message() method 
        message();  
    } 
} 

public class Lab7
{
      public static void main(String args[])
     {
      try
      {
           BufferedReader in=new BufferedReader(new InputStreamReader(System.in));  
           System.out.println("\nWELCOME\n");
           System.out.println("Give your feedback\n");
           System.out.println("DIRECTIONS FOR GIVING FEEDBACK:1=POOR  2=FAIR  3=GOOD  4=VERY GOOD  5=EXCELLENT");            
 
           //creating subclass object
            MscStudent s = new MscStudent();
 
            //method call
            s.showDetail();

           Teacher t = new Teacher();   //object created for teacher subclass
           
            System.out.print("Faculty Name: ");
            String fac_name=in.readLine();
            System.out.print("Department: ");
            String dept=in.readLine();
            System.out.print("Feedback: ");
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
          else if(feedback >=6)
         {
            System.out.println("Wrong input. Please enter values between 1 and 5\n");
         }
         t.display();
       
       }catch(Exception e){}
    }
}