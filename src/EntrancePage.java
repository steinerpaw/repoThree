import java.util.Scanner;

public class EntrancePage {
	
	public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  ShoppingCart cart = new ShoppingCart();
//program options are listed
	  System.out.println("Welcome to an Online Shopping Cart! In this system, you are able to enter any item you would like! Here are your options to get started:\n");
	    while (true) {
	       // System.out.println("Welcome to an Online Shopping Cart! In this system, you are able to enter any item you would like! Here are your options to get started:\n");
	       System.out.println("1: Add product");
	       //System.out.println("2: Remove product");
	       System.out.println("2: Calculate total cost");
	       System.out.println("3: View Items");
	       System.out.println("4: Exit\n");
	       System.out.print("Please choose a number: ");

	        int chosenNumber = input.nextInt();
	        input.nextLine(); 
	            
//lets user add item (takes in and stores its name price and quantity)
	        	if (chosenNumber == 1) {
	                System.out.print("Enter product name: ");
	                String productName = input.nextLine();
	                
	                System.out.print("Enter product price: ");
	                double productPrice = input.nextDouble();
	                
	                System.out.print("Enter product quantity: ");
	                int productQuantity = input.nextInt();
	                input.nextLine(); 
	                
	                //taking user's product and adding it to cart
	                Product product = new Product(productName, productPrice, productQuantity);
	                cart.addProduct(product);
	                System.out.println("\n" + ANSIConstants.ANSI_GREEN + "Product added to cart.\n" +  ANSIConstants.ANSI_RESET);
	                
	             //else if (chosenNumber == 2) {
	            	  // System.out.print("Enter product name: ");
	            	   //String name = input.nextLine();
	            	   
	            	  //Product product = new Product(name, 0, productQuantity1);
	            	    //cart.removeProduct(product);
	            	    //System.out.println("Product removed from cart.");
	         
	                //adds up the amount for cart items  
	            } else if (chosenNumber == 2) {
	                double totalAmount = cart.calculateTotalCost();
	                System.out.println("Total cost of items: $" +String.format("%.2f",totalAmount)); //making double with two deccimal places https://java2blog.com/format-double-to-2-decimal-places-java/
	               
	                //user can view items
	            } else if (chosenNumber == 3) {
	                cart.viewCart();
	            
	                //user can leave program
	            } else if (chosenNumber == 4) {
	                System.out.println("Thank you! Goodbye:)");
	                break;
	              
	                //if user enters a wrong number
	            } else {
	                System.out.println(ANSIConstants.ANSI_RED + "Invalid choice, try a different choice" + ANSIConstants.ANSI_RESET);
	            }
	        }
	    
	     input.close();
	}
	    
}




