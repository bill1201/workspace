package edu.fju.exam;

public class Director extends Manager {

	public Director(String name ,int salary) {
		super(salary);
	}
@Override
public void print(){
	int total =(int)(salary+bonus);
	System.out.println(total+"(9000)");
}
}
