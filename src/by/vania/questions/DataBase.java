package by.vania.questions;


import java.util.Objects;

public class DataBase {
    int h;
    String name;
    double g;

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }

    public DataBase(int h, String name, double g) {
        this.h = h;
        this.name = name;
        this.g = g;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataBase dataBase = (DataBase) o;
        return h == dataBase.h && Double.compare(dataBase.g, g) == 0 && Objects.equals(name, dataBase.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(h, name, g);
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "h=" + h +
                ", name='" + name + '\'' +
                ", g=" + g +
                '}';
    }

    public static void main(String[] args) {

        String pool = "67";

        System.out.println(Integer.toBinaryString(67));
        System.out.println(Integer.toHexString(1515));
        System.out.println(Integer.toOctalString(16));
        System.out.println(Integer.parseInt(pool));

        // double
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.MIN_EXPONENT);
        System.out.println(Double.MAX_EXPONENT);
        System.out.println(Double.MAX_VALUE);
    }
}
