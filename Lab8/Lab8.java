/* Lab 8 : Implementation of package */

import msc.Student_det;
import java.util.*;
import java.lang.*;
import java.io.*;
class Lab8
{
     public static void main(String[] args)
     {
          String nm,fn;
          int roll;
          Scanner sc = new Scanner(System.in);
          
          System.out.println("\nDIRECTIONS FOR GIVING FEEDBACK:1=POOR  2=FAIR  3=GOOD  4=VERY GOOD  5=EXCELLENT");
          System.out.println("ENTER THE DETAILES HERE");
          System.out.print("Enter Roll no:= ");
          roll = sc.nextInt();
          System.out.print("Enter Name:= ");
          nm = sc.next();
          System.out.print("Enter Faculty Name:= ");
          fn = sc.next();
          int m1,m2,m3;
          System.out.print("Give feedbacks For 1)Concept clarity  2)Doubt clarification  3)Subject Understanding\n");
          m1 = sc.nextInt();
          m2 = sc.nextInt();
          m3 = sc.nextInt();
          Student_det s = new Student_det( roll,nm,fn,m1,m2,m3);
          s.display();
     }
}