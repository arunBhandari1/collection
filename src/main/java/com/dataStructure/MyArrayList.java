package com.dataStructure;

import java.util.ArrayList;

public class MyArrayList<T>
{
   int size=0;
   int capacity=20;
   Object[] obj;

   public MyArrayList(){
      Object[] obj = new Object[capacity];
   }

   public boolean add(T data){
      obj[size++]= data;
      return true;
   }
   public T get(int index){
      return (T) obj[index];
   }


   public static void main(String[] args)
   {
      MyArrayList<Integer> arrayList= new MyArrayList<Integer>();
      arrayList.add(4);
      arrayList.add(46);
      arrayList.add(5);
      arrayList.add(7);arrayList.add(8);

      for(int i=0;i< arrayList.size;i++){
         System.out.println(arrayList.get(i));
      }
   }



}
