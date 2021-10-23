package task4;

import java.time.Year;
import java.util.Scanner;

public class Person {
    private String name;
    private int birthYear;
    private String info;

    public Person() {
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName(){
        return name;
    }

    public int getBirthYear(){
        return birthYear;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }

    public void setInfo(String info){
        this.info = info;
    }

    public static int age(Person per){
        int birthYear = per.getBirthYear();
        int year = Year.now().getValue();
        return year - birthYear;
    }

    public static void input(Person per){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the information: ");
        String info = scan.nextLine();
        per.setInfo(info);
    }

    public static String output(Person per){
        return per.info;
    }

    public static String changeName(Person per, String name1){
        per.name = name1;
        return per.name;
    }

    @Override
    public String toString(){
        return "Person [Name= " + name + ", birthYear= " + birthYear + "]";
    }

    public static void main(String[] args) {
        Person personOne = new Person();
        personOne.setName("Igor");
        personOne.setBirthYear(2020);
        Person personTwo = new Person("Stepan",2000);
        Person personThree = new Person("Oleg",1999);
        Person personFour = new Person("Olga",2003);
        Person personFive = new Person("Anna",2007);
        System.out.println("Name: " + personOne.getName() + ", birthYear: " + personOne.getBirthYear());
        System.out.println("Name: " + personTwo.getName() + ", birthYear: " + personTwo.getBirthYear());
        System.out.println("Name: " + personThree.getName() + ", birthYear: " + personThree.getBirthYear());
        System.out.println("Name: " + personFour.getName() + ", birthYear: " + personFour.getBirthYear());
        System.out.println("Name: " + personFive.getName() + ", birthYear: " + personFive.getBirthYear());
        System.out.println(personFive.toString());
        System.out.println(age(personFive));
        input(personFive);
        System.out.println("Personal information: ");
        System.out.println(output(personFive));
        System.out.println("Changing of name " + personFive.name + ". Person's new name:");
        System.out.println(changeName(personFive, "PAVLO"));

    }
}
