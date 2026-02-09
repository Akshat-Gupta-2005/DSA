#include <bits/stdc++.h>
using namespace std;

int minimizeCleaningCost(string dataset, int matchCost, int mismatchCost) {
    int n = dataset.size();
    vector<vector<int>> dp(n, vector<int>(n, 0));

    // dp[i][j] = minimum cost to remove substring dataset[i..j]
    for (int len = 2; len <= n; len += 2) { // only even lengths
        for (int i = 0; i + len - 1 < n; i++) {
            int j = i + len - 1;
            dp[i][j] = INT_MAX;

            // Case 1: Remove i and j together
            int cost = (dataset[i] == dataset[j]) ? matchCost : mismatchCost;
            if (len == 2) {
                dp[i][j] = cost;
            } else {
                dp[i][j] = min(dp[i][j], dp[i+1][j-1] + cost);
            }

            // Case 2: Split into two substrings
            for (int k = i+1; k < j; k += 2) {
                dp[i][j] = min(dp[i][j], dp[i][k] + dp[k+1][j]);
            }
        }
    }

    return dp[0][n-1];
}


int main(){
    int a;
    int b;
    string s;
    cin >> s >> a >> b ;
    int n = minimizeCleaningCost(s,a,b);
    cout << n;

}