package com.dataStructure;

public class MyBinaryTree<T extends Comparable<T>>
{
   class Node<T>
   {
      Node left, right;
      T data;

      public Node(T data)
      {
         this.data = data;
      }
   }

   Node root;

   public void insert(T data)
   {
      root =insertData(root, data);
   }

   private Node insertData(Node root, T data)
   {
      if (root == null)
      {
         root = new Node(data);
         return root;
      }
      if (data.compareTo((T) root.data) < 0)
      {
         root.left = insertData(root.left, data);
      }
      else
      {
         root.right = insertData(root.right, data);
      }
      return root;
   }

   public void inorder(){
      inorderPrint(root);
   }

   private void inorderPrint(Node root)
   {
      if (root!=null){
         inorderPrint(root.left);
         System.out.println(root.data);
         inorderPrint(root.right);
      }
   }

   public boolean contains(T data){
      return containsData(root,data);
   }

   private boolean containsData(Node root, T data)
   {
      if(root.data.equals(data)){
         return true;
      }
      if(data.compareTo((T) root.data)<0){
         return containsData(root.left,data);
      }else
      {
         return containsData(root.right, data);
      }

   }

   public static void main(String[] args)
   {
      MyBinaryTree<Integer> s = new MyBinaryTree<>();
      s.insert(5);
      s.insert(4);
      s.insert(10);
      s.insert(3);
      s.inorder();
   }
}
