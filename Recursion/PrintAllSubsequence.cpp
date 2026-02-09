#include <bits/stdc++.h>

using namespace std;

void PrintAllSubsequence(int i, int n, int arr[], string s)
{
    if (i == n)
    {
        cout << s << endl;
        return;
    }

    PrintAllSubsequence(i + 1, n, arr, s + to_string(arr[i]));
    PrintAllSubsequence(i + 1, n, arr, s);
}

int main()
{
    int n;
    cin >> n;
    int arr[n];
    string s;

    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    PrintAllSubsequence(0, n, arr, s);
    return 0;
}