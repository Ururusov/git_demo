package ru.rash.viktori;

public class salary {
    public static int salary;

    public static void add(int increase) {
//        int salary = Solution.salary;
        salary += increase;
    }

    public static void main(String[] args) {
        add(100500);
        System.out.println(salary);
    }
}

