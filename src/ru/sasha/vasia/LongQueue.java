package ru.sasha.vasia;

import java.util.ArrayList;
import java.util.Collections;

public class LongQueue {

    public int longQueue;
    public int maxLongQueue;
    public  int[] array;
    public  int longArray = 14000000;
    public ArrayList<IndexAndValue> arrayIndexAndValues = new ArrayList<>();
    public ArrayList<IndexAndValue> maxArrayIndexAndValues = new ArrayList<>();
    public ArrayList<ArrayList> maxAll = new ArrayList<>();
    public ArrayQueue sum = new ArrayQueue(new ArrayList<>());



    public  void enterArray(){
        array = new int[longArray];
        System.out.println("\nИсходный массив \nЧисло элементов N = " + longArray + ";");
        System.out.print("array[");
        for (int i = 0; i < longArray; i++) {
            array[i] = (int) (Math.random() * 50 + 1);
           if (i == longArray -1){
                System.out.print(array[i]);
            }else {
               System.out.print(array[i] + " ");
           }
        }
        System.out.println("]");
    }



    public void findMaxLongQueue(){

        longQueue = 1;
        maxLongQueue = 0;
        int temp = 0;
        int temp1 = 0;

        for (int i = 0; i < longArray - 1; i++) {
            if(array[i] < array[i + 1]){
                longQueue++;
                if(longQueue == 2) {
                    temp1++;
                    arrayIndexAndValues.add(new IndexAndValue(i, array[i]));
                    arrayIndexAndValues.add(new IndexAndValue(i + 1, array[i + 1]));
                }else {
                    arrayIndexAndValues.add(new IndexAndValue(i + 1, array[i + 1]));
                }
                if (maxLongQueue < longQueue){
                    maxLongQueue = longQueue;
                    maxArrayIndexAndValues.clear();
                    maxArrayIndexAndValues.addAll(0 ,arrayIndexAndValues);
                }

                if (maxLongQueue == longQueue){
                    if (maxArrayIndexAndValues.get(0).getValue() < arrayIndexAndValues.get(0).getValue()){
                        maxArrayIndexAndValues.clear();
                        maxArrayIndexAndValues.addAll(0 ,arrayIndexAndValues);
                    }
                }

                }else {
                // !!! ленивая тварь не идет на последнем цике в else !!! извините пожалуйста, я забыл что для элсо нужно что бы выполнялось условие
                longQueue = 1;
                if (arrayIndexAndValues.size() != 0) {
                    maxAll.add(arrayIndexAndValues);
                    System.out.println("...\n новая последовательность");
                    for (IndexAndValue arrayIndexAndValue : arrayIndexAndValues) {
                        arrayIndexAndValue.showObject();
                    }
                }
                arrayIndexAndValues.clear();
            }
            if (i == longArray - 2){
                if (arrayIndexAndValues.size() != 0) {
                    maxAll.add(arrayIndexAndValues);
                    System.out.println("...\n новая последовательность");
                    for (IndexAndValue arrayIndexAndValue : arrayIndexAndValues) {
                        arrayIndexAndValue.showObject();
                    }
                }
                arrayIndexAndValues.clear();
            }
            temp++;
        }


        System.out.println("\nмаксимальная длинна последовательности " + maxLongQueue);
        System.out.println("колличество последовательностей " + temp1 );
        System.out.println("колличество прохождений " + temp);
        System.out.println("\nиндексы и значения в максимальной последовательности");


        for (IndexAndValue maxArrayIndexAndValue : maxArrayIndexAndValues) {
            maxArrayIndexAndValue.showObject();

        }
        System.out.println("Сумма значений = " + sum.getSumValue(maxArrayIndexAndValues));


    }

    public static void main(String[] args) {

        LongQueue decision = new LongQueue();
        decision.enterArray();
        decision.findMaxLongQueue();
        System.out.println(decision.maxAll.size());


    }


}
