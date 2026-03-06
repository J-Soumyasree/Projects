package com.learn.core.map;

import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

public class LinkedHashMapEx
{
    public static void main(String[] args)
    {
        LinkedHashMap<Object,Object> lhm=new LinkedHashMap<Object,Object>();
        lhm.put(101,"Java");//Insertion order is maintained
        lhm.put("Java",1000);//heterogeneous keys & values are allowed
        lhm.put(null,null);//null keys and values are allowed
        lhm.put(108,"Java");//Duplicates values are allowed but keys must unique
        lhm.put('A',false);//its default capacity is 16, size increases by double
        lhm.put(true,"oracle");//it is not synchronized
        lhm.put(103,2000);//available from java 1.4v
        lhm.put(107,"css");
        System.out.println(lhm);
        System.out.println("\nsize: "+lhm.size());
        System.out.println("get(key): "+lhm.get(101));
        lhm.put(108,"Spring");
        System.out.println("\n"+lhm);
        ArrayList<Object> al=new ArrayList<Object>(lhm.keySet());
        System.out.println("/n keys: "+al);
        System.out.println("\n\n Printing hashmap using ArrayList\n");
        for(Object key:al)
            System.out.println(key+"==>"+lhm.get(key));
        System.out.println("\n\n Printing hashmap using LinkedHashSet\n");
        LinkedHashSet<Object> lhs=new LinkedHashSet<Object>(lhm.keySet());
        Iterator<Object> i= lhs.iterator();
        while(i.hasNext())
        {
            Object o=i.next();
            System.out.print(o+"===>"+lhm.get(o)+" ");
        }
        System.out.println("\n\nusing entrySet(): \n");
        LinkedList<Object> ll=new LinkedList<Object>(lhm.entrySet());
        Iterator<Object> i2=ll.iterator();
        while(i2.hasNext())
        {
            // System.out.print(i2.next()+" ");
            Entry e=(Entry)i2.next();
            System.out.print(e.getKey()+"--->"+e.getValue()+"  ");
        }
    }
}
