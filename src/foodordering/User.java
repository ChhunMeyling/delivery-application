package foodordering;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int userId;
    private String name;
    private List<Order> orderHistory;
//    public User(){
//        this.orderHistory=new ArrayList<>();
//    }
    public User(int userId , String name){
        this.userId=userId;
        this.name=name;
        this.orderHistory= new ArrayList<>();
    }
    public void placeOrder(Order order){
        System.out.println(name + " has placed an order.");
        order.updateStatus("Delivered");
        orderHistory.add(order);
    }
    public List<Order> viewOrderHistory(){
        return orderHistory;
    }

}
