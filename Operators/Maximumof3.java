package Operators;

public class Maximumof3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        if (a > b && a > c) {
            System.out.println("A is Maximum");
        } else if (b > c) {
            System.out.println("B is Maximum");
        } else {
            System.out.println("C is Maximum");
        }
        String str1 = "Hello";
        String str2 = "Hello";
        if (str1==str2) {
            System.out.println("Strings are Equal");
        } else {
            System.out.println("Strings are not Equal");
        }

    }
}
