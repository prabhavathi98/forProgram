package com.onesoft.day7;

public class UseEmployee {
	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.id=121;
		emp1.name="Arun";
		emp1.age=24;
		emp1.gender="Male";
		emp1.salary=25000;
		
		Employee emp2=new Employee();
		emp2.id=122;
		emp2.name="Vinitha";
		emp2.age=38;
		emp2.gender="Female";
		emp2.salary=92000;
		
		Employee emp3=new Employee();
		emp3.id=123;
		emp3.name="Ajay";
		emp3.age=29;
		emp3.gender="Male";
		emp3.salary=52000;
		
		Employee emp4=new Employee();
		emp4.id=124;
		emp4.name="Priya";
		emp4.age=32;
		emp4.gender="Female";
		emp4.salary=36000;
		
		Employee emp5=new Employee();
		emp5.id=125;
		emp5.name="Raja";
		emp5.age=38;
		emp5.gender="Male";
		emp5.salary=65000;
		
		Employee emp6=new Employee();
		emp6.id=126;
		emp6.name="Ragavi";
		emp6.age=27;
		emp6.gender="Female";
		emp6.salary=42000;
		
		Employee emp7=new Employee();
		emp7.id=128;
		emp7.name="Vicky";
		emp7.age=42;
		emp7.gender="Male";
		emp7.salary=125000;
		
		Employee emp8=new Employee();
		emp8.id=128;
		emp8.name="Ram";
		emp8.age=33;
		emp8.gender="Male";
		emp8.salary=36000;
		
		Employee emp9=new Employee();
		emp9.id=129;
		emp9.name="Nithish";
		emp9.age=24;
		emp9.gender="Male";
		emp9.salary=15000;
		
		Employee emp10=new Employee();
		emp10.id=130;
		emp10.name="Sanji";
		emp10.age=29;
		emp10.gender="Female";
		emp10.salary=41000;
		
//		Print highest salary
		Employee[] e= {emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8,emp9,emp10};
     	Employee highSalariedEmps=e[0];
//		int maxSalary=e[0].salary;
		for(int i=0;i<e.length;i++) {
			 if(e[i].salary>=highSalariedEmps.salary) {
				 highSalariedEmps=e[i];
			 }
		}
//		System.out.println("HighestSalary:"+highSalariedEmps);
		highSalariedEmps.display();
		
//		Print lowest salary
//		int minSalary=e[0].salary;
		Employee lowSalariedEmps=e[0];
		for(int i=0;i<e.length;i++) {
			if(e[i].salary<=lowSalariedEmps.salary) {
				lowSalariedEmps=e[i];
			}
		}
//		System.out.println("LowestSalary:"+highSalariedEmps);
		lowSalariedEmps.display();
		
//		Print male employee name
		for(Employee employee:e){
			if(employee.gender.equals("Male")) {
				System.out.println(employee.name);
//				employee.display();
			}
		}
		
//		Print female employee id 
		for(Employee emp:e) {
			if(emp.gender.equals("Female")) {
			System.out.println(emp.id);
//				emp.display();
			}
		}
		
//		Print employee id 
		for(Employee emps:e) {
			if(emps.age>=35) {
				emps.display();
			}
		}
	}

}
