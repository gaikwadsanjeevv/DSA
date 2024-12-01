# C++
C++ is a versatile language, and it relies on libraries to access various functionalities. 
To perform tasks like input and output, we include specific libraries at the beginning of our code. 
For instance, #include<iostream> is used for input and output operations, while #include<math.h> 
allows us to use mathematical functions. Simply put, libraries provide pre-built functions and tools 
for us to use in our code.

## The Generic Skeleton

#include<iostream>

int main() {
    // Your code here
    return 0;
}

## Output with cout
#include<iostream>

int main() {
    std::cout << "Hey, Striver!";
    return 0;
}

### New line charachter \n
#include<iostream>

int main() {
    std::cout << "Hey, 
Striver!" << "\n";
    std::cout << "Hey, 
Striver!";
    return 0;
}
Output:
Hey, Striver!
Hey, Striver!

## using namespace std
By adding using namespace std; at the beginning of your program, you're telling the compiler that you want to use all the names from the std namespace without explicitly specifying std:: each time. This can make your code cleaner and more concise.

#include<iostream>
using namespace std;

int main() {
    cout << "Hey, 
Striver!" << :endl;
    cout << "Hey, 
Striver!";
    return 0;
}
Output:
Hey, Striver!
Hey, Striver!


## Taking User Input using cin
#include<iostream>
using namespace std;

int main() {
    int x;
    cin >> x;
    cout << "Value of x: " << x;
    return 0;
}
Input: 10
Output: Value of x: 10

### multiple inputs, we can simply use the >> operator with cin
#include<iostream>
using namespace std;

int main() {
    int x;
    int y;
    cin >> x >> y;
    cout << "Value of x: " << x << “ and y: “ <<y;
    return 0;
}


Input: 10 20
Output: Value of x: 10 and y: 20

 
### To make the process more convenient, there's a shortcut that allows you to include almost all standard libraries at once using #include<bits/stdc++.h>

### If-Else Statement
#include<bits/stdc++.h>
using namespace std;

int main() {
int age=10;


if (age >= 18) {
    cout << "You are an adult." << endl;
} else {
    cout << "You are not an adult." << endl;
}
}

Else-if

#include <iostream>
using namespace std;

int main() {
    int marks = 54;


    if (marks < 25) {
        cout << "Grade: F" << endl;
    } else if (marks >= 25 && marks <= 44) {
        cout << "Grade: E" << endl;
    } else if (marks >= 45 && marks <= 49) {
        cout << "Grade: D" << endl;
    } else if (marks >= 50 && marks <= 59) {
        cout << "Grade: C" << endl;
    } else if (marks >= 60 && marks <= 69) {
        cout << "Grade: B" << endl;
    } else if (marks >= 70) {
        cout << "Grade: A" << endl;
    } else {
        cout << "Invalid marks entered." << endl;
    }

    return 0;
}
Output: Grade: C

If marks are less than 25, it prints "Grade: F."
If marks are between 25 and 44 (inclusive), it prints "Grade: E."
If marks are between 45 and 49 (inclusive), it prints "Grade: D."
If marks are between 50 and 59 (inclusive), it prints "Grade: C."
If marks are between 60 and 69 (inclusive), it prints "Grade: B."
If marks are 70 or higher, it prints "Grade: A."
If marks are outside the valid range, it prints "Invalid marks entered."
The provided code for grading based on marks is functional, but it can be simplified for better readability and maintainability. In the current code, there are several redundant comparisons of marks with specific values. For example, when checking for grades E, C, B, and A, you have to repeatedly check marks >= X && marks <= Y, which can be error-prone and hard to maintain as the grade ranges change.
We can refactor the code, we can remove the lower bounds and check only the upper bounds for each grade as the code flow is such that we move along the conditions only after satisfying the previous one.

More Optimized - to reduce several redundant
#include <iostream>

int main() {
    int marks = 54;
    char grade;

    if (marks < 25) {
        grade = 'F';
    } else if (marks <= 44) {
        grade = 'E';
    } else if (marks <= 49) {
        grade = 'D';
    } else if (marks <= 59) {
        grade = 'C';
    } else if (marks <= 69) {
        grade = 'B';
    } else if (marks >= 70) {
        grade = 'A';
    } else {
        grade = 'X'; // Use 'X' to indicate invalid marks
    }

    std::cout << "Grade: " << grade << std::endl;
    
    return 0;
}


## Switch Case Statements

#include <iostream>
using namespace std;

int main() {
    int day = 4;

    switch (day) {
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
            cout << "Thursday";
            break;
        case 5:
            cout << "Friday";
            break;
        case 6:
            cout << "Saturday";
            break;
        case 7:
            cout << "Sunday";
            break;
        default:
            cout << "Invalid";
    }

    return 0;
}
Output: Thursday


#include <iostream>
using namespace std;

int main() {
    const int x = 10;
    const int y = 5;

    switch (x + y) {
        case 15:
            cout << "Result is 15." << endl;
            break;
        case 20:
            cout << "Result is 20." << endl;
            break;
        default:
            cout << "No match found." << endl;
    }

    return 0;
}


Output: Result is 15.


#include <iostream>
using namespace std;

int main() {
    char grade = 'B';

    switch (grade) {
        case 'A':
            cout << "Excellent!" << endl;
            break;
        case 'B':
            cout << "Good!" << endl;
            break;
        default:
            cout << "Not specified." << endl;
    }

    return 0;
}

Output: Good!


#include <iostream>
using namespace std;

int main() {
    int day = 2;

    switch (day) {
        case 1:
            cout << "Monday." << endl;
            break;
        case 2:
            cout << "Tuesday." << endl;
            break;
        case 2:  // Duplicate case, not allowed
            cout << "Duplicate case." << endl;
            break;
        default:
            cout << "Invalid day." << endl;
    }
    return 0;
}



#include <iostream>
using namespace std;

int main() {
    int x = 2;
    int y = 3;

    switch (x) {
        case 1:
            cout << "x is 1." << endl;
            switch (y) {
                case 1:
                    cout << "y is 1." << endl;
                    break;
                default:
                    cout << "y is not 1." << endl;
            }
            break;
        default:
            cout << "x is not 1." << endl;
    }

    return 0;
}



