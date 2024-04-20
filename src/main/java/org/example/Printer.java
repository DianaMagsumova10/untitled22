package org.example;

import lessons16.MYList;

public class Printer implements MYList {
    private static final Printer PRINTER = new Printer();

    private Printer(){
    }

    public void print(){
    }

    public static Printer getInstance(){
        return PRINTER;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void add(Object element) {

    }

    @Override
    public Object getByIndex(int index) {
        return null;
    }
}
