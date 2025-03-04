import java.util.*;

class Employee{
    private int id;
    private String name;
    private double salary;

    Employee(int id,String name,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("Id : "+id+", Name : "+name+", Salary : "+salary);
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101,"Akash",70000));
        employees.add(new Employee(102,"Bhawna",50000));
        employees.add(new Employee(103,"Chetan",60000));

        System.out.println("Employee Details : ");
        for(Employee emp : employees){
            emp.displayDetails();
        } 
    }
}
