package com.learn.core.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class LinkedHashSetEx
{
    public static void main(String[] args)
    {
        LinkedHashSet<Object> lh=new LinkedHashSet<Object>();
        lh.add(10);//insertion order maintained
        lh.add("string");//heterogenous data allowed
        lh.add('c');//available from java 1.4v
        lh.add(10);//duplicates are allowed
        lh.add(true);//its default capacity is 16, size increases by double
        lh.add(null);//not synchronized
        lh.add(20);
        lh.add(30);
        System.out.println(lh);
        ArrayList<Object> al=new ArrayList<Object>(lh);
        ListIterator<Object> li=al.listIterator();
        while(li.hasNext())
        {
            System.out.print(li.next()+" ");
        }
    }
}
