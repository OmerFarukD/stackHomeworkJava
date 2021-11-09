package stackDemo.entities;

public class Product {
public Product(int productId, String name) {
		this.productId = productId;
		this.name = name;
	}
private int productId;
private String name;
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}
