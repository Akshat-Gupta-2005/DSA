public class DP4 {

    public static int frogJumpKRec(int n, int [] arr, int k){
        if (n == 0) return 0;
        int min = Integer.MAX_VALUE;

        for (int i = 1 ; i <= k ; i++){
            if (n>=i) min = Math.min(min, frogJumpKRec(n-i,arr,k) + Math.abs(arr[n] - arr[n-i]));
        }

        return min;
    }

    public static int frogJumpKMem(int n, int [] arr, int k,int [] dp){
        if (n == 0) return 0;
        if (dp[n] != 0) return dp[n];
        int min = Integer.MAX_VALUE;

        for (int i = 1 ; i <= k ; i++){
            if (n>=i) min = Math.min(min, frogJumpKRec(n-i,arr,k) + Math.abs(arr[n] - arr[n-i]));
        }

        return dp[n] = min;
    }

    public static int frogJumpKTab(int n, int [] arr, int k){
        int [] dp = new int[n+1];

        dp[0] = 0;
        
        for (int i = 1 ; i <= n ; i++){
            int min = Integer.MAX_VALUE;
            for (int j = 1 ; j<=k ; j++){
                if (i >= j){
                    min = Math.min(min,dp[i-j] + Math.abs(arr[i] - arr[i-j]));
                }
            }

            dp[i] = min;
        }

        return dp[n];

    }

    public static int frogJumpKSO(int n , int [] arr, int k){
        int [] var  = new int[k];
        for (int i = 0 ; i <  k ; i++){
            var[i] = Integer.MAX_VALUE;
        }

        var[k-1] = 0;

        for (int i = 1 ; i <= n;i++ ){
            int min = Integer.MAX_VALUE;
            for (int j = 1 ; j <= k ; j++){
                if ( i >= j){
                    min = Math.min(min , var[k-j] + Math.abs(arr[i] - arr[i-j]));

                }
            }
            for (int j = 0 ; j < k-1 ; j++){
                var[j] = var[j+1];
            }
            var[k-1] = min;
        }

        return var[k-1];

    }


    public static void main(String [] args){
        int n =3;
        int k = 2;
        int [] arr = new int[]{10,20,30,10};
        int [] dp = new int[n+1];

        System.out.println(frogJumpKRec(n,arr,k));
        System.out.println(frogJumpKMem(n,arr,k,dp));
        System.out.println(frogJumpKTab(n,arr,k));
        System.out.println(frogJumpKSO(n,arr,k));
    }    
}
