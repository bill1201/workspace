package edu.fju.exam;

public class Directer extends Manager {

	public Directer(int salary) {
		super(salary);
	}

	@Override
	public void print(){
		int total =(int)(salary+bonus);
		System.out.println(total+"(3000)");
	}
}
