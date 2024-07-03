package Introduction;

public class ArmstrongNumber {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        boolean ans = CheckArmstrong(a);
//        System.out.println(ans);
         //Starting with 100 because 1 and 0 will print if we use i = 0;
        for (int i =100; i <= 1000 ; i++ ){
           if(CheckArmstrong(i)){
               System.out.println(i);
           }
        }
    }


    static boolean CheckArmstrong(int n ){
        int original = n;
        int  sum = 0;

        while(n > 0){
          int   rem = n % 10 ;
            sum = sum + rem*rem*rem ;
            n = n /10;
        }
        return original == sum ;

    }
}
