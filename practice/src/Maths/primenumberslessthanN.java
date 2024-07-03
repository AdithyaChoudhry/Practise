package Maths;

public class primenumberslessthanN {
    public static void main(String[] args){
        int n = 40;
        boolean[] primes = new boolean[n+1];//0 to 39 is limit to include also 40 we include n+1
        check(n,primes);
    }
    static void check(int n , boolean[] primes){
        for (int i = 2; i*i <=n ; i++) {
           if(!primes[i]){
               for (int j = 2*i; j <=n; j+=i) {
                        primes[j]=true;
               }
           }//here not prime means false , that is false boolean is prime
        }
        for (int i = 2; i <=n; i++) {
            if(!primes[i]){
                System.out.print(" "+ i);
            }
        }
    }
}
//time complexity of a number is n/2+n/3+n/5--- take n commonly out n(log(logn)) is time complexity
