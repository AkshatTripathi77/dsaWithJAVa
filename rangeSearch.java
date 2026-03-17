public class rangeSearch {
    public static void main(String[] args) {
        int[] arr = {12,54,87,34,98,67,17,83};
        int target = 87;
        System.out.println(linearsearch(arr,target,3,4));
    }
    static int linearsearch(int[] arr,int target,int start,int end){
        if(arr.length == 0){
            return -1;
        }
        for (int index = start; index <= end ; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }


        }
        return target;
    }
}
