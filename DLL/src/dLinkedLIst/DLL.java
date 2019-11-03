package dLinkedLIst;

public class DLL {
	public Node head;
	public Node tail;
	
	public DLL() {
		this.head=null;
		this.tail = null;
	}
//	METHODS
	public void push(Node newNode) {
		if(this.head==null) {
			this.head = newNode;
			this.tail = newNode;
		}else {
			Node lastNode = this.tail;
			lastNode.next = newNode;
			newNode.previous = lastNode;
			this.tail = newNode;
		}		
	}
	public void printValuesForward() {
		Node current = this.head;
		while(current != null) {
			System.out.println(current.value);
			current = current.next;
		}
	}
	public void printValuesBackward() {
		Node current = this.tail;
		while(current.previous != null) {
			System.out.println(current.value);
			current = current.previous;
		}
	}
	public Node pop() {
		if(this.tail==null) {
			System.out.println("Error: List is empty!");
		}
		Node last =this.tail;
		this.tail = last.previous;
		return last;
	}
	public boolean contains(int value) {
		Node current = this.head;
		while(current !=null) {
			if(current.value == value) {
				return true;
			}else {
				current = current.next;
			}
		}
		return false;
	}
	public int size() {
		Node current = this.head;
		int tally = 0;
		while(current != null) {
			tally ++;
			current = current.next;
		}
		return tally;
	}

		
	
	
//END
}
