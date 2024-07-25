package Logical;

public class EvenandOdd {
    public static void main(String[] abc){
        int arr[] = {53, 54, 34, 48, 95, 36, 37, 28, 19};
        int even = 0;
        int odd = 0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Number of Even ele: "+even);
        System.out.println("Number of Odd ele: "+odd);


    }

}
