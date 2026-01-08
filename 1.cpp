#include<iostream>
using namespace std;
class A
{
public:
    void msg1()
    {
        cout<<"HELLO";
    }
};
class B : public A
{
    public:
    void msg2()
    {
        cout<<"Gaurav";
    }
};
int main()
{
    B *p;
    p=new B();
    p->msg1();
    p->msg2();
}