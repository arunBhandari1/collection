package com.dataStructure;

public class MyStack<T>
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
   public void add(T data){  // H-> H.node
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
      MyStack<Integer> struct = new MyStack<>();
      struct.add(2);
      struct.add(3);
      struct.add(4);
      struct.add(5);
      struct.print();

   }




}
