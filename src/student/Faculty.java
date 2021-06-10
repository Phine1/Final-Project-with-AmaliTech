package student;

public class Faculty {
	private int id;
	private String name;
	private double basicSalary;
	private double bonus;
	private double net;
	private double salaryArrears;
	private static double salary;
	
	public Faculty(int id, String name, double basicSalary) {
	
		this.id=id;
		this.name=name;
		this.basicSalary=basicSalary;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double money) {
		basicSalary = money;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus=bonus;
	}
	public double getNet() {
		return net = basicSalary+bonus;
	}
    public double getSalaryArrears() {
		return salaryArrears=net-salary;
	}
    public void salary(double money) {
    	 salary=money;
    Administration.updateTotalExpense(salary);
    }
    public double getSalary() {
		return salary;
    }  
}