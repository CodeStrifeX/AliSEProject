package project.api;

public class CoordinatingController implements UserComputeAPI {
    private final DataStorageAPI dataStorageAPI;
    private final ComputeEngineAPI computeEngineAPI;

    public CoordinatingController(DataStorageAPI dataStorageAPI, ComputeEngineAPI computeEngineAPI) {
        this.dataStorageAPI = dataStorageAPI;
        this.computeEngineAPI = computeEngineAPI;
    }

    @Override
    public ReturnStatus userComputation(ComputationRequest request) {
        try {
            InputData input = dataStorageAPI.readInput(request.getInputSource());
            String output = computePrimes(input, request.getDelimiter());
            dataStorageAPI.storeResults(request.getOutputDestination(), new OutputData(output));
            return ReturnStatus.PASS;
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnStatus.FAIL;
        }
    }

    private String computePrimes(InputData input, char delimiter) {
        String output = "";
        for (int number : input.getNumbers()) {
            ReturnComputation result = computeEngineAPI.searchPrimes(new SendComputation(number));
            output += number + ":" + result.getPrimes() + delimiter;
        }
        return output;
    }
}