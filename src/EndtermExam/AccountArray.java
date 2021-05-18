package EndtermExam;

public class AccountArray {

public static void main(String[] args)
{
	Account[] accountArray = new Account[10];
	
	accountArray[0] = new Checking (1234);
	accountArray[1] = new Checking (5678);
	accountArray[2] = new Checking (9101);
	accountArray[3] = new Checking (1213);
	accountArray[4] = new Checking (1415);
	accountArray[5] = new Savings (6550, 2.0);
	accountArray[6] = new Savings (3432, 0.4);
	accountArray[7] = new Savings (8908, 0.2);
	accountArray[8] = new Savings (5634, 1.9);
	accountArray[9] = new Savings (8734, 3.1);
	
	for(int i = 0; i < accountArray.length; i++)
		
		System.out.println(accountArray[i].getAccountInfo() + "\n");
}
}