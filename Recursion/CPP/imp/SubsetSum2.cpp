#include <bits/stdc++.h>

using namespace std;

void SubsetSum2(int ind , vector<int> &arr , vector<int> &ds , vector<vector<int>> &ans){
    ans.push_back(ds);
    for (int i = ind ; i < arr.size() ; i++){
        if (i>ind && arr[i] == arr[i-1]) continue;

        ds.push_back(arr[i]);
        SubsetSum2(i+1 , arr, ds , ans);
        ds.pop_back();
    }



}

int main(){
    int n;
    int x;
    vector<int> arr;
    vector<int> ds;
    vector<vector<int>> ans;

    cin >> n;
    for (int i = 0 ; i < n ; i++){
        cin >> x;
        arr.push_back(x);
    }

    sort(arr.begin(), arr.end());

    SubsetSum2(0,arr,ds,ans);

    for (auto it1:ans){
        for (auto it2:it1){
            cout << it2 << " ";
        }
        cout << endl;
    }


    return 0;
}