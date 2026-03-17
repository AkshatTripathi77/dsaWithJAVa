public class linear_Search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8,90,43};
        int target = 8;
        int ans = linearSearch(arr,target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return target;
    }
}
