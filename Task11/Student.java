package Task11;

import java.util.*;

public class Student implements Comparable<Student>{
    String name;
    int course;

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int course) {
        this.course = course;
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public static void printStudents(ArrayList<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.toString());
            }
        }
    }
    @Override
    public int compareTo(Student o) {
        return toString().compareTo(o.toString());
    }

    public static void sortStudentsByName(ArrayList<Student> students) {

        Collections.sort(students, new Comparator<Student>(){

            public int compare(Student o1, Student o2)
            {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(Arrays.asList(students));
    }

    public static void sortStudentsByCourse(ArrayList<Student> students){
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.course - o2.course; // or whatever property you want to sort
            }
        });
        System.out.println(Arrays.asList(students));
        }

    public static void main(String[] args) {
        ArrayList<Student>
                students = new ArrayList<Student>();

        // adding element to arrlist
        students.add(new Student("Anna",1));
        students.add(new Student("Ella",1));
        students.add(new Student("Carla",1));
        students.add(new Student("Devid",2));
        students.add(new Student("Stepan",3));
        System.out.println("---All students---");
        System.out.println(students.toString());
        System.out.println("---Students which are taught in 1 course---");
        printStudents(students, 1);
        System.out.println("---All students compared by name---");
        sortStudentsByName(students);
        System.out.println("---All students compared by course---");
        sortStudentsByCourse(students);
    }



}


