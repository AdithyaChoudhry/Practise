package OOPS;

public class Constructor {
    public static void main(String[] args) {
        //in java primtive we dont use new keyword because it is stored in stack memory itself rather thaan storing in heap memory as python does
        //creating an object
        //this will call default constructor
        Students Ramesh = new Students();


        //this will call argumented constructor
       Students Rakesh = new Students(55,"Rakesh Ramu",99.0f);
       // Rakesh = new Students(55,"Rakesh Ramu",99.0f);
//will give error
//        final Students Rakesh = new Students(55,"Rakesh Ramu",99.0f);
//        Rakesh = new Students(55,"Rakesh Ramu",99.0f);
//

        Students Random = new Students(Rakesh);

        System.out.println(Random.marks);
        System.out.println(Random.name);
        System.out.println(Random.rollno);


        System.out.println();
        System.out.println();
//It refers to the constructor at line 78
        Students Random2 = new Students();
        System.out.println(Random2.rollno);

      Ramesh.Greeting();
        System.out.println(Ramesh.marks);
        System.out.println(Ramesh.name);
        System.out.println(Ramesh.rollno);

        Rakesh.Greeting();
        System.out.println(Rakesh.rollno);
        System.out.println(Rakesh.name);
        System.out.println(Rakesh.marks);

    }

}
class  Students{
    int rollno;
    String name;
    float marks;
    //This is constructor it should have the same name as class name and -- constructor is a special function
    //and it allocates variables or arguments  to it as it is a function here we dont have anything because it is bydefault constructor
   //by default constructor
    Students(){
        //this keyword represents the object-- example student is ramesh it is ramesh.roll no or ramesh.name
        //basically replaces the object
        this.rollno= 13;
        this.name="Ramesh ";
        this.marks=85.5f;
    }
    //Constructor with arguments
    Students(int rollno , String Firstname , float marks){
        this.rollno=rollno;
        // if we dont use this keyword here then argument variable should be slightly different to indicate correct calling of the required variable
        //example
        this.name = Firstname;

        this.marks=marks;
    }

    //declaring function
    void Greeting(){
        System.out.println("Hello "+ name);
    }

    //we create a constrcutor here that takes value from the another Object
   Students(Students Another ){
        //see 13th line
        //current values will be equal to previous values so we are creating this
        //basically this.roll no is random.name and Another.name will be Rakesh.name
        this.rollno=Another.rollno;
        this.marks=Another.marks;
        this.name=Another.name;
   }
   //calling constructor from another constructor
    //see 22line
//  Students(){
//        this (5,"RAgu",88.0f)
//  }
}
