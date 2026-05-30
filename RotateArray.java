//Rotate an array by K Positions Right Shift
import java.util.*;
class RotateArray{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n=sc.nextInt();//5
		int[] arr=new int[n];
		System.out.println("Enter the values of an array");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();//1,2,3,4,5
		}
		System.out.println("Before rotating an array:"+Arrays.toString(arr));
		System.out.println("Enter the Kpositions to rotate an array:");
		int k=sc.nextInt();//3
		k=k%n;
		for(int i=0;i<k;i++){
			int temp=arr[n-1];//temp=5//temp=4//3
			for(int j=n-1;j>0;j--){
				arr[j]=arr[j-1];//5=>4//4=>3//3=>2
			}
			arr[0]=temp;//arr[0]=5//arr[0]=4=>3
			System.out.println("Each Iteration"+i+":"+Arrays.toString(arr));//5,1,2,3,4//4,5,1,2,3//3,4,5,1,2
		}
		System.out.println("After rotating an array:"+Arrays.toString(arr));//3,4,5,1,2
	}
	
}