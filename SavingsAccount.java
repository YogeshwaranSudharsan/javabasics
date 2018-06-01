package com.basic;

public class SavingsAccount {
static double annualInterestRate;
double savingsBalance;
double interest;
public SavingsAccount(double savingsBalance){
	
this.savingsBalance=savingsBalance;
}
public void calculateMonthlyInterest() {
	interest=(savingsBalance*annualInterestRate/100.0)/12;
	savingsBalance+=interest;
	System.out.println(savingsBalance);
}
public static void modifyInterestRate(int newValue) {
	annualInterestRate=newValue;
}
   public static void main(String[] args) {
	SavingsAccount s1=new SavingsAccount(2000.0);
	SavingsAccount s2=new SavingsAccount(3000.0);
	SavingsAccount.modifyInterestRate(4);
	s1.calculateMonthlyInterest();
	s2.calculateMonthlyInterest();
	SavingsAccount.modifyInterestRate(5);
	s1.calculateMonthlyInterest();
	s2.calculateMonthlyInterest();
}
	
	
	
	
	
	
	
}



