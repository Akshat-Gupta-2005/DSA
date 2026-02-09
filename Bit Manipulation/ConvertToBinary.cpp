#include <bits/stdc++.h>

using namespace std;

string ConvertToBinary(int n){
    string s;
    if (n == 0) return "0";
    while (n > 0){
        if (n%2 == 1) s = '1' + s;
        else s = '0' + s;
        n = n / 2;
    }
    return s;
}

int main(){
    int n;
    cin >> n;
    string s = ConvertToBinary(n);
    cout << s;

    return 0;
}