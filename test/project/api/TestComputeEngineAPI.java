package project.api;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestComputeEngineAPI {
    @Test

    public void smokeTestSearchPrimes() {
        ComputeEngineAPIImpl computeEngine = new ComputeEngineAPIImpl();
        ReturnComputation computeResult = computeEngine.searchPrimes(new SendComputation(10));
        Assertions.assertEquals(List.of(2, 3, 5, 7), computeResult.getPrimes());
    }
}
