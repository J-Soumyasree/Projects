package com.learn.core.map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

public class HashMapEx
{
    public static void main(String[] args)
    {
        HashMap<Object,Object> hm=new HashMap<Object,Object>();
        hm.put(101,"Java");//Insertion order is not maintained
        hm.put("Java",1000);//heterogeneous keys & values are allowed
        hm.put(null,null);//null keys and values are allowed
        hm.put(108,"Java");//Duplicates values are allowed but keys must unique
        hm.put('A',false);//its default capacity is 16, size increases by double
        hm.put(true,"oracle");//it is not synchronized
        hm.put(103,2000);//it is available from java 1.2v
        hm.put(107,"css");
        System.out.println(hm);
        System.out.println("\nsize: "+hm.size());
        System.out.println("get(key): "+hm.get(101));
        hm.put(108,"Spring");
        System.out.println("\n"+hm);
        ArrayList<Object> al=new ArrayList<Object>(hm.keySet());
        System.out.println("/n keys: "+al);
        System.out.println("\n\n Printing hashmap using ArrayList\n");
        for(Object key:al)
            System.out.println(key+"==>"+hm.get(key));
        System.out.println("\n\n Printing hashmap using LinkedHashSet\n");
        LinkedHashSet<Object> lhs=new LinkedHashSet<Object>(hm.keySet());
        Iterator<Object> i= lhs.iterator();
        while(i.hasNext())
        {
            Object o=i.next();
            System.out.print(o+"===>"+hm.get(o)+" ");
        }
        System.out.println("\n\nusing entrySet(): \n");
        LinkedList<Object> ll=new LinkedList<Object>(hm.entrySet());
        Iterator<Object> i2=ll.iterator();
        while(i2.hasNext())
        {
           // System.out.print(i2.next()+" ");
            Entry e=(Entry)i2.next();
            System.out.print(e.getKey()+"--->"+e.getValue()+"  ");
        }
    }
}
