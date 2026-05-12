#include <bits/stdc++.h>

using namespace std;

void ReverseArray(int i , int n, int arr[]){
    if (i >= n/2){
        return;
    }

    int temp;
    temp = arr[i];
    arr[i] = arr[n-1-i];
    arr[n-1-i] = temp;

    ReverseArray(i+1,n,arr);
}

int main(){
    int n;
    cin>>n;
    int arr[n];
    
    for (int i = 0 ; i<n ; i++){
        cin >> arr[i];
    }

    ReverseArray(0,n,arr);

    for (int i = 0 ; i<n ; i++){
        cout << arr[i]<<endl;
    }

    return 0;
}