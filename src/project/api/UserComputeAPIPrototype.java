package project.api;
import project.annotations.NetworkAPIPrototype;

public class UserComputeAPIPrototype {
    @NetworkAPIPrototype
    public void userComputePrototype(UserComputeAPI api) {
        InputSource input = null;
        OutputDestination output = null;
        api.userComputation(new ComputationRequest(input, output, ','));
        api.userComputation(new ComputationRequest(input, output));
    }
}
