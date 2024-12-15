## @ https://takeuforward.org/ Notes for DSA, Theory and Problems for Leetcode  
## ⓒ TakeUForward : Raj Vikramaditya Sir  

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

## Basic Maths  
When ever we do % Modulo 10 we get the last digit.   

Pseudo code :  

while(N > 0) 
{
lastDigit = N % 10;
N = N/ 10;
}
** so the number of time the given number is divisible by 10 = number of digits it has.  
#### Count The number of digits : 
```java
class Solution {
    static int evenlyDivides(int n) {
        int ctn = 0;
        // Loop until the number becomes 0
        while (n > 0) {
            ctn++;
            n = n / 10; // Remove the last digit
        }
        return ctn;
    }
}
```
#### Palindrome number
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int revNum = 0;
        int dup = n; // store original number
        
        while (n > 0) {
            int ld = n % 10; // get last digit
            revNum = (revNum * 10) + ld; // construct reversed number
            n = n / 10; // reduce number
        }
        
        if (dup == revNum) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
        sc.close();
    }
}

```
#### Armstrong Numbers: 
```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int originalNum = n; // Store the original number for comparison
        int sum = 0;

        while (n > 0) {
            int ld = n % 10; // Get the last digit
            sum += ld * ld * ld; // Add the cube of the last digit to sum
            n = n / 10; // Remove the last digit
        }

        // Compare the original number with the sum of cubes of digits
        if (originalNum == sum) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
        sc.close();
    }
}

