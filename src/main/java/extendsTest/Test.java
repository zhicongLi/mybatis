package extendsTest;

public class Test {

    public void test(){
        System.out.println("父类方法");
    }
}

class Test1 extends Test{

    @Override
    public void test(){
        System.out.println("子类方法");
    }
}
