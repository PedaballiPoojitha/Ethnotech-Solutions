class ReserveBank{
	String accountnumber;
	private String accountholdername;
	int balance;
	ReserveBank(String accountnumber,String accountholdername,int balance){
		this.accountnumber=accountnumber;
		this.accountholdername=accountholdername;
		this.balance=balance;
	}
	public void display(){
		System.out.println("Reserve Bank of India");
		System.out.println("Account Holder Name:"+accountholdername);
		System.out.println("Account Number:"+accountnumber+"\nBalance:"+balance);
	}
	public void deposit(int amount){
		balance+=amount;
		System.out.println("Total Amount after Deposit:"+balance);
	}
	public void withdraw(int amount){
	if(amount <= balance){
		balance -= amount;
		System.out.println("Total Amount after withdraw:"+balance);
	}
	else{
		System.out.println("Insufficient Balance");
	}
}
}
class CanaraBank extends ReserveBank{
	CanaraBank(String accountnumber,String accountholdername,int balance){
		super(accountnumber,accountholdername,balance);
	}
	public void display(){
		super.display();
	}
	public void deposit(int amount){
		super.deposit(amount);
	}
	public void withdraw(int amount){
		super.withdraw(amount);
	}
	
}
class Bank{
	public static void main(String[] args){
		CanaraBank obj=new CanaraBank("234agf54","Poojitha",20000);
		obj.display();
		obj.deposit(2000);
		obj.withdraw(1500);
	}
}