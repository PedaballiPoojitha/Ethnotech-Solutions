import java.util.*;
interface UPIPayment{
	void display();
}
interface CashPayment{
	void show();
}
class Payments implements UPIPayment,CashPayment{
	public void display(){
		System.out.println("UPI Payment is Successful!");
	}
	public void show(){
		System.out.println("Cash Payment is Successful!");
	}
}
class InterfacePayment{
	public static void main(String[] args){
		Payments p=new Payments();
		p.display();
		p.show();
	}
}