package Assignments;

import java.util.Scanner;

public class ques4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();

        String password ="";
        int i,j;
        for(i=0 ,j=0 ; i < a.length() && j <b.length();i++,j++){
            password = password + a.charAt(i) + b.charAt(j);
        }
       if(i<a.length()){
           password = password + a.substring(i,a.length());
       }
       if(j<b.length()){
           password = password + b.substring(j,b.length());
       }

       System.out.println(password);

    }
}
