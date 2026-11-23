package project.api;
import project.annotations.ProcessAPI;

@ProcessAPI
public interface DataStorageAPI {
    InputData readInput(InputSource inputSource);
    ReturnStatus storeResults(OutputDestination destination, OutputData data);
}
