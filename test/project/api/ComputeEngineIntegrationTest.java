package project.api;
import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComputeEngineIntegrationTest {
    @Test

    public void integrationTestComputeEngine() {
        InMemoryDataStorage dataStorage = new InMemoryDataStorage();
        ComputeEngineAPIImpl computeEngine = new ComputeEngineAPIImpl();
        CoordinatingController controller = new CoordinatingController(dataStorage, computeEngine);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(25);

        InMemoryInputSource input = new InMemoryInputSource(numbers);
        InMemoryOutputDestination output = new InMemoryOutputDestination();
        controller.userComputation(new ComputationRequest(input, output));
        Assertions.assertEquals("1:[];10:[2, 3, 5, 7];25:[2, 3, 5, 7, 11, 13, 17, 19, 23];", output.getResults().get(0));
    }
}