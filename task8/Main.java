package task8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void sortEmployeesBySalary(ArrayList<Employee> employees){
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.salary - o2.salary; // or whatever property you want to sort
            }
        });
        System.out.println(Arrays.asList(employees));
    }
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0]= new SalariedEmployee("1abcde","Jack",150,6,"1234gtf");
        employees[1]= new SalariedEmployee("2abcde","Ben",50,4,"87689ijm");
        employees[2]= new ContractEmployee("3abcde","Carla",10000,"uyjh3424");
        employees[3]= new ContractEmployee("4abcde","Nina",8000,"oi9809");


        for (int i =0; i< employees.length;i++) {
            if (employees[i].getClass().getSimpleName().equals("SalariedEmployee"))
            System.out.println(employees[i].calculatePay());
        }


        for (int i =0; i< employees.length;i++) {
            System.out.println(employees[i].toString());
        }
        System.out.println("------------Method 1. Sorted by salary-----------------");

        Employee temp = new Employee();
        for (int i =0; i< employees.length;i++) {
            for (int j =0; j< employees.length;j++) {
                if (employees[i].getSalary() > employees[j].getSalary()) {
                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
        for (int i =0; i< employees.length;i++) {
            System.out.println(employees[i].toString());
        }



        System.out.println("------------Method 2. Sorted by salary with collections-----------------");
        // Variant 2
        ArrayList<Employee> employees_ = new ArrayList<Employee>();

        // adding element to arrlist
        employees_.add(new SalariedEmployee("1abcde","Jack",150,6,"1234gtf"));
        employees_.add(new SalariedEmployee("2abcde","Ben",50,4,"87689ijm"));
        employees_.add(new ContractEmployee("3abcde","Carla",10000,"uyjh3424"));
        employees_.add(new ContractEmployee("4abcde","Nina",8000,"oi9809"));
        for (Employee element : employees_) {
            element.setSalary(element.calculatePay());
        }
        sortEmployeesBySalary(employees_);

/*
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.salary - o2.salary; // or whatever property you want to sort
            }
        });

 */

        /*
        List<? extends Employee> employeeList = new ArrayList<? extends Employee>();
         */

}

}