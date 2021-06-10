package student;

public class Main {

	public static void main(String[] args) {
		Faculty Frank = new Faculty(2014,"Frank Osei",1500.00);
		Faculty Sarah = new Faculty(2015,"Sarah Adjei",1300.00);
		Faculty Joe = new Faculty(2016,"Joey Willock",1800.40);
		Faculty Louisa = new Faculty(2017,"Louisa Sam",1400.00);
		Faculty Phine = new Faculty(2018,"Phinehas Sersah",40000.00);
		
		Faculty[] teacher = new Faculty[5];
		    teacher[0] = Frank;
		    teacher[1] = Sarah;
		    teacher[2] = Joe;
		    teacher[3] = Louisa;
		    teacher[4] = Phine;
		    
		
		Student Francis = new Student(9001,"Francis Aso", 6, 900.20);
		Student Alex = new Student(9002,"Alex Mould", 6, 600.20);
	    Student Sirrah = new Student(9003,"Sirrah Ail", 4, 503.20);
		Student EBE = new Student(9004,"Ebenezer Simon", 8, 1000.20);
		Student Max = new Student(9023,"Maxwell Cudjoe", 4, 830.20);
	    Student Leon = new Student(9021,"Leon Alfonso", 6, 900.20);
		Student Mavis = new Student(9201,"Mavis Sedab", 6, 970.20);
		Student Aisha = new Student(9501,"Aisha Kandoh", 12, 1200.0);
	    Student God = new Student(9801,"Gofdred Arjin", 4, 800.20);
		Student Franc = new Student(9031,"Franca Baah", 6, 900.20);
		Student Kasi = new Student(9071,"kasim Limbo", 7, 400.20);
	    Student Jose = new Student(9011,"Jose Fonte", 11, 1100.40);
		Student Fers = new Student(9008,"Ferssian Anlo", 5, 670.20);
		Student Kas = new Student(9071,"Kassim Ajoso", 6, 600.20);
	    Student Trent = new Student(9041,"Trentty Nit", 6, 900.20);
	    Student Nao = new Student(9018,"Naomi", 4, 570.20);
		Student George = new Student(9831,"George Ajoso", 6, 840.20);
	    Student Lorr = new Student(9076,"Lorrence Ajata", 6, 1000.20);
		Student Bel = new Student(9064,"Belinda Awuah", 9, 1000.20);
		Student Ali = new Student(9034,"Ali Bongo", 3, 400.43);

		Student[] student = new Student[20];
		 student[0] = Francis;
		 student[1] = Alex;
		 student[2] = Sirrah;
		 student[3] = EBE;
		 student[4] = Max;
		 student[5] = Leon;
		 student[6] = Mavis;
		 student[7] = Aisha;
		 student[8] = God;
		 student[9] = Franc;
		 student[10]= Kasi;
		 student[11]= Jose;
		 student[12]= Fers;
		 student[13]= Kas;
		 student[14]= Trent;
		 student[15]= Bel;
		 student[16]= Ali;
		 student[17] = Nao;
		 student[18]= George;
		 student[19]=Lorr;
 /*Testing of the code to find mistakes
  * Everything seems OK
  */
		 Administration PIS = new Administration(student, teacher);
		Bel.payFees(900);
		Bel.payFees(1000);
		Ali.payFees(1000.3);
		Trent.payFees(2000);
		Phine.setBonus(30);
		Phine.setBasicSalary(2000);
		Phine.salary(8500);
	    Phine.getNet();
	    Phine.getSalaryArrears();
	
	    System.out.println("Administration has received "+ PIS.getTotalIncome());
		System.out.println("Phine's id is" +Phine.getId());
		System.out.println("Bels total fees is"+Bel.getTotalFees()+"Bel has paid " + Bel.getFeesPaid()+ "her remaining fee balance is "+Bel.getFeeBalance());
		System.out.println("Phine's bonus is "+Phine.getBonus());
		System.out.println("Phine's basic salary is"+Phine.getBasicSalary());
		System.out.println("Phine has received "+ Phine.getSalary());
		System.out.println("Phine's Salary arrears is"+Phine.getSalaryArrears());
		System.out.println("Phine's net is" +Phine.getNet()+"admn"+PIS.getTotalExpense());
}
}