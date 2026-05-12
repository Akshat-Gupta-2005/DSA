#include <bits/stdc++.h>

using namespace std;

void AllPermutations(int count , vector<int> &arr , vector<int> &ds , vector<vector<int>> &ans , int freq[]){
    if (count == arr.size()){
        for (auto it: ds){
            cout<<it<<" ";
        }
        cout<<endl;
        ans.push_back(ds);
        return ;
    }

    for (int i = 0 ; i< arr.size() ; i++){
        if (freq[i] == 1) continue;
        freq[i] = 1;
        ds.push_back(arr[i]);
        AllPermutations(count +1 , arr, ds, ans,freq);
        ds.pop_back();
        freq[i] = 0;
    }
}

int main(){
    int n;
    int x;
    vector<int> arr;
    vector<int> ds;
    vector<vector <int>> ans;
    
    cin >> n;
    int freq[n] = {0};
    for (int i = 0 ; i < n ; i++){
        cin >> x;
        arr.push_back(x);
    }

    AllPermutations(0,arr,ds,ans , freq);
    return 0;
}