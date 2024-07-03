package OOPS.Generics.ComparingObjects;

public class Student implements Comparable<Student> {//implementing comparable interface to compare the Objects
    String name;

    int marks;
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + " ";
    }

    @Override
    public int compareTo(Student o) {
        int diff = this.marks - o .marks;//if marks float then typecast it
        return diff;
    }
}
