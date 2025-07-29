class Person{
    String name;
    public Person(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
}
class Employee extends Person{
    private double salary;
    private int year_of_join;
    private String NIC;
    Employee(String name,double salary,int year_of_join,String NIC){
        super(name);
        this.salary=salary;
        this.year_of_join=year_of_join;
        this.NIC=NIC;
    }
    public void setyear(int year_of_join){
        this.year_of_join=year_of_join;
    }

    public double getsalary(){
        return salary;
    }
    public int getyear(){
        return year_of_join;
    }
    public String getNic(){
        return NIC;
    }
}
public class Main
{
	public static void main(String[] args) {
		Employee e=new Employee("shama",55000,2026,"8074");
		System.out.println(e.getyear());
		System.out.println(e.getname());
		    
	}
}