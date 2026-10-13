package project.api;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TestUserComputeAPI {
    @Test

    public void smokeTestUserComputation() {
        DataStorageAPI mockDataStorage = Mockito.mock(DataStorageAPI.class);
        ComputeEngineAPI mockComputeEngine = Mockito.mock(ComputeEngineAPI.class);

        when(mockDataStorage.readInput(any(InputSource.class))).thenReturn(new InputData(List.of(10)));
        when(mockComputeEngine.searchPrimes(any(SendComputation.class))).thenReturn(new ReturnComputation(List.of(2,3,5,7)));
        CoordinatingController controller = new CoordinatingController(mockDataStorage, mockComputeEngine);
        InputSource input = Mockito.mock(InputSource.class);
        OutputDestination output = Mockito.mock(OutputDestination.class);
        controller.userComputation(new ComputationRequest(input, output));
    }
}
