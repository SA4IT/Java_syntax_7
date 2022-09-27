package ru.moscow.mirea.kvbo0121.korenev.practic71;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        double a1 = sc.nextDouble();
        System.out.println("В какую степень возвести: ");
        double pow = sc.nextDouble();
        MathCalculable math = new MathFunc();
        math.setA(a1);
        math.setB(pow);
        math.pow1();
        math.module();
        System.out.println("Введите действительную часть комплексного числа: ");
        double real = sc.nextDouble();
        System.out.println("Введите мнимую часть комплексного числа: ");
        double imagine = sc.nextDouble();
        math.setIm(imagine);
        math.setRe(real);
        math.module_complex();
    }
}
