package Composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

    private String position;//职位
    private String name;
    private double salary;

    private List<Employee> subordinates;

    public Employee(String position,String name,double salary){
        this.position=position;
        this.name=name;
        this.salary=salary;
        subordinates=new ArrayList<Employee>();

    }

    public Employee(String position,String name,double salary,List<Employee> employees){
        this.position=position;
        this.name=name;
        this.salary=salary;
        subordinates=new ArrayList<Employee>();
        for(Employee employee:employees){
            subordinates.add(employee);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", subordinates=" + subordinates +
                '}';
    }

    public void add(Employee employee){
        subordinates.add(employee);
    }

    public void remove(Employee employee){
        subordinates.remove(employee);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<Employee> subordinates) {
        this.subordinates = subordinates;
    }
}
