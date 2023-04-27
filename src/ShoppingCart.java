import java.util.ArrayList;

public class ShoppingCart {   //used outline of code on assignment document to do this class
	
	private ArrayList<Product> items;
   
	public ShoppingCart() {
		this.items = new ArrayList<Product>();
	}
// Add a product to the cart
public void addProduct(Product product) {
    items.add(product);
}
 
// Remove a product from the cart
public void removeProduct(Product product) {
    items.remove(product);
} 

// View products in the cart
public void viewCart() {
		for(int i = 0; i < items.size();i++) {
			Product product = items.get(i);
			  System.out.println("\nItem: " + product.getName() + "\nPrice: $" + product.getPrice() + " \nQuantity: " + product.getQuantity() +  "\n");
}
		
}

// Calculate the total cost of the items
public double calculateTotalCost() {
    double totalCost = 0;
    
    for (int i = 0; i < items.size(); i++) {
    	Product product = items.get(i);
    	 totalCost += product.getPrice() * product.getQuantity();
    	 
    }
    
    return totalCost;

}

}



