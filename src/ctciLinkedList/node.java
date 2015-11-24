package ctciLinkedList;

public class node {
	node next=null;
	int data;
	public node(int d){
		this.data=d;
	}
	public void appendToTail(int d){
		node end=new node(d);
		node n=this;
		while(n.next!=null){
			n=n.next;
		}
		n.next=end;
	}
	public node delete(node head,int d){
		node n=head;
		if(n.data==d){
			return n.next;
		}
		while(n.next!=null){
			if(n.next.data==d){
				n.next=n.next.next;
				return head;
			}
			n=n.next;
		}
		return head;
	}
}
