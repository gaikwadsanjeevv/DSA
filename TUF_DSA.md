### Basics C++  
#### Basic Skeleton of Programme  
```C++
#include<bits/stdc++.h>
using namespace std;

int main() 
{

    return 0;
}
```

The use of return 0 in the main() function in C is important because it provides a clear and standardized way to indicate to the operating system or the program's caller that the program has completed successfully.When a C program finishes executing, control is returned to the operating system.  
The value returned by main() is interpreted as the program's exit status:  
0: Indicates successful completion.  
Non-zero values: Indicate an error or abnormal termination.  
The operating system uses this value to determine whether the program ran as expected or if there were issues.  

#### Hello World programme
```C++
#include<iostream>
using namespace std;

int main() {
    cout << "Hello World" << endl;
    return 0;
}
```
#### Input and output:  
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
#### Data Types  
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
####  if-else
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
#### Switch  
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
}
}
//When break is NOT Needed  
If default is the last case in the switch, adding a break is technically unnecessary because there are no further cases to "fall through" to. For example:  
// When break IS Needed  
If the default case is not the last one, omitting break can cause fall-through to subsequent cases, leading to unintended behavior. For example:  
```
#### ARRAY  
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
##### String also stores every character at index because string is storing characters within  
```c++
#include <bits/stdc++.h>
using namespace std;

int main() {
  string s = "Striver";
  cout << s[2];

    return 0;
}

```
#### For Loop  
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
#### While loop  
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
####  Do while  
I want atleast one time the loop to execute if the condition is false:  
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
#### Functions  
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
#### Parameterized function
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
####  Sum of numbers  
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
#### Always Ensuring the function always return a value  
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
#### Pass by value  
```c++
#include<bits/stdc++.h>
using namespace std;

//pass by value - making copy of original and made changes.

void doSomething(string s) {
    s[0] = 't';
    cout << s << endl;
}
int main() {
string s = "raj";
doSomething(s);
cout<< s << endl;
return 0;
}
```
####  Pass by reference  

```c++
#include<bits/stdc++.h>
using namespace std;

//pass by reference - put &

void doSomething(string &s) {
    s[0] = 't';
    cout << s << endl;
}
int main() {
string s = "raj";
doSomething(s);
cout<< s << endl;
return 0;
}
```
But for array no need to put &  

```c++
#include<bits/stdc++.h>
using namespace std;

void doSomething(int arr[], int n) {
    arr[0] += 100;
    cout << "Value inside function: " << arr[0] << endl;
}
int main() {
    int n = 5;
    int arr[n];

    for(int i = 0; i < n ; i = i + 1) {
        cin >> arr[i];
    }
    doSomething(arr, n);
cout << "value inside int main: " << arr[0] << endl;
return 0;
}
```
========================================================  
Time complexity basically helps to judge different codes and also helps to decide which code is better.  
in real life, Time complexity does not refer to the time taken by the machine to execute a particular code.  
the time taken by a machine can be changed depending on the configuration. That is why we should not compare the two different codes on the basis of the time taken by a machine as the time is dependent on it.  

The rate at which the time, required to run a code, changes with respect to the input size, is considered the time complexity. Basically, the time complexity of a particular code depends on the given input size, not on the machine used to run the code.  

we are not going to use the standard units like minutes or seconds, but the Big O notation.  
We will always calculate the time complexity for the worst-case scenario.  
We will avoid including the constant terms.  
We will also avoid the lower values. 

==========================================================  
####  Pattern problems  
There are 4 general rules for solving a pattern-based question:   

We always use nested loops for printing the patterns. For the outer loop, we count the number of lines/rows and loop for them.  
Next, for the inner loop, we focus on the number of columns and somehow connect them to the rows by forming a logic such that for each row we get the required number of columns to be printed.  
We print the ‘*’ inside the inner loop.  
Observe symmetry in the pattern or check if a pattern is a combination of two or more similar patterns.  

![image](https://github.com/user-attachments/assets/0bcf9c83-effc-454e-9680-bbd4829221d0)

```c++
#include <bits/stdc++.h>
using namespace std;

void pattern1(int N)
{
    // This is the outer loop which will loop for the rows.
    for (int i = 0; i < N; i++)
    {
        // This is the inner loop which here, loops for the columns
        // as we have to print a rectangular pattern.
        for (int j = 0; j < N; j++)
        {
            cout << "* ";
        }
       
        // As soon as N stars are printed, we move to the
        // next row and give a line break otherwise all stars
        // would get printed in 1 line.
        cout << endl;
    }
}

