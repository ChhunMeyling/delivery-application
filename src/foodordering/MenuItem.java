package foodordering;

abstract class MenuItem {
    protected String name;
    protected float price;
    protected String description;
    public MenuItem(String name,float price, String description){
        this.name=name;
        this.price=price;
        this.description=description;
    }
    public abstract String getDetails();

}
