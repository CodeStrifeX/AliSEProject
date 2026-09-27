package project.api_temp;
import project.annotations.NetworkAPIPrototype;

public class UserComputeAPIPrototype implements UserComputeAPI {
    
    @Override
    @NetworkAPIPrototype
    public void userComputation(String inputSource, char delimiterCharacters, String outputDestination) {
        System.out.println("Input source: " + inputSource);
    }

    @Override
    @NetworkAPIPrototype
    public void userComputation(String inputSource, String outputDestination) {
        userComputation(inputSource, ',', outputDestination);
    }
}
