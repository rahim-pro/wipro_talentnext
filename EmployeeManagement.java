import java.util.Scanner;

public class EmployeeManagement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDB db = new EmployeeDB();

        while (true) {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Delete Employee");
            System.out.println("3. Show Pay Slip");
            System.out.println("4. Display All Employees");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter Gender: ");
                    String gender = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    float salary = sc.nextFloat();

                    Employee emp = new Employee(id, name, email, gender, salary);
                    db.addEmployee(emp);
                    System.out.println("Employee added successfully.");
                    break;

                case 2:
                    System.out.print("Enter Employee ID to delete: ");
                    int delId = sc.nextInt();
                    boolean removed = db.deleteEmployee(delId);
                    if (removed)
                        System.out.println("Employee deleted.");
                    else
                        System.out.println("Employee not found.");
                    break;

                case 3:
                    System.out.print("Enter Employee ID for payslip: ");
                    int payId = sc.nextInt();
                    System.out.println(db.showPaySlip(payId));
                    break;

                case 4:
                    db.displayAllEmployees();
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}