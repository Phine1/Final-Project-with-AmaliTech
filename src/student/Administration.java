package student;

public class Administration  {
	
	// Assuming there are 20 students in Pearl International School
 private Student[] student = new Student[20];

 // Assuming there are 5 teachers in the School
 private Faculty[] teacher = new Faculty[5];
 
 private static double totalIncome;
 private static double totalExpense;
 public Administration( Student[] student,Faculty[] teacher) {
	 this.student=student;
	 this.teacher=teacher;
	 totalExpense=0;
	 totalIncome=0;
 }
 public Student[] getStudent() {
	 return student;
 }
 public void setStudent() {
	 this.student=student;
 }
 public Faculty[] getFaculty() {
	 return teacher;
 }
 public void setFaculty() {
	 this.teacher=teacher;
 }
 public double getTotalIncome() {
	 return totalIncome;
 }
 public static void updateTotalIncome(double income) {
	 totalIncome += income;
 } 
 public double getTotalExpense() {
	 return totalExpense;
 }
 public static void updateTotalExpense(double salaryPaid) {
	 totalExpense+=salaryPaid;
 }
}

