package liveclass;

public class TestEmployee {

	public static void main(String[] args) {
		Employee employee;
		employee = new Employee();
		
		Employee employee1;
		employee1 = new Employee();
		
		Employee employee2;
		employee2 = new Employee();
		
		employee.name = "Ruturaj";
		employee.id = 781845;
		employee.age = 27;
		employee.salary = 75000.00f;
		employee.address = "Chennai";
		employee.mobileNo = "9121522521";
		
		employee1.name = "Dhoni";
		employee1.id = 781847;
		employee1.age = 40;
		employee1.salary = 95000.00f;
		employee1.address = "Bangalore";
		employee1.mobileNo = "9121522527";
		
		employee2.name = "Jadeja";
		employee2.id = 781848;
		employee2.age = 33;
		employee2.salary = 85000.00f;
		employee2.address = "Mumbai";
		employee2.mobileNo = "9121522528";
		
		
		System.out.println("Name :"+employee.name+"  Id: "+employee.id+"  Age :"+employee.age);
		System.out.println("Salary :"+employee.salary+"  Address :"+employee.address+"  MoblieNo :"+employee.mobileNo);
		
		System.out.println("Name :"+employee1.name+"  Id :"+employee1.id+"  Age : "+employee1.age);
		System.out.println("Salary :"+employee1.salary+"  Address :"+employee1.address+"  MoblieNo :"+employee1.mobileNo);
		
		System.out.println("Name :"+employee2.name+"  Id :"+employee2.id+"  Age : "+employee2.age);
		System.out.println("Salary :"+employee2.salary+"  Address :"+employee2.address+"  MoblieNo :"+employee2.mobileNo);
		
		System.out.println(employee+" "+employee1+" "+employee2);

	}

}
