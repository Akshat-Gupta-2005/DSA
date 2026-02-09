#include <bits/stdc++.h>

using namespace std;

bool PallindromeCheck(int i , int n, string s){
    if (s[i]!=s[n-1-i]){
        return false;
    }

    if (i>=n/2){
        return true;
    }

    return PallindromeCheck(i+1,n,s);
}

int main(){
    int n;
    string s;
    cin >> s;
    n = s.size();
    bool val = PallindromeCheck(0,n,s);
    cout<<boolalpha <<val;

    return 0;
}