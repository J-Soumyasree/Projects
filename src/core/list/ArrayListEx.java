package com.learn.core.list;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListEx
{
    void meth1()
    {
        System.out.println("\n\n======meth2()======== ");
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i)+ " ");
        }
        System.out.println("\n\nReverse of ArrayList: ");
        for(int i=al.size()-1;i>=0;i--)
        {
            System.out.print(al.get(i)+" ");
        }
        System.out.println("\n\nArrayList: Using for each");
        for(int data:al)
        {
            System.out.print(data+" ");
        }
        System.out.println("\n\nArrayList: Using Iterator");
        Iterator it= al.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }

    }
    void meth2()
    {
        System.out.println("\n\n======meth2()======== ");
        ArrayList<Object> al2=new ArrayList<Object>();
        al2.add(10);//insertion order maintained
        al2.add("hii");//heterogenous data allowed
        al2.add(true);//default size is 10 , increases by half
        al2.add(null);//nulls are allowed
        al2.add(20);//
        al2.add(10);//dublicates are allowed
        al2.add('C');//not synchronized
        System.out.println("\n\nArrayList2: ");

        for(int i=0;i<al2.size();i++)
        {
            System.out.print(al2.get(i)+ " ");
        }
        System.out.println("\n\nReverse of ArrayLit: ");
        for(int i=al2.size()-1;i>=0;i--)
        {
            System.out.print(al2.get(i)+" ");
        }
        System.out.println("\n\nArrayList: Using for each");
        for(Object data:al2)
        {
            System.out.print(data+" ");
        }
        System.out.println("\n\nArrayList: Using Iterator");
        Iterator it= al2.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }

    public static void main(String[] args)
    {
        new ArrayListEx().meth1();

        ArrayListEx obj=new ArrayListEx();
        obj.meth2();
    }
}
