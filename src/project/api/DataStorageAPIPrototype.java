package project.api;
import project.annotations.ProcessAPIPrototype;

public class DataStorageAPIPrototype {
    @ProcessAPIPrototype
    public void testDataStorage(DataStorageAPI api) {
        api.readInput("");
        api.storeResults("", null);
    }
}

