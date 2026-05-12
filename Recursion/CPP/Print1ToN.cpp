#include <bits/stdc++.h>

using namespace std;

void Print1ToN(int x, int n){
    if (x>n){
        return ;
    }
    cout<<x<<endl;
    Print1ToN(x+1,n);
}

int main(){
    int n;
    cin >> n;
    Print1ToN(1,n);
    return 0;
}