package msc;
public class Student_det
{
     public int r_no;
     public String name;
     public String fac_name;
     public int a,b,c;
     int sum=0;
     public Student_det(int roll, String nm, String fn, int m1,int m2,int m3)
     {
          r_no = roll;
          name = nm;
          fac_name=fn;
          a = m1;
          b = m2;
          c = m3;
          sum = a+b+c;
     }
     public void display()
     {
          System.out.println("\nRoll_no : "+r_no);
          System.out.println("Name    : "+name);
          System.out.println("Faculty Name    : "+fac_name);
          System.out.println("-----Feedbacks-------");
          System.out.println("Concept clarity  : "+a);
          System.out.println("Doubt Clarification  : "+b);
          System.out.println("Subject Understanding : "+c);
          System.out.println("Total Feedback     : "+sum);
           if(sum>12 && sum<=15)
          {
             System.out.println("\nResult = Excellent\n");
          }
          else if(sum>9 && sum<=12)
         {
            System.out.println("\nResult = Very Good\n");
         }
         else if(sum>6 && sum<=9)
        {
           System.out.println("\n Result = Good\n"); 
        }
        else if(sum>3 && sum<=6)
       {
         System.out.println("\nResult = Fair\n"); 
       }
       else if(sum<= 3)
       {
         System.out.println("\nResult = Poor\n"); 
       }
       else if(sum > 15)
       {
         System.out.println("Please enter feedbacks between 1 and 5 \n");
       }
          
       System.out.println("------------------");
     }
}