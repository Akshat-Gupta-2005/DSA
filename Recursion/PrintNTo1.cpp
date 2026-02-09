#include <bits/stdc++.h>

using namespace std;

void PrintNTo1(int n){
    if (n<=0){
        return;
    }

    cout << n << endl;
    PrintNTo1(n-1);
}

int main(){
    int n;
    cin >> n;
    PrintNTo1(n);

    return 0;
}