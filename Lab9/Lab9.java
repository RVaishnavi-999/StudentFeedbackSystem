/*Lab9 : Exception Handling
Implementation of 1. StringIndexOutOfBound Exception
                             2. Arithmetic exception
                             3. NumberFormat Exception
                             4. ArrayIndexOutOfBounds Exception 
                             5.USED-DEFINED Exception */

import java.io.*;
import java.util.*;
import java.lang.*;

class Student extends Exception
{
 String name;
 int stu_id;
 String fac_name;
 String dept;
 int feedback;
 
 //creating constructor and initializing variables 
 public Student(String initName, int initstu_id, String initFac_Name, String initDept, int initfeedback)
 {
   name = initName;
   stu_id = initstu_id;
   fac_name = initFac_Name;
   dept = initDept;
   feedback = initfeedback;
 }
   
   //Constructor for showing exception 
   public Student(String nm)   
   {
	name=nm;
   }
   public String toString()
   { 
	return ("OUTPUT: Exception Occurred is :- "+name) ;
              //OUTPUT: This is User-defined Exception
   } 
}

public class Lab9       //main class
{
  public static void main(String args[])
 {
   try    
     {  
       BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    
    //Usage of StringBuffer class 
    StringBuffer s = new StringBuffer("\nProject name: YOUR VOICE-YOUR CHOICE\n");
    //append() method of string buffer class.
    s.append("To receive feedbacks from the students");
    System.out.println(s);
    
    System.out.println("- - - - - - - - - - - - - - - - - - - \n");
    System.out.println("ENTER THE DETAILES HERE");
    System.out.println("DIRECTIONS FOR GIVING FEEDBACK:1=POOR  2=FAIR  3=GOOD  4=VERY GOOD  5=EXCELLENT");
    System.out.println("ENTER YOUR CHOICE");
    Student[] S = new Student[2];   //Student class datatype, S is array name and here used as object. for the array of 2 students.  
    
    for(int i=0; i<2; i++)
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
      else if(feedback > 6)
      {
        System.out.println("Please enter feedbacks between 1 and 5 \n");
      }
      S[i] = new Student(name,stu_id,fac_name,dept,feedback);    //calling Student constructor using the object S 
   }
   
    int choice;
    Scanner n = new Scanner(System.in);
    System.out.println(".......Exception Handling.......\n");
    System.out.println("1. StringIndexOutOfBound Exception");
    System.out.println("2. Arithmetic exception");
    System.out.println("3. NumberFormat Exception");
    System.out.println("4. ArrayIndexOutOfBounds Exception");
    System.out.println("5. UserDefined Exception");

   do
   {
    System.out.println("\nEnter the choice : ");
    choice = n.nextInt();
    switch(choice)
    { 
       case 1:
                  System.out.println("\nTo show : StringIndexOutOfBound Exception");
                  try 
                  { 
                     String a = "Project Name: YOUR VOICE-YOUR CHOICE"; // length is 36 
                     char c = a.charAt(38); // accessing 39th element 
                     System.out.println(c);
                  } 
                  catch(StringIndexOutOfBoundsException e) 
                  {  
                     System.out.println("OUTPUT : StringIndexOutOfBoundsException"); 
                  }
                  break; 

        case 2:
                 System.out.println("\nTo show : Arithmetic exception\n ");
                 try 
                { 
                   int a=5,b=0;
                   int sum=0;
                   System.out.println("Feedbacks are given as shown below\n");
                   System.out.println("Concept clarity  : "+a); 
                   System.out.println("Doubt Clarification  : "+b);
                   sum = a+b;
                   System.out.println("--------------------------------");
                   System.out.println("Total Feedback     : "+sum); 
                   System.out.println("Rating : Excellent");  
                   System.out.println("--------------------------------");
                   int c = a/b;  // cannot divide by zero 
                   System.out.println ("Result = " + c); 
               } 
               catch(ArithmeticException e) 
               { 
                  System.out.println ("\nCan't divide a number by 0"); 
                  System.out.println ("This is ArithmeticException"); 
               }
               break;
 
        case 3:
                  System.out.println("\nTo show : NumberFormat Exception");
                  try 
                  {  
                     // "Thank you" is not a number 
                     int num = Integer.parseInt ("Thank you") ; 
                     System.out.println(num); 
                  } 
                  catch(NumberFormatException e) 
                  {  
                     System.out.println("OUTPUT : Number format exception");
                    System.out.println("This Exception occured since 'Thank you is not a number");
                 } 
                 break;
        
        case 4:
                   System.out.println("\nTo show : ArrayIndexOutOfBoundsException "); 
                    try{ 
                           int a[] = new int[5]; 
                           a[6] = 9; // accessing 7th element in an array of size 5 
                        } 
                       catch(ArrayIndexOutOfBoundsException e)
                       { 
                          System.out.println ("OUTPUT : Array Index is Out Of Bounds"); 
                          System.out.println("Accessing 7th element in an array of size 5 causes this exception");
                       } 
                       break;
           
         case 5:
                     System.out.println("\nTo show : User Defined Exception ");
                     try
                    {
		System.out.println("Starting of try block for showing User Defined Exception");
		throw new Student("This is My User Defined Exception");  // throw is used to create a new exception and throw it.
	      }
 	      catch(Student e)
                     {
		System.out.println("Catch Block") ;
		System.out.println(e) ;
	      }         
                    break;

        default:
                     System.out.println("Wrong choice..");

     } //switch closed
   } //do closed
   while(choice < 5);
  }// try closed
  catch(Exception e){}
 }
}

   





 