#include <bits/stdc++.h>
using namespace std;

void printx(string s , int a , int x){
    while(a!=x){
        cout<<s<<endl;
        a++;
    }
}

int main(){
    string s;
    cin >> s;
    int x;
    cin >> x;
    printx(s,0,x);
    return 0;
}