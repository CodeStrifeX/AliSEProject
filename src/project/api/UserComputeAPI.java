package project.api;
import project.annotations.NetworkAPI;

@NetworkAPI
public interface UserComputeAPI {
    void userComputation(ComputationRequest request);
}
