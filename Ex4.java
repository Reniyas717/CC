class BookTicket implements Runnable {
    int totalTicket = 3;
    void bookTicket(Thread t) {
        System.out.println(t.getName());
    }
    public void run() {
        bookTicket(Thread.currentThread());
    }
}
public class Ex4 {
    public static void main(String[] args) throws Exception {
        BookTicket book = new BookTicket();
        Thread t1 = new Thread(book, "Person1");
        Thread t2 = new Thread(book, "Person2");
        Thread t3 = new Thread(book, "Person3");

        t1.start();
        t2.start();
        t3.start();
    }
}