int main()
{   
    // Here, we have taken the value of N as 5.
    // We can also take input from the user.
    int N = 5;

    pattern1(N);

    return 0;
}
```
------------  

![image](https://github.com/user-attachments/assets/7928dac5-0002-4eb0-ad92-4f615a904b28)  
```c++
#include <bits/stdc++.h>
using namespace std;

void pattern2(int N)
{
    // This is the outer loop which will loop for the rows.
    for (int i = 0; i < N; i++)
    {
        // This is the inner loop which loops for the columns
       // no. of columns = row number for each line here.
        for (int j = 0; j <=i; j++)
        {
            cout << "* ";
        }
       
        // As soon as stars for each iteration are printed, we move to the
        // next row and give a line break otherwise all stars
        // would get printed in 1 line.
        cout << endl;
    }
}

int main()
{   
    // Here, we have taken the value of N as 5.
    // We can also take input from the user.
    int N = 5;

    pattern2(N);

    return 0;
}

```
---------------  

![image](https://github.com/user-attachments/assets/5eb553d9-ac25-478e-b56d-c5e65f298f8c)  

```c++
#include <bits/stdc++.h>
using namespace std;

void pattern3(int N)
{
    // This is the outer loop which will loop for the rows.
    for (int i = 1; i <= N; i++)
    {
        for (int j = 1; j <=i; j++)
        {
            cout <<j<<" ";
        }
        cout << endl;
    }
}

int main()
{   
    int N = 5;

    pattern3(N);

    return 0;
}
```
------------------------  


![image](https://github.com/user-attachments/assets/9f6a1c78-dede-4969-802c-6151dec837f3)  

```c++
#include<bits/stdc++.h>
using namespace std;

void pattern4(int N) {
    for(int i = 0; i <= N; i++)
     {
        for(int j = 1; j <= i; j++) 
        {
            cout <<i<<" ";
        }
        cout << endl;
    }
}

int main() {
    int N = 5;
    pattern4(N);

return 0;
}
```
----------------------  

![image](https://github.com/user-attachments/assets/042df236-18aa-4f0d-962a-4a898dcc026b)  
```c++
#include<bits/stdc++.h>
using namespace std;

void pattern5(int N) {
    for(int i = 0; i <= N; i++)
     {
        for(int j = N; j > i; j--) 
        {
            cout <<"* ";
        }
        cout << endl;
    }
}

int main() {
    int N = 5;
    pattern5(N);

return 0;
}

```
-----------------------  

![image](https://github.com/user-attachments/assets/e19a4f12-b85c-40af-b898-fc20ca04a340)  
```c++
#include<bits/stdc++.h>
using namespace std;

void pattern5(int N) {
    for(int i = 0; i < N; i++)
     {
        for(int j = N; j > i; j--) 
        {
            cout <<N-j+1<<" ";
        }
        cout << endl;
    }
}

int main() {
    int N = 5;
    pattern5(N);

return 0;
}

```

------------------------  


![image](https://github.com/user-attachments/assets/937cf69d-bca7-4dcf-97bd-d522ed7fa993)  
```c++
#include <bits/stdc++.h>
using namespace std;

void pattern7(int N)
{
    // This is the outer loop which will loop for the rows.
    for (int i = 0; i < N; i++)
    {
        // For printing the spaces before stars in each row
        for (int j =0; j<N-i-1; j++)
        {
            cout <<" ";
        }
       
        // For printing the stars in each row
        for(int j=0;j< 2*i+1;j++){
            
            cout<<"*";
        }
        
        // For printing the spaces after the stars in each row
         for (int j =0; j<N-i-1; j++)
        {
            cout <<" ";
        }
        
        // As soon as the stars for each iteration are printed, we move to the
        // next row and give a line break otherwise all stars
        // would get printed in 1 line.
        cout << endl;
    }
}

int main()
{   
    // Here, we have taken the value of N as 5.
    // We can also take input from the user.
    int N = 5;

    pattern7(N);

    return 0;
}
```

-----------------  


![image](https://github.com/user-attachments/assets/96522df6-2f16-4e4b-9e0c-b3615f78f696)  
```c++
#include <bits/stdc++.h>
using namespace std;

