package Logical;

public class PosNeg {
    public static void main(String[] abc){
        int arr[] = {-53, 54, 34, -48, -95, -36, 37, 28, 19};
        int arr2[] = new int[arr.length];
        int arr3[] = new int[arr.length];
        System.out.println("Positive ele: ");
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i] > 0){
                arr2[i] = arr[i];
                System.out.print(arr2[i]+" ");
            }
        }
        System.out.println("\nNegative ele: ");
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i] < 0){
                arr3[i] = arr[i];
                System.out.print(arr3[i]+" ");
            }
        }


    }
}
