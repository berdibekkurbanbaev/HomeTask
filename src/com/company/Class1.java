package com.company;

import java.util.Arrays;

public class Class1 {
    private int number;
    private String word;
    private int [] massiv;

    public Class1(int number, String word, int[] massiv) {
        this.number = number;
        this.word = word;
        this.massiv = massiv;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int[] getMassiv() {
        return massiv;
    }

    public void setMassiv(int[] massiv) {
        this.massiv = massiv;
    }

    @Override
    public String toString() {
        return "Class1....." +
                " number = " + number +
                ", word = " + word  +
                "  massiv = " + Arrays.toString(massiv) +""
                ;
    }
}
