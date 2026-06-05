//create a java program for social media feed navigation for next post,prev post and delete and insert a sponsored post
import java.util.*;
class Node{
	int data;
	Node next;
	Node prev;
	boolean isSponsored;
	Node(int data){
		this.data=data;
		this.next=null;
		this.prev=null;
		this.isSponsored=false;
	}
}
class Sponser{
	Node head=null;
	Node tail=null;
	public Node nextPost(Node current){
		if(current!=null && current.next!=null){
			current=current.next;
			System.out.println("Move to the next post: " + current.data + (current.isSponsored ? " [SPONSORED]" : ""));
            return current;
		}
		System.out.println("You are already at the end of the feed.");
        return current;	
	}
	public Node prevPost(Node current){
		if(current!=null && current.prev!=null){
			current=current.prev;
			System.out.println("Moved Backward to Post ID: " + current.data + (current.isSponsored ? " [SPONSORED]" : ""));
            return current;
		}
		System.out.println("You are already at the beginning of the feed.");
        return current;	
	}
	public void insertSponsored(Node current, int adId) {
        if (current == null) {
            System.out.println("Feed is empty. Cannot insert sponsored post.");
            return;
        }
        Node adNode = new Node(adId);
        adNode.isSponsored = true;
        adNode.next = current.next;
        adNode.prev = current;
		if (current.next != null) {
            current.next.prev = adNode;
        } else {
            this.tail = adNode; 
        }
        current.next = adNode;
        System.out.println("Successfully inserted Sponsored Ad ID " + adId + " right after Post ID " + current.data);
    }
	public Node deleteCurrentPost(Node current) {
        if (current == null) {
            System.out.println("Feed is empty. Nothing to delete.");
            return null;
        }

        System.out.println("Deleting Post ID: " + current.data);
        Node toDelete = current;

        if (toDelete.prev != null) {
            toDelete.prev.next = toDelete.next;
        } else {
            this.head = toDelete.next; 
        }

        if (toDelete.next != null) {
            toDelete.next.prev = toDelete.prev;
        } else {
			this.tail = toDelete.prev; 
        }

        if (toDelete.next != null) {
            return toDelete.next;
        } else {
            return toDelete.prev;
        }
    }
    public void appendPost(int id) {
        Node newNode = new Node(id);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            newNode.prev = this.tail;
			this.tail = newNode;
		}
	}
}
public class DoublyLinkedList {
    public static void main(String[] args) {
        Sponser feed = new Sponser();
		feed.appendPost(10);
        feed.appendPost(20);
        feed.appendPost(30);
        Node current = feed.head; 
        System.out.println("Feed App Initialized. Current Screen: Post ID " + current.data);
        current = feed.nextPost(current);
        feed.insertSponsored(current, 999);
        current = feed.nextPost(current);
        current = feed.nextPost(current);
		current = feed.prevPost(current); 
        current = feed.deleteCurrentPost(current);
        if (current != null) {
            System.out.println("System active post fallback reference: Post ID " + current.data);
        }
    }
}

		