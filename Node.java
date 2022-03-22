public class Node {
	int num;
	public Node next=null,prev=null;
	public Node head,tail;
	public Node() {
		// TODO Auto-generated constructor stub
		head=tail=null;
	}

	public Node(int number) {
		num=number;
	}
	
	public Node(int number,Node n,Node p) {
		num=number;
		next=n;
		prev=p;
	}
	
	
	public boolean empty() {
		return head==null;
	}
	
	public void addHead(int el) {
		if(!empty()) {
			head = new Node(el,head,null);
			head.next.prev=head;
		}
		else
			tail=head=new Node(el,null,null);
	}
	
	public void addTail(int el) {
		if(!empty()) {
			tail= new Node(el,null,tail);
			tail.prev.next=tail;
		}
		else {
			head=tail=new Node(el,null,null);
		}
	}
	
	public int deleteHead() {
		if(!empty()) {
			int el=head.num;
			if(head==tail)
				head=tail=null;
			else {
				head=head.next;
				head.prev=null;
			}
			return el;
		}
		return 0;
	}
	
	public int deleteTail() {
		if(!empty()) {
			int el=tail.num;
			if(head==tail)
				head=tail=null;
			else {
				tail=tail.prev;
				tail.next=null;
			}
			return el;
		}
		return 0;
	}
	
	public void delete(int el) {
		if(!empty()) {
			if(head==tail && head.num==el)
				head=tail=null;
			else if(el==head.num) {
				head=head.next;
				head.prev=null;
			}
			else {
				Node temp;
				for(temp=head.next,temp.prev=head;temp!=null&&temp.num!=el;temp.prev=temp,temp=temp.next);
				if(temp!=null) 
					temp.prev.next=temp.next;
					temp.next.prev=temp.prev;
				if(temp==tail)	
					tail=prev;	
			}
		}
	}
	
	public boolean isInList(int el) {
		Node temp;
		for(temp=head;temp!=null&&temp.num!=el;temp=temp.next);
		return temp!=null;
	}
	
	public void printLink() {
		if(!empty()) {
			Node temp;
			for(temp=head;temp!=null;temp=temp.next)
			System.out.print(temp.num+" ");
		}
	}
}