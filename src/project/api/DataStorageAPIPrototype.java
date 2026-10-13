package project.api;
import java.util.List;
import project.annotations.ProcessAPIPrototype;

public class DataStorageAPIPrototype {
    @ProcessAPIPrototype
    public void testDataStorage(DataStorageAPI api) {
        InputSource inputSource = null;
        OutputDestination destination = null;

        InputData input = api.readInput(inputSource);
        List<Integer> numbers = input.getNumbers();
        System.out.println("Read " + numbers.size() + " numbers");
        api.storeResults(destination, new OutputData(null));
    }
}

