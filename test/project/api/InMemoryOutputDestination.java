package project.api;
import java.util.ArrayList;
import java.util.List;

public class InMemoryOutputDestination implements OutputDestination {
    private final List<String> results = new ArrayList<>();

    public List<String> getResults() {
        return results;
    }
}
