package test;

public class Persion {

    public static void main(String[] args) {
        Persion persion = new Man();
        Man man = new Man();
        persion.eat();
        persion.sleep();

        if(persion instanceof Persion){
            System.out.println("===========true");
        }
        Man man1 = (Man)persion;
        man.money();
    }

    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }
}
class Man extends Persion{

    String str = "测试";
    {
        System.out.println("代码块测试");
    }
    public void eat(){
        System.out.println("男生吃饭");
    }

    public void money(){
        System.out.println("赚钱");
    }
}
