package ru.moscow.mirea.kvbo0121.korenev.practic71;

public class Complex {
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    private double re;
    private double im;

    public void print(){
        System.out.println(this.re + this.im+"i");
    }
}