void pattern8(int N)
{
    // This is the outer loop which will loop for the rows.
    for (int i = 0; i < N; i++)
    {
        // For printing the spaces before stars in each row
        for (int j =0; j<i; j++)
        {
            cout <<" ";
        }
       
        // For printing the stars in each row
        for(int j=0;j< 2*N -(2*i +1);j++){
            
            cout<<"*";
        }
        
        // For printing the spaces after the stars in each row
         for (int j =0; j<i; j++)
        {
            cout <<" ";
        }
        
        // As soon as the stars for each iteration are printed, we move to the
        // next row and give a line break otherwise all stars
        // would get printed in 1 line.
        cout << endl;
    }
}

int main()
{   
    // Here, we have taken the value of N as 5.
    // We can also take input from the user.
    int N = 5;

    pattern8(N);

    return 0;
}
```
-------------------  

![image](https://github.com/user-attachments/assets/159f9207-ff52-4ac1-a583-e78de88c72dd)  

```c++
#include <bits/stdc++.h>
using namespace std;

void erect_pyramid(int N)
{
    // This is the outer loop which will loop for the rows.
    for (int i = 0; i < N; i++)
    {
        // For printing the spaces before stars in each row
        for (int j =0; j<N-i-1; j++)
        {
            cout <<" ";
        }
       
        // For printing the stars in each row
        for(int j=0;j< 2*i+1;j++){
            
            cout<<"*";
        }
        
        // For printing the spaces after the stars in each row
         for (int j =0; j<N-i-1; j++)
        {
            cout <<" ";
        }
        
        // As soon as the stars for each iteration are printed, we move to the
        // next row and give a line break otherwise all stars
        // would get printed in 1 line.
        cout << endl;
    }
}

void inverted_pyramid(int N)
{
    // This is the outer loop which will loop for the rows.
    for (int i = 0; i < N; i++)
    {
        // For printing the spaces before stars in each row
        for (int j =0; j<i; j++)
        {
            cout <<" ";
        }
       
        // For printing the stars in each row
        for(int j=0;j< 2*N -(2*i +1);j++){
            
            cout<<"*";
        }
        
        // For printing the spaces after the stars in each row
         for (int j =0; j<i; j++)
        {
            cout <<" ";
        }
        
        // As soon as the stars for each iteration are printed, we move to the
        // next row and give a line break otherwise all stars
        // would get printed in 1 line.
        cout << endl;
    }
}

int main()
{   
    // Here, we have taken the value of N as 5.
    // We can also take input from the user.
    int N = 5;
    erect_pyramid(N);
    inverted_pyramid(N);

    return 0;
}
```
------------------------------------  

#### STL C++ -  Standard Templete Library:  

C++ STL divided in to 4 parts:   
ALgorithm  
Containers  
Functions  
Iterators  

Before moving to containers we need to know about pairs - Pairs is a part of utility library.  

```c++
//storing 2 inputs in pairs
void explainPain() {
pair <int, int> p = {1,3};
cout << p.first << " " << p.second;

//storing 3 number
pair<int, pair<int, int>> p = {1,{3,4}};
cout<< p.first << " " << p.second.second << " " << p.second.first;
//pair array
pair<int, int> arr[] = {{1,2},{2,5}, {5,1}};
cout<< arr[1].second;
 }
```
Vector is the container dynamic in nature  
 
```c++
#include <bits/stdc++.h>
using namespace std;

// emplace_back is more efficient than push_back when dealing with complex objects because 
// it eliminates the need for a temporary object and a copy or move operation.
void explainVector() {
    vector<int> v;

    // Adding elements to a vector of integers
    v.push_back(1);        // Adds 1 to the vector using push_back
    v.emplace_back(2);     // Adds 2 to the vector using emplace_back (slightly more efficient)

    // Vector of pairs
    vector<pair<int, int>> vec;

    // Adding elements to a vector of pairs
    vec.push_back({1, 2});        // Requires constructing a temporary pair {1, 2}
    vec.emplace_back(1, 2);       // Constructs the pair directly in place (more efficient)

    // Print the vector of integers
    cout << "Vector of integers: ";
    for (auto val : v) {
        cout << val << " ";
    }
    cout << endl;

    // Print the vector of pairs
    cout << "Vector of pairs: ";
    for (auto &p : vec) {
        cout << "{" << p.first << ", " << p.second << "} ";
    }
    cout << endl;
}

int main() {
    explainVector();  // Call the function to demonstrate the usage
    return 0;
}
```
Other ways to put element in vector :  

vector<int> v(5. 100);   //vector of size 5, with values 100  
vector<int> v(5);  //vector of size 5, with 5 instances of garbage value  
vector<int> v2(v1);  
//even if u are predefining the size of the vector you can anytime dynamically increase it  
//ways to access the elements of an vector is by providing it indices, other way is by iterator.  




















