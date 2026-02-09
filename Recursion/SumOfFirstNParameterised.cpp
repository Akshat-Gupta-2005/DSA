#include <bits/stdc++.h>

using namespace std;

void SumOfFirstNParameterised(int s , int n){
    if (n<=0){
        cout << s; 
        return;
    }

    SumOfFirstNParameterised(s + n , n-1);
}

int main(){
    int n;
    cin >> n;

    SumOfFirstNParameterised(0,n);

    return 0;
}