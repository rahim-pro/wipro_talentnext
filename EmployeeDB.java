import java.util.ArrayList;

public class EmployeeDB {
    ArrayList<Employee> list = new ArrayList<>();

   
    public boolean addEmployee(Employee e) {
        return list.add(e);
    }

 
    public boolean deleteEmployee(int empId) {
        for (Employee e : list) {
            if (e.empId == empId) {
                list.remove(e);
                return true;
            }
        }
        return false;
    }

    
    public String showPaySlip(int empId) {
        for (Employee e : list) {
            if (e.empId == empId) {
                return "Pay slip for employee ID " + empId + " is ₹" + e.salary;
            }
        }
        return "Employee not found!";
    }


    public void displayAllEmployees() {
        if (list.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            for (Employee e : list) {
                e.getEmployeeDetails();
            }
        }
    }
}