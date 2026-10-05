package pack2;

public class Test11 {
    int i = 10;
    int j = 20;
    Test11(int i, int j)
    {
        System.out.println("i = " + i + " j = " + j);
        System.out.println("this.i = " + this.i + " this.j = " + this.j);
    }
    public static void main(String[] args) {
        Test11 t = new Test11(30, 40);
    }

}
