interface notfications{
	void sendMessages(String message);
}
class Mobilenotification implements notfications{
	public void sendMessages(String message){
		System.out.println("Sending mobile notification :"+message);
	}
}
class Emailnotification implements notfications{
	public void sendMessages(String message){
		System.out.println("Sending email notification :"+message);
	}
}
class notificationsystem{
	public static void main(String[] args){
		Mobilenotification mobile=new Mobilenotification();
		Emailnotification email=new Emailnotification();
		mobile.sendMessages("You have a new message!");
		email.sendMessages("You have a new email!");
		
	}
}