/*Implementation of thread class and Runnable interface*/

import java.io.*;
import java.util.*;
import java.lang.*;

public class Lab10 extends Thread implements Runnable    //main class
{  
   public void run()
  { 
    int m1,m2,m3,sum; 
    String fn;
    Scanner sc = new Scanner(System.in); 
    System.out.println("thread is running...\n"); 
    System.out.print("Enter Faculty Name:= ");
    fn = sc.next();
    System.out.print("Give feedbacks For the below\n");
     System.out.println("Concept clarity  : ");
     m1 = sc.nextInt();
     System.out.println("Doubt Clarification  : ");
     m2 = sc.nextInt();
     System.out.println("Subject Understanding : ");      
     m3 = sc.nextInt();
     sum = m1+m2+m3;
     System.out.println("------------------");
     System.out.println("Total Feedback     : "+sum);
           if(sum>12 && sum<=15)
          {
             System.out.println("Result = Excellent\n");
             System.out.print("------------------\n");
          }
          else if(sum>9 && sum<=12)
         {
            System.out.println("Result = Very Good\n");
            System.out.print("------------------\n");
         }
         else if(sum>6 && sum<=9)
        {
           System.out.println("Result = Good\n");
           System.out.print("------------------\n"); 
        }
        else if(sum>3 && sum<=6)
       {
         System.out.println("Result = Fair\n");
         System.out.print("------------------\n"); 
       }
       else if(sum<= 3)
       {
         System.out.println("Result = Poor\n");
         System.out.print("------------------\n"); 
       }
       else if(sum > 15)
       {
         System.out.println("Please enter feedbacks between 1 and 5 \n");
       }     
       System.out.println("Thank you for giving feedbacks");
       System.out.println("Have a great day ahead\n");
  } //run() close
      
  public static void main(String args[]) throws InterruptedException
  {  
     String nm;
     int roll, sum;
     Scanner sc = new Scanner(System.in); 
     System.out.println("\nDIRECTIONS FOR GIVING FEEDBACK:1=POOR  2=FAIR  3=GOOD  4=VERY GOOD  5=EXCELLENT");
     System.out.println("ENTER THE DETAILES HERE");
     System.out.println("------------------");
     System.out.print("Enter Roll no:= ");
      roll = sc.nextInt();
     System.out.print("Enter Name:= ");
      nm = sc.next();
      
     Lab10 obj1=new Lab10();  
     obj1.start();
  }  
}  