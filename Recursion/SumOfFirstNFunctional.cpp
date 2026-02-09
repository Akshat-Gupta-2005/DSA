#include <bits/stdc++.h>

using namespace std;

int SumOfFirstNFunctional(int n){
    if (n<=0){
        return 0;
    }

    return n + SumOfFirstNFunctional(n-1);
}

int main(){
    int n,s;
    cin >> n;
    s = SumOfFirstNFunctional(n);
    cout<<s;
    return 0;
}