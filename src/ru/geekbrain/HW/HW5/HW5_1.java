package ru.geekbrain.HW.HW5;

public class HW5_1 {

    public static void main(String[] args) {
        for (int i = -4; i < 9; i++) {
            System.out.println("2^" + i + "= " + exponent(2,i));
        }
    }

    public static double exponent (int num, int exp) {
       if (exp == 0) {
            return 1;
        }
        else if (exp < 0) {
           return (double)1/(num * exponent(num, (-1)*exp-1));
       }
        return num * exponent(num, exp-1);
    }
}
