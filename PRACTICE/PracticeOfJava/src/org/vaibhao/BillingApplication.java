package org.vaibhao;

class Product {
	private int id;
	private String name;
	private int Qty;
	private int rate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return Qty;
	}

	public void setQty(int qty) {
		Qty = qty;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public void getRate(int i) {
	}

}

class CalculateBill {
	Product prod[];

	void calBill(Product... p) {
		prod = p;
	}

	void showBill() {
		int total = 0;
		for (int i = 0; i < prod.length; i++) {
			int t = prod[i].getQty() * prod[i].getRate();
			System.out.println(
					prod[i].getId() + "\t" + prod[i].getName() + "\t\t" + prod[i].getQty() + "\t" + prod[i].getRate());
			total = total + t;
		}
		System.out.println("==================================");
		System.out.println("\t Total bill is  =  " + total);
	}
}

public class BillingApplication {
	public static void main(String[] args) {
		CalculateBill cb = new CalculateBill();
		Product p = new Product();
		p.setId(1);
		p.setName("Parley");
		p.setQty(10);
		p.setRate(50);
		Product p1 = new Product();
		p1.setId(2);
		p1.setName("Buisut");
		p1.setQty(15);
		p1.setRate(30);
		cb.calBill(p, p1);
		cb.showBill();
	}
}
