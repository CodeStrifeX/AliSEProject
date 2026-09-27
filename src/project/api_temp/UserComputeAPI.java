package project.api_temp;
import project.annotations.NetworkAPI;

@NetworkAPI
public interface UserComputeAPI {
    void userComputation(String inputSource, char delimiterCharacters, String outputDestination);
    void userComputation(String inputSource, String outputDestination);
}
