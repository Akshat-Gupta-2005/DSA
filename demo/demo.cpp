#include <iostream>
#include <fstream>
#include <string>
using namespace std;

ifstream inputFile("input.txt");
ofstream outputFile("output.txt");

void printx(string s, int a, int x)
{
    if (a==x){
        return;
    }
    outputFile<<s<<endl;
    printx(s,a+1,x);
}

int main()
{
    string s;
    inputFile >> s;
    int x;
    inputFile >> x;
    printx(s, 0, x);
    return 0;



    return 0;
}
