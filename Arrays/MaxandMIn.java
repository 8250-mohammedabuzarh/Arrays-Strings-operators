package Arrays;

import java.util.Arrays;

public class MaxandMIn {
    public static void main(String[] args){
        int arr[] = {100, 21, 3, 43, 54};
        Arrays.sort(arr);
        System.out.println("Min ele: "+arr[0]);
        System.out.println("Max ele: "+arr[arr.length-1]);
    }
}
