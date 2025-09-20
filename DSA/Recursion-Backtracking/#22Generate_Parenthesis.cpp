#include <bits/stdc++.h>
using namespace std;
class Solution {
public:
    vector<string> ans;
    void helper(int open, int close, int n, string &cur) {
        if (cur.size() == 2 * n) {
            ans.push_back(cur);
            return;
        }
        // choice 1 -> add '(' if we can 
        if (open < n) {
            cur.push_back('(');
            helper(open + 1, close, n, cur);
            cur.pop_back();
        }
        // choice 2 -> add ')' if we can
        if (close < open) {
            cur.push_back(')');
            helper(open, close + 1, n, cur);
            cur.pop_back();
        }
    }
    vector<string> generateParenthesis(int n) {
        string cur;
        helper(0, 0, n, cur);
        return ans;
    }
};
int main() {
    Solution s;
    int n = 3;
    vector<string> res = s.generateParenthesis(n);
    for (auto &str : res) {
        cout << str << endl;
    }
    return 0;
}   
//output:
//((()))
//(()())
//(())()
//()(())
//()()()
/*dry run
1. Start with an empty string: ""
2. Add '(': "("
3. Add '(': "(("
4. Add '(': "((("
5. Add ')': "((())"
6. Add ')': "((()))"
7. Backtrack to "(()"
8. Add '(': "(()("
9. Add ')': "(()()"
10. Add ')': "(()())"
11. Backtrack to "(("
12. Add ')': "(()"
13. Add '(': "(()("
14. Add ')': "(()()"
15. Add ')': "(()())"
16. Backtrack to "("
17. Add ')': "()"
18. Add '(': "()(("
19. Add '(': "()(("
20. Add ')': "()(())"
21. Add ')': "()()()"
*/
/*TC-O(4^n/sqrt(n)) SC-O(n)
where n is the number of pairs of parentheses.
The time complexity is derived from the fact that the number of
valid parentheses combinations is given by the nth Catalan number,
which is approximately 4^n/sqrt(n).
The space complexity is O(n) for the recursion stack and the
current string being built. The result list also takes up space,
but it is not counted in the space complexity analysis.*/