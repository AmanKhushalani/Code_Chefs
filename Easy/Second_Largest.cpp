#include <iostream>
using namespace std;

int main() {
    int teseCase;
    cin>>teseCase;
    while(teseCase>0)
    {
        int a,b,c;
        cin>>a>>b>>c;

        if(a<b)

            if(a<c)
                if(b<c)
                    cout<<b<<endl;
                else
                    cout<<c<<endl;
            else
                cout<<a<<endl;

        else if(a<c)
            cout<<a<<endl;
        else
            if(b<c)
                cout<<c<<endl;
            else
                cout<<b<<endl;

        teseCase--;
    }
	return 0;
}
