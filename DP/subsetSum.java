public class subsetSum {

    public static boolean f(int n, int [] arr, int i){
        if (n == 0) return true;
        if (i == arr.length) return false;

        boolean take = f(n - arr[i] , arr , i+1);
        boolean nottake = f(n  , arr , i+1);

        return take || nottake;
    }
    public static void main(String [] arfs){
        int n = 9;
        int [] arr = {0,7,8};
        
        System.out.println(f(n,arr,0));

    }
}
