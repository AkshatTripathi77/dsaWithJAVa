import java.util.Arrays;
import java.util.Scanner;

public class InputInArr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      /*  int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 21;
        arr[2] = 123;
        arr[3] = 9874;
        arr[4] = 1625;
        System.out.println(arr[3]);*/
        /*
         input using for loop
          for (int i = 0;i < arr.length;i++){
                   arr[i] = s.nextInt();
               }
               for (int i = 0;i < arr.length;i++){
                   System.out.println(arr[i] + " ");
               }
               for (int num : arr){
                   System.out.println(num + " ");
               }
               System.out.println();
         }
        */
        String[] str = new String[4];
        for(int i = 0;i < str.length;i++){
            str[i] = s.next();
        }
        System.out.println(Arrays.toString(str)) ;
        str[1] = "Akshat";
        System.out.println(Arrays.toString(str));
    }
}




