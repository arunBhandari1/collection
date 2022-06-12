package com.dataStructure.Stack;

public class StackLinkedList<T>
{
   class Node<T> {
      Node next;
      T data;
      private Node(T data){
         this.data=data;
      }
   }

   Node head;


   public T pop(){
      Node node;
      node = head;
      head= head.next;
      if(head!=null){
         return (T) node.data;
      }
      return null;
   }
   public void push(T data){  // H-> H.node
      Node node = new Node(data);
      node.next=head;
      head=node;
   }

   public void print(){
     if(head!=null)
     {
        System.out.println(head.data);
     }
      while(head.next!=null){
         System.out.println(head.next.data);
         head.next=head.next.next;
      }
   }




   public static void main(String[] args)
   {
      StackLinkedList<Integer> struct = new StackLinkedList<>();
      struct.push(2);
      struct.push(3);
      struct.push(4);
      struct.push(5);
      struct.print();

   }




}
