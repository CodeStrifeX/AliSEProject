package project.api;
import project.annotations.ConceptualAPIPrototype;

public class ComputeEngineAPIPrototype {
    @ConceptualAPIPrototype
    public void testComputeEngine(ComputeEngineAPI api) {
        SendComputation sendInput = new SendComputation(0);
        ReturnComputation returnOutput = api.searchPrimes(sendInput);
        System.out.println("Found Primes: " + returnOutput.getPrimes());
    }
}
