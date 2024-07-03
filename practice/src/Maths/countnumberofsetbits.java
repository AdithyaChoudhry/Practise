package Maths;

public class countnumberofsetbits {
    public static void main(String[] args){
        int n = 798708;
        System.out.println(Integer.toBinaryString(n));
        int count=0;
//        while(n>0){
//            count++;
//            //n-=(n&-n);
//
//        }
        while (n>0){
            count++;
           n = n & n-1;
        }
        System.out.println(count);
//        if n is 8
//
//        1000
//        8-1 = 7
//        0111
//
//        1000
//        0111 &
//
//                0000 so count is 1

        //xor of numbers from  0 to a
        //a % 4 == 0 then then a itself the answer
        //a % 4 == 1 then 1 is answer
        //a%4 == 2 then a+1
        //a%4 == 4 then 3
    }
}
