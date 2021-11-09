package stackDemo;

import stackDemo.business.ProductManager;
import stackDemo.core.utilities.Stack;
import stackDemo.entities.Product;

public class Main {

	public static void main(String[] args) {
		
ProductManager manager=new ProductManager(new Stack(8));
manager.add(new Product(1,"Elma"));
manager.add(new Product(2,"Armut"));
manager.add(new Product(3,"Kiraz"));
manager.add(new Product(4,"Üzüm"));
System.out.println("-----------------------");
manager.pop();




	}

}
