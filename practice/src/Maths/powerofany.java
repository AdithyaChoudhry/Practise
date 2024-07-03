package Maths;

public class powerofany {
    public static void main(String[] args){
        int power = 6;
        int base = 2;
       int ans =1; //basically
        while(power > 0){
            if((power & 1 )==1){
                ans*=base;
            }
            base*=base;
            power=power>>1;
        }
        System.out.println(ans);
    }
}
