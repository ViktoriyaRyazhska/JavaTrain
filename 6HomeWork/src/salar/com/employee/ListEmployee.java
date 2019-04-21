package salar.com.employee;


public class ListEmployee {

	public static void main(String[] args) {
		Employee[] empl = new Employee[5];
		empl[0] = new SalariedEmployee(3300,"Vasya");
		empl[1] = new SalariedEmployee(4400, "Vasylyna");
		empl[2] = new ContractEmployee(3, 22, "Sveta");
		empl[3] = new ContractEmployee(4, 15, "Olya");
		empl[4] = new ContractEmployee(5, 10, "Yulja");
		
		for (int i = 0; i < empl.length - 1; i++) {	
			for (int j = i + 1; j < empl.length; j++) {	
				if (empl[i].calculatePay() < empl[j].calculatePay()) {
					Employee temp = empl[i];
					empl[i] = empl[j];
					empl[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < empl.length; i++) {
			System.out.println(empl[i].getName() + " " + empl[i].getAvsalary());
		}
	}

}
