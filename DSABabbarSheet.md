## Problem solving.  
- Understanding the problem.  
- Given Values.  
- Approach towards the programme.  
- Write the programme.

How do we do:  
- FLowchart/ Psuedocode.
- Computer understabnd Binary Language.
- Programme HLL(Source Code) into Machine understandable langauge.

Making an FLowchart.  
Oval → Start / End  
Rectangle → Action step  
Diamond → Decision  
Parallelogram → Input/Output  
Arrow → Flow direction  

<img width="231" height="376" alt="image" src="https://github.com/user-attachments/assets/57dac162-ce7c-48a2-b988-1e2c8bc14983" />
  
##  Pseudocode - Generic way to represent flow of programme irrespective of langauge.  
- Sum of 2 numbers.
  - read 2 numbers, a & b.
  - sum = a+b
  - print sum.

2. Programme to calculate Simple Interest, Camparing 2 values.  
FLowchart:  
<img width="1024" height="1536" alt="image" src="https://github.com/user-attachments/assets/86ffd9d1-3771-43af-bfa1-f65c2b7470b4" />
<img width="1024" height="1536" alt="image" src="https://github.com/user-attachments/assets/be035e1b-c081-4246-9a7b-2e267294708e" />  
<img width="645" height="407" alt="image" src="https://github.com/user-attachments/assets/83f78308-485c-49af-817b-9a79c5fc9287" />

## First Programme.  
```C++
#include<iostream>
using namespace std;
int main() {
cout << "Hello world" <<endl;
}

Data Types:

#include <iostream>
using namespace std;
int main()
{
 int a = 123;
 cout << a << endl;
 char b = 'v';
 cout << b << endl;
 bool b1 = true;
 cout << b1 << endl;
 float f = 1.2;
 cout << f << endl;
 double d = 2.44;
 cout << d << endl;
 
 int size = sizeof(a);
 cout << size<< endl;

//Type Casting

int a = 'a';
cout << a << endl;

char ch = 98;
cout << ch << endl;

char ch1 = 123456;
cout << ch1 << endl;
    return 0;
}
```
All Charachter is mapped with the ASCII Table. 

Hiw negative number are stored - if the number is positive your first bit is 0 or else if number is negative your first bit is 1.  
```C++
#include <iostream>
#include <bitset>

int main() {
    int num = -5;

    // Print as decimal
    std::cout << "Decimal: " << num << "\n";

    // Print as binary (32-bit)
    std::cout << "Binary: " << std::bitset<32>(num) << "\n";

    return 0;
}
Output:
Decimal: -5
Binary: 11111111111111111111111111111011

How Stored in memory:
Binary of 5 in normal unsigned form (just enough bits to store it):
We’ll store this in 32 bits, so we pad with zeros at the front:
00000000 00000000 00000000 00000101
Two’s complement steps:
One’s complement → invert all bits (0 → 1, 1 → 0):
11111111 11111111 11111111 11111010
Add 1:
11111111 11111111 11111111 11111011
How it looks in memory
11111111 11111111 11111111 11111011
Hexadecimal (common in debuggers):
0xFFFFFFFB

5. Why we must do the two’s complement step
It encodes negative numbers in a way that works naturally with binary addition.
It lets us store positive and negative integers together in the same binary range.
It makes hardware simpler, faster, and cheaper.
```

```C++
//relational Operator
#include <iostream>
using namespace std;
int main()
{
int a = 2;
int b = 3;

bool first = (a == b);
cout<< first << endl;

bool second = (a < b);
cout<< second << endl; 

bool third = (a > b);
cout<< third << endl;

bool fourth = (a <= b);
cout<< fourth << endl;

bool fifth = (a >= b);
cout<< fifth << endl;

    return 0;

Output: 0 is positive and 1 is negative
0
1
0
1
0
}

Logical operator
&&

#include <iostream>
using namespace std;

int main() {
    bool A, B;

    // Input two boolean values (0 for false, 1 for true)
    cout << "Enter value for A (0 or 1): ";
    cin >> A;
    cout << "Enter value for B (0 or 1): ";
    cin >> B;

    cout << "\n--- Logical Operators ---\n";

    // Logical AND
    cout << "A && B : " << (A && B) << endl;

    // Logical OR
    cout << "A || B : " << (A || B) << endl;

    // Logical NOT
    cout << "!A : " << (!A) << endl;
    cout << "!B : " << (!B) << endl;

    return 0;
}

Enter value for A (0 or 1): 1
Enter value for B (0 or 1): 0

--- Logical Operators ---
A && B : 0
A || B : 1
!A : 0
!B : 1

```


