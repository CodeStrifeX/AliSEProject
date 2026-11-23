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
        // delimiters do not need validation because any character can be used as a delimiter
        if (request == null || request.getInputSource() == null || request.getOutputDestination() == null) {
            return ReturnStatus.FAIL;
        }
        try {
            InputData input = dataStorageAPI.readInput(request.getInputSource());
            if (input.getStatus() == ReturnStatus.FAIL) {
                return ReturnStatus.FAIL;
            }
            String output = computePrimes(input, request.getDelimiter());
            ReturnStatus storeStatus = dataStorageAPI.storeResults(request.getOutputDestination(), new OutputData(output));
            if (storeStatus == ReturnStatus.FAIL) {
                return ReturnStatus.FAIL;
            }
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
            output += number + ":" + result.getPrimes().toString().replace(", ", " ") + delimiter;
        }
        return output;
    }
}