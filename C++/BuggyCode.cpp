#include <iostream>
using namespace std;

int main() {
    int n = 5;
    //int sum;   uninitialized variable may contain garbage value hence buggy output
int sum = 0;
    for(int i = 1; i <= n; i++) {
        sum = sum + i;
    }

    cout << "Sum = " << sum << endl;

    return 0;
}

//To find all the warning or buggy code to check bugs use :   clang++ -std=c++17 -Weverything main.cpp -o main
//To compile:   clang++ -std=c++17 main.cpp -o main
//To run: ./main
