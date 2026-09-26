package project.api;
import project.annotations.ProcessAPIPrototype;
import java.util.*;

public class DataStorageAPIPrototype implements DataStorageAPI {
    @Override
    @ProcessAPIPrototype
    public List<Integer> readInput(String inputSource) {
        return new ArrayList<>();
    }

    @Override
    @ProcessAPIPrototype
    public void storeResults(String outputDestinastion, List<Integer> results) {

    }
}

