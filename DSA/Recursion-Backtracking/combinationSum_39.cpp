#include <iostream>
#include <vector>
using namespace std;

void backtrack(vector<int>& candidates, int target, int start, vector<int>& current, vector<vector<int>>& result) {
    // ✅ Base Case
    if (target == 0) {
        result.push_back(current); // ek answer mila
        return;
    }

    // ✅ Choices
    for (int i = start; i < candidates.size(); i++) {
        if (candidates[i] <= target) {  // only if candidate fit ho
            current.push_back(candidates[i]);   // choice lo
            backtrack(candidates, target - candidates[i], i, current, result); // recursion
            current.pop_back();  // undo / backtrack
        }
    }
}

vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
    vector<vector<int>> result;
    vector<int> current;
    backtrack(candidates, target, 0, current, result);
    return result;
}

int main() {
    vector<int> candidates = {2,3,6,7};
    int target = 7;
    vector<vector<int>> ans = combinationSum(candidates, target);

    cout << "Answers:\n";
    for (auto &vec : ans) {
        cout << "[ ";
        for (int x : vec) cout << x << " ";
        cout << "]\n";
    }
}
