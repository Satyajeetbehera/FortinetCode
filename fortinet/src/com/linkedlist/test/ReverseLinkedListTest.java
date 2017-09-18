package com.linkedlist.test;

import org.junit.Assert;
import org.junit.Test;

import com.linkedlist.Node;
import com.linkedlist.ReverseLinkedList;


public class ReverseLinkedListTest {

	
	
	@Test
    public void testNullList() {
        ReverseLinkedList list = new ReverseLinkedList();
        Node head = list.reverse(null);
        Assert.assertEquals(null, head);
    }
	
	@Test
    public void testListOneElement() {
        ReverseLinkedList list = new ReverseLinkedList();
        Node head = new Node(5);
        Node rev = list.reverse(head);
        Assert.assertEquals(rev, head);
    }


	@Test
    public void testAverageList() {
        ReverseLinkedList list = new ReverseLinkedList();
        int[] data  = {8,9,3,5,1,28};
    	Node head = new Node(data[0]);
    	list.addElement(head);
    	for(int i=1;i<data.length;i++){
    		list.addElement(new Node(data[i]));
    	}
    	
    	Node rev = list.reverse(head);
    	Node rev1 = list.reverse(rev);
//    	list.getElements(head);
//    	list.getElements(rev);
        Assert.assertEquals(rev1,head);
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