package com.learn.core.set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetEx
{
    public static void main(String[] args)
    {
        TreeSet<Object> t = new TreeSet<Object>();
        t.add(10);//insertion order is not maintained but Ascending order maintained
        // t.add("String");//Heterogenous data is not allowed
        // t.add('a');
        t.add(10);//duplicates are not allowed
        // t.add(true);
        // t.add(null); //nulls are not allowed
        t.add(20);
        t.add(30);//available from java 1.2v
        t.add(20);
        t.add(50);//default capacity is 16 , size increases by double
        t.add(40);//not synchronized

        System.out.println(t);

        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(100);
        al.add(15);
        al.add(35);
        al.add(67);
        al.add(8);

        TreeSet<Integer> t1=new TreeSet<>(al);
        System.out.println(t1);
        t.addAll(al);
        System.out.println(t);
        System.out.println("\n\nAscending order: ");
        Iterator<Object> i=t.iterator();
        while(i.hasNext())
        {
            System.out.print(i.next()+" ");
        }
        System.out.println("Descending order: ");
        Iterator<Object> ds=t.descendingIterator();
        while(ds.hasNext())
        {
            System.out.print(ds.next()+" ");
        }


    }
}
