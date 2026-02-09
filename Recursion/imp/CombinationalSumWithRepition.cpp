#include <bits/stdc++.h>
using namespace std;

void CombinationalSumWithRepition(int i, int n, int s, int Sum, vector<int> vec, int arr[])
{
    if (i == n)
    {
        if (s == Sum)
        {
            for (auto it : vec)
            {
                cout << it << " ";
            }
            cout<<endl;
        }
        return;
    }

    if (s > Sum) return;

    if (s + arr[i] <= Sum)
    {
        vec.push_back(arr[i]);
        CombinationalSumWithRepition(i, n, s + arr[i], Sum, vec, arr);
        vec.pop_back();
    }

    CombinationalSumWithRepition(i + 1, n, s, Sum, vec, arr);
}

int main()
{
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    int S;
    cin >> S;
    vector<int> vec;
    CombinationalSumWithRepition(0, n, 0, S, vec, arr);

    return 0;
}
