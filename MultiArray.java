import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //   int[][] arr = new int[3][3];
      /*  int [][] arr = new int[3][];
        int[][] arr2D ={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}

        };
        System.out.println((arr2D[1][2]));*/
        int[][] arr = new int[3][3];
        System.out.println(arr.length);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = s.nextInt();
            }

        }
        for (int[] ints : arr) {
            for (int col = 0; col < ints.length; col++) {
                System.out.print(ints[col] + " ");

            }
            System.out.println();

        }
    }
}
