//fibonacci

#include <iostream>
using namespace std;

int fib(int n){
    //base case
    if (n == 0) return 0;
    if (n == 1) return 1;
    //recusive case
    return fib(n-1) + fib(n-2);
    
}

int main(){
    cout << fib(4) << endl;
    return 0;
}