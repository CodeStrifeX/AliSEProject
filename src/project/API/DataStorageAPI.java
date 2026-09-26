package project.API;
import project.annotations.ProcessAPI;
import java.util.*;

@ProcessAPI
public interface DataStorageAPI {
    List<Integer> readInput(String inputSource);
    void storeResults(String outputDestination, List<Integer> results);
}
