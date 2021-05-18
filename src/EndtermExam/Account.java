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
		
		public abstract double getBalance();
		public abstract int getAccountNumber();
		public abstract String getAccountInfo();
	}
