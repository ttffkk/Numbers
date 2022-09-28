import java.util.ArrayList;

public class Basicfunc {
    public static void main(String[] args) {
        System.out.println(primefactor(662790));
    }
    public static int nextPrime(int n) {
        for (int i = n + 1; true; i++) {
            if (isPrime(i)) {
                return i;
            }
        }
    }
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }   
    public static double enumber(double n){
        double x=1/n;
        x=x+1;
        return Math.pow(x, n);
    }
    public static int fib(int n){
        int x=1;
        int y=1;
        if(n==1){
            return x;
        }
        else{
            for(int i=2;i<n;i++){
                int z=x+y;
                x=y;
                y=z;
            }
            return y;
        }
    }
    
    public static String primefactor(int n){
        ArrayList<Integer> john = new ArrayList();
        for(int z=n-1;z>1;z--){
            if(n%z==0){
                john.add(z);
            }
        }
        return john.toString();
    }
}
