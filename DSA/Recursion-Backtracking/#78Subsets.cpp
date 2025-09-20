// # Subsets
// Given an integer array nums of unique elements, return all possible subsets (the power set).
// The solution set must not contain duplicate subsets. Return the solution in any order.
#include <bits/stdc++.h>
using namespace std;
class Solution {
    public:
    vector<vector<int>> ans;
    void helper(int idx, vector<int> &nums, vector<int> &cur){
        if(idx == nums.size()){
            ans.push_back(cur);
            return;
        }
        // choice 1 -> Skip the element
        helper(idx+1, nums, cur);
        // choice 2 -> Take the element
        cur.push_back(nums[idx]);
        helper(idx+1, nums, cur);
        cur.pop_back();
    }
    vector<vector<int>> subsets(vector<int> &nums) {
        vector<int> cur;
        helper(0, nums, cur);
        return ans;
    }
};
int main() {
    Solution s;
    vector<int> nums = {1,2,3};
    vector<vector<int>> res = s.subsets(nums);
    for(auto &vec : res){
        cout << "[ ";
        for(auto &num : vec){
            cout << num << " ";
        }
        cout << "]" << endl;
    }
    return 0;
} //output: [ [], [3], [2], [2,3], [1], [1,3], [1,2], [1,2,3] ]
/*dry run
1. Start with an empty subset: []
2. Include the first element (1): [1]
3. Exclude the first element (1): []
4. Include the second element (2): [2]
5. Exclude the second element (2): []
6. Include the third element (3): [3]
7. Exclude the third element (3): []
*/
/*TC-O(2^n * n) SC-O(n) + O(2^n * n)
where n is the number of elements in the input array nums.
The O(2^n) factor comes from the fact that there are 2^n
possible subsets of an n-element set.
The additional O(n) factor is due to the time taken to copy
each subset into the result vector.
The space complexity is O(n) for the recursion stack,
and O(2^n * n) for storing all the subsets in the result vector.*/