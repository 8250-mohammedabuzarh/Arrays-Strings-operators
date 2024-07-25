package Logical;

public class Duplicate {
    public static void main(String[] abc) {
        int[] ar1 = {1, 1, 2, 3,2,4,4,};
        int[] ar2= new int[ar1.length];
        for (int i = 0; i <= ar1.length -1; i++) {
            for (int j = i + 1; j <= ar1.length - 1; j++) {
                if (ar1[i] == ar1[j]) {
                    ar2[i]=ar1[i];
                    System.out.print(ar2[i]+" ");
                }

            }
        }

    }
}