
public class Drink {
    private int quantity , price;
    private String type;
    public Drink(){
        quantity = 0;
	price = 0;
	type = "";
    }

    public Drink(int quantity , int price , String type){
	    set_quantity(quantity);
	    set_price(price);
	    set_type(type);
    }

    public void set_quantity(int quantity) { this.quantity = quantity; }
    public void set_price(int price) { this.price = price; }
    public void set_type(String type) { this.type = type; }

    public void set_quantity_add(int quantity) { this.quantity = Math.min(this.quantity + quantity , 10); }

    public String product(){
	    return type + ": " + Integer.toString(price);
    }

    public String get_quantity() { return Integer.toString(quantity); }
    public String get_price() { return Integer.toString(price); }
    public String get_type() { return type; }

    public int get_price_int() { return price; }
    public int get_quantity_int() { return quantity; }
    
}
