package student;

// This class will contain detail data about student of the school//

public class Student {
private	int id;
private String name;
private int grade;
private static double feesPaid;
private double totalFees;


public Student (int id, String name, int grade,double feesPaid) {
	feesPaid=0;
	totalFees = 2500;
	this.id =id;
	this.name=name;
	this.grade=grade;	
	this.feesPaid=feesPaid; 
}
public int getId() {
	 return id;
}
public String getName() {
	 return name;
}
public void setGrade(int grade) {
	this.grade=grade;
}
public int getGrade() {
	 return grade;
}
public  void payFees(double fees) {
	feesPaid +=fees;
	Administration.updateTotalIncome(feesPaid);
}
public static double getFeesPaid() {
return feesPaid;
}
 public double getTotalFees() {
	 return totalFees;
 }
 public double getFeeBalance() {
	 return totalFees-feesPaid;
 }
}

