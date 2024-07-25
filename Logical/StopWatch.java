package Logical;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("press Enter to Start the StopWatch");
        sc.nextLine();
        long start=System.currentTimeMillis();
        System.out.println("press Enter to Stop the StopWatch");
        sc.nextLine();
        long end=System.currentTimeMillis();

        long result=end-start;
        System.out.println("Time taken to execute the loop is: "+result/1000+" seconds");
    }
}
