package org.vaibhao;

class Students {
	private int id;
	private String name;
	private float per;
	private int actualPaidFees;
	private int disFees;

	// Constructors
	public Students() {
	}

	public Students(String name, int id , float per, int actualPaidFees, int disFees) {
		this.id = id;
		this.name = name;
		this.per = per;
		this.actualPaidFees = actualPaidFees;
		this.disFees = disFees;
	}

	// Getters and setters
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

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	public int getActualPaidFees() {
		return actualPaidFees;
	}

	public void setActualPaidFees(int actualPaidFees) {
		this.actualPaidFees = actualPaidFees;
	}

	public int getDisFees() {
		return disFees;
	}

	public void setDisFees(int disFees) {
		this.disFees = disFees;
	}

	class DiscountFees {
		void checkDiscountEligibility() {
			if (per > 60) {
				int tFees = actualPaidFees;
				int adis = tFees * 30 / 100;
				int studNeedPay = tFees - adis;
				setActualPaidFees(studNeedPay);
				setDisFees(adis);
			}
		}

		void show() {
			System.out.println(getName() + "\t" + getId() + "\t" + getPer() + "\t"
					+ getActualPaidFees() + "\t" + getDisFees());
		}
	}
}

public class StudentApp {
	public static void main(String[] args) {
		Students s = new Students("vaibhao",1, 99, 10000, 3000);
		Students.DiscountFees d = s.new DiscountFees();
		d.checkDiscountEligibility();
		d.show();
	}
}
