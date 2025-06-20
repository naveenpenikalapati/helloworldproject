package hello;
public class Helloworld {

    public void printNumbers()
    {
        for(int i=0;i<=10;i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        System.out.println("hello world");

        Helloworld hy = new Helloworld();
        hy.printNumbers();
        System.out.println("hello world- 5 commit master");
    }
}
