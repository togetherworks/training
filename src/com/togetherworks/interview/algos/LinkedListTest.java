package com.togetherworks.interview.algos;

/**
 * Java program to find middle element of linked list in one pass.
 * In order to find middle element of linked list we need to find length first
 * but since we can only traverse linked list one time, we will use two pointers
 * one which we will increment on each iteration while other which will be
 * incremented every second iteration. so when first pointer will point to the
 * end of linked list, second will be pointing to the middle element of linked list
 * @author
 */


public class LinkedListTest {
	  
    public static void main(String args[]) {
        //creating LinkedList with 5 elements including head
      LinkedListExample linkedList = new LinkedListExample();
      LinkedListExample.Node head = linkedList.head();
      linkedList.add( new LinkedListExample.Node("1"));
      linkedList.add( new LinkedListExample.Node("2"));
      linkedList.add( new LinkedListExample.Node("3"));
      linkedList.add( new LinkedListExample.Node("4"));
    
      //finding middle element of LinkedList in single pass
      LinkedListExample.Node current = head;
      int length = 0;
      LinkedListExample.Node middle = head;
    
      while(current.next() != null){
          length++;
          if(length%2 ==0){
              middle = middle.next();
          }
          current = current.next();
      }
    
      if(length%2 == 1){
          middle = middle.next();
      }

      System.out.println("length of LinkedList: " + length);
      System.out.println("middle element of LinkedList : " + middle);
      
    } 
  
}


