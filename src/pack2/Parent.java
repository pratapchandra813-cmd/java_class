package pack2;

public class Parent {
    int i = 10;

}

class Child extends Parent {
    int i = 20;

    void methid1(){
        System.out.println(this.i);
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.methid1();
    }
}
