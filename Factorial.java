import java.util.*;
class Factorial{
	public static int factorial(int num){
		if(num==0||num==1){
			return 1;
		}
		return num*factorial(num-1);
	}
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=scanner.nextInt();
		System.out.println("Factorial of a number:"+factorial(n));
	}
}
