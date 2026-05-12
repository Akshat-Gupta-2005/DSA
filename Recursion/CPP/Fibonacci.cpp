#include <bits/stdc++.h>

using namespace std;

void Fibonacci(int i , int n , int x , int y){
    if (i>n){
        return ;
    }

    cout << x+y << endl;
    Fibonacci(i+1,n,y,x+y);
}

int main(){
    int n;
    cin >> n;
    cout<<0<<endl<<1<<endl;
    Fibonacci(2,n,0,1);

    return 0;
}