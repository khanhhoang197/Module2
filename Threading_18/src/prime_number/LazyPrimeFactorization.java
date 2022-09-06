package prime_number;

public class LazyPrimeFactorization implements Runnable {
    String name;

    public LazyPrimeFactorization(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int number = 1;
        boolean isPrime;
        while (number < 200) {
            number++;
            isPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.printf("\n%s print: %d", name, number);
            }
        }
    }
}
