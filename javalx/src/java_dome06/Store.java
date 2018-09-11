package java_dome06;

import java.util.ArrayList;

class product {
	private final int id;
	private String name;
	private double paice;
	public product(int id , String name , double paice) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.paice = paice;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPaice() {
		return paice;
	}
	public void setPaice(double paice) {
		this.paice = paice;
	}
	public int getId() {
		return id;
	}
	public String toString() {
		return id + " " + name + " " + paice; 
	}
	
}

public class Store extends ArrayList<product> {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store store = new Store();
		store.add(new product(1, "li", 86));
		System.out.println(store);

	}

}
