package project.api_temp;
import project.annotations.ConceptualAPI;
import java.util.List;

@ConceptualAPI
public interface ComputeEngineAPI {
    List<Integer> primesUpTo(int input);
}
