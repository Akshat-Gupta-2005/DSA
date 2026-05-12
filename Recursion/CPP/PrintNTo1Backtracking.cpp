#include <bits/stdc++.h>

using namespace std;

void PrintNTo1Backtracking(int x , int n){
    if (x>n){
        return ;
    }

    PrintNTo1Backtracking(x+1,n);
    cout<<x<<endl;
}

int main(){
    int n;
    cin>>n;
    PrintNTo1Backtracking(1,n);
    return 0;
}