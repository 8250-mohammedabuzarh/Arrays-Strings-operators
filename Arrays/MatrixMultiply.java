package Arrays;

public class MatrixMultiply {
    public static void main(String[] args){
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr3 = new int[3][3];
        if(arr1.length== arr2.length){
            for(int i = 0; i <= arr1.length-1; i++){
                for(int j = 0; j <= arr1[i].length-1; j++){
                    for(int k = 0; k <= arr1.length-1; k++){
                        arr3[i][j] += arr1[i][k] * arr2[k][j];

                    }
                    System.out.print(arr3[i][j]+" ");

                }

            }
        }
        else {
            System.out.println("Multiplication not possible");
        }
    }
}
