package singleton;

//醉汉式单例
public class SingletonTest {

    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank1 == bank2);

        Bank2 bank3 = Bank2.getBank2();
        Bank2 bank4 = Bank2.getBank2();
        System.out.println(bank3 == bank4);
    }
}

class Bank{

    //1.私有化构造方法
    private Bank() {
    }
    //2.内部创建类的对象
    private static Bank instance = new Bank();

    //3.提供公共方法 返回类的对象
    public static Bank getInstance(){
        return instance;
    }
}

class Bank2{
    private Bank2(){

    }
    private static Bank2 bank2 = new Bank2();

    public static Bank2 getBank2(){
        return bank2;
    }
}
