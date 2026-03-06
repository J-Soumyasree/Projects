package com.learn.core.map;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
public class HashTableEx
{
    public static void main(String[] args)
    {
        Hashtable<Object,Object> ht=new Hashtable<Object,Object>();
        ht.put(101,"Java");//insertion order is not maintained
        ht.put("Java",1000);//heterogeneous keys and values are allowed
        ht.put(false,2000);//null keys & values are not allowed
        ht.put(108,"Java");//duplicates values are allowed
        ht.put('A',false);//it is available from Java 1.0v [legacy class]
        ht.put(true,"Oracle");//its default capacity is 11, size increases by double
        ht.put(103,2000);//it is synchronized
        ht.put(107,"css");
        System.out.println(ht);
        System.out.println("\nKeys: "+new ArrayList<Object>(ht.keySet()));
        ArrayList<Object> al=new ArrayList<Object>(ht.entrySet());
        Iterator<Object> i=al.iterator();
        while(i.hasNext())
        {
            Entry e=(Entry)i.next();
            System.out.println(e.getKey()+"--->"+e.getValue());
        }

    }
}
