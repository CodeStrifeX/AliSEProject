package project.api;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDataStorageAPI {
    @Test
    
    public void smokeTestReadInput() {
        DataStorageAPIImpl dataStorage = new DataStorageAPIImpl();
        InputData result = dataStorage.readInput(null);
        Assertions.assertNotNull(result);
    }
}
