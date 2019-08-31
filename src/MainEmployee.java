import java.util.*;

public class MainEmployee {

	public int eno;
	public String ename;
	public String designation;
	public String department;
	public double salary;

	ArrayList<ArrayList<Object>> al = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainEmployee e = new MainEmployee();
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
		System.out.println("7. View Employees according to Department");
		System.out.println("8. Exit");

		while (true) {
			System.out.println("Enter your choice to perform Operation:");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				e.addEmployee();
				break;

			case 2:
				e.viewEmployee();
				break;

			case 3:
				e.removeEmployee();
				break;

			case 4:
				e.clearAllData();
				break;

			case 5:
				e.updateSalEmployee();
				break;

			case 6:
				e.searchEmployee();
				break;

			case 7:
				break;

			case 8:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid no");
			}
		}

	}

	public void addEmployee() {

		ArrayList<Object> emp = new ArrayList<Object>();
		// System.out.println("Enter Employee Id:");
		// int eno = sc.nextInt();
		eno++;
		System.out.println("Enter Employee Name:");
		String ename = sc.nextLine();
		System.out.println("Enter Employee Designation:");
		String desg = sc.nextLine();
		System.out.println("Enter Employee Department:");
		String dept = sc.nextLine();
		System.out.println("Enter Employee Salary:");
		// sc.nextLine();
		double sal = sc.nextDouble();
		emp.add(eno);
		emp.add(ename);
		emp.add(desg);
		emp.add(dept);
		emp.add(sal);

		al.add(emp);

	}

	public void viewEmployee() {
		al.forEach(System.out::println);
	}

	public void removeEmployee() {
		System.out.print("Enter eno to delete :");
		int no = sc.nextInt();
		al.remove(no - 1);
	}

	public void clearAllData() {
		System.out.println("Are you sure you want to clear the data.Press Y/N :");
		char ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			al.clear();
			System.out.println("data cleared");
		} else
			return;
		// al.clear();
	}

	public void updateSalEmployee() {
		System.out.print("Enter eno number whose salary you want to update :");
		int no = sc.nextInt();
		// double salsal =
		for (int i = 0; i < al.size(); i++) {
			if ((int) ((ArrayList) al.get(i)).get(0) == no) {
				System.out.println("Employee Numbers " + no + " current salary is :" + ((ArrayList) al.get(i)).get(4));
			}
		}
		System.out.print("Enter new salary :");
		double salsal = sc.nextDouble();
		al.get(no - 1).set(4, salsal);
		System.out.println("Salary Updated !");

	}

	public void searchEmployee() {
		System.out.print("Enter Employee number to search :");
		int no = sc.nextInt();
		for (int i = 0; i < al.size(); i++) {
			if ((int) ((ArrayList) al.get(i)).get(0) == no) {
				System.out.println(((ArrayList) al.get(i)).get(1));
			}
		}

	}

}
