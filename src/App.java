public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(nextPrime(1190));
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
}
