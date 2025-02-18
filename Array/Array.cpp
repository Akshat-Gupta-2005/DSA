#include <stdio.h>
#include <vector>
#include <algorithm>
using namespace std;

class Array
{
public:
    template <class T>
    static void input(vector<T> &A, int n)
    {
        for (int i = 0; i < n; i++)
        {
            scanf("%d ", &A[i]);
        }
    }

    template <class T>
    static void print(vector<T> &A)
    {
        for (int i = 0; i < A.size(); i++)
        {
            cout << A[i] << " ";
        }
        cout << endl;
    }

    int largest(vector<int> &arr)
    {
        int max = arr[0];
        for (int i = 0; i < arr.size(); i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    int getSecondLargest(vector<int> &arr)
    {
        int l = -1;
        int sl = -1;
        for (int i = 0; i < arr.size(); i++)
        {
            if (arr[i] > l)
            {
                sl = l;
                l = arr[i];
            }
            else if (arr[i] > sl && arr[i] != l)
            {
                sl = arr[i];
            }
        }
        if (sl == -1)
        {
            sl = l;
        }
        return sl;
    }

    bool checkSortOrRotated(vector<int> &nums)
    {
        int count = 0;
        int n = nums.size();

        for (int i = 0; i < n; i++)
        {
            if (nums[i] > nums[(i + 1) % n])
            {
                count++;
                if (count > 1)
                {
                    return false;
                }
            }
        }

        return true;
    }

    int removeDuplicates(vector<int> &nums)
    {
        int i = 0;
        int j = 0;

        for (i = 0; i < nums.size(); i++)
        {
            if (nums[i] != nums[j])
            {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }
    void removeDuplicates(vector<int> &nums)
    {
        int i = 0;
        int j = 0;

        for (i = 0; i < nums.size(); i++)
        {
            if (nums[i] != nums[j])
            {
                j++;
                nums[j] = nums[i];
            }
        }

        nums.resize(j + 1);
    }

    void rotate(vector<int> &nums, int k)
    {
        k = k % nums.size();
        reverse(nums.begin(), nums.end());
        reverse(nums.begin(), nums.begin() + k);
        reverse(nums.begin() + k, nums.end());
    }

    void moveZeroes(vector<int> &nums)
    {
        int j = 0;
        int temp;
        for (int i = 0; i < nums.size(); i++)
        {
            if (nums[i] != 0)
            {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    bool searchInSorted(vector<int> &arr, int k)
    {
        for (int i = 0; i < arr.size(); i++)
        {
            if (arr[i] == k)
            {
                return true;
            }
        }
        return false;
    }

    vector<int> findUnion(vector<int> &a, vector<int> &b)
    {
        vector<int> _union;
        int i = 0;
        int j = 0;

        while (i < a.size() && j < b.size())
        {
            if (a[i] < b[j])
            {
                _union.push_back(a[i]);
                i++;
            }
            else if (a[i] > b[j])
            {
                _union.push_back(b[j]);
                j++;
            }
            else
            {
                _union.push_back(a[i]);
                i++;
                j++;
            }
        }

        while (i < a.size())
        {
            _union.push_back(a[i]);
            i++;
        }
        while (j < b.size())
        {
            _union.push_back(b[j]);
            j++;
        }
        removeDuplicates(_union);
        return _union;
    }

    int missingNumber(vector<int> &nums)
    {
        int n = nums.size();
        int s = 0;
        for (int i = 0; i < n; i++)
        {
            s = s + nums[i];
        }
        int s2 = (n * (n + 1)) / 2;

        return s2 - s;
    }

    int findMaxConsecutiveOnes(vector<int> &nums)
    {
        int maxmax = 0;
        int max = 0;
        int i = 0;
        for (i = 0; i < nums.size(); i++)
        {
            if (nums[i] == 0)
            {
                if (max > maxmax)
                {
                    maxmax = max;
                }
                max = 0;
            }
            else
            {
                max++;
            }
        }
        if (max > maxmax)
        {
            maxmax = max;
        }
        return maxmax;
    }

    int singleNumber(vector<int>& nums) {
        int xorr = 0;
        for (int i = 0 ; i  < nums.size() ; i++){
            xorr = xorr ^ nums[i];
        }
        return xorr;
    }
};
 
