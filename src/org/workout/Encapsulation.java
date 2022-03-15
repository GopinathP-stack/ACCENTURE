package org.workout;

public class Encapsulation {

	int r;
	String set;
	int c;
	public String getSet() {
		return set;
	}
	public void setSet(String Set) {
		set = Set;
	}
	public void setR(int b) {
		
	r=b;}
	public int getR() {
		return r;
	}
	
	
	public static void username() {
		System.out.println("github");
	}
	
	public static void main(String[] args) {
		Encapsulation enb=new Encapsulation();
		enb.setR(5);
		enb.setSet("ravi");
		System.out.println(enb.getR());
		System.out.println(enb.getSet());
	
	
	
	}
	
	
	
	
	
	
}
