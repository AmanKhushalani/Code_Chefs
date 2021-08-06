#include<bits/stdc++.h>
using namespace std;
int main()
{
    int amount;
    double balance;
    cin>>amount;
    cin>>balance;

    if(amount%5==0 && balance-amount>=0.50)
    {
    balance = balance - amount - 0.50;
    }
    cout << fixed << setprecision(2) << balance;
    return 0;

}

