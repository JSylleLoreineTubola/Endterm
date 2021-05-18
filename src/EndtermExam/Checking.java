package EndtermExam;
public class Checking extends Account
{
	public Checking(int AC)
	{
		super(AC);
	}
	
	public int getAccountNumber()
	{
		return AC;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String getAccountInfo()
	{
		return("Checking Account Information\nAcct Num: " + getAccountNumber() + "\nBalance: " + getBalance());
	}
}