package ru.sasha.vasia;

public class IndexAndValue {
    public int index;
    public int value;

    public IndexAndValue(int index, int value) {
        this.index = index;
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public int getValue() {
        return value;
    }
    public void showObject(){
        System.out.println("индекс: " + getIndex() + "; " + "значение: " + getValue());
    }
    public String toString(){
        return "\nиндекс: " + getIndex() + " - " + "значение: " + getValue();

    }
}
