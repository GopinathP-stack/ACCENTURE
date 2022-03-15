package org.workout;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Customer
{
String name;
int balance;
int id;


//Costructor 
Customer(String s, int i, int j)
{
name=s;
balance=i;
id=j;
}


//toString() method is overridden to give a meaningful String representaion of each object.
public String toString() 
{
return "|Name : "+ name + "|Balance : "+ balance + "|ID : " + id + "|\n";
}


public static void main(String... ar)
{
Set<Customer> arr= new TreeSet<Customer>(); //ArrayList will contain a collection of Customer's objects.

//Creating Customer objects.
Customer customera = new Customer("Jay", 1000, 2);


Customer customerb = new Customer("Ricky", 5000, 1);
Customer customerc = new Customer("Tom", 3000, 6);
Customer customerd = new Customer("Mick", 6000, 4);

arr.add(customera);

arr.add(customerb);
arr.add(customerc);
arr.add(customerd);

for(Customer c: arr) {
	System.out.println(c);
}
}}