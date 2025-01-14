package foodordering;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    @Getter
    private List<MenuItem> menu;
    private List<Order> orders;

    public Restaurant(){
        this.menu=new ArrayList<>();
        this.orders=new ArrayList<>();
    }
    public void addToMenu(MenuItem item){
        menu.add(item);
    }
    public List<MenuItem> viewMenu(){
        return menu;
    }
    public void processOrder(Order order){
        order.updateStatus("Preparing");
        orders.add(order);
    }
}
