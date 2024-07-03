package OOPS.Access;

public class Class {
    protected int num;
    private String name;//we cannot access the private in other package but we can access it using getter and setter methods

    public String getName() {
        return name;
    }

    public Class(int num, String name) {
        this.num = num;
        this.name = name;
    }
}
