    package Maths;

    import java.util.Scanner;

    public class primenumbers {
        public static void main(String[] args){

            Scanner input = new Scanner(System.in);
            int n = input.nextInt();

            for (int i = 1; i <=n; i++) {
                System.out.println(i+ " " + isprime(i));

            }
        }
        static boolean isprime(int n){
            if(n<=1){
                return false;
            }
            int c=2;
            while(c*c<=n){
                if(n%c==0){
                    return false;
                }
                c++;


            }
            return true;
        }
    }
