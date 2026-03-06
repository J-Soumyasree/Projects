package com.learn.core.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSetEx
{
    void meth1()
    {
        HashSet<Object> h=new HashSet<Object>();
        h.add(10);//insertion order not maintained
        h.add("string");//heterogenous data is allowed
        h.add(null);//nulls are allowed
        h.add('c');//default capacity is 16, size increases by double
        h.add(true);//available from java 1.2v
        h.add(10);//duplicates are not allowed
        h.add(1);//it is not synchronized
        h.add(100);
        System.out.println(h);
        System.out.println("size: "+h.size());
        System.out.println("\n\nusing for each: ");
        for(Object data:h)
        {
            System.out.print(data+" ");
        }
        System.out.println("\n\nusing iterator: ");
        Iterator<Object> i=h.iterator();
        while(i.hasNext())
        {
            System.out.print(i.next()+" ");
        }
        System.out.println("\n\nreversing using listiterator: ");
        ArrayList<Object> al=new ArrayList<>(h);
        ListIterator<Object> li=al.listIterator(al.size());
        while(li.hasPrevious())
        {
            System.out.print(li.previous()+" ");
        }
        h.add(20);
        h.remove(10);
        h.contains(100);
        System.out.println("\n---->"+h.contains(100));
        System.out.println(h.isEmpty());
        System.out.println(h.size());
        System.out.println(h);


    }

    public static void main(String[] args) {
        HashSetEx obj=new HashSetEx();
        obj.meth1();
    }
}
