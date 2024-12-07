//Calculator.cpp
#include<iostream>
using namespace std;
int main()
{
    char X;
    double a,b;
    cout<<"Enter value of two numbers:";
    cin>>a>>b;
    cout<<"Enter the operation of 2 numbers(+, -, *, /):";
    cin>>X;
    if(X=='+'){
        cout<<a+b;
    }
    else if(X=='-'){
        cout<<a-b;
    }
    else if(X=='*'){
        cout<<a*b;
    }
    else if(X=='/'){
        cout<<a/b;
    }
    else{
        cout<<"Enter any 4 given operators";
    }
    return 0;
}