package com.learn.core.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorEx
{
    void meth1()
    {
        System.out.println("\n====meth1()=====");
        Vector<Object> v=new Vector<Object>();
        v.add(10);//insertion order maintained
        v.add(20);//available from java 1.0 version[legacy class]
        v.add("String");//Strings are allowed /=====\ heterogenous  data is allowed
        v.add('a');//Char is allowed
        v.add(true);//Boolean is allowed
        v.add(null);//nulls are allowed
        v.add(10);//dublicates are allowed
        v.add(100);//default capacity id 10, size increases by double/=====\ Synchronized[It is Threadsafe]
        for(Object data:v)
        {
            System.out.print(data+" ");
        }
        System.out.println("\n\nUsing Enumeration: ");
        Enumeration<Object> e=v.elements();
        while(e.hasMoreElements())
        {
            System.out.print(e.nextElement()+" ");
        }

        System.out.println("\n\nUsing for: ");
        for(int i=0;i<v.size();i++)
        {
            System.out.print(v.get(i)+" ");
        }
        System.out.println("\n\nUsing iterator: ");
        Iterator<Object> it=v.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println("\n\nUsing Listiterator: ");
        ListIterator<Object> lit=v.listIterator();
        while(lit.hasNext())
        {
            System.out.print(lit.next()+" ");
        }
        System.out.println("\n\nReverse Using Listiterator: ");
        ListIterator<Object> lir=v.listIterator(v.size());
        while(lir.hasPrevious())
        {
            System.out.print(lir.previous()+" ");
        }

        v.add(30);
        v.addFirst("first");
        v.addLast("Last");
        v.removeElementAt(v.size()-1);
        System.out.println("\n\nUsing Enumeration: ");
        Enumeration<Object> e1=v.elements();
        while(e1.hasMoreElements())
        {
            System.out.print(e1.nextElement()+" ");
        }
    }

    public static void main(String[] args)
    {
        VectorEx obj=new VectorEx();
        obj.meth1();
    }
}
