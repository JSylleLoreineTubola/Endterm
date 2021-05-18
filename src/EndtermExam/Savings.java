package EndtermExam;

public class Savings extends Account
{
	private double interestRate;
	
	public Savings(int AC, double interest)
	{
		super(AC);
		setInterestRate(interest);
	}
	
	
	public double getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
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
		return("Savings Account Information \nAccount Number: " + getAccountNumber() + "\nBalance: " + getBalance() + "\nInterest Rate: " + getInterestRate() + "percent");
	}
}