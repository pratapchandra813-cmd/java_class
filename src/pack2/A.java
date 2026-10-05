package pack2;

public class A {
    void method1(){
        System.out.println("I am method1 of class A");
        method2();
        this.method2();
    }

    void method2(){
        System.out.println("I am method2 of class A");
    }
    public static void main(String[] args) {
        A a = new A();
        a.method1();
        

    }

}
