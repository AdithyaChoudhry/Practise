package Assignments;

//public class HCFandLCM {
//
//        public static void main(String[] args) {
//            int hcf =0;
//            int lcm =0;
//            Scanner input = new Scanner(System.in);
//            int a =input.nextInt();
//            int b =input.nextInt();
//            for (int i = 1; i < (a+b)/2 ; i++) {
//                if( (a % i)==0 && (b % i) ==0){
//                    hcf = i;
//                }
//            }
//            System.out.println(hcf);
//        lcm = a * b / hcf;
//            System.out.println(lcm);
//        }
//}
public class HCFandLCM {
    public static void main(String[] args) {

        int n1 = 72, n2 = 120, lcm;

        // maximum number between n1 and n2 is stored in lcm
        lcm = (n1 > n2) ? n1 : n2;

        // Always true
        while(true) {
            if( lcm % n1 == 0 && lcm % n2 == 0 ) {
                System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
                break;
            }
            ++lcm;
        }
    }
}