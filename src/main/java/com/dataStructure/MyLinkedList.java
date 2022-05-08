package com.dataStructure;

public class MyLinkedList<T>
{
   Node head;
   public class Node<T>{
      Node next;
      T data;

      public Node(T data)
      {
         this.data= data;
      }
   }

   public void append(T data){
      if (head==null){
         head = new Node(data);
         return;
      }
      Node current = head;
      while(current.next!=null){
         current= current.next;
      }
      current.next= new Node(data);
   }


}
