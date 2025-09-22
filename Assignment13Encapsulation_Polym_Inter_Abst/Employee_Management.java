package Assignment13Encapsulation_Polym_Inter_Abst;
	interface Department {
	    void assignDepartment(String deptName);
	    String getDepartmentDetails();
	}
	abstract class Employee implements Department {
	    private int employeeId;
	    private String name;
	    private double baseSalary;
	    private String department;
	    public Employee(int employeeId, String name, double baseSalary) {
	        this.employeeId = employeeId;
	        this.name = name;
	        this.baseSalary = baseSalary;
	    }
	    public int getEmployeeId() {
	        return employeeId;
	    }

	    public void setEmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getBaseSalary() {
	        return baseSalary;
	    }

	    public void setBaseSalary(double baseSalary) {
	        this.baseSalary = baseSalary;
	    }
	    public void assignDepartment(String deptName) {
	        this.department = deptName;
	    }

	   
	    public String getDepartmentDetails() {
	        return department;
	    }

	    public abstract double calculateSalary();

	    public void displayDetails() {
	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Name: " + name);
	        System.out.println("Base Salary: " + baseSalary);
	        System.out.println("Department: " + getDepartmentDetails());
	        System.out.println("Final Salary: " + calculateSalary());
	        System.out.println("-----------------------------------");
	    }
	}
	class FullTimeEmployee extends Employee {
	    private double fixedAllowance;

	    public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedAllowance) {
	        super(employeeId, name, baseSalary);
	        this.fixedAllowance = fixedAllowance;
	    }
	    public double calculateSalary() {
	        return getBaseSalary() + fixedAllowance;
	    }
	}
	class PartTimeEmployee extends Employee {
	    private int hoursWorked;
	    private double hourlyRate;

	    public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
	        super(employeeId, name, baseSalary);
	        this.hoursWorked = hoursWorked;
	        this.hourlyRate = hourlyRate;
	    }
	    public double calculateSalary() {
	        return getBaseSalary() + (hoursWorked * hourlyRate);
	    }
	}

public class Employee_Management{
	    public static void main(String[] args) {
	        Employee[] employees = new Employee[3];

	        employees[0] = new FullTimeEmployee(101, "Alice", 30000, 10000);
	        employees[1] = new PartTimeEmployee(102, "Bob", 10000, 80, 150);
	        employees[2] = new FullTimeEmployee(103, "Charlie", 25000, 7000);
	        employees[0].assignDepartment("HR");
	        employees[1].assignDepartment("Support");
	        employees[2].assignDepartment("Finance");
	        for (Employee emp : employees) {
	            emp.displayDetails();
	        }
	    }
	}