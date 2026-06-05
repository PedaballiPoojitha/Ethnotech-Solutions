class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class LinkedList {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
		Node firstnode=new Node(10);
		Node secondnode=new Node(20);
		Node thirdnode=new Node(30);
		firstnode.next=secondnode;
		secondnode.next=thirdnode;
		System.out.println("LinkedList :");
		Node currentnode=firstnode;
		while(currentnode!=null){
		System.out.print(currentnode.data+"->");
		currentnode=currentnode.next;
		}
		System.out.println("null");
		int temp=firstnode.next.data;
		System.out.println(temp);
	}
	
}