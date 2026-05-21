package hello;
public class Helloworld {

    public void printNumbers()
    {
        for(int i=0;i<=10;i++) {
            System.out.println(i);
        }
    }
    public void shoWNumbers1()
    {
        for(int i=0;i<=20;i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        System.out.println("hello world naveen, how are you");
        System.out.println("Iam good");
        Helloworld hy = new Helloworld();
        hy.printNumbers();
        hy.showNumbers1();
//        System.out.println("hello world - 3 commit");
//        System.out.println("hello world - 4 commit");
    }
}
