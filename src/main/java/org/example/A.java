package org.example;

public class A {
    private int value;

    public A(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public A setValue(int value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return "A{" +
                "value=" + value +
                '}';
    }
}
