import java.util.*;
class Task1 extends Thread
{
    public void run(){
        for(int i=0;i<10;i++)
    {
    System.out.println("*");
    }   

}

}
class Task2 extends Thread
{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("#");
        }
    }
}

class Ex3{
    public static void main(String[] args) throws Exception{
        Task1 t1=new Task1();
        Task2 t2=new Task2();
        t1.start();
        t2.start();
        t1.join();



    }

}