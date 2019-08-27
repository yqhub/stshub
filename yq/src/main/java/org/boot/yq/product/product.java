package org.boot.yq.product;

public class product {
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public product(String name, double price, int shuliang) {
	super();
	this.name = name;
	this.price = price;
	this.shuliang = shuliang;
}
public product() {
}	
public void setPrice(Double price) {
	this.price = price;
}
public int getShuliang() {
	return shuliang;
}
public void setShuliang(int shuliang) {
	this.shuliang = shuliang;
}
private  double price;
 private int  shuliang;
}
