class Parent {
    void show() {
        System.out.println("Parent show()");
    }

    static void staticShow() {
        System.out.println("Parent staticShow()");
    }

    void display(int x) {
        System.out.println("Parent display(int): " + x);
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child show()");
    }

    static void staticShow() {
        System.out.println("Child staticShow()");
    }

    void display(String msg) {
        System.out.println("Child display(String): " + msg);
    }
}

public class riding {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        Parent pc = new Child();

        p.show();      
        c.show();      
        pc.show();     

        p.staticShow();   
        c.staticShow();   
        pc.staticShow();  

        c.display(10);         
        c.display("Hello");    
    }
}