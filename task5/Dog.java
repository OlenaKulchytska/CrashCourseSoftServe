package task5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public enum breed {
        Bulldog, Akita, Terrier, Shepherd
    }

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int age) {
        this.name = name;
        if (age<1 || age>30){
            throw new IllegalArgumentException();
        }
        this.age = age;
    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        if (age<1 || age>30){
            throw new IllegalArgumentException();
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog [Name=" + name + ", breed=" + breed + ", age=" + age +  "]";
    }

    public boolean sameName(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog that = (Dog) o;
        return name.equals(that.name);
    }

    public static void maxAge(Dog dog1, Dog dog2, Dog dog3){
        int age1 = dog1.age;
        int age2 = dog2.age;
        int age3 = dog3.age;
        List<Integer> values = Arrays.asList(age1, age2, age3);
        int max = Collections.max(values);
        if (dog1.age == max) System.out.println("Name: " + dog1.name + " Breed: " + dog1.breed);
        else if (dog2.age == max) System.out.println("Name: " + dog2.name + "Breed: " + dog2.breed);
        else if (dog3.age == max) System.out.println("Name: " + dog3.name + "Breed: " + dog3.breed);
    }

    public int getAge(){
        return age;
    }

    public String getBreed(){
        return breed;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex","Bulldog",12);
        System.out.println(dog1.toString());
        Dog dog2 = new Dog("Rex","Terrier",3);
        System.out.println(dog2.toString());
        Dog dog3 = new Dog("Alex","Akita",15);
        System.out.println(dog3.toString());
        System.out.println("Two dogs have the same names: ");
        System.out.println(dog1.sameName(dog3));
        System.out.println("Two dogs have the same names: ");
        System.out.println(dog1.sameName(dog2));
        maxAge(dog1,dog2,dog3);

    }

}
