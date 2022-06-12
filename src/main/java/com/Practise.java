package com;

public class Practise<T>
{

   public  void print(){
      Node dub= head;
      while(dub.next!=null){
         System.out.print(dub.data +" ");
         dub=dub.next;
      }
      System.out.println("");
   }
   Node<T> head;

   public void add(T data){
      Node<T> node = new Node(data);
      node.next= head;
      head=node;

   }

   public Node<T>  pop(){
      Node top = head;
      head=head.next;
      return top;
   }

   public static void main(String[] args)
   {
    Practise practise= new Practise();
    practise.add(1);
      practise.add(2);practise.add(3);practise.add(4);practise.add(5);practise.add(6);


   practise.print();
      System.out.println("------------------------");
    practise.pop();
      practise.print();


   }



 public static class Node<T> {
    T data;
    Node<T> next;
    public Node(T data){
       this.data = data;
    }

    public void setNext(Node t){
       this.next= t;
    }


 }


}
