package com.learn.core.map;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapEx
{
    public static void main(String[] args)
    {
        TreeMap<Object,Object>tm=new TreeMap<Object,Object>();
        tm.put(101,"Java");//insertion order is not maintained but sorting order is followed
        tm.put(104,1000);//only values can be heterogeneous
        tm.put(102,null);//null values are allowed not keys
        tm.put(108,"Java");//dublicate values are allowed not keys
        tm.put(106,false);//it is available from java 1.2v
        tm.put(105,"oracle");//its default capacity is 16, size increase by double
        tm.put(103,2000);//it is not synchronized
        tm.put(107,"css");
        System.out.println(tm);
        ArrayList<Object> al=new ArrayList<Object>(tm.keySet());
        TreeSet<Object> ts=new TreeSet<Object>(tm.keySet());
        System.out.println("\nal: "+al);
        System.out.println("ts: "+ts);
        for(Object data:ts)
            System.out.println(data+" "+tm.get(data));

    }
}
