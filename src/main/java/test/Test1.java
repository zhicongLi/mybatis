package test;

public class Test1 {

    public static void main(String[] args) {
        Test2 t = new Test2();
        System.out.println(t.x);
        System.out.println(t.y);
    }
}

class Test2 {

    int x = 1;
    static int y =2;

    public Test2(){
        x = 2;
        y = 4;
        System.out.println("构造器赋予值");
    }

    static{
        y = 3;
        System.out.println("静态代码块");
    }
    {
        x = 9;
        System.out.println("代码块");
    }

}
