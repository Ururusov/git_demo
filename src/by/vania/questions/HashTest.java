package by.vania.questions;

import java.util.Objects;

public class HashTest {
    double d = 9.809;
    int c = 5764;
    public static void main(String[] args) {
        String str = "hash code";
        System.out.println(str.hashCode());
        String s = new String("hash code");
        System.out.println(s.hashCode());
        System.out.println( );



    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashTest hashTest = (HashTest) o;
        return Double.compare(hashTest.d, d) == 0 && c == hashTest.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(d, c);
    }
}
