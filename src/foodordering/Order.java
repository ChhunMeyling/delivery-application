package foodordering;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

class Order {
    @Getter
    private static int ordercount=0;

    private int orderId ;

    private List<MenuItem> items;
    private String status;

    public Order(){
        ordercount++;
        this.orderId=ordercount;
        this.items=new ArrayList<>();
        this.status="Pending";
    }
    public void addItem(MenuItem menu_item){
        items.add(menu_item);
    }
    public void removeItem(MenuItem menu_item){
        items.remove(menu_item);
    }
    public double calculateTotal(){
            double total = 0;
            for (MenuItem item : items) {
                total += item.price;
            }
            return total;

    }
    public void updateStatus(String new_status){
        this.status=new_status;
    }


}
