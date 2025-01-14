package foodordering;

import java.util.List;

class FoodItem extends MenuItem{
    private List<String> ingredients;

    public FoodItem(String name,float price, String description,List<String> ingredients){
        super(name,price,description);
        this.ingredients=ingredients;

    }

    @Override
    public String getDetails() {
        return "[+] Food Item: " + name + "\n" +
                "Price: $" + price + "\n" +
                "Description: " + description + "\n" +
                "Ingredients: " + String.join(", ", ingredients);
    }
}
