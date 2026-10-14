package project.api;

public class InMemoryDataStorage implements DataStorageAPI {
    @Override
    public InputData readInput(InputSource inputSource) {
        InMemoryInputSource inMemoryInput = (InMemoryInputSource) inputSource;
        return new InputData(inMemoryInput.getNumbers());
    }
    
    @Override
    public void storeResults(OutputDestination destination, OutputData data) {
        InMemoryOutputDestination inMemoryOutput = (InMemoryOutputDestination) destination;
        inMemoryOutput.getResults().add(data.getResults());
    }
}
