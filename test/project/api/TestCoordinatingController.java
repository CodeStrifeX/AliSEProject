package project.api;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCoordinatingController {
    @Test

    public void noFileReturnsFailure() {
        CoordinatingController controller = new CoordinatingController(new DataStorageAPIImpl(), new ComputeEngineAPIImpl());
        ComputationRequest request = new ComputationRequest(new FileInputSource("NoFile.txt"), new FileOutputDestination("output.txt"));
        Assertions.assertEquals(ReturnStatus.FAIL, controller.userComputation(request));
    }
}
