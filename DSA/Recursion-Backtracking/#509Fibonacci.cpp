#include <iostream>
using namespace std;
int fibonacci(int n) {
    if(n == 0) return 0; // base case
    if(n == 1) return 1; // base case
    return fibonacci(n -1) + fibonacci(n - 2); // recursive case
}
int main() {
    int num = 6;
    cout << "Fibonacci of " << num << " is " << fibonacci(num) << endl;
    return 0;
//output: Fibonacci of 6 is 8 => 0, 1, 1, 2, 3, 5, 8
}
/*

    dry run for fibonacci(6)
fibonacci(6) = fibonacci(5) + fibonacci(4)
fibonacci(5) = fibonacci(4) + fibonacci(3)
fibonacci(4) = fibonacci(3) + fibonacci(2)
fibonacci(3) = fibonacci(2) + fibonacci(1)
fibonacci(2) = fibonacci(1) + fibonacci(0)
fibonacci(1) = 1 (base case)
fibonacci(0) = 0 (base case)

fibonacci(2) = 1 + 0 = 1
fibonacci(3) = 1 + 1 = 2
fibonacci(4) = 2 + 1 = 3
fibonacci(5) = 3 + 2 = 5
fibonacci(6) = 5 + 3 = 8
*/