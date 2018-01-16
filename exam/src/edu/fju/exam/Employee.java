package edu.fju.exam;

public class Employee {
	String name ;
	int salary;
	int bonus=0;
	

public Employee(int salary){
	this.salary=salary;
	this.name=name;
}
public void print(){
	int total =(int)(salary+bonus);
	System.out.println(name+total);
}
}