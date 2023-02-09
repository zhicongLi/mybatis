package test;

public class throwTest {

    public static void main(String[] args) {
        GzTest gzTest = new GzTest("a");
        try{
            String a = null;
            a.equals("test");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

class GzTest extends FzTest{

    public GzTest(String a){
        this();
        System.out.println("构造方法带参");
    }

    public GzTest(){
        System.out.println("构造方法无参");
    }
}

class FzTest{
    public FzTest(String a){
        System.out.println("构造方法带参man");
    }

    public FzTest(){
        System.out.println("构造方法无参man");
    }
}
