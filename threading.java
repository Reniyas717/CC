import java.util.*;
class Task1 implements Runnable
{
    public void run(){
        for(int i=0;i<10;i++)
    {
    System.out.println("#");
    }   

}

}
class Task2 implements Runnable
{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("*");
        }
    }
}
class Ex2 {
    public static void main(String[] args) {
        // Task1 t1 = new Task1();
        // Task2 t2 = new Task2();
        // t1.run();//run() will printrandomly
        // t2.run();
        // // t1.start();// will print * first and then #
        // // t2.start();
        Task1 tsk1=new Task1();
        Task2 tsk2=new Task2();
        Thread t1=new Thread(tsk1);
        Thread t2=new Thread(tsk2);
        t1.start();
        t2.start();

       
    }
}