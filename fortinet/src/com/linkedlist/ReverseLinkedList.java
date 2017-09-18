package com.linkedlist;

/**
 * This class will take a linkedlist and reverse it by using reverse method
 * ex:
 * Original List 
	8 -> 9 -> 3 -> 5 -> 1 -> 28 ->  
	Reversed List
	28 -> 1 -> 5 -> 3 -> 9 -> 8 -> 

 *  Time complexity O(n) as we have to traverse though all the nodes
 *  Space complexity O(1)
 */



public class  ReverseLinkedList {
	
	private  Node head;
	
	/*
	 * This method will take a Linked list of Node type and reverse the order of elements
	 * @param Node
	 * @return Node
	 */
	public  Node  reverse(Node head){
		if(head  ==  null)
			return null;
		if(head.next == null)
			return head;
		Node previousNode=null;  
		Node nextNode;  
		  while(head!=null)  
		  {  
		   nextNode=head.next;  
		  // reversing the link  
		   head.next=previousNode;  
		  // moving currentNode and previousNode by 1 node  
		   previousNode=head;  
		   head=nextNode;  
		  }  
		  return previousNode;  
	}  
	
/*
 * This method can be used to build a list for testing
 * @param Node
 */
public  void addElement(Node node){
	if (head == null) {
		   head = node;
		  } else {
		   Node temp = head;
		   while (temp.next != null)
		    temp = temp.next;
		 
		   temp.next = node;
		  }
}

/*
 * This method will get the elements of the list
 * @param Node
 */
public void getElements(Node head) {
	  Node node = head;
	  while (node != null) {
	   System.out.print( node.value + " -> ");
	   node = node.next;
	  }
	 }

//public static void main(String[] args) {
//	ReverseLinkedList list = new ReverseLinkedList();
//	int[] data  = {8,9,3,5,1,28};
//	Node head = new Node(data[0]);
//	list.addElement(head);
//	for(int i=1;i<data.length;i++){
//		list.addElement(new Node(data[i]));
//	}
//
//	 System.out.print( "Original List \n");
//	  list.getElements(head);
//	  System.out.print( " \n");
//	  //Reversing LinkedList
//	  Node rev = ReverseLinkedList.reverse(head);
//	  System.out.println("Reversed List");
//	  list.getElements(rev);
//}
}

