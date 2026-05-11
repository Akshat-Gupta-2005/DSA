public class DP3 {
    public static int frogJumpRec(int n , int [] arr){
        if (n == 0 ) return 0;

        int left = frogJumpRec(n-1,arr) + Math.abs(arr[n] - arr[n-1]);
        int right = Integer.MAX_VALUE;
        if (n>1) {right = frogJumpRec(n-2,arr) + Math.abs(arr[n] - arr[n-2]);}
        return Math.min(left,right);
    }

    public static int frogJumpMem(int n , int [] arr , int [] dp ){
        if (n == 0 ) return 0;
        if (dp[n] != 0) return dp[n];

        int left = frogJumpRec(n-1,arr) + Math.abs(arr[n] - arr[n-1]);
        int right = Integer.MAX_VALUE;
        if (n>1) {right = frogJumpRec(n-2,arr) + Math.abs(arr[n] - arr[n-2]);}
        return dp[n] = Math.min(left,right);
    }

    public static int frogJumpTab(int n , int [] arr){
        if (n == 0) return 0;
        if (n == 1) return Math.abs(arr[0] - arr[1]);
        int [] dp = new int[n+1];

        dp[0] = 0;
        dp[1] = Math.abs(arr[0] - arr[1]);

        for (int i = 2 ; i <= n ; i++){
            dp[i] = Math.min(dp[i-1]  + Math.abs(arr[i-1] - arr[i] ),dp[i-2]  + Math.abs(arr[i-2] - arr[i] ));
        }
        return dp[n];
    }

    public static int frogJumpSO(int n, int [] arr){
        int p2 = 0;
        int p1 = Math.abs(arr[0] - arr[1]);
        int cur = 0;

        for (int i = 2 ; i <=n ; i++){
            cur = Math.min(p2 + Math.abs(arr[i-2] - arr[i]) , p1 + Math.abs(arr[i-1] - arr[i]));

            p2 = p1;
            p1 = cur;
        }

        return cur;
    }
    public static void main(String [ ] args){
        int n = 5;
        int [] arr = new int[]{10,20,30,10,50,10};
        int [] dp = new int[n+1];
        System.out.println(frogJumpRec(n, arr));
        System.out.println(frogJumpMem(n, arr,dp));
        System.out.println(frogJumpTab(n, arr));
        System.out.println(frogJumpSO(n, arr));
    }    
}
