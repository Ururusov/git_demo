package ru.sasha.vasia;

import java.util.ArrayList;

public class ArrayQueue {

    public int sumValue;
    public  ArrayList<IndexAndValue> arrayQueue;

    public ArrayQueue(ArrayList<IndexAndValue> arrayQueue) {
        this.arrayQueue = arrayQueue;
    }

    public int getSumValue(ArrayList<IndexAndValue> arrayQueue){
        for (int i = 0; i < arrayQueue.size(); i++){
            sumValue += arrayQueue.get(i).getValue();
        }

        return sumValue;
    }

    public void printArrayQueue(ArrayList<IndexAndValue> arrayQueue){
        for (int i = 0; i < arrayQueue.size(); i++){
            arrayQueue.get(i).showObject();
        }
    }
}
