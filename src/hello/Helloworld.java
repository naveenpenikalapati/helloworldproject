package hello;
public class Helloworld {

    public void printNumbers()
    {
        for(int i=0;i<=10;i++) {
            System.out.println(i);
        }
    }
    public void printNumbers1()
    {
        for(int i=0;i<=20;i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        System.out.println("hello world");

        Helloworld hy = new Helloworld();
        hy.printNumbers();
        hy.printNumbers1();
    }
}
