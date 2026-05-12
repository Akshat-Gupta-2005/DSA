
public class DP5{
    public static int MaximumSumofNonAdjacentElementsRec(int n , int [] arr){
        if (n ==0 ) return arr[0];
        if (n<0) return 0;


        int pick = arr[n] + MaximumSumofNonAdjacentElementsRec(n-2,arr);
        int notPick = 0 + MaximumSumofNonAdjacentElementsRec(n-1,arr);

        return Math.max(pick,notPick);

    }
    public static int MaximumSumofNonAdjacentElementsMem(int n , int [] arr , int [] dp){
        if (n ==0) return arr[0];
        if (n<0) return 0;
        if (dp[n] != 0) return dp[n];
        
        int pick = arr[n] + MaximumSumofNonAdjacentElementsRec(n-2,arr);;
        int notPick = 0 + MaximumSumofNonAdjacentElementsRec(n-2,arr);;
        
        return  dp[n] = Math.max(pick,notPick);
        
    }
    
    public static int MaximumSumofNonAdjacentElementsTab(int n , int [] arr){
        int [] dp = new int[n+1];

        dp[0] = arr[0];
        dp[1] = arr[1];
        for (int i = 2  ; i<= n ; i++){
            int take = arr[i] + dp[i-2];
            int notTake = dp[i-1];
            dp[i] = Math.max(take,notTake);
        }
        return dp[n];
    }
    public static int MaximumSumofNonAdjacentElementsSO(int n , int [] arr){
        // int [] dp = new int[n+1];

        int prev2 = arr[0];
        int prev1 = arr[1];
        int cur = 0;
        for (int i = 2  ; i<= n ; i++){
            int take = arr[i] + prev2;
            int notTake = prev1;
            cur = Math.max(take,notTake);

            prev2 = prev1;
            prev1 = cur;
        }
        return cur;
    }




    public static void main(String [] args){
        int n = 5;
        int [] arr = new int[]{1,2,4,4,1,1};
        int [] dp = new int[n+1];
        System.out.println(MaximumSumofNonAdjacentElementsRec(n, arr));
        System.out.println(MaximumSumofNonAdjacentElementsMem(n, arr,dp));
        System.out.println(MaximumSumofNonAdjacentElementsTab(n, arr));
        System.out.println(MaximumSumofNonAdjacentElementsSO(n, arr));
    }
}