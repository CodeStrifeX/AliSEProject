package project.api_temp;
import project.annotations.ConceptualAPIPrototype;
import java.util.List;
import java.util.ArrayList;

public class ComputeEngineAPIPrototype implements ComputeEngineAPI {
    @Override
    @ConceptualAPIPrototype
    public List<Integer> primesUpTo(int input) {
        return new ArrayList<>();
    }
}
