package test;

public class SonTest extends MainTest{

    int x = 1;
    @Override
    protected void test() {
        System.out.println("子类执行方法");
        System.out.println(super.x);
    }

    protected void test2() {
        System.out.println("子类执行方法");
        System.out.println(super.x);
    }
}
