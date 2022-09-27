package ru.moscow.mirea.kvbo0121.korenev.practic7;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Movable rectangle = new Movable.MovableRectangle(34,46,2,6);
        rectangle.print();
        Scanner sc = new Scanner(System.in);
        System.out.println("Передвинуть прямоугольник по x на:");
        double x_count = sc.nextDouble();
        System.out.println("Передвинуть прямоугольник по y на:");
        double y_count = sc.nextDouble();
        rectangle.move(x_count, y_count);
        rectangle.print();
    }
}
