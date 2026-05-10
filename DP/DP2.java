public class DP2 {
    public static int climbingStairsRec(int n){
        if (n == 0 || n == 1) return 1;
        return climbingStairsRec(n-1) + climbingStairsRec(n-2);
    }    

    public static int climbingStairsMem(int n,int [] dp){
        if (n == 0 || n == 1) return 1;
        if (dp[n] != 0 ) return dp[n];
        return dp[n] = climbingStairsRec(n-1) + climbingStairsRec(n-2);
    }

    public static int climbingStairsTab(int n){
        if (n == 0 || n == 1) return 1;
        
        int [ ] dp = new int[n+1];
        dp[0] =1;
        dp[1] =1;

        for (int i = 2; i<= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    public static int climbingStairsSO(int n){
        if ( n == 0 || n == 1) return 1;
        int p2 = 1;
        int p1 = 1;
        int cur = 0;

        for (int i = 2 ; i <= n ; i++){
            cur = p1 + p2;
            p2 = p1;
            p1 = cur;
        }

        return cur;
    }


    public static void main(String [] args){
        int n = 7;
        System.out.println(climbingStairsRec(n));
        int [] arr = new int[n+1];
        System.out.println(climbingStairsMem(n,arr));
        System.out.println(climbingStairsTab(n));
        System.out.println(climbingStairsSO(n));

        // for (int i : arr){
        //     System.out.println(i);
        // }
    }
}
