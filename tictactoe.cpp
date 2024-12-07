//Tic_Tac_Toe.cpp
#include<iostream>
using namespace std;
char Player='X';
char board[3][3]={{'1','2','3'},{'4','5','6'},{'7','8','9'}};
void XOBoard(){
    cout<<"-------------"<<endl;
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            cout<<" "<<board[i][j]<<" ";
            if(j<2)
            cout<<"|";
        }
        cout<<"\n";
        if(i<2)
        cout<<"-------------"<<endl;
    }
    cout<<"\n";
}
void Playermove()
{
    int choice;
    cout<<"Player"<<Player<<", Enter a Number from (1-9):";
    cin>>choice;
    switch(choice){
        case 1:{
            if(board[0][0]=='1') 
            board[0][0]=Player; 
            break;
        }
        case 2:{
            if(board[0][1]=='2')
            board[0][1]=Player;
            break;
        }
        case 3:{
            if(board[0][2]=='3')
            board[0][2]=Player;
            break;
        }
        case 4:{
            if(board[1][0]=='4')
            board[1][0]=Player;
            break;
        }
        case 5:{
            if(board[1][1]=='5')
            board[1][1]=Player;
            break;
        }
        case 6:{
            if(board[1][2]=='6')
            board[1][2]=Player;
            break;
        }
        case 7:{
            if(board[2][0]=='7')
            board[2][0]=Player;
            break;
        }
        case 8:{
            if(board[2][1]=='8')
            board[2][1]=Player;
            break;
        }
        case 9:{
            if(board[2][2]=='9')
            board[2][2]=Player;
            break;
        }
        default:{
            cout<<"Invalid choice! Try again now"<<endl;
            Playermove();
            return;
        }
    }
}
int Boardfull(){
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            if(board[i][j]!='X'&&board[i][j]!='O')
            {
                return 0;
            }
        }
    }
    return 1;
}
int checkWin(){
    for(int i=0;i<3;i++){
        if(board[i][0]==board[i][1]&&board[i][1]==board[i][2])
        return 1;
        if(board[0][i]==board[1][i]&&board[1][i]==board[2][i])
        return 1;
    }
    if(board[0][0]==board[1][1]&&board[1][1]==board[2][2])
    return 1;
    if(board[0][2]==board[1][1]&&board[1][1]==board[2][0])
    return 1;
    return 0;
}
int main(){
    int Times=0;
    while (true){
        XOBoard();
        Playermove();
        Times++;
        if (checkWin())
        {
            XOBoard();
            cout<<" WINNER WINNER CHICKEN DINNER . Congratulations "<<Player<<endl;
            break;
        }
        if (Boardfull())
        {
            XOBoard();
            cout<<"OOPS! itz a DRAW"<<endl;
            break;
        }
        Player=(Player=='X')?'O':'X';
    }
    return 0;
}
