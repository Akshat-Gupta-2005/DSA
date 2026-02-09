#include <bits/stdc++.h>

using namespace std;

void DFS(int node , vector<int> adj[] , vector<int> &dfs , vector<int> &vis){
    vis[node] = 1;
    dfs.push_back(node);

    for (auto it : adj[node]){
        if (!vis[it]){
            DFS(it,adj,dfs,vis);
        }
    }
}

int main(){

    int n,m;
    cin >> n >> m;
    vector<int> adj[n+1];
    for (int i = 0 ; i < m ; i++){
        int u,v;
        cin >> u >> v;
        adj[u].push_back(v);
        adj[v].push_back(u);
    }
    int node;
    cin >> node;

    vector<int> dfs;
    vector<int> vis(n+1,0);
    
    DFS(node , adj , dfs , vis);

    for (auto it: dfs) cout<<it<<" ";

    return 0;
}