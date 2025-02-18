#include <stdio.h>
#include <vector>
using namespace std;

void swap(int *xp, int *yp)
{
    int temp = *xp;
    *xp = *yp;
    *yp = temp;
}

void selectionSort(vector<int> &arr)
{
    int length = arr.size();
    for (int i = 0; i < length - 1; i++)
    {
        int min = i;
        for (int j = i + 1; j < length; j++)
        {
            if (arr[j] < arr[min])
            {
                min = j;
            }
        }

        swap(&arr[min], &arr[i]);
    }
}

void bubbleSort(vector<int> &arr)
{
    int length = arr.size();

    for (int i = length - 1; i >= 0; i--)
    {
        for (int j = 0; j < i; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                swap(&arr[j], &arr[j + 1]);
            }
        }
    }
}

void insertionSort(vector<int> &arr)
{
    int l = arr.size();
    for (int i = 1; i < l; i++)
    {
        int ind = i;
        int num = arr[i];
        while (arr[ind] < arr[ind - 1])
        {
            swap(&arr[ind], &arr[ind - 1]);
            ind--;
        }
    }
}

int main()
{
    return 0;
}