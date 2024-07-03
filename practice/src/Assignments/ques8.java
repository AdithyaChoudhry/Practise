package Assignments;

import java.util.ArrayList;
import java.util.List;

public class ques8 {
    List<String> ans;

    private String letters(char ch){
        switch (ch){
            case '2':
                return "abc";
            case '3':
                return "def";
            case '4':
                return "ghi";
            case '5':
                return "jkl";
            case '6':
                return "mno";
            case '7':
                return "pqrs";
            case '8':
                return "tuv";
            case '9':
                return "wxyz";
            default:
                return "";
        }
    }

    private void Solution(String digits , int i , StringBuffer sb){
        if(i==digits.length()){
            ans.add(sb.toString());
            return;
        }

        String letter = letters(digits.charAt(i));
        for(int j=0;j<letter.length();j++){
            sb.append(letter.charAt(j));
            Solution(digits,i+1,new StringBuffer(sb));
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public List<String> combination(String digits){
        ans = new ArrayList<>();
        Solution(digits,0,new StringBuffer());
        return ans;
    }

    public static void main(String[] args){

        ques8 creat = new ques8();
        String digits = "23";
        List<String> combinations = creat.combination(digits);
        System.out.println("Combination for digits " + digits+":");
        for (String combine:combinations
             ) {
            System.out.println(combine);
        }
    }



}
