#include <bits/stdc++.h>

using namespace std;

void CombinationalSumWithoutRepition(int ind , vector<int> &arr , int target , vector<vector<int>> &ans , vector<int> &ds){
    if (target == 0){
        ans.push_back(ds);
        return ;
    }

    for (int i = ind ; i < arr.size() ;i++){
        if (i>ind && arr[i]==arr[i-1]) continue;
        if (arr[i] > target) break;
        ds.push_back(arr[i]);
        CombinationalSumWithoutRepition(i+1,arr,target-arr[i],ans,ds);
        ds.pop_back();
    }
}

int main(){
    int n;
    int x;
    int t;
    vector<int> arr;
    vector<int> ds;
    vector<vector<int>> ans;
    
    cin >> n;
    for (int i = 0 ; i < n ; i++){
        cin >> x;
        arr.push_back(x);
    }
    cin>>t;
    cout<<endl;
    for (auto it2: arr){
            cout << it2 << " ";
        }

    CombinationalSumWithoutRepition(0,arr,t,ans,ds);

    for (auto it:ans){
        for (auto it2: it){
            cout << it2 << " ";
        }
        cout << endl;
    }

    return 0;
}