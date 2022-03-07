package ru.rash.viktori;

public class University {
    private final String[] students = new String[7];

    public void addStudent(String student) {
        int i = 0;
        for (; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
        }
        students[i] = student;
    }

    public void printStudents() {
        for (String student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        University university = new University();
        university.addStudent("Максим Федоренко");
        university.addStudent("Олег Кесарчук");
        university.addStudent("Олег Кесарчук");
        university.addStudent("Олег Кесарчук");
        university.addStudent("Олег Кесарчук");
        university.addStudent("Олег Кесарчук");
        university.addStudent("Олег Кесарчук");

        university.printStudents();
    }
}
