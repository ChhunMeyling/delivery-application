package foodordering;

 class DrinkItem extends MenuItem {
     private String size;
     public DrinkItem(String size, float price, String name, String description){
         super(name,price,description);
         this.size=size;
     }
     @Override
     public String getDetails() {
         return "Drink Item: " + name + "\n" +
                 "Price: $" + price + "\n" +
                 "Description: " + description + "\n" +
                 "Size: " + size;
     }
 }
