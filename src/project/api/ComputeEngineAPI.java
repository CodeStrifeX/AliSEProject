package project.api;
import project.annotations.ConceptualAPI;
import java.util.List;

@ConceptualAPI
public interface ComputeEngineAPI {
    List<Integer> primesUpTo(int input);
}
