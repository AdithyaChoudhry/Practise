package OOPS.ExceptionHandling;

public class Main {
    //throw-> exceptions and errors
    //exceptions-> checked and unchecked --// checked happens at compile time and throws exception

    //error is somewhat like if we have stackoverflow it is error
    //because stack is out of memory

    //exception is when we divide by 0 it throws exception that we should not divide by zero

    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int c;
        try{
            c = a/ b;
            String name = "Ramesh";
            if(name=="Ramesh"){
                throw new MyException("Name is Ramesh ");
            }

           // throw new Exception("Just check");//if we use this alone it will print this and the normal exception because it is not arithmetic
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }
//basically Arithemtic exception e is creating object like Arithmeticexception e = new ArithmeticException() // which method to call depends on child class
        catch (ArithmeticException e){//if we use Exception it is child of  throwable and Arithmetic is child of runtimeexception
            System.out.println(e.getMessage());
        }
        //Exception is common while arithmetic is specific we want to mention it above because it is more strict
        catch (Exception e){//if we use Exception it is child of  throwable and Arithmetic is child of runtimeexception
            System.out.println("Normal Exception");
        }
        finally {
            System.out.println("Always executed");
        }
    }
                 //throw is basically throwing the exception
                //throws is basically declaring the exception that it throws the exception
    static int divide ( int a , int b) throws ArithmeticException{//whenever we use throw declare it using throws outside
        if(b==0){
            throw new ArithmeticException("Do not divide by zero");//we are saying it explicitly
        }
        return a/b;
    }
}
