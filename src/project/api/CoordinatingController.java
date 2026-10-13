package project.api;

public class CoordinatingController implements UserComputeAPI {
    private final DataStorageAPI dataStorageAPI;
    private final ComputeEngineAPI computeEngineAPI;

    public CoordinatingController(DataStorageAPI dataStorageAPI, ComputeEngineAPI computeEngineAPI) {
        this.dataStorageAPI = dataStorageAPI;
        this.computeEngineAPI = computeEngineAPI;
    }

    @Override
    public void userComputation(ComputationRequest request) {
        InputData input = dataStorageAPI.readInput(request.getInputSource());
        String output = "";
        for (int number : input.getNumbers()) {
            ReturnComputation result = computeEngineAPI.searchPrimes(new SendComputation(number));
            output += number + ":" + result.getPrimes() + request.getDelimiter();
        }
        dataStorageAPI.storeResults(request.getOutputDestination(), new OutputData(output));
    }
}