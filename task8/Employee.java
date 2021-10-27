package task8;


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




}