package singleton;

public class singletonTest2 {

    public static void main(String[] args) {
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();
        System.out.println(order1 == order2);

    }
}

class Order{

    private Order(){}

    private static Order order = null;

    public static Order getInstance(){
        if(order == null){
            order = new Order();
        }
        return order;
    }
}

class Order2{

    private Order2(){}

    private static Order2 order2 = null;

    public static Order2 getOrder2(){
        if(order2 == null){
            order2 = new Order2();
        }
        return order2;
    }
}
