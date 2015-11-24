package ctciLinkedList;

public class test {

	/*******************
	 * 2.2
	 * 
	 * 
	 * 
	 *******************/
	public static void main(String[] args){
		int last=3;
		node head=new node(0);
		for(int i=1;i<11;i++){
			head.appendToTail(i);
		}
		node n=head;
		System.out.println("the linked list is ");
		while(n!=null){
			System.out.print(n.data+",");
			n=n.next;
		}
		System.out.println("");
		nthLastElement nle = new nthLastElement();
		int k=nle.findNthLastElement(head, last);
		System.out.println(k);
	}
	
}
