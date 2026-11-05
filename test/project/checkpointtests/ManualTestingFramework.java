package project.checkpointtests;

import project.api.ComputationRequest;
import project.api.ComputeEngineAPI;
import project.api.ComputeEngineAPIImpl;
import project.api.CoordinatingController;
import project.api.DataStorageAPI;
import project.api.DataStorageAPIImpl;
import project.api.FileInputSource;
import project.api.FileOutputDestination;
import project.api.UserComputeAPI;

public class ManualTestingFramework {
    
    public static final String INPUT = "manualTestInput.txt";
    public static final String OUTPUT = "manualTestOutput.txt";

    public static void main(String[] args) {
        // TODO 1:
        // Instantiate a real (ie, class definition lives in the src/ folder) implementation 
        // of all 3 APIs
        DataStorageAPI dataStorage = new DataStorageAPIImpl();
        ComputeEngineAPI computeEngine = new ComputeEngineAPIImpl();
        UserComputeAPI coordinator = new CoordinatingController(dataStorage, computeEngine);
        // TODO 2:
        // Run a computation with an input file of <root project dir>/manualTestInput.txt
        // and an output of <root project dir>/manualTestOutput.txt, with a delimiter of ',' 
        coordinator.userComputation(new ComputationRequest(new FileInputSource(INPUT), new FileOutputDestination(OUTPUT), ','));
        // Helpful hint: the working directory of this program is <root project dir>,
        // so you can refer to the files just using the INPUT/OUTPUT constants. You do not 
        // need to (and should not) actually create those files in your repo
    }
}
