package Assignments;

public class User1 {
    String id;
    String name;
    String email;
    String password;

    public User1(String id , String name , String email , String password){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password=password;
    }

    public String getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public String getemail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
}
