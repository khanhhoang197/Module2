package prime_number;

public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization primeLazy = new LazyPrimeFactorization("\nShow prime lazy");
        OptimizedPrimeFactorization primeOptimized = new OptimizedPrimeFactorization("\n\t\t\t\t\t\t\t\t Show prime optimized");

        Thread print1 = new Thread(primeLazy);
        Thread print2 = new Thread(primeOptimized);

        print1.start();
        print2.start();
    }
}
