import java.util.Scanner;

class  Ex 
{
    int a,b;
    void acceptData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A:");
        a=sc.nextInt();
        System.out.print("Enter B:");
        b=sc.nextInt();
    }
    void calculateData(Ex e1)
    {
//        e2.a=e2.a+e1.a;
        a=a+e1.a;
        b=b+e1.b;
    }
    void showData()
    {
        System.out.println("A is:"+a);
        System.out.println("B is:"+b);
    }
}

class exclass
{
    public static void main(String[] args) {
        Ex e1=new Ex();
        Ex e2=new Ex();
        e1.acceptData();
        e2.acceptData();
        e2.calculateData(e1);
        e2.showData();
    }
}