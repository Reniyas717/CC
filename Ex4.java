class BookTicket implements Runnable {

    int totalTicket = 3;

    @Override
    public synchronized void run() {
        if(totalTicket>0)
        {
        System.out.println(Thread.currentThread().getName()+" Seat No:"+totalTicket);
        totalTicket--;
        }
    }

}

public class Ex4 {

    public static void main(String[] args) throws Exception {
        BookTicket book = new BookTicket();
        Thread t1 = new Thread(book);
        t1.setName("P1");
        Thread t2 = new Thread(book);
        t2.setName("P2");
        Thread t3 = new Thread(book);
        t3.setName("P3");
        Thread t4 = new Thread(book);
        t4.setName("P4");
        Thread t5 = new Thread(book);
        t5.setName("P5");
        t1.start();
        t2.start();        
        t3.start();        
        t4.start();        
        t5.start();
    }
}