package Arrays;

public class Arraysum {
    public static void main(String[] abs){
        int[] arry = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arry.length; i++) {
            sum += arry[i];

        }
        System.out.println("Sum of ele: "+sum);
        int Avg = sum / arry.length;
        System.out.println("Average of ele :"+Avg);
    }
}
