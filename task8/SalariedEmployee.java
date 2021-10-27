package task8;

public class SalariedEmployee extends Employee implements Pay{
    private String socialSecurityNumber;
    private int salary;
    private int hourlyRate;
    private int numberOfHours;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String employeeId,String name, int hourlyRate, int numberOfHours, String socialSecurityNumber) {
        this.employeeId = employeeId;
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.numberOfHours = numberOfHours;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    @Override
    public int calculatePay() {
        salary = hourlyRate * numberOfHours;
        return salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "name='" + name + '\'' +
                "employeeId='" + employeeId + '\'' +
                ", salary=" + salary +
                '}';
    }



}
