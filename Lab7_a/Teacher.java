/* Lab 7a  : Implementation of abtract and super keywords.*/

//abstract class
abstract class Person 
{
    String name;
    String gender;
	
   public Person(String nm, String gen)
  {
     this.name=nm;
     this.gender=gen;
   }
	
  //abstract method 
  public abstract void work();
	
  public String toString()
  {
    return "\nName = "+this.name+"::Gender = "+this.gender;
  }	
}

public class Teacher extends Person 
{
   int empId;
	
   public Teacher(String nm, String gen, int id) 
   {
       super(nm, gen);
       this.empId=id;
   }
   @Override
   public void work() 
   {
       if(empId == 0)
       {
           System.out.println("Not working");
       }
       else
       {
           System.out.println("Working as Teacher!!");
       }
}
	
public static void main(String args[])
{
     //coding in terms of abstract classes
     Person obj1 = new Teacher("Ms.Clarissa","Female",0);
     Person obj2 = new Teacher("Bash","Male",123);
     System.out.println(obj1.toString());
     obj1.work();
     System.out.println(obj2.toString());
     obj2.work();  
  }
} 


























