package com.demo;
import java.util.*;
public class HashSetDemo {
    public static void main(String args[]){
        //Creating HashSet and adding elements
        HashSet<String> set=new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        System.out.println("HashSet:"+set);
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        set.remove("Three");
        System.out.println("After invoking remove(object) method: "+set);
        set.removeIf(str->str.contains("Five"));
        System.out.println("After invoking removeIf() method: "+set);
        set.clear();
        System.out.println("After invoking clear() method: "+set);
        HashSet<String> set1=new HashSet<String>();
        set1.add("Ajay");
        set1.add("Gaurav");
        set.addAll(set1);
        System.out.println("Updated List: "+set);
        HashSet<Integer> hs1 = new HashSet<Integer>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(3);
        hs1.add(4);
        hs1.add(5);
        System.out.println("HashSet:"+hs1);
        HashSet<Integer> hs2 = new HashSet<Integer>();
        hs2.add(1);
        hs2.add(2);
        hs2.add(3);
        System.out.println(hs1.retainAll(hs2));
        System.out.println("HashSet after "
                + "retainAll() operation : "
                + hs1);
        System.out.println("HashSet after "
                + "retainAll() operation : "
                + hs2);

    }
}
