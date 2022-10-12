package Composite;

import Filter.Person;

public class Main {
    public static void main(String[] args) {
        Employee ceo=new Employee("ceo","ceo",100000);

        Employee manager1=new Employee("manager","manager1",10000);
        Employee manager2=new Employee("manager","manager2",10000);

        Employee employee1=new Employee("employee","employee1",1000);
        Employee employee2=new Employee("employee","employee1",1000);

        ceo.add(manager1);
        ceo.add(manager2);

        manager1.add(employee1);
        manager2.add(employee2);


        PrintTree(ceo);


    }

    public static void PrintTree(Employee employee){
        if(employee.getSubordinates()!=null){
            for(Employee emp: employee.getSubordinates()){
                PrintTree(emp);
            }
        }
        System.out.println(employee.toString());
    }
}
