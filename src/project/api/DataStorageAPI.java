package project.api;
import project.annotations.ProcessAPI;

@ProcessAPI
public interface DataStorageAPI {
    InputData readInput(InputSource inputSource);
    void storeResults(OutputDestination destination, OutputData data);
}
