#include <bits/stdc++.h>
using namespace std;

void Print1ToNBacktracking(int n){
    if (n<=0){
        return ;
    }

    Print1ToNBacktracking(n-1);
    cout<<n<<endl;
}

int main(){
    int n;
    cin >> n;

    Print1ToNBacktracking(n);

    return 0;
}