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
Switch  
```C++
#include<bits/stdc++.h>
using namespace std;

int main() {
int day;
cin >> day;

switch (day)
{
case 1:
    cout << "Monday";
    break;
    case 2:
    cout << "Tuesday";
    break;
    case 3:
    cout << "Wednesday";
    break;
    case 4:
    cout << "Thrusday";
    break;
    case 5:
    cout << "Friday";
    break;

default:
cout << "Invalid ";
//no need of break here
}
}
```
ARRAY  
```c++
#include <bits/stdc++.h>
using namespace std;

int main() {
    int arr[5];

    // Input 5 integers into the array
    cout << "Enter 5 integers: ";
    cin >> arr[0] >> arr[1] >> arr[2] >> arr[3] >> arr[4];

    // Modify the 4th element
    arr[3] = 16;

    // Loop through the array and print each element
    cout << "Array elements: ";
    for (int i = 0; i < 5; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}
```
String also stores every character at index because string is storing characters within  
```c++
#include <bits/stdc++.h>
using namespace std;

int main() {
  string s = "Striver";
  cout << s[2];

    return 0;
}

```
For Loop  
```c++
#include <bits/stdc++.h>
using namespace std;

int main() {
    for(int i = 1; i <= 25; i = i + 5 ) {
        cout << "Strive " << i<< endl;
    }
    return 0;
}

```
While loop  
```c++
#include <bits/stdc++.h>
using namespace std;

int main() {
    int i = 0; // Initialize 'i' to 0

    while (i <= 5) {
        cout << "Sanjeev " << i << endl;
        i = i + 1; // Increment 'i' to avoid an infinite loop
    }

    return 0;
}
```
Do while :  I want atleast one time the loop to execute if the condition is false:  
```c++
#include <iostream>
using namespace std;

int main() {
    int i = 6; // Initialize the counter

    // Start the do-while loop
    do {
        cout << "Number: " << i << endl; // Print the current number
        i++; // Increment the counter
    } while (i <= 5); // Condition to repeat the loop

    return 0;
}
```
Functions  
```c++
#include <iostream>
using namespace std;
//Functions are set of code which perform some task.
//Functions are used to modularise code, increase readability, can be used multiple time, 
//void

void printName() {
    cout << "Hey sanjeev";
}
int main() {
printName();
    return 0;
}

``
Parameterized function
```c++
#include <iostream>
using namespace std;
//Functions are set of code which perform some task.
//Functions are used to modularise code, increase readability, can be used multiple time, 
//void

void printName(string name) {
    cout << "Hey " << name;
}
int main() {
string name;
cin >> name;
printName(name);

string name2;
cin >> name2;
printName(name2);
return 0;
}
```
Sum of numbers  
```c++
#include <iostream>
using namespace std;

// Function to calculate the sum of two numbers
int sum(int num1, int num2) {
    int num3 = num1 + num2; // Calculate the sum
    return num3;           // Return the sum
}

int main() {
    int num1, num2;

    // Input two numbers
    cout << "Enter two numbers: ";
    cin >> num1 >> num2;

    // Call the sum function and store the result
    int result = sum(num1, num2);

    // Display the result
    cout << "The sum is: " << result << endl;

    return 0;
}
```
Always Ensuring the function always return a value  
```c++
#include <iostream>
using namespace std;

// Function to find the maximum of two numbers
int maxx(int num1, int num2) {
    if (num1 >= num2) {
        return num1;
    }
    return num2; // Ensures the function always returns a value
}

int main() {
    int num1, num2;

    // Input two numbers
    cout << "Enter two numbers: ";
    cin >> num1 >> num2;

    // Call the maxx function and store the result
    int result = maxx(num1, num2);

    // Display the maximum value
    cout << "The maximum number is: " << result << endl;

    return 0;
}
```
1:15
