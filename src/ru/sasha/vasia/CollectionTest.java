package ru.sasha.vasia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionTest {
    public static void main(String[] args) {
        int t = 0;
        ArrayList a = new ArrayList();
        a.add(7);
        a.add(0);
        a.add(2);
        a.add(8);
        System.out.println(Collections.max(a));
        t =(int) Collections.max(a);
        System.out.println(t);
        ArrayList<IndexAndValue> tertor = new ArrayList<>();
        ArrayList<IndexAndValue> test = new ArrayList<>();
        ArrayQueue test2 = new ArrayQueue(new ArrayList<IndexAndValue>());


        for ( int i = 0; i < 10; i++){
            int ind = (int) (Math.random() * 10);
            int val = (int) (Math.random() * 10);
            test.add(new IndexAndValue(ind,val));
            tertor.add(new IndexAndValue(val,ind));


        }

        System.out.println(test2.getSumValue(test));
        test2.printArrayQueue(test);
        System.out.println("");
        test2.printArrayQueue(tertor);



    }
}
