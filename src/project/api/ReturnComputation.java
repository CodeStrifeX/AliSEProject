package project.api;
import java.util.List;

public class ReturnComputation {
    private final List<Integer> primes;

    public ReturnComputation(List<Integer> primes) {
        this.primes = primes;
    }

    public List<Integer> getPrimes() {
        return primes;
    }
}
