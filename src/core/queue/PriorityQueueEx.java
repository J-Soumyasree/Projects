package com.learn.core.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEx
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(60);//insertion order is not maintained but 1st ele will be smallest number
       // pq.add("string");//heterogenous data is not allowed
       // pq.add('c');//available from java 1.5v
        pq.add(20);
        pq.add(30);
       // pq.add(true);//its default capacity is 11, size increases by double
       //  pq.add(null);//null value is not allowed
        pq.add(10);//not synchronized
        pq.add(90);
        pq.add(10);//duplicates are allowed
        pq.add(50);
        System.out.println(pq);
        System.out.println("size: "+pq.size());
        Iterator<Integer> i=pq.iterator();
        while(i.hasNext())
        {
            System.out.print(i.next()+" ");
        }
        System.out.println("\nsorting using Collections: ");
        ArrayList<Integer> al=new ArrayList<Integer>(pq);
        Collections.sort(al);
        System.out.println(al);
        System.out.println("\npoll(): "+pq.poll());
        System.out.println(pq);
        System.out.println("\npoll(): "+pq.poll());
        System.out.println(pq);
        System.out.println("\npoll(): "+pq.poll());
        System.out.println(pq);
        System.out.println("\nremove(): "+pq.remove(50));
        System.out.println(pq);
        System.out.println("\npeek(): "+pq.peek());
        System.out.println(pq);

    }
}
