package stackDemo.business;

import stackDemo.core.utilities.Stack;
import stackDemo.entities.Product;

public class ProductManager {
	private Stack stack;
public ProductManager(Stack stack) {
		this.stack = stack;
	}

public void add(Product product) {
	this.stack.push(product.getProductId());
	this.stack.push(product.getName());
	
}
public void pop() {
	this.stack.pop();
}
}
