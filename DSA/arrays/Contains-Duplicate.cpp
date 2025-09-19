#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        sort(nums.begin(), nums.end()); // O(n log n)
        for (int i = 1; i < nums.size(); i++) {
            if (nums[i] == nums[i-1]) {
                return true; // duplicate mila
            }
        }
        return false;
    }
};

int main() {
    Solution sol;
    vector<int> nums = {1, 2, 3, 1};
    bool ans = sol.containsDuplicate(nums);
    cout << (ans ? "true" : "false") << endl; // output: true
    return 0;
} //output: true => 1 is duplicate


// Time Complexity: O(n log n) due to sorting
// Space Complexity: O(1) if we ignore the space used by sorting algorithm
// Note: This approach modifies the input array by sorting it.
// If you want to keep the original array intact, consider using a hash set for O(n) time and O(n) space solution.
// Example of hash set approach:

/*
#include <unordered_set>
bool containsDuplicate(vector<int>& nums) {
    unordered_set<int> seen;
    for (int num : nums) {
        if (seen.count(num)) {
            return true; // duplicate mila
        }
        seen.insert(num);
    }
    return false;
}
*/