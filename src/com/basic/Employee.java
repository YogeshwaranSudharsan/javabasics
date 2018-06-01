package com.basic;

public class Employee {
	private String e;
	private double salary;
	public String getE() {
		return e;
	}
	public void setE(String e) {
		this.e = e;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.setE("yogesh");
		e1.setSalary(1000);
		e2.setE("stephen");
		e2.setSalary(2000);
		String E =e1.getE();
		double Salary=e1.getSalary();
		System.out.println(E);
		System.out.println(Salary);
	}
}	
		
		
		
		
