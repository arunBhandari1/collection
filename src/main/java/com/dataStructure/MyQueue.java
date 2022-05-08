package com.dataStructure;

public class MyQueue<T>
{
   Node head; //remove here
   Node tail; //add here

   public class Node<T>
   {
      public Node(T data)
      {
         this.data = data;
      }

      T    data;
      Node next;
   }

   public boolean isEmpty()
   {
      return head == null;
   }

   public void queue(T data)
   {
      Node node = new Node(data);
      if (tail != null) //adding to tail
      {
         tail.next = node;
      }
      tail = node; //setting new tail
      if (head == null)
      {
         head = node;    //if empty previously head and tail will be the same node
      }
   }

   public T dequeue()
   {
      if (isEmpty())
      {
         return null;
      }
      T data = (T) head.data;
      head = head.next;
      if (head == null)
      {
         tail = null;
      }
      return data;

   }

   public void println()
   {
      if (head != null)
      {
         System.out.println(head.data);
      }
      while (head.next != null)
      {
         System.out.println(head.next.data);
         head.next = head.next.next;
      }
   }

   public static void main(String[] args)
   {
      MyQueue<Integer> struct = new MyQueue<>();
      struct.queue(2);
      struct.queue(3);
      struct.queue(4);
      struct.dequeue();
      struct.queue(5);
      struct.println();

   }

}