```
#### Print all divisors  
The divisors of any number are always between 1 to N.  
so lets do looping  





![image](https://github.com/user-attachments/assets/d23a83b8-e9f9-4e44-9cff-21b9b03d75ed)
Here while finding factors we can see in the image the square root of number forms the mid line and then factors above line is replica below so to optimize code let take one above part of code to get all factors.  

```java
pseudo code
for(i = 1; i < sqrt(n); i++) //here sqrt is function so its called in every step u can write there i * i <=n  
{
if(n%i == 0)
{
print(i)
if((n/j)! = i)
print(n/i)
```
#### Checking the number is prime or not  

```java
//Brute force
public class Main {
    // Function to check if a
    // given number is prime.
    static boolean checkPrime(int n) {
        // Initialize a counter variable to
        // count the number of factors.
        int cnt = 0;
        // Loop through numbers from 1 to n.
        for (int i = 1; i <= n; i++) {
            // If n is divisible by i
            // without any remainder.
            if (n % i == 0) {
                // Increment the counter.
                cnt = cnt + 1;
            }
        }

        // If the number of
        // factors is exactly 2
        if (cnt == 2) {
            // Return true, indicating
            // that the number is prime.
            return true;
        }
        // If the number of
        // factors is not 2.
        else {
            // Return false, indicating
            // that the number is not prime.
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 1483;
        boolean isPrime = checkPrime(n);
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
```
Optimal Method
![image](https://github.com/user-attachments/assets/8e12f8fd-5d1e-4121-804a-f162ea655ddf)  
```java
//optimal approach
import java.util.*;

public class Main {

    // Function to check if a
    // given number is prime.
    static boolean checkPrime(int n){ 

        // Initialize a counter variable to
        // count the number of factors.
        int cnt = 0;

        // Loop through numbers from 1
        // to the square root of n.
        for(int i = 1; i <= Math.sqrt(n); i++){   //more better is for(int i = 1; i*i <= n; i++)  

            // If n is divisible by i
            // without any remainder.
            if(n % i == 0){ 

                // Increment the counter.
                cnt = cnt + 1;

                // If n is not a perfect square,
                // count its reciprocal factor.
                if(n / i != i){
                    cnt = cnt + 1;
                }
            }
        }

        // If the number of
        // factors is exactly 2.
        if(cnt == 2){
             // Return true, indicating
             // that the number is prime.
            return true;
        }
        // If the number of
        // factors is not 2.
        else{ 
            // Return false, indicating
            // that the number is not prime.
            return false; 
        }
    }

    public static void main(String[] args) {
        int n = 1483;
        boolean isPrime = checkPrime(n);
        if(isPrime){
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
```
Find GCD of two numbers  
Problem Statement: Given two integers N1 and N2, find their greatest common divisor.  
The Greatest Common Divisor of any two integers is the largest number that divides both integers.  
 
```java
public class Main {
    public static int findGcd(int n1, int n2) {
        // Initialize gcd to 1
        int gcd = 1;

        // Iterate from 1 up to
        // the minimum of n1 and n2
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            // Check if i is a common
            // factor of both n1 and n2
            if (n1 % i == 0 && n2 % i == 0) {
                // Update gcd to the
                // current common factor i
                gcd = i;
            }
        }

        // Return the greatest
        // common divisor (gcd)
        return gcd;
    }

    public static void main(String[] args) {
        int n1 = 20, n2 = 15;

        // Find the GCD of n1 and n2
        int gcd = findGcd(n1, n2);

        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }
}
  Time Complexity: O(min(N1, N2))                          
```
#### Better Approach 
```java
public class Main {
    // Continue loop as long as both
    // a and b are greater than 0
    public static int findGcd(int a, int b) {
        while(a > 0 && b > 0) {
            // If a is greater than b,
            // subtract b from a and update a
            if(a > b) {
                // Update a to the remainder
                // of a divided by b
                a = a % b;
            }
            // If b is greater than or equal
            // to a, subtract a from b and update b
            else {
                // Update b to the remainder
                // of b divided by a
                b = b % a;
            }
        }
        // Check if a becomes 0,
        // if so, return b as the GCD
        if(a == 0) {
            return b;
        }
        // If a is not 0,
        // return a as the GCD
        return a;
    }

    public static void main(String[] args) {
        int n1 = 20, n2 = 15;

        // Find the GCD of n1 and n2
        int gcd = findGcd(n1, n2);

        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }
}
    

```
#### Recursions  

when  a function calls itself  until a specified condition is meet.
![digital_flowchart](https://github.com/user-attachments/assets/39867a87-0f90-4d61-8d16-5cfd68c8dce9)  
If u look the image above there is function with in function calling itself.  

```c++
#include <stdio.h>

// Function f definition
void f() {
    printf("1\n"); // Print 1
    f();           // Recursive call to f()
}

// Main function
int main() {
    f(); // Call f() from main
    return 0;
}
```
when the function keeps calling up recursively the stack get overfilled leading to segmentation fault also called as StackOverflow.  
As the fuction keep calling recursively so it must stop somewhere, which we call as the base condition. There can be single or multiple base condition.  
```c++
#include<bits/stdc++.h>
using namespace std;

int cnt = 0;
void print() {
    if(cnt == 3) return;
cout << cnt << endl;
cnt++;
print();
}

int main() {

print();
return 0;

}
```
We hear one more concept Recursion Tree:  
A recursive tree is basically a representative form of recursion which depicts how functions are called and returned as a series of events happening consecutively. It is a pictorial description of the process of recursion as illustrated below :   
![image](https://github.com/user-attachments/assets/ac79beb5-b0f9-4bce-862c-acc924be373a)
 
####  Basic recursion function with base condition.  
```java
class Basic {
    static int cnt = 0;
    static void print(){
        
         // Base Condition.
         if(cnt == 3 ) return;
         System.out.println(cnt);

         // Count incremented.
         cnt = cnt+1;
         print();

    }
    public static void main(String[] args) {
        print();
    }
}
```
#### Print your Name N times using recursion  
```java
class Recursion {
    
    static void func(int i, int n){
        
            // Base Condition.
            if(i>n) return;
            System.out.println("Sanju "+i);

            // Function call to print till i increments.
            func(i+1,n);

    }
    public static void main(String[] args) {

       // Here, let’s take the value of n to be 4.
       int n = 25;
       func(1,n);
    }
}
```
Time Complexity: O(N) { Since the function is being called n times, and for each function, we have only one printable line that takes O(1) time, so the cumulative time complexity would be O(N)  

#### Print 1 to N using Recursion  

Forward Tracking:  

In forward tracking, the logic or operation (e.g., System.out.println(i)) is executed before the recursive call.  
The recursive calls are made first, progressively reaching the base condition. The logic unfolds as the function stack grows.  
Use Case: When the task requires processing elements while "going deeper" into recursion, such as printing or accumulating values in a forward sequence.  

Backward Tracking  

In backward tracking, the recursive call is made before the logic or operation.  
This means the logic unfolds as the recursion stack starts "unwinding" after reaching the base condition.  
Use Case: When the task requires processing elements in reverse order or using results obtained from deeper recursive calls, such as calculating factorials or backtracking algorithms.  

![image](https://github.com/user-attachments/assets/02f142d1-895b-4c35-ad80-80950cc06835)  
![image](https://github.com/user-attachments/assets/6200caf2-3e2f-4b00-bfc5-aa533182158a)  

Forward tracking is suitable when the solution is built progressively, step by step, without needing to backtrack or reconsider earlier steps.  
It works for tasks that are deterministic, such as rendering a game's visuals (e.g., updating the snake's position in the snake game) or exploring possibilities in a depth-first manner.  

Backtracking is critical in solving puzzles like mazes, Sudoku, or any problem involving a "trial-and-error" approach. It explores a path and "backs up" if the path fails.  
Backtracking is used to find solutions when constraints need to be satisfied or when the problem space requires exploration and pruning.  
Example in a Maze Solver:

You move step by step (forward tracking) until you hit a dead end. Then, backtracking kicks in to reverse the last step and try alternative paths.  

##### Sum of first N natural numbers  
```java
//using loop
import java.util.*;

public class tuf {

  public static void main(String[] args) {

    solve(5);
    solve(6);
  }
  public static void solve(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    System.out.println("The sum of the first " + n + " numbers is: " + sum);
  }
}
//Time Complexity: O(N)

//Space Complexity: O(1)
```
#### Solution 2: Using the formula
```java
import java.util.*;

public class tuf {

  public static void main(String[] args) {

    solve(5);
    solve(6);
  }
  public static void solve(int N) {
    int sum = N * (N + 1) / 2;
    System.out.println("The sum of the first " + N + " numbers is: " + sum);
  }
}
Time Complexity: O(1)

Space Complexity: O(1)
```
#### Recursive way of calculating the sum of first N Natural Numbers:

Backtracking involves exploring all possible solutions to a problem and "backtracking" to try other possibilities if a certain solution path does not work. Typical backtracking problems include finding permutations, solving mazes, or generating subsets.  
This code does not explore multiple paths or revert decisions. Instead, it follows a single, linear recursive path to compute the sum.  
The error for large values like 98765 occurs because Java recursion has a limit on the stack depth. By default, Java's stack size is limited, and recursive calls consume stack memory for each function call. When the stack depth exceeds the allocated size, a StackOverflowError is thrown.  

```java
class Recursion {
    
    static void func(int i, int sum){
        
            // Base Condition.
            if(i<1){
                
                System.out.println(sum);
                return;
            }
            
            // Function call to increment sum by i till i decrements to 1.
            func(i-1,sum+i);
            

    }
    public static void main(String[] args) {

       // Here, let’s take the value of n to be 3.
       int n = 3;
       func(n,0);
    }
}
Time Complexity: O(N) { Since the function is being called n times, and for each function, we have only one printable line that takes O(1) time, so the cumulative time complexity would be O(N) }

Space Complexity: O(N) { In the worst case, the recursion stack space would be full with all the function calls waiting to get completed and that would make it an O(N) recursion stack space }.
```
#### 2. Functional way

This approach is a lot simpler than the parameterized recursion. We can visualize the sum of n natural numbers in the following way as shown below:
```java
class Recursion {
    
    static int func(int n){
        
            // Base Condition.
            if(n == 0){
                
                return 0;
            }
            
            // Problem broken down into 2 parts and then combined.
            return n + func(n-1);
            

    }
    public static void main(String[] args) {

       // Here, let’s take the value of n to be 3.
       int n = 3;
       System.out.println(func(n));
    }
}
Time Complexity: O(N) { Since the function is being called n times, and for each function, we have only one printable line that takes O(1) time, so the cumulative time complexity would be O(N) }

Space Complexity: O(N) { In the worst case, the recursion stack space would be full with all the function calls waiting to get completed and that would make it an O(N) recursion stack space }.
```
![image](https://github.com/user-attachments/assets/90e0429a-c027-429a-8b64-aa3c6173a49f)  

Final conclusion:  
Most Efficient (Optimal for Performance): Use the formula method for instant and scalable results.  
Best for Practical Applications: Use the iterative approach if you need intermediate steps or more control.  
For Recursion: Stick to recursion only if:  
You’re solving a recursive problem, such as divide-and-conquer algorithms.  
Stack depth is manageable (small N).  
It's a learning or demonstrative task.  
If you want to use recursion for very large 𝑁 and avoid stack overflow, you can consider tail recursion (if supported by the compiler). However, in Java, tail call optimization is not natively supported, so recursion depth is still limited. Iterative approaches are preferred in such cases.  

Applications of Recursion  
Recursion is widely used in scenarios where a problem can be naturally divided into smaller subproblems, especially when the solution involves traversing data structures, exploring possibilities, or applying divide-and-conquer techniques.  

Typical Applications
Tree and Graph Traversals:

Example: Traversing binary trees (inorder, preorder, postorder) or graph algorithms like Depth First Search (DFS).
Real-Time Use Case:
File system navigation where directories are nested (e.g., finding all files within a folder and its subfolders).  
Divide-and-Conquer Algorithms:    

Example: QuickSort, MergeSort, Binary Search.  
Real-Time Use Case:  
Sorting large datasets using MergeSort for optimal performance.  
Searching for elements in databases using Binary Search.  
Backtracking:  

Example: Solving mazes, generating permutations, N-Queens problem, Sudoku solver.  
Real-Time Use Case:  
AI-based pathfinding in games (like finding a way out of a maze in a virtual environment).  
Generating all combinations of a given set (e.g., password cracking tools).  
Dynamic Programming (Recursive with Memoization):  

Example: Fibonacci sequence, Longest Common Subsequence.  
Real-Time Use Case:  
Optimization problems like route planning in GPS systems (e.g., finding the shortest path with constraints).  
Mathematical Computations:  

Example: Factorial, power calculation, combinatorics (like calculating combinations and permutations).  
Real-Time Use Case:  
Recursive mathematical models in scientific simulations.  
Parsing and Evaluating Expressions:  

Example: Compilers use recursion to parse nested expressions in programming languages.  
Real-Time Use Case:  
Parsing JSON, XML, or HTML data in applications.  


Applications of Recursion
Recursion is widely used in scenarios where a problem can be naturally divided into smaller subproblems, especially when the solution involves traversing data structures, exploring possibilities, or applying divide-and-conquer techniques.

Typical Applications
Tree and Graph Traversals:

Example: Traversing binary trees (inorder, preorder, postorder) or graph algorithms like Depth First Search (DFS).
Real-Time Use Case:
File system navigation where directories are nested (e.g., finding all files within a folder and its subfolders).
Divide-and-Conquer Algorithms:

Example: QuickSort, MergeSort, Binary Search.
Real-Time Use Case:
Sorting large datasets using MergeSort for optimal performance.
Searching for elements in databases using Binary Search.
Backtracking:

Example: Solving mazes, generating permutations, N-Queens problem, Sudoku solver.
Real-Time Use Case:
AI-based pathfinding in games (like finding a way out of a maze in a virtual environment).
Generating all combinations of a given set (e.g., password cracking tools).
Dynamic Programming (Recursive with Memoization):

Example: Fibonacci sequence, Longest Common Subsequence.
Real-Time Use Case:
Optimization problems like route planning in GPS systems (e.g., finding the shortest path with constraints).
Mathematical Computations:

Example: Factorial, power calculation, combinatorics (like calculating combinations and permutations).
Real-Time Use Case:
Recursive mathematical models in scientific simulations.
Parsing and Evaluating Expressions:

Example: Compilers use recursion to parse nested expressions in programming languages.
Real-Time Use Case:
Parsing JSON, XML, or HTML data in applications.
#### Understanding Tail Recursion  
Tail recursion is a special type of recursion where the recursive call is the last operation performed by the function. This allows some compilers or interpreters to optimize the recursion, reusing the same stack frame instead of creating a new one for each recursive call.  

Key Characteristics of Tail Recursion  
Last Call: The recursive call must be the final action of the function.  
Optimization: Many languages optimize tail-recursive functions by avoiding additional stack usage (called Tail Call Optimization, or TCO).  

Non-Tail Recursive Version  
In non-tail recursion, the recursive call is not the last operation in the function. The function typically performs additional operations after the recursive call.  

![image](https://github.com/user-attachments/assets/f46390d0-9ba2-4421-b2d8-87f664788384)  
![image](https://github.com/user-attachments/assets/f350c68a-de70-4f31-926c-155b9053654f)  
![image](https://github.com/user-attachments/assets/6e2cb920-6107-47db-bf60-9e48e77a867a)  

![image](https://github.com/user-attachments/assets/d672c432-0843-4fc3-9a16-67340909b3d4)  

#### Iterative Alternative (Simulating Tail Recursion in Java)  
```java
class IterativeFactorial {

    // Iterative approach to calculate factorial
    static long factorial(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i; // Accumulate the result iteratively
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " is: " + factorial(n)); // Output: 120
    }
}
```
![image](https://github.com/user-attachments/assets/3d59390f-4e99-47fd-8704-6c150c441247)  
![image](https://github.com/user-attachments/assets/0a6c33bc-23e0-4f7e-bd4f-b7d3d4d13ca8)  

![image](https://github.com/user-attachments/assets/a3a17a67-b84e-4d32-9416-019a0d4a8045)  
![image](https://github.com/user-attachments/assets/bc56c050-5787-423f-98fb-114b33c9b7b8)  

![image](https://github.com/user-attachments/assets/fc6d3b87-94bb-4244-abb8-2455f3bff27b)  

### Factorial of a number :  Iterative and Recursive.

```java
public class Main {
   static int factorial(int X) {
      int ans = 1;
      for (int i = 1; i <= X; i++) {
         ans = ans * i;
      }
      return ans;
   }
   public static void main(String[] args) {

      int X = 5;
      int result = factorial(X);
      System.out.println("The factorial of " + X + " is " + result);
   }
}
Time Complexity: O(n)

Space Complexity: O(1) 
```
#### Solution 2: Recursive  

Recursive way of calculating the factorial of first N Numbers (functional way):  
```java
import java.util.Scanner;

class FactorialRecursion {

    // Recursive method to calculate factorial
    static int factorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }
        
        // Recursive case: n * factorial(n-1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Calculate factorial using recursion
        int result = factorial(n);

        // Output the result
        System.out.println("Factorial of " + n + " is: " + result);

        scanner.close();
    }
}
```
#### Reverse a given Array  
```java
public class Main {
   //Function to print array
   static void printArray(int ans[], int n) {
      System.out.print("Reversed array is:- \n");
      for (int i = 0; i < n; i++) {
         System.out.print(ans[i] + " ");
      }
   }
   //Function to reverse array using an auxiliary array
   static void reverseArray(int arr[], int n) {
      int[] ans = new int[n];
      for (int i = n - 1; i >= 0; i--) {
         ans[n - i - 1] = arr[i];
      }
      printArray(ans, n);
   }
   public static void main(String[] args) {
      int n = 5;
      int arr[] = { 5, 4, 3, 2, 1};
      reverseArray(arr, n);
   }
}
Time Complexity: O(n), single-pass for reversing array.

Space Complexity: O(n), for the extra array used.
```
![image](https://github.com/user-attachments/assets/7c45450d-343a-4d03-92a4-723fa2fc5ad0)  
![image](https://github.com/user-attachments/assets/19e895da-49b4-416f-9baf-6bdadc8b5fa6)  
![image](https://github.com/user-attachments/assets/1e6def4f-3513-44bc-9c9d-3824f4219219)  

```java
public class Main {
   //Function to print array
   static void printArray(int arr[], int n) {
      System.out.print("Reversed array is:- \n");
      for (int i = 0; i < n; i++) {
         System.out.print(arr[i] + " ");
      }
   }
   //Function to reverse array 
   static void reverseArray(int arr[], int n) {
      int p1 = 0, p2 = n - 1;
      while (p1 < p2) {
         int tmp = arr[p1];
         arr[p1] = arr[p2];
         arr[p2] = tmp;
         p1++;
         p2--;
      }
      printArray(arr, n);
   }
   public static void main(String[] args) {
      int n = 5;
      int arr[] = { 5, 4, 3, 2, 1};
      reverseArray(arr, n);

   }
}
Time Complexity: O(n), single-pass involved.

Space Complexity: O(1) 
```
![image](https://github.com/user-attachments/assets/c86fa7ff-f904-4448-ab56-ea2bfd0ef96e)  
```java
public class Main {
   //Function to print array
   static void printArray(int arr[], int n) {
      System.out.print("Reversed array is:- \n");
      for (int i = 0; i < n; i++) {
         System.out.print(arr[i] + " ");
      }
   }
   //Function to reverse array using recursion
   static void reverseArray(int arr[], int start, int end) {
      if (start < end) {
         int tmp = arr[start];
         arr[start] = arr[end];
         arr[end] = tmp;
         reverseArray(arr, start + 1, end - 1);
      }
   }
   public static void main(String[] args) {
      int n = 5;
      int arr[] = { 5, 4, 3, 2, 1};
      reverseArray(arr, 0, n - 1);
      printArray(arr, n);
   }
}
Time Complexity: O(n)

Space Complexity: O(1)
```
![image](https://github.com/user-attachments/assets/15e40636-e97a-465f-b784-1d645f43ce4c)  
```java
import java.util.*;
public class Main {
   //Function to print array
   static void printArray(Integer arr[], int n) {
      System.out.print("Reversed array is:- \n");
      for (int i = 0; i < n; i++) {
         System.out.print(arr[i] + " ");
      }
   }
   //Reverse array using library function
   static void reverseArray(Integer arr[]) {
      //fetching array as list object
      //reversing the fetched object
      Collections.reverse(Arrays.asList(arr));
   }
   public static void main(String[] args) {
      int n = 5;
      Integer arr[] = {5,4,3,2,1};
      reverseArray(arr);
      printArray(arr, n);
   }
}
Time Complexity: O(n)

Space Complexity: O(1)

```

![image](https://github.com/user-attachments/assets/4eb28402-2f7b-4a21-8f4d-b88f73721249)  

![image](https://github.com/user-attachments/assets/60e225f0-8b69-4465-957a-aea13216a593)  

```java
import java.io.*;
import java.util.Arrays;
class Test {
  static private boolean isPalindrome(String s) {
    int left = 0, right = s.length()-1;
        while(left<right)
        {
            char l = s.charAt(left), r = s.charAt(right);
            if(!Character.isLetterOrDigit(l)) 
                left++;
            else if(!Character.isLetterOrDigit(r)) 
                right--;
            else if(Character.toLowerCase(l)!=Character.toLowerCase(r)) 
                return false;
            else {
                left++; 
                right--;
            }
        }
        return true;
  }
  public static void main(String[] args) {
    String str = "ABCDCBA";
    boolean ans = isPalindrome(str);

    if (ans == true) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not Palindrome");
    }
  }
}
Time Complexity:  O(N)

Space Complexity: O(1)
```

![image](https://github.com/user-attachments/assets/de47afba-e04b-4032-8b67-98c33b62cd0a)  
```java
class Recursion {
    
    static boolean palindrome(int i, String s){
        
            // Base Condition
            // If i exceeds half of the string, means all the elements 
            // are compared, we return true.
            if(i>=s.length()/2) return true;
            
            // If start is not equal to end, not palindrome.
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
            
            // If both characters are same, increment i and check start+1 and end-1.
            return palindrome(i+1,s);
            

    }
    public static void main(String[] args) {

       // Example string.
       String s = "madam";
       System.out.println(palindrome(0,s));
    }
}
Output:

True

Time Complexity: O(N) { Precisely, O(N/2) as we compare the elements N/2 times and swap them}.

Space Complexity: O(1) { The elements of the given array are swapped in place so no extra space is required}.

```
![image](https://github.com/user-attachments/assets/c7423eb1-623f-4636-b4d5-d7f956f647b8)  

![image](https://github.com/user-attachments/assets/c2f6e419-c149-4729-baf8-61e652681591)  
```Java
public class TUF {
  public static void main(String args[]) {
    int n = 5;
    if (n == 0) {
      System.out.println(0);
    } else {
      int fib[] = new int[n + 1];
      fib[0] = 0;
      fib[1] = 1;
      for (int i = 2; i <= n; i++) {
        fib[i] = fib[i - 1] + fib[i - 2];
      }
      System.out.println("The Fibonacci Series up to "+n+"th term:");
      for (int i = 0; i <= n; i++) {
        System.out.print(fib[i] + " ");
      }
    }
  }
}
Output:

The Fibonacci Series up to 5th term:
0 1 1 2 3 5

Time Complexity: O(n)+O(n), for calculating and printing the Fibonacci series.
Space Complexity: O(n), for storing Fibonacci series.
```
![image](https://github.com/user-attachments/assets/59e1c0c9-1628-486f-ae3e-2ee29d063c33)  
```java
public class TUF {
  public static void main(String args[]) {
    int n = 5;
    if (n == 0) {
    System.out.println("The Fibonacci Series up to "+n+"th term:");
    System.out.print(0);
    } else {
      int secondLast = 0;
      int last = 1;
      System.out.println("The Fibonacci Series up to "+n+"th term:");
      System.out.print(secondLast + " " + last + " ");
      int cur;
      for (int i = 2; i <= n; i++) {
        cur = last + secondLast;
        secondLast = last;
        last = cur;
        System.out.print(cur + " ");
      }
    }
  }
}
Output:

The Fibonacci Series up to 5th term:
0 1 1 2 3 5

Time Complexity: O(N).As we are iterating over just one for a loop.

Space Complexity: O(1).
```
![image](https://github.com/user-attachments/assets/2cc1f9a4-74a2-420e-a623-fab20613c4b2)  
![image](https://github.com/user-attachments/assets/eda09109-b4dd-4997-8466-f77f2e7e6155)  
```java
class Recursion {
    
    static int fibonacci(int N){
        
            // Base Condition.
            if(N <= 1){
                
                return N;
            }
            
            // Problem broken down into 2 functional calls
            // and their results combined and returned.
            int last = fibonacci(N-1);
            int slast = fibonacci(N-2);
            
            return last + slast;
            

    }
    public static void main(String[] args) {

       // Here, let’s take the value of N to be 4.
       int N = 4;
       System.out.println(fibonacci(N));
    }
}
Time Complexity: O(2^N) { This problem involves two function calls for each iteration which further expands to 4 function calls and so on which makes worst-case time complexity to be exponential in nature }.

Space Complexity: O(N) { At maximum there could be N function calls waiting in the recursion stack since we need to calculate the Nth Fibonacci number for which we also need to calculate (N-1) Fibonacci numbers before it }.
```
#### Hashing :   
Let’s first try to understand the importance of hashing using an example:

Given an array of integers: [1, 2, 1, 3, 2] and we are given some queries: [1, 3, 4, 2, 10]. For each query, we need to find out how many times the number appears in the array. For example, if the query is 1 our answer would be 2, and if the query is 4 the answer will be 0. 

Similarly, the following will be the answers to the given queries:  
Brute Force approach:  
As we have learned the ‘for loop’, the first approach that should come to our mind is to use it to solve this problem. For each query, we will iterate over the array using a loop. We will count the number of times the query number appears in that array i.e. increment the counter variable if the array element at that index equals the query number. In terms of function, it will look like the following:  
![image](https://github.com/user-attachments/assets/b435ff0f-f81b-4654-ab39-b3c738be3fe7)  
10^8 operations take 1 second to get executed.  
In order to optimize this approach, we need to use hashing. If we say the definition of hashing in a naive way, it is nothing but the combination of the steps, pre-storing, and fetching.  
![image](https://github.com/user-attachments/assets/06f49d40-1557-4226-b286-ac0e112d2747)  



