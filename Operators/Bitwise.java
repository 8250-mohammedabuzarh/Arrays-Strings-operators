package Operators;

public class Bitwise {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c = a & b;
        System.out.println(c);
        int d = a | b;
        System.out.println(d);
        int e = a ^ b;
        System.out.println(e);
        int f = ~a;
        System.out.println(f);
        int ab = 21;
        System.out.println(ab << 2);
        System.out.println(ab >> 2);
        System.out.println("Odd or Even using Bitwise Operator");
        int num = 5;
        if ((num & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
}