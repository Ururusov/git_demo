package ru.test.method;

public class TestAssert {
    static int k = -5;

    public static void main(String[] args) {
    TestAssert.testAssert(k);
    }
    static void testAssert( int a){
        assert (a > 0);
        System.out.println(a);
    }

}
