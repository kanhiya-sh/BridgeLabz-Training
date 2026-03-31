package BridgeLabz_Day30_Collections;

import java.util.*;

class Employee{
    String name;
    String dept;
    Employee(String n,String d){name=n;dept=d;}
}

public class GroupByDepartment {
    public static void main(String[] args) {
        List<Employee> ll = List.of(
            new Employee("Bhavy","HR"),
            new Employee("Naman","IT"),
            new Employee("Kanhiya","HR")
        );
        Map<String,List<Employee>> map = new HashMap<>();
        for(Employee e : ll) {
            map.computeIfAbsent(e.dept,x->new ArrayList<>()).add(e);
        }
        for (String d : map.keySet()) {
            System.out.print(d + ": ") ;
            for (Employee e : map.get(d)) {
                System.out.print(e.name + " ") ;
            }
            System.out.println();
        }
    }
}