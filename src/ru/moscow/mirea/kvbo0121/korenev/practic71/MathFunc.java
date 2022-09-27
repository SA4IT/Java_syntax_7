package ru.moscow.mirea.kvbo0121.korenev.practic71;

public class MathFunc implements MathCalculable{
    public void setA(double a){this.a=a;}
    public void setB(double b) {this.b = b;}
    public void setRe(double re) {this.re = re;}
    public void setIm(double im) {this.im = im;}

    private double a;
    private double b;
    private double re;
    private double im;

    @Override
    public void pow1() {
        System.out.println("Результат = " + Math.pow(this.a,this.b));
    }
    @Override
    public void module() {
        System.out.println("Модуль числа = " + Math.abs(this.a));
    }
    @Override
    public void module_complex() {
        System.out.println("Модуль комплексного числа = " + Math.sqrt(Math.pow(this.re,2)+Math.pow(this.im,2)));
    }
}
