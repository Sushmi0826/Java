package com.demo;
import java.util.*;
public class TreeSetdemo {
    public static void main(String[] args) {
        try {
            TreeSet<String> ts = new TreeSet<String>();
            ts.add("Revi");
            ts.add("Vijay");
            ts.add("Kavi");
            ts.add("Ajay");
            System.out.println("TreeSet:" + ts);
            Iterator<String> itr = ts.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
            System.out.println("Traversing element through Iterator in descending order");
            Iterator i = ts.descendingIterator();
            while (i.hasNext()) {
                System.out.println(i.next());
            }
            TreeSet<Integer> ts1 = new TreeSet<Integer>();
            ts1.add(24);
            ts1.add(66);
            ts1.add(12);
            ts1.add(15);
            System.out.println("TreeSet Integer:" + ts1);
            System.out.println("TreeSet Reverse Integer:" + ts1.descendingSet());

            System.out.println("Lowest Value: " + ts1.pollFirst());
            System.out.println("Highest Value: " + ts1.pollLast());
            TreeSet<String> ts2 = new TreeSet<String>();
            ts2.add("A");
            ts2.add("B");
            ts2.add("C");
            ts2.add("D");
            ts2.add("E");
            System.out.println("TreeSet String:" + ts2);
            System.out.println("Initial Set: " + ts2);
            System.out.println("Reverse Set: " + ts2.descendingSet());
            System.out.println("Head Set: " + ts2.headSet("C", true));
            System.out.println("SubSet: " + ts2.subSet("A", false, "E", true));
            System.out.println("TailSet: " + ts2.tailSet("C", false));
        }
        catch(Exception e){
            System.out.println("Exception:"+e.getMessage());
        }

    }
}
