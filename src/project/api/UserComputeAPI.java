package project.api;
import project.annotations.NetworkAPI;

@NetworkAPI
public interface UserComputeAPI {
    ReturnStatus userComputation(ComputationRequest request);
}
