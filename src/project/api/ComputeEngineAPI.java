package project.api;
import project.annotations.ConceptualAPI;

@ConceptualAPI
public interface ComputeEngineAPI {
    ReturnComputation searchPrimes(SendComputation sendInput);
}
