package ru.sasha.vasia;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        System.out.println("изначальный размер al: " + al.size());

        //добовляем элементы
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");
        al.add("e");
        al.add("f");
        System.out.println("содержание al: " + al);
        System.out.println("размер al: " + al.size());

        al.set(0,"A2");
        al.set(1,"B2");
        al.add(0,"54");
        al.remove("f");
        al.remove(3);

        System.out.println("содержание редактированного al: " + al);
        System.out.println("размер редактированного al: " + al.size());

        ArrayList<IndexAndValue> indexAndValues = new ArrayList<>();
        ArrayList<IndexAndValue> indexAndValues2 = new ArrayList<>();
        ArrayList<IndexAndValue> indexAndValues3 = new ArrayList<>();
        IndexAndValue[] fg = new IndexAndValue[6];
        fg[0] = new IndexAndValue(4,6);
        System.out.println("я могу создовать массив из обьектов " + fg[0].getValue());
        fg[0].showObject();
        System.out.println(fg[0].toString());
        System.out.println(fg.toString());
        System.out.println(Arrays.toString(fg));
        System.out.println(fg.length);

        indexAndValues.add(new IndexAndValue(0,1));
        indexAndValues.add(new IndexAndValue(1,1));
        indexAndValues.add(new IndexAndValue(2,1));
        indexAndValues.add(new IndexAndValue(3,1));
        indexAndValues.add(new IndexAndValue(2,1));
        indexAndValues.get(0).showObject();
        indexAndValues2.add(new IndexAndValue(0,10));
        indexAndValues2.add(new IndexAndValue(4,5));
        indexAndValues2.add(new IndexAndValue(8,30));
        indexAndValues2.add(new IndexAndValue(2,20));

        indexAndValues3.add(new IndexAndValue(2,2));
        indexAndValues3.add(new IndexAndValue(2,20));
        indexAndValues3.add(new IndexAndValue(2,3));
        indexAndValues3.add(new IndexAndValue(6,8));
        indexAndValues3.add(new IndexAndValue(6,5));
        indexAndValues3.add(new IndexAndValue(6,45));
        indexAndValues3.add(new IndexAndValue(7,3));
        indexAndValues3.add(new IndexAndValue(7,50));

        Collections.sort(indexAndValues3, new Comparator<IndexAndValue>() {
            @Override
            public int compare(IndexAndValue o1, IndexAndValue o2) {

                if (o2.getIndex() == o1.getIndex()){
                    return o1.getValue() - o2.getValue();
                }
                return o2.getIndex() - o1.getIndex();


            }
        });

        System.out.println(indexAndValues3);
        System.out.println("___________________________");


        if (indexAndValues2.get(0).getValue() < indexAndValues.get(0).getValue()){
            System.out.println("нет, нельзя сравнивать null И 0 ");
        }

        System.out.println("");
       ArrayList<ArrayList<IndexAndValue>> aLAL = new ArrayList<ArrayList<IndexAndValue>>();

       aLAL.add(indexAndValues);
       aLAL.add(indexAndValues2);
       aLAL.add(indexAndValues3);

        System.out.println(aLAL.get(0).get(2).getValue());
        System.out.println(getSumValue(aLAL.get(0)) + " правильно ли считается сумма ?");
        System.out.println(getSumValue(aLAL.get(1)) + " правильно ли считается сумма ?");
        System.out.println(getSumValue(aLAL.get(2)) + " правильно ли считается сумма ?");



        ArrayList sumArray = new ArrayList<>();
        sumArray.add(getSumValue(aLAL.get(0)));
        sumArray.add(getSumValue(aLAL.get(1)));
        sumArray.add(getSumValue(aLAL.get(2)));

        System.out.println(Collections.max(sumArray) + " что это ? должно быт равно 65");
        sumArray.indexOf(Collections.max(sumArray));
        System.out.println("это массив с максимальной суммой ");
        printArrayQueue(aLAL.get(sumArray.indexOf(Collections.max(sumArray))));

    }
    public static int sumValue;
    public static int getSumValue(ArrayList<IndexAndValue> arrayList){
        for (int i = 0; i < arrayList.size(); i++){
            sumValue += arrayList.get(i).getValue();
        }

        return sumValue;
    }
    public static void printArrayQueue(ArrayList<IndexAndValue> arrayQueue){
        for (int i = 0; i < arrayQueue.size(); i++){
            arrayQueue.get(i).showObject();
        }
    }

}
