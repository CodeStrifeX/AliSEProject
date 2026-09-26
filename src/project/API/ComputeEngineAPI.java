package project.API;
import project.annotations.ConceptualAPI;
import java.util.*;

@ConceptualAPI
public interface ComputeEngineAPI {
    List<Integer> primesUpTo(int input);
}
