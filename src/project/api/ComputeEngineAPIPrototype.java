package project.api;
import project.annotations.ConceptualAPIPrototype;

public class ComputeEngineAPIPrototype {
    @ConceptualAPIPrototype
    public void testComputeEngine(ComputeEngineAPI api) {
        api.primesUpTo(0);
    }
}
