
public class Product { //used outline of code on assignment document to do this class
	
	private  String name;
	private double price;
    private int quantity;
    
	
	public Product(String name, double price, int quantity) {
		this.name = name;
    	this.price = price;
    	this.quantity = quantity;
	}

	// Getter methods
	public String getName() {
		return name;
	}

	public double getPrice() {
	    return price;
	}
 
	public int getQuantity() {
	    return quantity;
	}

	// Setter methods
	public void setPrice(double price) {
	    this.price = price;
	}

	public void setQuantity(int quantity) {
	    this.quantity = quantity;
	}
	

	
	//public static void main(String[] args) {
    //	Product example = new Product("apple", 3.00, 3);
    	//System.out.println("Your product is " + example.getName());
    	//System.out.println("The price is $" + example.getPrice());
    	//System.out.println("The quantity is " + example.getQuantity());
}

