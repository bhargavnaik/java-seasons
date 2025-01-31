package sep13;

public class Bank {

	private double balance=10000;
	
	//public methods to access private variables 
	
	//getters
	
	public void getBalance(int pin)
	{
		//validation
		if(pin==9999)
		{
			System.out.println("Balance"+balance);
		}
		else
		{
			System.out.println("Wrong pin entered");
		}
	}	
	//setters
	public void setBalance(double deposit)
	{
	
		balance = balance+deposit;
	}
}
