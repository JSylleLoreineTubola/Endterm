package EndtermExam;

public abstract class Account {
	
		protected int AC;
		protected double balance;
		
		public Account(int acctNum)
		{
			AC = acctNum;
			setBalance(0.0);
		}
		
		public void setBalance(double accountbalance)
		{
			balance = accountbalance;
		}
		
		public abstract int getAccountNumber();
		public abstract double getBalance();
		
		// Added this because it makes sense with my current application design
		public abstract String getAccountInfo();
	}
