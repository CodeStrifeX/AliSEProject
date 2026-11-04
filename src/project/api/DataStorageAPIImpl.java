package project.api;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataStorageAPIImpl implements DataStorageAPI {

    @Override
    public InputData readInput(InputSource inputSource) {
        String filePath = ((FileInputSource) inputSource).getFilePath();
        List<Integer> nums = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.isBlank()) {
                    nums.add(Integer.parseInt(line.trim()));
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Error reading file: " + filePath, e);
        }
        return new InputData(nums);
    }

    @Override
    public void storeResults(OutputDestination destination, OutputData data) {
        String filePath = ((FileOutputDestination) destination).getFilePath();
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(data.getResults());
        } catch (IOException e) {
            throw new IllegalStateException("Error writing file to: " + filePath, e);
        }
    }
}
