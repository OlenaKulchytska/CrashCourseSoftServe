package task8;

public class ContractEmployee extends Employee implements Pay{
    private String federalTaxIdMemeber;
    private int salary;

    public ContractEmployee(){
    }

    public ContractEmployee(String eployeeId,String name, int salary,String federalTaxIdMemeber){
        this.employeeId =eployeeId;
        this.name = name;
        this.salary = salary;
        this.federalTaxIdMemeber = federalTaxIdMemeber;

    }
    public void setFederalTaxIdMemeber(String federalTaxIdMemeber) {
        this.federalTaxIdMemeber = federalTaxIdMemeber;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFederalTaxIdMemeber() {
        return federalTaxIdMemeber;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int calculatePay() {
        return salary;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "name='" + name + '\'' +
                "employeeId='" + employeeId + '\'' +
                ", salary=" + salary +
                '}';
    }



}
