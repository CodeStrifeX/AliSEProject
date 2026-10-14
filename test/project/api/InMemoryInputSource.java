package project.api;
import java.util.List;

public class InMemoryInputSource implements InputSource {
    private final List<Integer> numbers;
    
    public InMemoryInputSource(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
