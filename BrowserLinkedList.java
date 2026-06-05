//create a browser history system where each visited page is stored as a node,Use a can visit new pages and display browsing history and search for a page and delete a page from history and count total visited pages
import java.util.Scanner;
class Node {
    String page;
    Node next;
    Node(String page) {
        this.page = page;
        this.next = null;
    }
}
class BrowserHistory {
    Node head;
    void visitPage(String page) {
        Node newNode = new Node(page);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println(page + " visited successfully.");
    }
    void displayHistory() {
        if (head == null) {
            System.out.println("No browsing history.");
            return;
        }
        System.out.println("Browsing History:");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.page);
            temp = temp.next;
        }
    }
    void searchPage(String page) {
        Node temp = head;

        while (temp != null) {
            if (temp.page.equalsIgnoreCase(page)) {
                System.out.println(page + " found in history.");
                return;
            }
            temp = temp.next;
        }

        System.out.println(page + " not found in history.");
    }
    void deletePage(String page) {
        if (head == null) {
            System.out.println("History is empty.");
            return;
        }
        if (head.page.equalsIgnoreCase(page)) {
            head = head.next;
            System.out.println(page + " deleted from history.");
            return;
        }
        Node temp = head;
        while (temp.next != null &&
               !temp.next.page.equalsIgnoreCase(page)) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println(page + " not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println(page + " deleted from history.");
        }
    }
    void countPages() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total visited pages: " + count);
    }
}
public class BrowserLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BrowserHistory bh = new BrowserHistory();
        while (true) {
            System.out.println("\n--- Browser History Menu ---");
            System.out.println("1. Visit Page");
            System.out.println("2. Display History");
            System.out.println("3. Search Page");
            System.out.println("4. Delete Page");
            System.out.println("5. Count Pages");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter page URL: ");
                    String page = sc.nextLine();
                    bh.visitPage(page);
                    break;
                case 2:
                    bh.displayHistory();
                    break;
                case 3:
                    System.out.print("Enter page to search: ");
                    page = sc.nextLine();
                    bh.searchPage(page);
                    break;
                case 4:
                    System.out.print("Enter page to delete: ");
                    page = sc.nextLine();
                    bh.deletePage(page);
                    break;
                case 5:
                    bh.countPages();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}