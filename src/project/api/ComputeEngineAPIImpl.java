package project.api;

import java.util.ArrayList;
import java.util.List;

public class ComputeEngineAPIImpl implements ComputeEngineAPI {
    @Override
    public ReturnComputation searchPrimes(SendComputation sendInput) {
        int primesToFind = sendInput.getNumber();
        List<Integer> primes = new ArrayList<>();
        for (int num = 2; num <= primesToFind; num++) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        return new ReturnComputation(primes);
    }

    private boolean isPrime(int num) {
        for (int factor = 2; factor < num; factor++) {
            if (num % factor == 0) {
                return false;
            }
        }
        return true;
    }
}
