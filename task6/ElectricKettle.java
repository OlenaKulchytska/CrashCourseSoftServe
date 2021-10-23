package task6;

import java.util.Objects;

public class ElectricKettle {
    private int id;
    private int cost;
    private String name;
    private double capacity;
    private String color;
    private boolean turn;


    public int getId(){
        return id;
    }

    public int getCost(){
        return cost;
    }

    public String getName(){
        return name;
    }

    public double getCapacity(){
        return capacity;
    }

    public String getColor(){
        return color;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setCost(int cost){
        this.cost = cost;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCapacity(int capacity){
        this.capacity= capacity;
    }

    public void setColor(String color){
        this.color = color;
    }

    public ElectricKettle() {
    }

    public ElectricKettle(int id) {
        this.id = id;
    }

    public ElectricKettle(int id,int cost) {
        this.id = id;
        this.cost = cost;
    }

    public ElectricKettle(int id,int cost, String name) {
        this.id = id;
        this.cost = cost;
        this.name = name;
    }

    public ElectricKettle(int id,int cost, String name,double capacity ) {
        this.id = id;
        this.cost = cost;
        this.name = name;
        this.capacity = capacity;
    }

    public ElectricKettle(int id,int cost, String name,double capacity, String color) {
        this.id = id;
        this.cost = cost;
        this.name = name;
        this.capacity = capacity;
        this.color = color;
    }

    @Override
    public String toString() {
        return "ElectricKettle [Name=" + name + ", id=" + id + ", cost=" + cost + ", capacity=" + capacity + ", color=" +  "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ElectricKettle)) return false;
        ElectricKettle that = (ElectricKettle) o;
        return id == that.id && cost == that.cost && Double.compare(that.capacity, capacity) == 0 && name.equals(that.name) && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cost, name, capacity, color);
    }

    public static boolean turnOn(){
        System.out.println("The electric kettle is switched on");
        return true;
    }


    public static boolean turnOff(){
        System.out.println("The electric kettle is switched off");
        return false;
    }



    public static void main(String[] args) {
        ElectricKettle kettle1 = new ElectricKettle(1,1500,"Picola PEK-01",1.8,"white");
        System.out.println(kettle1.toString());
        System.out.println(kettle1.turnOn());
        System.out.println(kettle1.turnOff());
        ElectricKettle kettle2 = new ElectricKettle(2,2500,"Bosch TWK 7601",1.7,"black");
        System.out.println(kettle2.toString());
        System.out.println("Two kettles are equal: " + kettle1.equals(kettle2));
        System.out.println("HashCode of kettle1: " + kettle1.hashCode());
    }
}
