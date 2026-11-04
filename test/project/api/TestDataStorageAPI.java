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
        Files.writeString(inputFile, "1\n10\n25");
        DataStorageAPIImpl dataStorage = new DataStorageAPIImpl();
        InputData result = dataStorage.readInput(new FileInputSource(inputFile.toString()));
        Assertions.assertEquals(List.of(1, 10, 25), result.getNumbers());
    }
}
