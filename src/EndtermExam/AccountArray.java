package EndtermExam;

public class AccountArray {

public static void main(String[] args)
{
	Account[] accountArray = new Account[10];
	
	accountArray[0] = new Checking(11);
	accountArray[1] = new Checking(12);
	accountArray[2] = new Checking(13);
	accountArray[3] = new Checking(14);
	accountArray[4] = new Checking(15);
	accountArray[5] = new Savings(21, 1.0);
	accountArray[6] = new Savings(22, 1.1);
	accountArray[7] = new Savings(23, 1.2);
	accountArray[8] = new Savings(24, 1.3);
	accountArray[9] = new Savings(25, 1.4);
	
	for(int i = 0; i < accountArray.length; ++i)
		System.out.println(accountArray[i].getAccountInfo() + "\n");
}
}