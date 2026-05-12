public class lis {
    public static void main(String [] args){
        int [] nums = {1,0,3,4,1,4,5};
        int n = nums.length;

        int [] arr = new int[n];
        arr[0] = 1;
        for (int i = 1 ; i < n ; i++){
            for (int j = 0; j < i ; j++){
                if (nums[i] > nums[j]){
                    arr[i] = Math.max(arr[i] , arr[j]);
                }
            }

            arr[i] = arr[i] + 1;
        }
        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println(arr[n-1]);
    }
}
