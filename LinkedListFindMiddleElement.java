public class LinkedListFindMiddleElement{
	
	Node head;
	Node tail;
	int size;
	
	public MyLinkedList(){
		head = null;
		size = 0;
	}
	
	public int getSize(){
		return size;
	}
	
	public Node find(){
		//to be implemented
		return null;
	}
	
	public boolean isEmpty(){
		if(head == null) return true;
		else return false;
	}
	
	public void insert(Node node){
		//empty
		if(head == null){
			head = node;
			tail = node;
			size++;
		}
		//non empty
		else{
			tail.next = node;
			tail = node;
			size++;
		}
	}
	
	public void deleteNode(Node nodeToDelete){
		if(head == null) return;
		while(){
			//to be implemented
		}
	}
	
  //----- get element in the middle method ----- //
	public Node getMiddle(){
		Node fast = this.head;
		Node slow = this.head;
		if(this.head == null) return new Node("");
		while(!(fast.next == null)){
			slow = slow.next;
			fast = fast.next;
			if(fast.next == null) return slow;
			else{
				fast = fast.next;
			}
			
		}
		return new Node("");
	}
	
}


class Node{
	
	public String name;
	
	public Node next;
	
	public Node(String name){
		this.name = name;	
	}
	
	public void display(){
		System.out.println(name);
	}
		
}
