package com.basic;

public class Invoice {
	String partnumber;
	String partdescription;
	int quantity;
	double price;
	public String getPartnumber() {
		return partnumber;
	}
	public void setPartnumber(String partnumber) {
		this.partnumber = partnumber;
	}
	public String getPartdescription() {
		return partdescription;
	}
	public void setPartdescription(String partdescription) {
		this.partdescription = partdescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity<=0)
		{
			this.quantity=0;
		}
		else
		{
			this.quantity=quantity;
		}
			
	}
		
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price<=0)
		{
			this.price=0;
		}
		else
		{
			this.price=price;
		}
	}
	public static void main(String[] args) {
		Invoice invoice=new Invoice();
		invoice.setPartdescription("Bill");
		invoice.setPartnumber("Part1");
		invoice.setPrice(100);
		invoice.setQuantity(3);
		String Partdescription=invoice.getPartdescription();
		String Partnumber=invoice.getPartnumber();
		double Price=invoice.getPrice();
		int Quantity=invoice.getQuantity();
		System.out.println(invoice.getPartdescription());
		System.out.println(invoice.getPartnumber());
		System.out.println(Price*Quantity);
		
		
		
	}
	
	
	
 

}
