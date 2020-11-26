class qus1
{
	static void validate(double balance)throws Insufficientbalance
    {
         if(balance<100)
         throw new Insufficientbalance("not valid\n");
         else
         System.out.println("Sufficient balance");
    }
    public static void main(String s[])
    {
		try
		{
			validate(50);
        }
	    catch(Exception m)
	    {
		   System.out.println("Exception occured: "+m);
	    }
        Bank account = new SBI();
		int Bankid=1111;
	    String Branch="B1"; String Location="Banglore";
		
    
        System.out.println("HDFC Account Detailes");
        transactOnAccount(account);
        System.out.println();
    
        account = new HDFC();
    
        System.out.println("SBI Account Detailes");
        transactOnAccount(account);
		
		account = new ICICI();
    
        System.out.println("ICICI Account Detailes");
        transactOnAccount(account);
		Person p =new Person();
		p.display();
    }
    
    public static void transactOnAccount(Bank account)
    {
        System.out.println("------------------------------");
        account.deposit(10000.0);
        printBalance("depositing 10,000.0", account);
        account.withdraw(2500.0);
        printBalance("withdrawing 2,500.0", account);
        account.withdraw(4100.0);
        printBalance("withdrawing 4,100.0", account);
        account.deposit(5000.0);
        printBalance("depositing 5,000.0", account);
        System.out.println("------------------------------");
    }
    
    public static void printBalance(String message, Bank account)
    {
        System.out.println("The balance after " + message + " is " + account.getBalance() +".");
    }
	

}

interface Bank
{
    double getBalance();

    void deposit(double amount);

    void withdraw(double amount);
}

class SBI implements Bank
{
    double deposits;
    double withdrawals;
	int Bankid=1111;
	String Branch="B1"; String Location="Banglore";

    public double getBalance()
    {
        return deposits - withdrawals;
    }

    public void deposit(double amount)
    {
        deposits += amount;
    }

    public void withdraw(double amount)
    {
        withdrawals += amount;
    }
}

class HDFC implements Bank
{
    double balance;
	int Bankid;
	String Branch, Location;

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

    public void withdraw(double amount)
    {
        balance -= amount;
    }
}
class ICICI implements Bank
{
    double balance;
	int Bankid;
	String Branch, Location;

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

    public void withdraw(double amount)
    {
        balance -= amount;
    }
}
class Person extends SBI
{
	public int PersonId, AccountNumber;  
    public String Name, TypeofAccount, Email;
	SBI s = new SBI();
	
	/*public AccountDetails(int PersonId,String Name,int Bankid,String Bankname,double Balance,double AnnualInterest )	
	{
		this.PersonId=PersonId;
		this.Name=Name;
		this.Bankid=Bankid;
		this.Bankname=Bankname;
		this.Balance=Balance;
		this.AnnualInterest=AnnualInterest;
	}*/
	
	public void display()                            /*display() method */
     {
		  String Name = "Tom";String Bankname= "SBI";
		  int PersonId=101; int Bankid = 8080;
		  double Balance = 10000; String AnnualInterest= "4.5%";
          System.out.println("\nPerson Id : "+PersonId);
          System.out.println("Name    : "+Name);
          System.out.println("Bank ID: "+Bankid);
          System.out.println("Bank Name: "+Bankname);
          System.out.println("Balance : "+Balance);
          System.out.println("Annual Interest: "+AnnualInterest);
	 }
}
class Insufficientbalance extends Exception   //Extending Exception class
{  
        Insufficientbalance(String s)    //constructor, wid parameter to be taken frm main class 
        {  
            super(s);  
        }  
}

