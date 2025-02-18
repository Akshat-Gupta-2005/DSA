#include<iostream> // input output

int a = 1; // global variable

// using namespace std; //used to prevent using std

int main(){
    std::cout<<"Hello\n";
    int b = 2; // local variable
    int c;
    std::cout<<a+b; //insertion operator
    std::cin>>c; //extraction operator 

    int *ptr;
    ptr = &b; //pointer points to the variable b
    int &ref = b; //refernce refers to the same memory so b 
    //and ref is basically the same thing just two different names

    return 0;
}

/*
User Defined Data Types:
    Struct 
    Union
    Enum

Derived Data Types:
    Array
    Pointer
    Functions
*/

// https://www.youtube.com/watch?v=sxHng1iufQE
// endl = \n
// setw(n) 
// typedef is used to rename an existing word
//https://www.youtube.com/watch?v=oQbyN-vDghA&list=PLu0W_9lII9agpFUAlPFe_VNSlXW5uE0YL&index=16





/*
member function occupies common memory
member variable occurs separate memory

use of constructor and destructor is optional yet useful


*/