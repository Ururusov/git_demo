package ru.sasha.vasia;

import java.util.Calendar;
import java.util.Date;

public class Pumpkin {
    public static void main(String[] args) {

        System.out.printf("мне нужно исправить %,.5f ошибки.\n", 487593.0875);
        System.out.printf("мне нужно исправить %,d ошибки. \n", 242359886);
        System.out.printf("%,10.2f \n", 54.457);
        System.out.printf("%x \n", 6789);
        System.out.printf("%c \n", 45);
        int one = 788932;
        double two = 10000432.766542300;
        String s = String.format("Уровень %,d из %,.3f.", one,two);
        System.out.println(s);
        System.out.printf("%h \n", true);
        System.out.printf("%1$,d ; %<x; %2$.3f ; %1$h ; %2$h  \n", one, two);
        System.out.printf("%tc \n", new Date());
        System.out.printf("%tr \n", new Date());
        System.out.printf("%1$tA, %1$td-oe %1$tB \n", new Date());
        System.out.printf("%tA, %<td-oe %<tB \n", new Date());

        Calendar c = Calendar.getInstance();
        c.set(2029,5,15, 15, 40, 00);
        System.out.println("время заданное по конструктору " + c.getTime());
        long day1 = c.getTimeInMillis();
        System.out.println(day1);
        day1 += 1000*60*60;
        System.out.println(day1);
        c.setTimeInMillis(day1);
        System.out.println(c);
        System.out.println("новый час " + c.get(c.HOUR_OF_DAY));
        c.add(c.DATE, 20);
        System.out.println("добавить 35 дней " + c.getTime());
        c.roll(c.DATE, 35);
        System.out.println("прокрутить 35 дней " + c.getTime());
        c.set(c.DATE, 1);
        System.out.println("установить дату 1; первое число" + c.getTime());
        c.add(c.MONTH, 1);
        System.out.println("добавили пол года " + c.getTime());


    }
}
