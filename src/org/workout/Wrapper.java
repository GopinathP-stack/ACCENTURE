package org.workout;

public class Wrapper {
 
public static void main(String[] args) {
	int i=5;
	Integer ii=new Integer(i);
	System.out.println(ii);
	//System.out.println(ii);//BOXING
	Integer jj=i; // AUTOBOXING
	int j= jj.intValue();// UNBOXING
	System.out.println(j);
	int k= jj;
	System.out.println(k); //AUTOUNBOXING
}
}
