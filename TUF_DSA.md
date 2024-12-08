### Basics C++
```C++
#include<iostream>
using namespace std;

int main() {
    cout << "Hello World" << endl;
    return 0;
}
```
Input and output:  
```C++
#include<bits/stdc++.h>
using namespace std;

int main() {
    int a,b;
   cin >> a >> b ;
   cout << "Value of a: " << a << endl << "Value of b: " << b;
   return 0;
}
```
Data Types  
```C++
#include <bits/stdc++.h>
using namespace std;

int main() {
    // Declare variables
    int a, b;
    long d;
    long long e;
    float f;
    double g;
    string s1, s2;
    char c;

    // Input validation for each data type
    cout << "Enter two integers (a and b): ";
    while (!(cin >> a >> b)) {
        cin.clear(); // Clear error flag
        cin.ignore(numeric_limits<streamsize>::max(), '\n'); // Ignore invalid input
        cout << "Invalid input. Enter two integers (a and b): ";
    }

    cout << "Enter a long integer (d): ";
    while (!(cin >> d)) {
        cin.clear();
        cin.ignore(numeric_limits<streamsize>::max(), '\n');
        cout << "Invalid input. Enter a valid long integer (d): ";
    }

    cout << "Enter a long long integer (e): ";
    while (!(cin >> e)) {
        cin.clear();
        cin.ignore(numeric_limits<streamsize>::max(), '\n');
        cout << "Invalid input. Enter a valid long long integer (e): ";
    }

    cout << "Enter a float (f): ";
    while (!(cin >> f)) {
        cin.clear();
        cin.ignore(numeric_limits<streamsize>::max(), '\n');
        cout << "Invalid input. Enter a valid float (f): ";
    }

    cout << "Enter a double (g): ";
    while (!(cin >> g)) {
        cin.clear();
        cin.ignore(numeric_limits<streamsize>::max(), '\n');
        cout << "Invalid input. Enter a valid double (g): ";
    }

    cout << "Enter a string (s1): ";
    cin >> s1;

    cout << "Enter a character (c): ";
    cin >> c;

    // Clear newline left in the input buffer
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    cout << "Enter another string (s2): ";
    getline(cin, s2);

    // Output values with formatting
    cout << "\n--- Output ---" << endl;
    cout << "a = " << a << endl;
    cout << "b = " << b << endl;
    cout << "d = " << d << endl;
    cout << "e = " << e << endl;
    cout << "f = " << fixed << setprecision(2) << f << endl;
    cout << "g = " << fixed << setprecision(2) << g << endl;
    cout << "s1 = " << s1 << endl;
    cout << "c = " << c << endl;
    cout << "s2 = " << s2 << endl;

    return 0;
}
```
If you need multiple conditional statment to check and execute use if-if  
if you need to check for any one condition and execute the do if-else if  

Nested if-else  
```C++

#include<bits/stdc++.h>
using namespace std;

int main() {
int age;
cin >> age;
if(age < 18) {
    cout << "Not eligible for job";
}
else if(age <= 57){
    cout << "eligible for job";
    if(age >=55) {
        cout << ", but retirement soon";
    }
}
else {
    cout << "Retirement time";
}
    return 0;
}
```

