import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainEmployee implements Comparable<MainEmployee> {
	private int eno;
	private String ename;
	private String designation;
	private String department;
	private double salary;
	public static int field;
	public static int asc = 1;

	static Scanner sc = new Scanner(System.in);
	static ArrayList<MainEmployee> emp = new ArrayList<MainEmployee>();

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		System.out.println("Employee Menu");
		System.out.println("-----------------------");
		System.out.println("1. Add a new Employee");
		System.out.println("2. View all Employees");
		System.out.println("3. Remove Employee");
		System.out.println("4. Clear all data");
		System.out.println("5. Update Salary");
		System.out.println("6. Search a Employee");
		System.out.println("7. Sort the employees");

		System.out.println("8. Exit");

		while (true) {
			System.out.println("Enter your choice to perform Operation:");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				addEmployee();
				break;

			case 2:
				viewEmployee();
				break;

			case 3:
				removeEmployee();
				break;

			case 4:
				clearAllData();
				break;

			case 5:
				updateSalEmployee();
				break;

			case 6:
				searchEmployee();
				break;

			}
		}
	}

	@Override
	public String toString() {
		return "Extraa [eno=" + eno + ", ename=" + ename + ", designation=" + designation + ", department=" + department
				+ ", salary=" + salary + "]";
	}

	public static void addEmployee() {

		MainEmployee e = new MainEmployee();
		System.out.println("Enter Employee Id:");
		e.eno = sc.nextInt();

		System.out.println("Enter Employee Name:");
		e.ename = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter Employee Designation:");
		e.designation = sc.nextLine();
		System.out.println("Enter Employee Department:");
		e.department = sc.nextLine();
		System.out.println("Enter Employee Salary:");
		// sc.nextLine();
		e.salary = sc.nextDouble();

		emp.add(e);
		System.out.print("1.Employee No 2.Employee Name 3.Salary ");
		MainEmployee.field = sc.nextInt();
		System.out.print("Based on Order 1.Ascending 2.Descending ");
		MainEmployee.asc = sc.nextInt();
		Collections.sort(emp);

		for (MainEmployee e1 : emp)// for printing sorted list
		{
			System.out.println(e1);
		}

	}

	public static void viewEmployee() {
		emp.forEach(System.out::println);
	}

	public static void removeEmployee() {
		System.out.print("Enter eno to delete :");
		int no = sc.nextInt();
		Iterator i = emp.iterator();
		int k = 0;
		// System.out.println("The ArrayList elements are:");
		while (i.hasNext()) {
			MainEmployee x = (MainEmployee) i.next();
			if (x.eno == no) {
				emp.remove(k);
				break;
			}
			k++;
		}
		// emp.remove(no);
	}

	public static void searchEmployee() {
		System.out.print("Enter Employee No to search :");
		int no = sc.nextInt();
		for (int i = 0; i <= emp.size(); i++) {
			MainEmployee x = (MainEmployee) emp.get(i);
			if (x.eno == no) {
				System.out.println(emp.get(i));

			}

		}
	}

	public static void clearAllData() {
		System.out.println("Are you sure you want to clear the data.Press Y/N :");
		char ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			emp.clear();
			System.out.println("data cleared");
		} else
			return;
		// al.clear();
	}

	public static void updateSalEmployee() {
		MainEmployee e = new MainEmployee();
		System.out.print("Enter Employee number whose salary you want to update :");
		int no = sc.nextInt();
		// double salsal =
		for (int i = 0; i < emp.size(); i++) {
			MainEmployee x = (MainEmployee) emp.get(i);
			if (x.eno == no) {
				System.out.println("Employee Numbers " + no + " current salary is :" + x.getSalary());
				System.out.print("Enter new salary :");
				x.salary = sc.nextDouble();
				emp.remove(i);
				emp.add(x);
				break;
			}
		}
		System.out.println("Salary Updated !");

	}

	@Override
	public int compareTo(MainEmployee emp) {

		if (field == 1) {
			if (asc == 2) {
				return -(this.eno - emp.eno);
			}
			return this.eno - emp.eno;

		}
		if (field == 2) {
			if (asc == 2) {
				return -(this.ename.compareTo(emp.ename));
			}
			return this.ename.compareTo(emp.ename);
		}
		if (field == 3) {
			if (asc == 2) {
				return -(int) (this.salary - emp.salary);
			}
			return (int) (this.salary - emp.salary);
		}

		return 0;
	}

	// -{1,2,2}--{8,7,7}-{3,4,10}
	// x={3,4,10}
}
