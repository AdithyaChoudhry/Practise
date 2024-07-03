package OOPS;

public class Classexample {
    public static void main(String[] args) {
        //use of new = new keyword is used because it dynamilcally allocates memory and returns a reference to it
        //--------------------------
        //Student Ramesh;
        // In the Above Ramesh is reference variable of student that is just declaring it here we are not creating a object

        //Below we are Creating the Object
        //Student Ramesh = new Student()
        Student Ramesh = new Student();

        //Student Ramesh Happens at compile time
        //new student happens at run time that is where dynamic allocation of memory takes place
        Ramesh.rollno=90;
        Ramesh.name="Ramesh R";
        Ramesh.marks= 100;

        System.out.println(Ramesh.rollno);
        System.out.println(Ramesh.name);
        System.out.println(Ramesh.marks);

        Teacher teacher = new Teacher();

        teacher.idno=1;
        teacher.name="Profeesor1";
        teacher.experienece=5;

        System.out.println(teacher.name);
        System.out.println(teacher.idno);
        System.out.println(teacher.experienece);



    }


}
class Student {
    int rollno;
    String name;
    //if we give  values here it will be assigned as default values
    int marks;

}

class Teacher{
    int idno;
    String name;
    int experienece;
}