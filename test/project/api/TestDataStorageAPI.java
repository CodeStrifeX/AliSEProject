package project.api;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDataStorageAPI {
    @Test
    
    public void smokeTestReadInput() throws Exception {
        Path inputFile = Files.createTempFile("input", ".txt");
        try {
            Files.writeString(inputFile, "1\n10\n25");
            DataStorageAPIImpl dataStorage = new DataStorageAPIImpl();
            InputData result = dataStorage.readInput(new FileInputSource(inputFile.toString()));
            Assertions.assertEquals(List.of(1, 10, 25), result.getNumbers());
        } finally {
            Files.deleteIfExists(inputFile);
        }
    }

    @Test
    public void smokeTestStoreResults() throws Exception {
        Path outputFile = Files.createTempFile("output", ".txt");
        try {
            DataStorageAPIImpl dataStorage = new DataStorageAPIImpl();
            ReturnStatus status = dataStorage.storeResults(new FileOutputDestination(outputFile.toString()), new OutputData("10:[2 3 5 7];"));
            Assertions.assertEquals(ReturnStatus.PASS, status);
            Assertions.assertEquals("10:[2 3 5 7];", Files.readString(outputFile));
        } finally {
            Files.deleteIfExists(outputFile);
        }
    }

    @Test
    public void nullInputSourceFail() {
        DataStorageAPIImpl dataStorage = new DataStorageAPIImpl();
        InputData result = dataStorage.readInput(null);
        Assertions.assertEquals(ReturnStatus.FAIL, result.getStatus());
    }
}
