package project.api_temp;
import project.annotations.ProcessAPI;
import java.util.List;

@ProcessAPI
public interface DataStorageAPI {
    List<Integer> readInput(String inputSource);
    void storeResults(String outputDestination, List<Integer> results);
}
