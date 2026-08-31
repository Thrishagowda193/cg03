package com.tnsif.Interface;

interface OrderService
{
	boolean validateOrder(double amt);
	void processPayment(double amt);
	void generateInvoice(String orderId,double amt);
	void updateOrderStatus(String orderId,String status);
	
}

class OnlineOrder implements OrderService
{

private String customername;
private String orderid;


public OnlineOrder(String customername, String orderid) 
{
	super();
	this.customername = customername;
	this.orderid = orderid;
}

@Override
public boolean validateOrder(double amt) 
{
	if(amt>0)
	{
		System.out.println("order validation sucessful");
		return true;
	}
	System.out.println("Invalid order amount");
	return false;
}

@Override
public void processPayment(double amt)
{
	System.out.println("Procession payment:"+amt);
	System.out.println("Payment sucessful");
}

@Override
public void generateInvoice(String orderId, double amt) 
{
	System.out.println("Invoice generated");
	System.out.println("Order Id:"+orderid);
	System.out.println("Customer name:"+customername);
	System.out.println("Amount:"+amt);
}

@Override
public void updateOrderStatus(String orderId, String status) 
{
	System.out.println("Order:"+ orderId+ "  Status updated to:"+status);
}

}


public class MainMethod
{
	public static void main(String[] args) 
	{
		OnlineOrder o=new OnlineOrder("Thri","ORD1001");
		double amt=100;
		if(o.validateOrder(amt))
		{
			o.processPayment(amt);
			o.generateInvoice("ORD1001",amt);
			o.updateOrderStatus("ORD1001","Confirmed");
			
		}
	}
}

