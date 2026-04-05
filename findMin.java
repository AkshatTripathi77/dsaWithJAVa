public class findMin {
    public static void main(String[] args) {
        int[] arr = {9,3,6,1,8,4,3};
        System.out.println(min(arr));

    }
    static int min(int[] arr){
        int minVal = arr[0];
        for (int i = 0; i < arr.length;i++){
            if (arr[i] < minVal) {
                minVal = arr[i];

            }
        }return minVal;
    }
}
