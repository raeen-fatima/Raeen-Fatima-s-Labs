#include <iostream>

using namespace std;
int recursiveSum(int n) {
    if (n == 0) return 0; // base case
    return n + recursiveSum(n - 1); // recursive case
}
int main() {
    int num = 5;
    cout << "Sum of first " << num << " natural numbers is " << recursiveSum(num) << endl;
    return 0;
}
//output: Sum of first 5 natural numbers is 15 => 1 + 2 + 3 + 4 + 5 = 15