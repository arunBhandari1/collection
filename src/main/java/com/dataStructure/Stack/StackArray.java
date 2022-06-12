package com.dataStructure.Stack;

import java.util.Arrays;
import java.util.Stack;

public class StackArray<T>
{

   T[] stackArray;
   int capacity = 10;
   int size     = 0;

   public StackArray()
   {
      stackArray = (T[]) new Object[capacity];
   }

   public void push(T data)
   {
      if (size > capacity)
      {
         increaseSize();
      }
      stackArray[size++] = data;

   }

   public T pop()
   {
      return stackArray[size--];
   }

   public void print()
   {
      for (int i = 0; i < size; i++)
      {
         System.out.println(stackArray[i]);
      }
   }

   private void increaseSize()
   {
      stackArray = Arrays.copyOf(stackArray, capacity * 2);
      capacity = capacity * 2;
   }

   public static void main(String[] args)
   {
      StackArray<Integer> struct = new StackArray<>();
      struct.push(2);
      struct.push(3);
      struct.push(4);
      struct.push(5);
      struct.pop();
      struct.print();

   }

}
