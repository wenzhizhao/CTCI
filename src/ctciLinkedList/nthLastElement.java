package ctciLinkedList;

public class nthLastElement {
	public int findNthLastElement(node head,int n){
		int i=0;
		if(head==null){
			return 0;
		}
		i=findNthLastElement(head.next,n)+1;
		System.out.println("the "+i+" recursive call");
		//findNthLastElement(head.next,n);
		if(i==n){
			System.out.println(head.data);
		}
		return i;
	}
}
