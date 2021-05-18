package EndtermExam;

public class Savings extends Account
{
	private double interestRate;
	
	public Savings(int AC, double interest)
	{
		super(AC);
		setInterestRate(interest);
	}
	
	public void setInterestRate(double interest)
	{
		interestRate = interest;
	}
	public double getInterestRate()
	{
		return interestRate;
	}
	
	public int getAccountNumber()
	{
		return AC;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	/*
	 * I was unsure what it meant by "[...] the get method displays the String
	 * [...]" so I assumed that putting that in the two get methods made no sense
	 * and opted to do the following. In this situation I feel like the following
	 * could be added to the abstract as an empty method to force its creation.
	 */
	public String getAccountInfo()
	{
		return("Savings Account Information\nAccount Number: " + getAccountNumber() + "\nBalance: " + getBalance() + "\nInterest Rate: " + getInterestRate() + "%");
	}
}