package OOPS.Generics.ComparingObjects;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student obj1 = new Student("Rajesh",80);
        Student obj2 = new Student("Ramesh",85);
        Student obj3 = new Student("Ragu",87);
        Student obj4 = new Student("Raj",89);
        Student obj5 = new Student("Ram",90);

        Student[] list = {obj1 , obj2 , obj3 , obj4 , obj5};
        Arrays.toString(list);
        System.out.println( Arrays.toString(list));//tostring overrided in Student class see there
        //if we run this with the compare to object in Student class it will sort it on ther order based on marks

        //we can also use arrays sort
        Arrays.sort(list, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return (o1.marks-o2.marks);//if we use - it sorts in descending order
                    }
                });

                //we can use lambda functions

                //Arrays.sort(list ,(o1 , o2) -> (o1.marks - o2.marks));


                //if we want to compare the students we cant do it normally here comes compareto method
                //implement the compareto method and then use it  here -- see in student.java file
                //comparable is an interface
//        if(obj1.compareTo(obj2) < 0){// that is if less than 0 means Ramesh has more marks // see compare to condition in Student
//            System.out.println("Ramesh has more marks");
//        }
    }
}
