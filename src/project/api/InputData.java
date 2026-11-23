package project.api;
import java.util.List;

public class InputData {
    private final List<Integer> numbers;
    private final ReturnStatus status;

    public InputData(List<Integer> numbers) {
        this(numbers, ReturnStatus.PASS);
    }

    public InputData(List<Integer> numbers, ReturnStatus status) {
        this.numbers = numbers;
        this.status = status;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public ReturnStatus getStatus() {
        return status;
    }
}
