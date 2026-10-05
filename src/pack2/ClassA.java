package pack2;

public class ClassA {
    int c =10;  // instance variable

    static int c = 30; // static variable

    void meth1(){
        int c = 20; // local variable

        //System.out.println("Instance Variable :"+a);
       // System.out.println("Local Variable :"+a);
        System.out.println("Static Variable");
        System.out.println("Static Variable :"+c);
        System.out.println("Static Variable :"+new ClassA().c);
        System.out.println("Static Variable :"+ClassA.c);
    }

    // void meth2(){
    //      System.out.println("Local Variable :"+a);
    // }
    public static void main(String[] args) {
        ClassA obj = new ClassA();
        obj.meth1();
       // a.meth2();
    }

}
