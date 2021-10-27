package task8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Employee implements Pay{
    public int salary;
    protected String name;
    protected String employeeId;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setEployeeId(String eployeeId) {
        this.employeeId = eployeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }



    @Override
    public int calculatePay() {
        return 0;
    }


    public void sortStudentsByCourse(ArrayList<Employee> employees){
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.salary - o2.salary; // or whatever property you want to sort
            }
        });
        System.out.println(Arrays.asList(employees));
    }

}