package project.api;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class DataStorageAPIImpl implements DataStorageAPI {

    @Override
    public InputData readInput(InputSource inputSource) {
        if (!(inputSource instanceof FileInputSource)) {
            return new InputData(List.of(), ReturnStatus.FAIL);
        }
        String filePath = ((FileInputSource) inputSource).getFilePath();
        if (filePath == null || filePath.isBlank()) {
            return new InputData(List.of(), ReturnStatus.FAIL);
        }
        List<Integer> nums = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.isBlank()) {
                    nums.add(Integer.parseInt(line.trim()));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new InputData(List.of(), ReturnStatus.FAIL);
        }
        return new InputData(nums);
    }

    @Override
    public ReturnStatus storeResults(OutputDestination destination, OutputData data) {
        if (!(destination instanceof FileOutputDestination) || data == null || data.getResults() == null) {
            return ReturnStatus.FAIL;
        }
        String filePath = ((FileOutputDestination) destination).getFilePath();
        if (filePath == null || filePath.isBlank()) {
            return ReturnStatus.FAIL;
        }
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(data.getResults());
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnStatus.FAIL;
        }
        return ReturnStatus.PASS;
    }
}
