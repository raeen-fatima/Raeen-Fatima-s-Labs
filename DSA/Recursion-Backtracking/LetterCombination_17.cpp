#include <iostream>
#include <vector>
#include <string>
using namespace std;

class Letter_Combination{
    public:
    vector<string> 
    mapping = {
        "" , "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    
    // helper function
    void backtrack(string digits, int index, string current, vector<string> &result){
        //Base Case => Where recursion stops
        if(index == digits.size()){
            if(!current.empty()){
                result.push_back(current);
            }
            return;
        }
        //Extract the last digit
        char digit = digits[index]; // char from a string
        // convert char to integer fusing ASCII trick example digits[0] - '0' => '2' - '0' => 50 - 48 = 2 so to is the integer value
        string letters = mapping[digits[index] -'0'];

        // choice: try all the letter of this string
        for(char letter : letters){
            backtrack(digits, index+1, current + letter, result);
        }
    }
    // passsing a new string similar to immutability behaviour
    vector<string> letter_combinations(string digits){
        vector <string> result; // a basket to store all the combinations
    if(digits.empty()) return result;
    //recursion starts here
    backtrack(digits, 0 , " " ,result);
    return result;
    }
};

int main(){
    Letter_Combination combination; // Create an object
    string digits = "23"; // input to print all the combinations of digit 2 and 3
    vector <string> ans = combination.letter_combinations(digits); // call the function
    cout << "All the possible combinations: \n"; // print the ans
    for(string s : ans){
        cout << s << " "; //loop to print all the strings
    }
    cout << endl;
    return 0;
};
// output => All the possible combinations:  ad  ae  af  bd  be  bf  cd  ce  cf

