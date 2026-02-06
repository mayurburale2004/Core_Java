package Day_28_01_26;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MyLinkedList {
	Node head;
	public void add(int data) {
		Node newNode =new Node(data);
		if(head==null) {
			head=newNode;
			return ;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
	}
	public void addFirst(int data) {
		Node newNode = new Node(data);
		newNode.next=head;
		head=newNode;
	}
	public void delete(int key) {
		if(head==null) return;
		if(head.data==key) {
			head=head.next;
			return;
			
		}
		Node temp=head;
		while(temp.next!=null && temp.next.data!=key) {
			temp=temp.next;
		}
		if(temp.next!=null) {
			temp.next=temp.next.next;
		}
	}
public void display() {
	Node temp=head;
	while(temp!=null) {
		System.out.print(temp.data+"->");
		temp=temp.next;
	}
	System.out.println("null");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList list = new MyLinkedList();
		list.add(10);
        list.add(20);
        list.add(30);

        list.addFirst(5);

        list.display();   // 5 -> 10 -> 20 -> 30 -> null

        list.delete(20);

        list.display(); 

	}

}
