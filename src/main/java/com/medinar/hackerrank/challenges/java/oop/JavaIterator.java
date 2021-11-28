package com.medinar.hackerrank.challenges.java.oop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JavaIterator {

//    2 2
//    42
//    10
//    hello
//    java

    @SuppressWarnings({ "unchecked" })
    public static void main(String []args){
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0;i<n;i++){
            mylist.add(sc.nextInt());
        }

        mylist.add("###");
        for(int i=0;i<m;i++){
            mylist.add(sc.next());
        }

        Iterator it=func(mylist);
        while(it.hasNext()){
            Object element = it.next();
            System.out.println((String)element);
        }
    }

    static Iterator func(ArrayList mylist){
        Iterator it=mylist.iterator();
        while(it.hasNext()){
            Object element = it.next();
            if(element instanceof String)  //Hints: use instanceof operator
            break;
        }
        return it;

    }
}
