package com.learn.core.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx
{
    void meth1()
    {
        System.out.println("\n=====meth1(objects)====");
        LinkedList<Object> ll=new LinkedList<Object>();
        ll.add(100);//insertion order is maintained
        ll.add(true);//heterogenous data is allowed
        ll.add(null);//nulls are allowed
        ll.add("String");//available from java 1.2v
        ll.add('a');//default capacity is 0 ,size increase by double
        ll.add(100);//duplicates allowed
        ll.add(200);//not synchronized

        for(int i=0;i<ll.size();i++)
        {
            System.out.print(ll.get(i)+" ");
        }
        System.out.println("\n\nReverse of ll");
        for(int i=ll.size()-1;i>=0;i--)
        {
            System.out.print(ll.get(i)+" ");
        }
        System.out.println("\n\nUsing for each: ");
        for(Object data:ll)
        {
            System.out.print(data+" ");
        }
        System.out.println("\n\nUsing iterator: ");
        Iterator it=ll.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println("\n\nUsing Listiterator: ");
        ListIterator lit=ll.listIterator();
        while(lit.hasNext())
        {
            System.out.print(lit.next()+" ");
        }
        System.out.println("\n\nReverse Using Listiterator: ");
        ListIterator<Object> r=ll.listIterator(ll.size());
        while(r.hasPrevious())
        {
            System.out.print(r.previous()+" ");
        }
    }
    void meth2()
    {
        System.out.println("\n\n======meth2()======== ");
        LinkedList<Integer> ll2=new LinkedList<Integer>();
        ll2.add(10);
        ll2.add(20);
        ll2.add(30);
        ll2.add(40);
        ll2.add(50);
        ListIterator<Integer> r=ll2.listIterator();
        while(r.hasNext())
        {
            System.out.print(r.next()+" ");
        }
        ll2.remove();
        System.out.println("\n\n");

        for(Object data:ll2)
        {
            System.out.print(data+" ");
        }
        ll2.add(0,10);
        System.out.println("\n\n");
        for(Object data:ll2)
        {
            System.out.print(data+" ");
        }
        ll2.add(3,500);
        System.out.println("\n\n");
        for(Object data:ll2)
        {
            System.out.print(data+" ");
        }
        ll2.addFirst(100);
        ll2.addLast(1000);
        ll2.remove((Integer)30);
        System.out.println("\n\n");
        System.out.println(ll2.contains(50));
        ll2.removeFirstOccurrence(50);
        ll2.offerFirst(1000);
        for(Object data:ll2)
        {
            System.out.print(data+" ");
        }
    }
    public static void main(String[] args)
    {
        LinkedListEx obj=new LinkedListEx();
        obj.meth1();
        obj.meth2();
    }
}
