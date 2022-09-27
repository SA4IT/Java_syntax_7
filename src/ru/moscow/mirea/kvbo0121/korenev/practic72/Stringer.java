package ru.moscow.mirea.kvbo0121.korenev.practic72;

public class Stringer implements String_inter {
    private char[] str2 = new char[]{'g', '4', 'Y', '2', '4', 'n', 'K', '0',};
    private int size = 8;
    @Override
    public void count() {
        System.out.println("Длина строки = " + str2.length);
    }
    @Override
    public void nechet() {
        for (int i = 0; i < str2.length; i++) {
            if (i % 2 != 0) {
                System.out.print(str2[i]);
            }
        }
        System.out.println(" - строка после перобразованная по нечетным индексам");
        System.out.println("");
    }
    @Override
    public void print() {
        for (int i = 0; i < str2.length; i++) {
            System.out.print(str2[i]);
        }
        System.out.println("");
    }
    @Override
    public void reverse() {
        char[] temp_str = new char[size];
        for (int i = 0; i < size; i++){
            temp_str[i]=str2[7-i];
        }
        for (int i = 0; i < size; i++){
            System.out.print(temp_str[i]);
        }
        System.out.println(" - реверс строки");
    }
}
