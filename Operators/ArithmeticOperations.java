package Operators;

public class ArithmeticOperations {
    public static void main(String[] abc)
    {
        int a=10;
        int b=20;
        System.out.println("Addition: "+(a+b));
        System.out.println("Subtraction: "+(a-b));
        int n=6;
        System.out.println("\nMultiplication Table: ");
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"*"+i+"="+(n*i));
        }
        System.out.println("\nAverage Calculation: "+(a+b)/2);
        int radius=5;
        System.out.println("\nArea of Circle: "+(3.14*radius*radius));
        System.out.println("\nCircle Circumference: "+(2*3.14*radius));
    }
}
