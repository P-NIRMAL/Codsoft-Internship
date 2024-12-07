//Guess.cpp
#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;
int main()
{
    int a=rand()%100+1;
    srand(time(0));
    int guess=0;
    cout<<"Random number generated between 1 to 100"<<endl;
    while (guess!=a)
    {
        cout<<"Enter your guess: ";
        cin>>guess;
        if(guess>a)
        {
            cout<<"The guess is too high.Try again."<<endl;
        }
        else if(guess<a)
        {
            cout<<"The guess is too low.Try again."<<endl;
        }
        else
        {
            cout<<"Congratulations! "<<a<<" is the random number"<<endl;
        }
    }
    return 0; 
}