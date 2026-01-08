#include <iostream>
using namespace std;
class Boss
{
public:
    virtual void t1() = 0;
    void sallary()
    {
        cout << "50k" << endl;
    }
};
class Emp : public Boss
{
    void t1()
    {
    }
};
class Caller 
{
    public static void main(String[] args) {
        Emp e1=new Emp();
        e1.sallary();
    }
}