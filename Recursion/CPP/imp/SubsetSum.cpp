#include <bits/stdc++.h>

using namespace std;

void SubsetSum(int i , int n , vector<int> &vec , int arr[] , int s){
    if (i>=n){
        // cout<<s;
        vec.push_back(s);
        return ;
    }

    SubsetSum(i+1,n,vec,arr,s);
    SubsetSum(i+1,n,vec,arr,s+arr[i]);

}

int main(){
    int n;
    cin >> n;

    int arr[n];

    for (int i = 0 ; i<n ; i++){
        cin >> arr[i];
    }


    vector<int> vec;
    SubsetSum(0,n,vec,arr,0);

    sort(vec.begin() , vec.end());
    for (auto it:vec){
        cout<<it<<endl;
    }

    return 0;
}