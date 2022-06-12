package com.traversing;

import java.util.*;

public class Graph<T>
{
   private HashMap<T, Node> hashMap = new HashMap();

   public class Node<T>
   {
      T                   id;
      LinkedList<Node<T>> adjacent = new LinkedList<>();

      Node(T id)
      {
         this.id = id;
      }
   }

   private Node getNode(T id)
   {
      return hashMap.get(id);
   }

   public void addNode(T id)
   {
      hashMap.put(id, new Node<>(id));
   }

   public void addEdge(T source, T destination)
   {
      Node sou  = getNode(source);
      Node dest = getNode(destination);
      sou.adjacent.add(dest);
   }

   public boolean hasPathDFS(T source, T destination)
   {
      Node       sou     = getNode(source);
      Node       dest    = getNode(destination);
      HashSet<T> visited = new HashSet<>();
      return hasPathDFS(sou, dest, visited);
   }

   private boolean hasPathDFS(Node<T> sou, Node<T> dest, HashSet<T> visited)
   {
      if (visited.contains(sou.id))
      {
         return false;
      }
      visited.add(sou.id);
      if (sou == dest)
      {
         return true;
      }
      for (Node child : sou.adjacent)
      {
         if (hasPathDFS(child, dest, visited))
         {
            return true;
         }
      }
      return false;
   }

   private boolean hasPathBFS(Node<T> source, Node<T> destination)
   {
      Queue<Node<T>> queue = new LinkedList<>();

      Set<Node<T>> visited = new HashSet<>();
      queue.add(source);
      while (!queue.isEmpty())
      {
         Node<T> lastNode = queue.poll();
         if(lastNode.id== destination.id){
            return true;
         }
         if (!visited.contains(lastNode))
         {
            visited.add(lastNode);
         }

         for (Node<T> node : lastNode.adjacent)
         {
               if (!visited.contains(node)){
                  queue.add(node);
               }
         }

      }
      return false;

   }

   private void printPath(Node<T> source, Node<T> destination)
   {
      Queue<Node<T>> nextToVisit = new LinkedList<>();
      HashSet<T>     visited     = new HashSet<>();
      nextToVisit.add(source);
      while (!nextToVisit.isEmpty())
      {
         Node<T> node = nextToVisit.remove();
         System.out.println(node.id);

         for (Node<T> child : node.adjacent)
         {
            if (!visited.contains(child.id))
            {
               visited.add(child.id);
            }
            nextToVisit.add(child);
         }
      }

   }

   private boolean hasPathBFS(T source, T dest)
   {
      return hasPathBFS(getNode(source), getNode(dest));

   }

   public static void main(String[] args)
   {
      Graph<Integer> graph = new Graph<>();
      for (int i = 1; i < 19; i++)
      {
         graph.addNode(i);
      }
      graph.addEdge(5, 7);   //5-7-14
      graph.addEdge(5, 8);
      graph.addEdge(5, 9);
      graph.addEdge(5, 7);

      graph.addEdge(7, 12);
      graph.addEdge(7, 1);
      graph.addEdge(7, 14);
      graph.addEdge(8, 2);
      graph.addEdge(10, 1);

      System.out.println(graph.hasPathBFS(5,10));
   }

}
